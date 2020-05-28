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
import com.azure.management.vanilla.network.implementation.LoadBalancerOutboundRulesImpl;
import com.azure.management.vanilla.network.models.OutboundRule;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class LoadBalancerOutboundRulesAsyncClient {
    private LoadBalancerOutboundRulesImpl serviceClient;

    /** Initializes an instance of LoadBalancerOutboundRules client. */
    LoadBalancerOutboundRulesAsyncClient(LoadBalancerOutboundRulesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<OutboundRule>> listSinglePage(String resourceGroupName, String loadBalancerName) {
        return this.serviceClient.listSinglePageAsync(resourceGroupName, loadBalancerName);
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<OutboundRule>> listSinglePage(
        String resourceGroupName, String loadBalancerName, Context context) {
        return this.serviceClient.listSinglePageAsync(resourceGroupName, loadBalancerName, context);
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OutboundRule> list(String resourceGroupName, String loadBalancerName) {
        return this.serviceClient.listAsync(resourceGroupName, loadBalancerName);
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the outbound rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OutboundRule> list(String resourceGroupName, String loadBalancerName, Context context) {
        return this.serviceClient.listAsync(resourceGroupName, loadBalancerName, context);
    }

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OutboundRule>> getWithResponse(
        String resourceGroupName, String loadBalancerName, String outboundRuleName) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, loadBalancerName, outboundRuleName);
    }

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OutboundRule>> getWithResponse(
        String resourceGroupName, String loadBalancerName, String outboundRuleName, Context context) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, loadBalancerName, outboundRuleName, context);
    }

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OutboundRule> get(String resourceGroupName, String loadBalancerName, String outboundRuleName) {
        return this.serviceClient.getAsync(resourceGroupName, loadBalancerName, outboundRuleName);
    }

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer outbound rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OutboundRule> get(
        String resourceGroupName, String loadBalancerName, String outboundRuleName, Context context) {
        return this.serviceClient.getAsync(resourceGroupName, loadBalancerName, outboundRuleName, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListOutboundRule API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<OutboundRule>> listNextSinglePage(String nextLink) {
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
     * @return response for ListOutboundRule API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<OutboundRule>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}