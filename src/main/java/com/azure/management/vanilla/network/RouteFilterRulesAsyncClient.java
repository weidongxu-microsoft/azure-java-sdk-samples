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
import com.azure.management.vanilla.network.implementation.RouteFilterRulesImpl;
import com.azure.management.vanilla.network.models.RouteFilterRule;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class RouteFilterRulesAsyncClient {
    private RouteFilterRulesImpl serviceClient;

    /** Initializes an instance of RouteFilterRules client. */
    RouteFilterRulesAsyncClient(RouteFilterRulesImpl serviceClient) {
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
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String routeFilterName, String ruleName) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, routeFilterName, ruleName);
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
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, routeFilterName, ruleName, context);
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
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String routeFilterName, String ruleName) {
        return this.serviceClient.deleteAsync(resourceGroupName, routeFilterName, ruleName);
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
    public Mono<Void> delete(String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        return this.serviceClient.deleteAsync(resourceGroupName, routeFilterName, ruleName, context);
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
    public Mono<Response<RouteFilterRule>> getWithResponse(
        String resourceGroupName, String routeFilterName, String ruleName) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, routeFilterName, ruleName);
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
    public Mono<Response<RouteFilterRule>> getWithResponse(
        String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, routeFilterName, ruleName, context);
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
    public Mono<RouteFilterRule> get(String resourceGroupName, String routeFilterName, String ruleName) {
        return this.serviceClient.getAsync(resourceGroupName, routeFilterName, ruleName);
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
    public Mono<RouteFilterRule> get(
        String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        return this.serviceClient.getAsync(resourceGroupName, routeFilterName, ruleName, context);
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
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String routeFilterName, String ruleName, RouteFilterRule routeFilterRuleParameters) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters);
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
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRule routeFilterRuleParameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(
                resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters, context);
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
    public Mono<RouteFilterRule> createOrUpdate(
        String resourceGroupName, String routeFilterName, String ruleName, RouteFilterRule routeFilterRuleParameters) {
        return this
            .serviceClient
            .createOrUpdateAsync(resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters);
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
    public Mono<RouteFilterRule> createOrUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRule routeFilterRuleParameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdateAsync(resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters, context);
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
    public Mono<PagedResponse<RouteFilterRule>> listByRouteFilterSinglePage(
        String resourceGroupName, String routeFilterName) {
        return this.serviceClient.listByRouteFilterSinglePageAsync(resourceGroupName, routeFilterName);
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
    public Mono<PagedResponse<RouteFilterRule>> listByRouteFilterSinglePage(
        String resourceGroupName, String routeFilterName, Context context) {
        return this.serviceClient.listByRouteFilterSinglePageAsync(resourceGroupName, routeFilterName, context);
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
    public PagedFlux<RouteFilterRule> listByRouteFilter(String resourceGroupName, String routeFilterName) {
        return this.serviceClient.listByRouteFilterAsync(resourceGroupName, routeFilterName);
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
    public PagedFlux<RouteFilterRule> listByRouteFilter(
        String resourceGroupName, String routeFilterName, Context context) {
        return this.serviceClient.listByRouteFilterAsync(resourceGroupName, routeFilterName, context);
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
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String routeFilterName, String ruleName) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, routeFilterName, ruleName);
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
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, routeFilterName, ruleName, context);
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
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String routeFilterName, String ruleName) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, routeFilterName, ruleName);
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
    public Mono<Void> beginDeleteWithoutPolling(
        String resourceGroupName, String routeFilterName, String ruleName, Context context) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, routeFilterName, ruleName, context);
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
    public Mono<Response<RouteFilterRule>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String routeFilterName, String ruleName, RouteFilterRule routeFilterRuleParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(
                resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters);
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
    public Mono<Response<RouteFilterRule>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRule routeFilterRuleParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(
                resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters, context);
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
    public Mono<RouteFilterRule> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String routeFilterName, String ruleName, RouteFilterRule routeFilterRuleParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(
                resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters);
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
    public Mono<RouteFilterRule> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRule routeFilterRuleParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(
                resourceGroupName, routeFilterName, ruleName, routeFilterRuleParameters, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListRouteFilterRules API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<RouteFilterRule>> listByRouteFilterNextSinglePage(String nextLink) {
        return this.serviceClient.listByRouteFilterNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListRouteFilterRules API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<RouteFilterRule>> listByRouteFilterNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listByRouteFilterNextSinglePageAsync(nextLink, context);
    }
}
