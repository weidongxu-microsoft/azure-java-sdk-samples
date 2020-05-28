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
import com.azure.management.vanilla.network.implementation.RouteFilterRulesImpl;
import com.azure.management.vanilla.network.models.RouteFilterRule;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class RouteFilterRulesClient {
    private RouteFilterRulesImpl serviceClient;

    /** Initializes an instance of RouteFilterRules client. */
    RouteFilterRulesClient(RouteFilterRulesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String routeFilterName, String ruleName) {
        return this.serviceClient.beginDelete(resourceGroupName, routeFilterName, ruleName);
    }

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, routeFilterName, ruleName, context);
    }

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String routeFilterName, String ruleName) {
        this.serviceClient.delete(resourceGroupName, routeFilterName, ruleName);
    }

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        this.serviceClient.delete(resourceGroupName, routeFilterName, ruleName, context);
    }

    /**
     * Gets the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified rule from a route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterRule get(String resourceGroupName, String routeFilterName, String ruleName) {
        return this.serviceClient.get(resourceGroupName, routeFilterName, ruleName);
    }

    /**
     * Gets the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified rule from a route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterRule get(String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        return this.serviceClient.get(resourceGroupName, routeFilterName, ruleName, context);
    }

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Route Filter Rule Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<RouteFilterRule>, RouteFilterRule> beginCreateOrUpdate(
        String resourceGroupName, String routeFilterName, String ruleName, RouteFilterRule routeFilterRuleParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters);
    }

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Route Filter Rule Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<RouteFilterRule>, RouteFilterRule> beginCreateOrUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRule routeFilterRuleParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters, context);
    }

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Route Filter Rule Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterRule createOrUpdate(
        String resourceGroupName, String routeFilterName, String ruleName, RouteFilterRule routeFilterRuleParameters) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters);
    }

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Route Filter Rule Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterRule createOrUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRule routeFilterRuleParameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters, context);
    }

    /**
     * Gets all RouteFilterRules in a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all RouteFilterRules in a route filter.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RouteFilterRule> listByRouteFilter(String resourceGroupName, String routeFilterName) {
        return this.serviceClient.listByRouteFilter(resourceGroupName, routeFilterName);
    }

    /**
     * Gets all RouteFilterRules in a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all RouteFilterRules in a route filter.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RouteFilterRule> listByRouteFilter(
        String resourceGroupName, String routeFilterName, Context context) {
        return this.serviceClient.listByRouteFilter(resourceGroupName, routeFilterName, context);
    }

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String routeFilterName, String ruleName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, routeFilterName, ruleName);
    }

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, routeFilterName, ruleName, context);
    }

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Route Filter Rule Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterRule beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String routeFilterName, String ruleName, RouteFilterRule routeFilterRuleParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters);
    }

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Route Filter Rule Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteFilterRule beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRule routeFilterRuleParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters, context);
    }
}