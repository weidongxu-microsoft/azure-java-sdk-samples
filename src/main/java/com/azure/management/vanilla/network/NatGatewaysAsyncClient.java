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
import com.azure.management.vanilla.network.implementation.NatGatewaysImpl;
import com.azure.management.vanilla.network.models.NatGateway;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class NatGatewaysAsyncClient {
    private NatGatewaysImpl serviceClient;

    /** Initializes an instance of NatGateways client. */
    NatGatewaysAsyncClient(NatGatewaysImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(String resourceGroupName, String natGatewayName) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, natGatewayName);
    }

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String natGatewayName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, natGatewayName, context);
    }

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String natGatewayName) {
        return this.serviceClient.beginDelete(resourceGroupName, natGatewayName);
    }

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String natGatewayName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, natGatewayName, context);
    }

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String natGatewayName) {
        return this.serviceClient.deleteAsync(resourceGroupName, natGatewayName);
    }

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String natGatewayName, Context context) {
        return this.serviceClient.deleteAsync(resourceGroupName, natGatewayName, context);
    }

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NatGateway>> getByResourceGroupWithResponse(
        String resourceGroupName, String natGatewayName, String expand) {
        return this.serviceClient.getByResourceGroupWithResponseAsync(resourceGroupName, natGatewayName, expand);
    }

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NatGateway>> getByResourceGroupWithResponse(
        String resourceGroupName, String natGatewayName, String expand, Context context) {
        return this
            .serviceClient
            .getByResourceGroupWithResponseAsync(resourceGroupName, natGatewayName, expand, context);
    }

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NatGateway> getByResourceGroup(String resourceGroupName, String natGatewayName, String expand) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, natGatewayName, expand);
    }

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NatGateway> getByResourceGroup(
        String resourceGroupName, String natGatewayName, String expand, Context context) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, natGatewayName, expand, context);
    }

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NatGateway> getByResourceGroup(String resourceGroupName, String natGatewayName) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, natGatewayName);
    }

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Nat Gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String natGatewayName, NatGateway parameters) {
        return this.serviceClient.createOrUpdateWithResponseAsync(resourceGroupName, natGatewayName, parameters);
    }

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Nat Gateway resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String natGatewayName, NatGateway parameters, Context context) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(resourceGroupName, natGatewayName, parameters, context);
    }

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Nat Gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<NatGateway>, NatGateway> beginCreateOrUpdate(
        String resourceGroupName, String natGatewayName, NatGateway parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, natGatewayName, parameters);
    }

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Nat Gateway resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<NatGateway>, NatGateway> beginCreateOrUpdate(
        String resourceGroupName, String natGatewayName, NatGateway parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, natGatewayName, parameters, context);
    }

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Nat Gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NatGateway> createOrUpdate(String resourceGroupName, String natGatewayName, NatGateway parameters) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, natGatewayName, parameters);
    }

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Nat Gateway resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NatGateway> createOrUpdate(
        String resourceGroupName, String natGatewayName, NatGateway parameters, Context context) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, natGatewayName, parameters, context);
    }

    /**
     * Updates nat gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NatGateway>> updateTagsWithResponse(
        String resourceGroupName, String natGatewayName, Map<String, String> tags) {
        return this.serviceClient.updateTagsWithResponseAsync(resourceGroupName, natGatewayName, tags);
    }

    /**
     * Updates nat gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NatGateway>> updateTagsWithResponse(
        String resourceGroupName, String natGatewayName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTagsWithResponseAsync(resourceGroupName, natGatewayName, tags, context);
    }

    /**
     * Updates nat gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NatGateway> updateTags(String resourceGroupName, String natGatewayName, Map<String, String> tags) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, natGatewayName, tags);
    }

    /**
     * Updates nat gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NatGateway> updateTags(
        String resourceGroupName, String natGatewayName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, natGatewayName, tags, context);
    }

    /**
     * Gets all the Nat Gateways in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Nat Gateways in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NatGateway>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
    }

    /**
     * Gets all the Nat Gateways in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Nat Gateways in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NatGateway>> listSinglePage(Context context) {
        return this.serviceClient.listSinglePageAsync(context);
    }

    /**
     * Gets all the Nat Gateways in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Nat Gateways in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NatGateway> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Gets all the Nat Gateways in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Nat Gateways in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NatGateway> list(Context context) {
        return this.serviceClient.listAsync(context);
    }

    /**
     * Gets all nat gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all nat gateways in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NatGateway>> listByResourceGroupSinglePage(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName);
    }

    /**
     * Gets all nat gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all nat gateways in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NatGateway>> listByResourceGroupSinglePage(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName, context);
    }

    /**
     * Gets all nat gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all nat gateways in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NatGateway> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName);
    }

    /**
     * Gets all nat gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all nat gateways in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NatGateway> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, context);
    }

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(String resourceGroupName, String natGatewayName) {
        return this.serviceClient.beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, natGatewayName);
    }

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String natGatewayName, Context context) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, natGatewayName, context);
    }

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String natGatewayName) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, natGatewayName);
    }

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String natGatewayName, Context context) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, natGatewayName, context);
    }

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Nat Gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NatGateway>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String natGatewayName, NatGateway parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(resourceGroupName, natGatewayName, parameters);
    }

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Nat Gateway resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NatGateway>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String natGatewayName, NatGateway parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(resourceGroupName, natGatewayName, parameters, context);
    }

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Nat Gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NatGateway> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String natGatewayName, NatGateway parameters) {
        return this.serviceClient.beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, natGatewayName, parameters);
    }

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Nat Gateway resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NatGateway> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String natGatewayName, NatGateway parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, natGatewayName, parameters, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNatGateways API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NatGateway>> listAllNextSinglePage(String nextLink) {
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
     * @return response for ListNatGateways API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NatGateway>> listAllNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listAllNextSinglePageAsync(nextLink, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNatGateways API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NatGateway>> listNextSinglePage(String nextLink) {
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
     * @return response for ListNatGateways API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NatGateway>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}
