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
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.network.implementation.IpGroupsImpl;
import com.azure.management.vanilla.network.models.IpGroup;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class IpGroupsAsyncClient {
    private IpGroupsImpl serviceClient;

    /** Initializes an instance of IpGroups client. */
    IpGroupsAsyncClient(IpGroupsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param expand Expands resourceIds (of Firewalls/Network Security Groups etc.) back referenced by the IpGroups
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IpGroup>> getByResourceGroupWithResponse(
        String resourceGroupName, String ipGroupsName, String expand) {
        return this.serviceClient.getByResourceGroupWithResponseAsync(resourceGroupName, ipGroupsName, expand);
    }

    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param expand Expands resourceIds (of Firewalls/Network Security Groups etc.) back referenced by the IpGroups
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IpGroup>> getByResourceGroupWithResponse(
        String resourceGroupName, String ipGroupsName, String expand, Context context) {
        return this.serviceClient.getByResourceGroupWithResponseAsync(resourceGroupName, ipGroupsName, expand, context);
    }

    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param expand Expands resourceIds (of Firewalls/Network Security Groups etc.) back referenced by the IpGroups
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroup> getByResourceGroup(String resourceGroupName, String ipGroupsName, String expand) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, ipGroupsName, expand);
    }

    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param expand Expands resourceIds (of Firewalls/Network Security Groups etc.) back referenced by the IpGroups
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroup> getByResourceGroup(
        String resourceGroupName, String ipGroupsName, String expand, Context context) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, ipGroupsName, expand, context);
    }

    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroup> getByResourceGroup(String resourceGroupName, String ipGroupsName) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, ipGroupsName);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String ipGroupsName, IpGroup parameters) {
        return this.serviceClient.createOrUpdateWithResponseAsync(resourceGroupName, ipGroupsName, parameters);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters The IpGroups resource information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String ipGroupsName, IpGroup parameters, Context context) {
        return this.serviceClient.createOrUpdateWithResponseAsync(resourceGroupName, ipGroupsName, parameters, context);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<IpGroup>, IpGroup> beginCreateOrUpdate(
        String resourceGroupName, String ipGroupsName, IpGroup parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, ipGroupsName, parameters);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters The IpGroups resource information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<IpGroup>, IpGroup> beginCreateOrUpdate(
        String resourceGroupName, String ipGroupsName, IpGroup parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, ipGroupsName, parameters, context);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroup> createOrUpdate(String resourceGroupName, String ipGroupsName, IpGroup parameters) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, ipGroupsName, parameters);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters The IpGroups resource information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroup> createOrUpdate(
        String resourceGroupName, String ipGroupsName, IpGroup parameters, Context context) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, ipGroupsName, parameters, context);
    }

    /**
     * Updates tags of an IpGroups resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IpGroup>> updateGroupsWithResponse(
        String resourceGroupName, String ipGroupsName, Map<String, String> tags) {
        return this.serviceClient.updateGroupsWithResponseAsync(resourceGroupName, ipGroupsName, tags);
    }

    /**
     * Updates tags of an IpGroups resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IpGroup>> updateGroupsWithResponse(
        String resourceGroupName, String ipGroupsName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateGroupsWithResponseAsync(resourceGroupName, ipGroupsName, tags, context);
    }

    /**
     * Updates tags of an IpGroups resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroup> updateGroups(String resourceGroupName, String ipGroupsName, Map<String, String> tags) {
        return this.serviceClient.updateGroupsAsync(resourceGroupName, ipGroupsName, tags);
    }

    /**
     * Updates tags of an IpGroups resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroup> updateGroups(
        String resourceGroupName, String ipGroupsName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateGroupsAsync(resourceGroupName, ipGroupsName, tags, context);
    }

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(String resourceGroupName, String ipGroupsName) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, ipGroupsName);
    }

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String ipGroupsName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, ipGroupsName, context);
    }

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String ipGroupsName) {
        return this.serviceClient.beginDelete(resourceGroupName, ipGroupsName);
    }

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String ipGroupsName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, ipGroupsName, context);
    }

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String ipGroupsName) {
        return this.serviceClient.deleteAsync(resourceGroupName, ipGroupsName);
    }

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String ipGroupsName, Context context) {
        return this.serviceClient.deleteAsync(resourceGroupName, ipGroupsName, context);
    }

    /**
     * Gets all IpGroups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<IpGroup>> listByResourceGroupSinglePage(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName);
    }

    /**
     * Gets all IpGroups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<IpGroup>> listByResourceGroupSinglePage(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName, context);
    }

    /**
     * Gets all IpGroups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IpGroup> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName);
    }

    /**
     * Gets all IpGroups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IpGroup> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, context);
    }

    /**
     * Gets all IpGroups in a subscription.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<IpGroup>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
    }

    /**
     * Gets all IpGroups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<IpGroup>> listSinglePage(Context context) {
        return this.serviceClient.listSinglePageAsync(context);
    }

    /**
     * Gets all IpGroups in a subscription.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IpGroup> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Gets all IpGroups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IpGroup> list(Context context) {
        return this.serviceClient.listAsync(context);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IpGroup>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String ipGroupsName, IpGroup parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(resourceGroupName, ipGroupsName, parameters);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters The IpGroups resource information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IpGroup>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String ipGroupsName, IpGroup parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(resourceGroupName, ipGroupsName, parameters, context);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroup> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String ipGroupsName, IpGroup parameters) {
        return this.serviceClient.beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, ipGroupsName, parameters);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters The IpGroups resource information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroup> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String ipGroupsName, IpGroup parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, ipGroupsName, parameters, context);
    }

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(String resourceGroupName, String ipGroupsName) {
        return this.serviceClient.beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, ipGroupsName);
    }

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String ipGroupsName, Context context) {
        return this.serviceClient.beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, ipGroupsName, context);
    }

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String ipGroupsName) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, ipGroupsName);
    }

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String ipGroupsName, Context context) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, ipGroupsName, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListIpGroups API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<IpGroup>> listByResourceGroupNextSinglePage(String nextLink) {
        return this.serviceClient.listByResourceGroupNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListIpGroups API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<IpGroup>> listByResourceGroupNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listByResourceGroupNextSinglePageAsync(nextLink, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListIpGroups API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<IpGroup>> listNextSinglePage(String nextLink) {
        return this.serviceClient.listNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListIpGroups API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<IpGroup>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}