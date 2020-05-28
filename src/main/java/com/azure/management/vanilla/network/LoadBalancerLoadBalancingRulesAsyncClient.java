// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.network.implementation.LoadBalancerLoadBalancingRulesImpl;
import com.azure.management.vanilla.network.models.LoadBalancingRule;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class LoadBalancerLoadBalancingRulesAsyncClient {
    private LoadBalancerLoadBalancingRulesImpl serviceClient;

    /** Initializes an instance of LoadBalancerLoadBalancingRules client. */
    LoadBalancerLoadBalancingRulesAsyncClient(LoadBalancerLoadBalancingRulesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancing rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<LoadBalancingRule>> listSinglePage(String resourceGroupName, String loadBalancerName) {
        return this.serviceClient.listSinglePageAsync(resourceGroupName, loadBalancerName);
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancing rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<LoadBalancingRule>> listSinglePage(
        String resourceGroupName, String loadBalancerName, Context context) {
        return this.serviceClient.listSinglePageAsync(resourceGroupName, loadBalancerName, context);
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancing rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LoadBalancingRule> list(String resourceGroupName, String loadBalancerName) {
        return this.serviceClient.listAsync(resourceGroupName, loadBalancerName);
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancing rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LoadBalancingRule> list(String resourceGroupName, String loadBalancerName, Context context) {
        return this.serviceClient.listAsync(resourceGroupName, loadBalancerName, context);
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer load balancing rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LoadBalancingRule>> getWithResponse(
        String resourceGroupName, String loadBalancerName, String loadBalancingRuleName) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName);
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer load balancing rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LoadBalancingRule>> getWithResponse(
        String resourceGroupName, String loadBalancerName, String loadBalancingRuleName, Context context) {
        return this
            .serviceClient
            .getWithResponseAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName, context);
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer load balancing rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancingRule> get(
        String resourceGroupName, String loadBalancerName, String loadBalancingRuleName) {
        return this.serviceClient.getAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName);
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer load balancing rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancingRule> get(
        String resourceGroupName, String loadBalancerName, String loadBalancingRuleName, Context context) {
        return this.serviceClient.getAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListLoadBalancingRule API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<LoadBalancingRule>> listNextSinglePage(String nextLink) {
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
     * @return response for ListLoadBalancingRule API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<LoadBalancingRule>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}
