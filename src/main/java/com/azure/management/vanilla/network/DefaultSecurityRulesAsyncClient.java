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
import com.azure.management.vanilla.network.implementation.DefaultSecurityRulesImpl;
import com.azure.management.vanilla.network.models.SecurityRule;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class DefaultSecurityRulesAsyncClient {
    private DefaultSecurityRulesImpl serviceClient;

    /** Initializes an instance of DefaultSecurityRules client. */
    DefaultSecurityRulesAsyncClient(DefaultSecurityRulesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityRule>> listSinglePage(String resourceGroupName, String networkSecurityGroupName) {
        return this.serviceClient.listSinglePageAsync(resourceGroupName, networkSecurityGroupName);
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityRule>> listSinglePage(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        return this.serviceClient.listSinglePageAsync(resourceGroupName, networkSecurityGroupName, context);
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SecurityRule> list(String resourceGroupName, String networkSecurityGroupName) {
        return this.serviceClient.listAsync(resourceGroupName, networkSecurityGroupName);
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all default security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SecurityRule> list(String resourceGroupName, String networkSecurityGroupName, Context context) {
        return this.serviceClient.listAsync(resourceGroupName, networkSecurityGroupName, context);
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecurityRule>> getWithResponse(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName) {
        return this
            .serviceClient
            .getWithResponseAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName);
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecurityRule>> getWithResponse(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName, Context context) {
        return this
            .serviceClient
            .getWithResponseAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName, context);
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityRule> get(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName) {
        return this.serviceClient.getAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName);
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified default network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityRule> get(
        String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName, Context context) {
        return this
            .serviceClient
            .getAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityRule API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityRule>> listNextSinglePage(String nextLink) {
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
     * @return response for ListSecurityRule API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityRule>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}
