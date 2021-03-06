// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.compute.implementation.ResourceSkusImpl;
import com.azure.management.vanilla.compute.models.ResourceSku;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class ResourceSkusAsyncClient {
    private ResourceSkusImpl serviceClient;

    /** Initializes an instance of ResourceSkus client. */
    ResourceSkusAsyncClient(ResourceSkusImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ResourceSku>> listSinglePage(String filter) {
        return this.serviceClient.listSinglePageAsync(filter);
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ResourceSku>> listSinglePage(String filter, Context context) {
        return this.serviceClient.listSinglePageAsync(filter, context);
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ResourceSku> list(String filter) {
        return this.serviceClient.listAsync(filter);
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ResourceSku> list(String filter, Context context) {
        return this.serviceClient.listAsync(filter, context);
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ResourceSku> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Resource Skus operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ResourceSku>> listNextSinglePage(String nextLink) {
        return this.serviceClient.listNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Resource Skus operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ResourceSku>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}
