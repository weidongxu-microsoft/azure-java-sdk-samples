package io.weidongxu.azure.samples.tracing;

import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.vanilla.storage.StorageAccountsAsyncClient;
import com.azure.management.vanilla.storage.StorageManagementClientBuilder;
import com.azure.management.vanilla.storage.models.Kind;
import com.azure.management.vanilla.storage.models.LargeFileSharesState;
import com.azure.management.vanilla.storage.models.Sku;
import com.azure.management.vanilla.storage.models.SkuName;
import com.azure.management.vanilla.storage.models.StorageAccount;
import com.azure.management.vanilla.storage.models.StorageAccountCreateParameters;
import io.grpc.ManagedChannelBuilder;
import io.opentelemetry.OpenTelemetry;
import io.opentelemetry.exporters.jaeger.JaegerGrpcSpanExporter;
import io.opentelemetry.exporters.logging.LoggingSpanExporter;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.trace.TracerSdkProvider;
import io.opentelemetry.sdk.trace.export.SimpleSpansProcessor;
import io.opentelemetry.trace.Span;
import io.opentelemetry.trace.Tracer;
import io.weidongxu.azure.samples.SampleBase;

import java.util.Map;

public class TracingSample extends SampleBase {

    private static final Tracer TRACER = OpenTelemetry.getTracerProvider().get("Azure-TracingSample");

    public TracingSample() {
        super("rg-sample-tracing");
    }

    public void run() {
        final String saName = "sasampletracing";

        StorageAccountsAsyncClient client = new StorageManagementClientBuilder()
                .pipeline(httpPipelineOpenTelemetryTracing())
                .subscriptionId(subscriptionId)
                .buildStorageAccountsAsyncClient();

        Span span = TRACER.spanBuilder("user-parent-span").setSpanKind(Span.Kind.CLIENT).startSpan();
        logger.info("span id: {}", span.getContext().getSpanId());
        try {
            Context context = Context.of(Map.of(com.azure.core.util.tracing.Tracer.PARENT_SPAN_KEY, span));

            // create storage account
            StorageAccount storageAccount = client.create(this.resourceGroup(), saName,
                    new StorageAccountCreateParameters()
                            .setLocation(this.location())
                            .setKind(Kind.STORAGE_V2)
                            .setSku(new Sku()
                                    .setName(SkuName.STANDARD_LRS))
                            .setLargeFileSharesState(LargeFileSharesState.ENABLED)
                            .setEnableHttpsTrafficOnly(true)
                            .setTags(Map.of("product", "javasdk",
                                    "cause", "automation")))
                    .subscriberContext(FluxUtil.toReactorContext(context)).block();

            client.delete(this.resourceGroup(), storageAccount.getName())
                    .subscriberContext(FluxUtil.toReactorContext(context)).block();
        } finally {
            span.end();
        }
    }

    public static void main(String[] args) {
        TracingSample sample = new TracingSample();
        try {
            // configure OpenTelemetry
            TracerSdkProvider tracerProvider = OpenTelemetrySdk.getTracerProvider();

            LoggingSpanExporter loggingExporter = new LoggingSpanExporter();
            tracerProvider.addSpanProcessor(SimpleSpansProcessor.newBuilder(loggingExporter).build());

            // refer to https://www.jaegertracing.io/docs/1.17/getting-started/
            JaegerGrpcSpanExporter jaegerGrpcSpanExporter = new JaegerGrpcSpanExporter.Builder()
                    .setServiceName("tracing-sample")
                    .setChannel(ManagedChannelBuilder.forTarget("localhost:14250").usePlaintext().build())
                    .build();
            tracerProvider.addSpanProcessor(SimpleSpansProcessor.newBuilder(jaegerGrpcSpanExporter).build());

            sample.createResourceGroup();

            sample.run();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            sample.deleteResourceGroup();
        }
    }
}
