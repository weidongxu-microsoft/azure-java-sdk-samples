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
import com.azure.management.vanilla.network.implementation.PrivateLinkServicesImpl;
import com.azure.management.vanilla.network.models.AutoApprovedPrivateLinkService;
import com.azure.management.vanilla.network.models.PrivateEndpointConnection;
import com.azure.management.vanilla.network.models.PrivateLinkService;
import com.azure.management.vanilla.network.models.PrivateLinkServiceVisibility;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class PrivateLinkServicesClient {
    private PrivateLinkServicesImpl serviceClient;

    /** Initializes an instance of PrivateLinkServices client. */
    PrivateLinkServicesClient(PrivateLinkServicesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified private link service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serviceName) {
        return this.serviceClient.beginDelete(resourceGroupName, serviceName);
    }

    /**
     * Deletes the specified private link service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serviceName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, serviceName, context);
    }

    /**
     * Deletes the specified private link service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serviceName) {
        this.serviceClient.delete(resourceGroupName, serviceName);
    }

    /**
     * Deletes the specified private link service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serviceName, Context context) {
        this.serviceClient.delete(resourceGroupName, serviceName, context);
    }

    /**
     * Gets the specified private link service by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link service by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkService getByResourceGroup(String resourceGroupName, String serviceName, String expand) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, serviceName, expand);
    }

    /**
     * Gets the specified private link service by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link service by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkService getByResourceGroup(
        String resourceGroupName, String serviceName, String expand, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, serviceName, expand, context);
    }

    /**
     * Gets the specified private link service by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link service by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkService getByResourceGroup(String resourceGroupName, String serviceName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, serviceName);
    }

    /**
     * Creates or updates an private link service in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param parameters Private link service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link service resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<PrivateLinkService>, PrivateLinkService> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, PrivateLinkService parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, serviceName, parameters);
    }

    /**
     * Creates or updates an private link service in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param parameters Private link service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link service resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<PrivateLinkService>, PrivateLinkService> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, PrivateLinkService parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, serviceName, parameters, context);
    }

    /**
     * Creates or updates an private link service in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param parameters Private link service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link service resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkService createOrUpdate(
        String resourceGroupName, String serviceName, PrivateLinkService parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, serviceName, parameters);
    }

    /**
     * Creates or updates an private link service in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param parameters Private link service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link service resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkService createOrUpdate(
        String resourceGroupName, String serviceName, PrivateLinkService parameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, serviceName, parameters, context);
    }

    /**
     * Gets all private link services in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link services in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkService> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Gets all private link services in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link services in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkService> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Gets all private link service in a subscription.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link service in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkService> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all private link service in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link service in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkService> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Get the specific private end point connection by specific private link service in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific private end point connection by specific private link service in the resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnection getPrivateEndpointConnection(
        String resourceGroupName, String serviceName, String peConnectionName, String expand) {
        return this
            .serviceClient
            .getPrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName, expand);
    }

    /**
     * Get the specific private end point connection by specific private link service in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific private end point connection by specific private link service in the resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnection getPrivateEndpointConnection(
        String resourceGroupName, String serviceName, String peConnectionName, String expand, Context context) {
        return this
            .serviceClient
            .getPrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName, expand, context);
    }

    /**
     * Get the specific private end point connection by specific private link service in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific private end point connection by specific private link service in the resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnection getPrivateEndpointConnection(
        String resourceGroupName, String serviceName, String peConnectionName) {
        return this.serviceClient.getPrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName);
    }

    /**
     * Approve or reject private end point connection for a private link service in a subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param parameters PrivateEndpointConnection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return privateEndpointConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnection updatePrivateEndpointConnection(
        String resourceGroupName, String serviceName, String peConnectionName, PrivateEndpointConnection parameters) {
        return this
            .serviceClient
            .updatePrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName, parameters);
    }

    /**
     * Approve or reject private end point connection for a private link service in a subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param parameters PrivateEndpointConnection resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return privateEndpointConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnection updatePrivateEndpointConnection(
        String resourceGroupName,
        String serviceName,
        String peConnectionName,
        PrivateEndpointConnection parameters,
        Context context) {
        return this
            .serviceClient
            .updatePrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName, parameters, context);
    }

    /**
     * Delete private end point connection for a private link service in a subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDeletePrivateEndpointConnection(
        String resourceGroupName, String serviceName, String peConnectionName) {
        return this
            .serviceClient
            .beginDeletePrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName);
    }

    /**
     * Delete private end point connection for a private link service in a subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDeletePrivateEndpointConnection(
        String resourceGroupName, String serviceName, String peConnectionName, Context context) {
        return this
            .serviceClient
            .beginDeletePrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName, context);
    }

    /**
     * Delete private end point connection for a private link service in a subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deletePrivateEndpointConnection(String resourceGroupName, String serviceName, String peConnectionName) {
        this.serviceClient.deletePrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName);
    }

    /**
     * Delete private end point connection for a private link service in a subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deletePrivateEndpointConnection(
        String resourceGroupName, String serviceName, String peConnectionName, Context context) {
        this.serviceClient.deletePrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName, context);
    }

    /**
     * Gets all private end point connections for a specific private link service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private end point connections for a specific private link service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpointConnection> listPrivateEndpointConnections(
        String resourceGroupName, String serviceName) {
        return this.serviceClient.listPrivateEndpointConnections(resourceGroupName, serviceName);
    }

    /**
     * Gets all private end point connections for a specific private link service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private end point connections for a specific private link service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpointConnection> listPrivateEndpointConnections(
        String resourceGroupName, String serviceName, Context context) {
        return this.serviceClient.listPrivateEndpointConnections(resourceGroupName, serviceName, context);
    }

    /**
     * Checks whether the subscription is visible to private link service.
     *
     * @param location The location of the domain name.
     * @param privateLinkServiceAlias The alias of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckPrivateLinkServiceVisibility API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkServiceVisibility checkPrivateLinkServiceVisibility(
        String location, String privateLinkServiceAlias) {
        return this.serviceClient.checkPrivateLinkServiceVisibility(location, privateLinkServiceAlias);
    }

    /**
     * Checks whether the subscription is visible to private link service.
     *
     * @param location The location of the domain name.
     * @param privateLinkServiceAlias The alias of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckPrivateLinkServiceVisibility API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkServiceVisibility checkPrivateLinkServiceVisibility(
        String location, String privateLinkServiceAlias, Context context) {
        return this.serviceClient.checkPrivateLinkServiceVisibility(location, privateLinkServiceAlias, context);
    }

    /**
     * Checks whether the subscription is visible to private link service in the specified resource group.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param privateLinkServiceAlias The alias of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckPrivateLinkServiceVisibility API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkServiceVisibility checkPrivateLinkServiceVisibilityByResourceGroup(
        String location, String resourceGroupName, String privateLinkServiceAlias) {
        return this
            .serviceClient
            .checkPrivateLinkServiceVisibilityByResourceGroup(location, resourceGroupName, privateLinkServiceAlias);
    }

    /**
     * Checks whether the subscription is visible to private link service in the specified resource group.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param privateLinkServiceAlias The alias of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckPrivateLinkServiceVisibility API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkServiceVisibility checkPrivateLinkServiceVisibilityByResourceGroup(
        String location, String resourceGroupName, String privateLinkServiceAlias, Context context) {
        return this
            .serviceClient
            .checkPrivateLinkServiceVisibilityByResourceGroup(
                location, resourceGroupName, privateLinkServiceAlias, context);
    }

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this
     * subscription in this region.
     *
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServices(String location) {
        return this.serviceClient.listAutoApprovedPrivateLinkServices(location);
    }

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this
     * subscription in this region.
     *
     * @param location The location of the domain name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServices(
        String location, Context context) {
        return this.serviceClient.listAutoApprovedPrivateLinkServices(location, context);
    }

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this
     * subscription in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServicesByResourceGroup(
        String location, String resourceGroupName) {
        return this.serviceClient.listAutoApprovedPrivateLinkServicesByResourceGroup(location, resourceGroupName);
    }

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this
     * subscription in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServicesByResourceGroup(
        String location, String resourceGroupName, Context context) {
        return this
            .serviceClient
            .listAutoApprovedPrivateLinkServicesByResourceGroup(location, resourceGroupName, context);
    }

    /**
     * Deletes the specified private link service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String serviceName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, serviceName);
    }

    /**
     * Deletes the specified private link service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String serviceName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, serviceName, context);
    }

    /**
     * Creates or updates an private link service in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param parameters Private link service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link service resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkService beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String serviceName, PrivateLinkService parameters) {
        return this.serviceClient.beginCreateOrUpdateWithoutPolling(resourceGroupName, serviceName, parameters);
    }

    /**
     * Creates or updates an private link service in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param parameters Private link service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link service resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkService beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String serviceName, PrivateLinkService parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, serviceName, parameters, context);
    }

    /**
     * Delete private end point connection for a private link service in a subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeletePrivateEndpointConnectionWithoutPolling(
        String resourceGroupName, String serviceName, String peConnectionName) {
        this
            .serviceClient
            .beginDeletePrivateEndpointConnectionWithoutPolling(resourceGroupName, serviceName, peConnectionName);
    }

    /**
     * Delete private end point connection for a private link service in a subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeletePrivateEndpointConnectionWithoutPolling(
        String resourceGroupName, String serviceName, String peConnectionName, Context context) {
        this
            .serviceClient
            .beginDeletePrivateEndpointConnectionWithoutPolling(
                resourceGroupName, serviceName, peConnectionName, context);
    }
}
