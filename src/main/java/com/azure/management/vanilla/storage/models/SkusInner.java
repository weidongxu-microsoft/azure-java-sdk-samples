// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Skus. */
public final class SkusInner {
    private final ClientLogger logger = new ClientLogger(SkusInner.class);

    /** The proxy service used to perform REST calls. */
    private final SkusService service;

    /** The service client containing this operation class. */
    private final StorageManagementClientImpl client;

    /**
     * Initializes an instance of SkusInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SkusInner(StorageManagementClientImpl client) {
        this.service = RestProxy.create(SkusService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientSkus to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface SkusService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Storage/skus")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<StorageSkuListResultInner>> list(
            @HostParam("$host") String host,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);
    }

    /**
     * Lists the available SKUs supported by Microsoft.Storage for given subscription.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage SKUs operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SkuInformationInner>> listSinglePageAsync() {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<SkuInformationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().getValue(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists the available SKUs supported by Microsoft.Storage for given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage SKUs operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SkuInformationInner>> listSinglePageAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .list(this.client.getHost(), this.client.getApiVersion(), this.client.getSubscriptionId(), context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().getValue(),
                        null,
                        null));
    }

    /**
     * Lists the available SKUs supported by Microsoft.Storage for given subscription.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage SKUs operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SkuInformationInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync());
    }

    /**
     * Lists the available SKUs supported by Microsoft.Storage for given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage SKUs operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SkuInformationInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context));
    }

    /**
     * Lists the available SKUs supported by Microsoft.Storage for given subscription.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage SKUs operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SkuInformationInner> list() {
        return new PagedIterable<>(listAsync());
    }
}
