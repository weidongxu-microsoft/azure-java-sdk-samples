package io.weidongxu.azure.samples;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.management.vanilla.resources.models.ResourceGroupInner;
import com.azure.management.vanilla.resources.models.ResourceManagementClientBuilder;
import com.azure.management.vanilla.resources.models.ResourceManagementClientImpl;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.credentials.AzureTokenCredentials;

import java.util.Objects;

public class SampleBase implements ResourceContext {

    protected final String rgName;
    protected final String location = "southcentralus";

    // track1 http
    private AzureTokenCredentials azureTokenCredentials;

    // track2 http
    private HttpPipeline httpPipeline;

    // authenticate
    private final String clientId;
    private final String clientSecret;
    private final String tenantId;
    protected final String subscriptionId;

    protected SampleBase(String rgName) {
        this.rgName = Objects.requireNonNull(rgName);

        this.clientId = Objects.requireNonNull(System.getenv("AZURE_CLIENT_ID"));
        this.clientSecret = Objects.requireNonNull(System.getenv("AZURE_CLIENT_SECRET"));
        this.tenantId =  Objects.requireNonNull(System.getenv("AZURE_TENANT_ID"));
        this.subscriptionId = Objects.requireNonNull(System.getenv("AZURE_SUBSCRIPTION_ID"));
    }

    protected HttpPipeline httpPipeline() {
        if (httpPipeline == null) {
            httpPipeline = new HttpPipelineBuilder()
                    .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy(),
                            new HttpLoggingPolicy(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC)),
                            new BearerTokenAuthenticationPolicy(new DefaultAzureCredentialBuilder().build(),
                                    AzureEnvironment.AZURE.getManagementEndpoint() + ".default"))
                    .build();
        }
        return httpPipeline;
    }

    protected AzureTokenCredentials azureTokenCredentials() {
        if (azureTokenCredentials == null) {
            azureTokenCredentials = new ApplicationTokenCredentials(clientId, tenantId, clientSecret,
                    com.microsoft.azure.AzureEnvironment.AZURE);
        }
        return azureTokenCredentials();
    }

    protected void createResourceGroup() {
        ResourceManagementClientImpl client = new ResourceManagementClientBuilder()
                .pipeline(httpPipeline())
                .subscriptionId(subscriptionId)
                .buildClient();

        client.resourceGroups().createOrUpdate(rgName, (ResourceGroupInner) new ResourceGroupInner()
                .setLocation(location()));
    }

    protected void deleteResourceGroup() {
        ResourceManagementClientImpl client = new ResourceManagementClientBuilder()
                .pipeline(httpPipeline())
                .subscriptionId(subscriptionId)
                .buildClient();

        client.resourceGroups().delete(rgName);
    }

    @Override
    public String resourceGroup() {
        return rgName;
    }

    @Override
    public String location() {
        return location;
    }
}
