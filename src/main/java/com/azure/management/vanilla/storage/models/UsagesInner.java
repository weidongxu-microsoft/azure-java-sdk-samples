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
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Usages. */
public final class UsagesInner {
    /** The proxy service used to perform REST calls. */
    private final UsagesService service;

    /** The service client containing this operation class. */
    private final StorageManagementClientImpl client;

    /**
     * Initializes an instance of UsagesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    UsagesInner(StorageManagementClientImpl client) {
        this.service = RestProxy.create(UsagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientUsages to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface UsagesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Storage/locations/{location}/usages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<UsageListResultInner>> listByLocation(
            @HostParam("$host") String host,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            Context context);
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The location of the Azure Storage resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<UsageInner>> listByLocationSinglePageAsync(String location) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByLocation(
                            this.client.getHost(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            context))
            .<PagedResponse<UsageInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().getValue(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The location of the Azure Storage resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UsageInner> listByLocationAsync(String location) {
        return new PagedFlux<>(() -> listByLocationSinglePageAsync(location));
    }

    /**
     * Gets the current usage count and the limit for the resources of the location under the subscription.
     *
     * @param location The location of the Azure Storage resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage count and the limit for the resources of the location under the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> listByLocation(String location) {
        return new PagedIterable<>(listByLocationAsync(location));
    }
}
