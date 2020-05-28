// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.network.implementation.RouteFiltersImpl;
import com.azure.management.vanilla.network.models.RouteFilter;
import java.util.Map;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class RouteFiltersClient {
    private RouteFiltersImpl serviceClient;

    /** Initializes an instance of RouteFilters client. */
    RouteFiltersClient(RouteFiltersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String routeFilterName) {
        return this.serviceClient.beginDelete(resourceGroupName, routeFilterName);
    }

    /**
     * Deletes the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String routeFilterName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, routeFilterName, context);
    }

    /**
     * Deletes the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String routeFilterName) {
        this.serviceClient.delete(resourceGroupName, routeFilterName);
    }

    /**
     * Deletes the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String routeFilterName, Context context) {
        this.serviceClient.delete(resourceGroupName, routeFilterName, context);
    }

    /**
     * Gets the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param expand Expands referenced express route bgp peering resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilter getByResourceGroup(String resourceGroupName, String routeFilterName, String expand) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, routeFilterName, expand);
    }

    /**
     * Gets the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param expand Expands referenced express route bgp peering resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilter getByResourceGroup(
        String resourceGroupName, String routeFilterName, String expand, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, routeFilterName, expand, context);
    }

    /**
     * Gets the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilter getByResourceGroup(String resourceGroupName, String routeFilterName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, routeFilterName);
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<RouteFilter>, RouteFilter> beginCreateOrUpdate(
        String resourceGroupName, String routeFilterName, RouteFilter routeFilterParameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, routeFilterName, routeFilterParameters);
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Route Filter Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<RouteFilter>, RouteFilter> beginCreateOrUpdate(
        String resourceGroupName, String routeFilterName, RouteFilter routeFilterParameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, routeFilterName, routeFilterParameters, context);
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilter createOrUpdate(
        String resourceGroupName, String routeFilterName, RouteFilter routeFilterParameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, routeFilterName, routeFilterParameters);
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Route Filter Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilter createOrUpdate(
        String resourceGroupName, String routeFilterName, RouteFilter routeFilterParameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, routeFilterName, routeFilterParameters, context);
    }

    /**
     * Updates tags of a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilter updateTags(String resourceGroupName, String routeFilterName, Map<String, String> tags) {
        return this.serviceClient.updateTags(resourceGroupName, routeFilterName, tags);
    }

    /**
     * Updates tags of a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilter updateTags(
        String resourceGroupName, String routeFilterName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTags(resourceGroupName, routeFilterName, tags, context);
    }

    /**
     * Gets all route filters in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route filters in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RouteFilter> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Gets all route filters in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route filters in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RouteFilter> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Gets all route filters in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route filters in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RouteFilter> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all route filters in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route filters in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RouteFilter> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Deletes the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String routeFilterName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, routeFilterName);
    }

    /**
     * Deletes the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String routeFilterName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, routeFilterName, context);
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Route Filter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilter beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String routeFilterName, RouteFilter routeFilterParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, routeFilterName, routeFilterParameters);
    }

    /**
     * Creates or updates a route filter in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param routeFilterParameters Route Filter Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilter beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String routeFilterName, RouteFilter routeFilterParameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, routeFilterName, routeFilterParameters, context);
    }
}
