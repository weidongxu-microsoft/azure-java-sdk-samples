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
import com.azure.management.vanilla.network.implementation.SecurityPartnerProvidersImpl;
import com.azure.management.vanilla.network.models.SecurityPartnerProvider;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class SecurityPartnerProvidersAsyncClient {
    private SecurityPartnerProvidersImpl serviceClient;

    /** Initializes an instance of SecurityPartnerProviders client. */
    SecurityPartnerProvidersAsyncClient(SecurityPartnerProvidersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String securityPartnerProviderName) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, securityPartnerProviderName);
    }

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String securityPartnerProviderName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, securityPartnerProviderName, context);
    }

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String securityPartnerProviderName) {
        return this.serviceClient.beginDelete(resourceGroupName, securityPartnerProviderName);
    }

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String securityPartnerProviderName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, securityPartnerProviderName, context);
    }

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String securityPartnerProviderName) {
        return this.serviceClient.deleteAsync(resourceGroupName, securityPartnerProviderName);
    }

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String securityPartnerProviderName, Context context) {
        return this.serviceClient.deleteAsync(resourceGroupName, securityPartnerProviderName, context);
    }

    /**
     * Gets the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Security Partner Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecurityPartnerProvider>> getByResourceGroupWithResponse(
        String resourceGroupName, String securityPartnerProviderName) {
        return this.serviceClient.getByResourceGroupWithResponseAsync(resourceGroupName, securityPartnerProviderName);
    }

    /**
     * Gets the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Security Partner Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecurityPartnerProvider>> getByResourceGroupWithResponse(
        String resourceGroupName, String securityPartnerProviderName, Context context) {
        return this
            .serviceClient
            .getByResourceGroupWithResponseAsync(resourceGroupName, securityPartnerProviderName, context);
    }

    /**
     * Gets the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Security Partner Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityPartnerProvider> getByResourceGroup(
        String resourceGroupName, String securityPartnerProviderName) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, securityPartnerProviderName);
    }

    /**
     * Gets the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Security Partner Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityPartnerProvider> getByResourceGroup(
        String resourceGroupName, String securityPartnerProviderName, Context context) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, securityPartnerProviderName, context);
    }

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Security Partner Provider resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String securityPartnerProviderName, SecurityPartnerProvider parameters) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(resourceGroupName, securityPartnerProviderName, parameters);
    }

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Security Partner Provider resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName,
        String securityPartnerProviderName,
        SecurityPartnerProvider parameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(resourceGroupName, securityPartnerProviderName, parameters, context);
    }

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Security Partner Provider resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<SecurityPartnerProvider>, SecurityPartnerProvider> beginCreateOrUpdate(
        String resourceGroupName, String securityPartnerProviderName, SecurityPartnerProvider parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, securityPartnerProviderName, parameters);
    }

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Security Partner Provider resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<SecurityPartnerProvider>, SecurityPartnerProvider> beginCreateOrUpdate(
        String resourceGroupName,
        String securityPartnerProviderName,
        SecurityPartnerProvider parameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, securityPartnerProviderName, parameters, context);
    }

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Security Partner Provider resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityPartnerProvider> createOrUpdate(
        String resourceGroupName, String securityPartnerProviderName, SecurityPartnerProvider parameters) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, securityPartnerProviderName, parameters);
    }

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Security Partner Provider resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityPartnerProvider> createOrUpdate(
        String resourceGroupName,
        String securityPartnerProviderName,
        SecurityPartnerProvider parameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdateAsync(resourceGroupName, securityPartnerProviderName, parameters, context);
    }

    /**
     * Updates tags of a Security Partner Provider resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecurityPartnerProvider>> updateTagsWithResponse(
        String resourceGroupName, String securityPartnerProviderName, Map<String, String> tags) {
        return this.serviceClient.updateTagsWithResponseAsync(resourceGroupName, securityPartnerProviderName, tags);
    }

    /**
     * Updates tags of a Security Partner Provider resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecurityPartnerProvider>> updateTagsWithResponse(
        String resourceGroupName, String securityPartnerProviderName, Map<String, String> tags, Context context) {
        return this
            .serviceClient
            .updateTagsWithResponseAsync(resourceGroupName, securityPartnerProviderName, tags, context);
    }

    /**
     * Updates tags of a Security Partner Provider resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityPartnerProvider> updateTags(
        String resourceGroupName, String securityPartnerProviderName, Map<String, String> tags) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, securityPartnerProviderName, tags);
    }

    /**
     * Updates tags of a Security Partner Provider resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityPartnerProvider> updateTags(
        String resourceGroupName, String securityPartnerProviderName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, securityPartnerProviderName, tags, context);
    }

    /**
     * Lists all Security Partner Providers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityPartnerProvider>> listByResourceGroupSinglePage(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName);
    }

    /**
     * Lists all Security Partner Providers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityPartnerProvider>> listByResourceGroupSinglePage(
        String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName, context);
    }

    /**
     * Lists all Security Partner Providers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SecurityPartnerProvider> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName);
    }

    /**
     * Lists all Security Partner Providers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SecurityPartnerProvider> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, context);
    }

    /**
     * Gets all the Security Partner Providers in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Security Partner Providers in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityPartnerProvider>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
    }

    /**
     * Gets all the Security Partner Providers in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Security Partner Providers in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityPartnerProvider>> listSinglePage(Context context) {
        return this.serviceClient.listSinglePageAsync(context);
    }

    /**
     * Gets all the Security Partner Providers in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Security Partner Providers in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SecurityPartnerProvider> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Gets all the Security Partner Providers in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Security Partner Providers in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SecurityPartnerProvider> list(Context context) {
        return this.serviceClient.listAsync(context);
    }

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String securityPartnerProviderName) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, securityPartnerProviderName);
    }

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String securityPartnerProviderName, Context context) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, securityPartnerProviderName, context);
    }

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String securityPartnerProviderName) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, securityPartnerProviderName);
    }

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(
        String resourceGroupName, String securityPartnerProviderName, Context context) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingAsync(resourceGroupName, securityPartnerProviderName, context);
    }

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Security Partner Provider resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecurityPartnerProvider>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String securityPartnerProviderName, SecurityPartnerProvider parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(
                resourceGroupName, securityPartnerProviderName, parameters);
    }

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Security Partner Provider resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SecurityPartnerProvider>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName,
        String securityPartnerProviderName,
        SecurityPartnerProvider parameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(
                resourceGroupName, securityPartnerProviderName, parameters, context);
    }

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Security Partner Provider resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityPartnerProvider> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String securityPartnerProviderName, SecurityPartnerProvider parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, securityPartnerProviderName, parameters);
    }

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Security Partner Provider resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SecurityPartnerProvider> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String securityPartnerProviderName,
        SecurityPartnerProvider parameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(
                resourceGroupName, securityPartnerProviderName, parameters, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityPartnerProvider>> listByResourceGroupNextSinglePage(String nextLink) {
        return this.serviceClient.listByResourceGroupNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityPartnerProvider>> listByResourceGroupNextSinglePage(
        String nextLink, Context context) {
        return this.serviceClient.listByResourceGroupNextSinglePageAsync(nextLink, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityPartnerProvider>> listNextSinglePage(String nextLink) {
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
     * @return response for ListSecurityPartnerProviders API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SecurityPartnerProvider>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}
