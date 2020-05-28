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
import com.azure.management.vanilla.network.implementation.RouteTablesImpl;
import com.azure.management.vanilla.network.models.RouteTable;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class RouteTablesAsyncClient {
    private RouteTablesImpl serviceClient;

    /** Initializes an instance of RouteTables client. */
    RouteTablesAsyncClient(RouteTablesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(String resourceGroupName, String routeTableName) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, routeTableName);
    }

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String routeTableName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, routeTableName, context);
    }

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String routeTableName) {
        return this.serviceClient.beginDelete(resourceGroupName, routeTableName);
    }

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String routeTableName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, routeTableName, context);
    }

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String routeTableName) {
        return this.serviceClient.deleteAsync(resourceGroupName, routeTableName);
    }

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String routeTableName, Context context) {
        return this.serviceClient.deleteAsync(resourceGroupName, routeTableName, context);
    }

    /**
     * Gets the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouteTable>> getByResourceGroupWithResponse(
        String resourceGroupName, String routeTableName, String expand) {
        return this.serviceClient.getByResourceGroupWithResponseAsync(resourceGroupName, routeTableName, expand);
    }

    /**
     * Gets the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouteTable>> getByResourceGroupWithResponse(
        String resourceGroupName, String routeTableName, String expand, Context context) {
        return this
            .serviceClient
            .getByResourceGroupWithResponseAsync(resourceGroupName, routeTableName, expand, context);
    }

    /**
     * Gets the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTable> getByResourceGroup(String resourceGroupName, String routeTableName, String expand) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, routeTableName, expand);
    }

    /**
     * Gets the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTable> getByResourceGroup(
        String resourceGroupName, String routeTableName, String expand, Context context) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, routeTableName, expand, context);
    }

    /**
     * Gets the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTable> getByResourceGroup(String resourceGroupName, String routeTableName) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, routeTableName);
    }

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String routeTableName, RouteTable parameters) {
        return this.serviceClient.createOrUpdateWithResponseAsync(resourceGroupName, routeTableName, parameters);
    }

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Route table resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String routeTableName, RouteTable parameters, Context context) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(resourceGroupName, routeTableName, parameters, context);
    }

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<RouteTable>, RouteTable> beginCreateOrUpdate(
        String resourceGroupName, String routeTableName, RouteTable parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, routeTableName, parameters);
    }

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Route table resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<RouteTable>, RouteTable> beginCreateOrUpdate(
        String resourceGroupName, String routeTableName, RouteTable parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, routeTableName, parameters, context);
    }

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTable> createOrUpdate(String resourceGroupName, String routeTableName, RouteTable parameters) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, routeTableName, parameters);
    }

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Route table resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTable> createOrUpdate(
        String resourceGroupName, String routeTableName, RouteTable parameters, Context context) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, routeTableName, parameters, context);
    }

    /**
     * Updates a route table tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouteTable>> updateTagsWithResponse(
        String resourceGroupName, String routeTableName, Map<String, String> tags) {
        return this.serviceClient.updateTagsWithResponseAsync(resourceGroupName, routeTableName, tags);
    }

    /**
     * Updates a route table tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouteTable>> updateTagsWithResponse(
        String resourceGroupName, String routeTableName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTagsWithResponseAsync(resourceGroupName, routeTableName, tags, context);
    }

    /**
     * Updates a route table tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTable> updateTags(String resourceGroupName, String routeTableName, Map<String, String> tags) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, routeTableName, tags);
    }

    /**
     * Updates a route table tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTable> updateTags(
        String resourceGroupName, String routeTableName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, routeTableName, tags, context);
    }

    /**
     * Gets all route tables in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<RouteTable>> listByResourceGroupSinglePage(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName);
    }

    /**
     * Gets all route tables in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<RouteTable>> listByResourceGroupSinglePage(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName, context);
    }

    /**
     * Gets all route tables in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouteTable> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName);
    }

    /**
     * Gets all route tables in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouteTable> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, context);
    }

    /**
     * Gets all route tables in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<RouteTable>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
    }

    /**
     * Gets all route tables in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<RouteTable>> listSinglePage(Context context) {
        return this.serviceClient.listSinglePageAsync(context);
    }

    /**
     * Gets all route tables in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouteTable> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Gets all route tables in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouteTable> list(Context context) {
        return this.serviceClient.listAsync(context);
    }

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(String resourceGroupName, String routeTableName) {
        return this.serviceClient.beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, routeTableName);
    }

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String routeTableName, Context context) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, routeTableName, context);
    }

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String routeTableName) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, routeTableName);
    }

    /**
     * Deletes the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String routeTableName, Context context) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, routeTableName, context);
    }

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouteTable>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String routeTableName, RouteTable parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(resourceGroupName, routeTableName, parameters);
    }

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Route table resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouteTable>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String routeTableName, RouteTable parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(resourceGroupName, routeTableName, parameters, context);
    }

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTable> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String routeTableName, RouteTable parameters) {
        return this.serviceClient.beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, routeTableName, parameters);
    }

    /**
     * Create or updates a route table in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param parameters Route table resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route table resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTable> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String routeTableName, RouteTable parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, routeTableName, parameters, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListRouteTable API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<RouteTable>> listNextSinglePage(String nextLink) {
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
     * @return response for the ListRouteTable API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<RouteTable>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListRouteTable API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<RouteTable>> listAllNextSinglePage(String nextLink) {
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
     * @return response for the ListRouteTable API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<RouteTable>> listAllNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listAllNextSinglePageAsync(nextLink, context);
    }
}
