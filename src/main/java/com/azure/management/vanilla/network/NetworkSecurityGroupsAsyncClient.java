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
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.network.implementation.NetworkSecurityGroupsImpl;
import com.azure.management.vanilla.network.models.NetworkSecurityGroup;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class NetworkSecurityGroupsAsyncClient {
    private NetworkSecurityGroupsImpl serviceClient;

    /** Initializes an instance of NetworkSecurityGroups client. */
    NetworkSecurityGroupsAsyncClient(NetworkSecurityGroupsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String networkSecurityGroupName) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, networkSecurityGroupName);
    }

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, networkSecurityGroupName, context);
    }

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkSecurityGroupName) {
        return this.serviceClient.beginDelete(resourceGroupName, networkSecurityGroupName);
    }

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, networkSecurityGroupName, context);
    }

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String networkSecurityGroupName) {
        return this.serviceClient.deleteAsync(resourceGroupName, networkSecurityGroupName);
    }

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String networkSecurityGroupName, Context context) {
        return this.serviceClient.deleteAsync(resourceGroupName, networkSecurityGroupName, context);
    }

    /**
     * Gets the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkSecurityGroup>> getByResourceGroupWithResponse(
        String resourceGroupName, String networkSecurityGroupName, String expand) {
        return this
            .serviceClient
            .getByResourceGroupWithResponseAsync(resourceGroupName, networkSecurityGroupName, expand);
    }

    /**
     * Gets the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkSecurityGroup>> getByResourceGroupWithResponse(
        String resourceGroupName, String networkSecurityGroupName, String expand, Context context) {
        return this
            .serviceClient
            .getByResourceGroupWithResponseAsync(resourceGroupName, networkSecurityGroupName, expand, context);
    }

    /**
     * Gets the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkSecurityGroup> getByResourceGroup(
        String resourceGroupName, String networkSecurityGroupName, String expand) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, networkSecurityGroupName, expand);
    }

    /**
     * Gets the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkSecurityGroup> getByResourceGroup(
        String resourceGroupName, String networkSecurityGroupName, String expand, Context context) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, networkSecurityGroupName, expand, context);
    }

    /**
     * Gets the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkSecurityGroup> getByResourceGroup(String resourceGroupName, String networkSecurityGroupName) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, networkSecurityGroupName);
    }

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters NetworkSecurityGroup resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(resourceGroupName, networkSecurityGroupName, parameters);
    }

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters NetworkSecurityGroup resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters, Context context) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(resourceGroupName, networkSecurityGroupName, parameters, context);
    }

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters NetworkSecurityGroup resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<NetworkSecurityGroup>, NetworkSecurityGroup> beginCreateOrUpdate(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, networkSecurityGroupName, parameters);
    }

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters NetworkSecurityGroup resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<NetworkSecurityGroup>, NetworkSecurityGroup> beginCreateOrUpdate(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, networkSecurityGroupName, parameters, context);
    }

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters NetworkSecurityGroup resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkSecurityGroup> createOrUpdate(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, networkSecurityGroupName, parameters);
    }

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters NetworkSecurityGroup resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkSecurityGroup> createOrUpdate(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters, Context context) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, networkSecurityGroupName, parameters, context);
    }

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkSecurityGroup>> updateTagsWithResponse(
        String resourceGroupName, String networkSecurityGroupName, Map<String, String> tags) {
        return this.serviceClient.updateTagsWithResponseAsync(resourceGroupName, networkSecurityGroupName, tags);
    }

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkSecurityGroup>> updateTagsWithResponse(
        String resourceGroupName, String networkSecurityGroupName, Map<String, String> tags, Context context) {
        return this
            .serviceClient
            .updateTagsWithResponseAsync(resourceGroupName, networkSecurityGroupName, tags, context);
    }

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkSecurityGroup> updateTags(
        String resourceGroupName, String networkSecurityGroupName, Map<String, String> tags) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, networkSecurityGroupName, tags);
    }

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkSecurityGroup> updateTags(
        String resourceGroupName, String networkSecurityGroupName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, networkSecurityGroupName, tags, context);
    }

    /**
     * Gets all network security groups in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkSecurityGroup>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
    }

    /**
     * Gets all network security groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkSecurityGroup>> listSinglePage(Context context) {
        return this.serviceClient.listSinglePageAsync(context);
    }

    /**
     * Gets all network security groups in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkSecurityGroup> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Gets all network security groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkSecurityGroup> list(Context context) {
        return this.serviceClient.listAsync(context);
    }

    /**
     * Gets all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkSecurityGroup>> listByResourceGroupSinglePage(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName);
    }

    /**
     * Gets all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkSecurityGroup>> listByResourceGroupSinglePage(
        String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName, context);
    }

    /**
     * Gets all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkSecurityGroup> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName);
    }

    /**
     * Gets all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkSecurityGroup> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, context);
    }

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String networkSecurityGroupName) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, networkSecurityGroupName);
    }

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, networkSecurityGroupName, context);
    }

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String networkSecurityGroupName) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, networkSecurityGroupName);
    }

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, networkSecurityGroupName, context);
    }

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters NetworkSecurityGroup resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkSecurityGroup>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(
                resourceGroupName, networkSecurityGroupName, parameters);
    }

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters NetworkSecurityGroup resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkSecurityGroup>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(
                resourceGroupName, networkSecurityGroupName, parameters, context);
    }

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters NetworkSecurityGroup resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkSecurityGroup> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, networkSecurityGroupName, parameters);
    }

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters NetworkSecurityGroup resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkSecurityGroup> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, networkSecurityGroupName, parameters, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkSecurityGroups API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkSecurityGroup>> listAllNextSinglePage(String nextLink) {
        return this.serviceClient.listAllNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkSecurityGroups API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkSecurityGroup>> listAllNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listAllNextSinglePageAsync(nextLink, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkSecurityGroups API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkSecurityGroup>> listNextSinglePage(String nextLink) {
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
     * @return response for ListNetworkSecurityGroups API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkSecurityGroup>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}