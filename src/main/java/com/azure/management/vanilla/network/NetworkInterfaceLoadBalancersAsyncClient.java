// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.network.implementation.NetworkInterfaceLoadBalancersImpl;
import com.azure.management.vanilla.network.models.LoadBalancer;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class NetworkInterfaceLoadBalancersAsyncClient {
    private NetworkInterfaceLoadBalancersImpl serviceClient;

    /** Initializes an instance of NetworkInterfaceLoadBalancers client. */
    NetworkInterfaceLoadBalancersAsyncClient(NetworkInterfaceLoadBalancersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list ip configurations API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<LoadBalancer>> listSinglePage(String resourceGroupName, String networkInterfaceName) {
        return this.serviceClient.listSinglePageAsync(resourceGroupName, networkInterfaceName);
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list ip configurations API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<LoadBalancer>> listSinglePage(
        String resourceGroupName, String networkInterfaceName, Context context) {
        return this.serviceClient.listSinglePageAsync(resourceGroupName, networkInterfaceName, context);
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list ip configurations API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LoadBalancer> list(String resourceGroupName, String networkInterfaceName) {
        return this.serviceClient.listAsync(resourceGroupName, networkInterfaceName);
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list ip configurations API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LoadBalancer> list(String resourceGroupName, String networkInterfaceName, Context context) {
        return this.serviceClient.listAsync(resourceGroupName, networkInterfaceName, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list ip configurations API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<LoadBalancer>> listNextSinglePage(String nextLink) {
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
     * @return response for list ip configurations API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<LoadBalancer>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}