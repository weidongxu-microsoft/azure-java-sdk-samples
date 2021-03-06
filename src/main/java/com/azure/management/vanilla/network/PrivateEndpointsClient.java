// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.network.implementation.PrivateEndpointsImpl;
import com.azure.management.vanilla.network.models.PrivateEndpoint;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class PrivateEndpointsClient {
    private PrivateEndpointsImpl serviceClient;

    /** Initializes an instance of PrivateEndpoints client. */
    PrivateEndpointsClient(PrivateEndpointsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String privateEndpointName) {
        return this.serviceClient.beginDelete(resourceGroupName, privateEndpointName);
    }

    /**
     * Deletes the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateEndpointName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, privateEndpointName, context);
    }

    /**
     * Deletes the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String privateEndpointName) {
        this.serviceClient.delete(resourceGroupName, privateEndpointName);
    }

    /**
     * Deletes the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String privateEndpointName, Context context) {
        this.serviceClient.delete(resourceGroupName, privateEndpointName, context);
    }

    /**
     * Gets the specified private endpoint by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpoint getByResourceGroup(String resourceGroupName, String privateEndpointName, String expand) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, privateEndpointName, expand);
    }

    /**
     * Gets the specified private endpoint by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpoint getByResourceGroup(
        String resourceGroupName, String privateEndpointName, String expand, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, privateEndpointName, expand, context);
    }

    /**
     * Gets the specified private endpoint by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpoint getByResourceGroup(String resourceGroupName, String privateEndpointName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, privateEndpointName);
    }

    /**
     * Creates or updates an private endpoint in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param parameters Private endpoint resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<PrivateEndpoint>, PrivateEndpoint> beginCreateOrUpdate(
        String resourceGroupName, String privateEndpointName, PrivateEndpoint parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, privateEndpointName, parameters);
    }

    /**
     * Creates or updates an private endpoint in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param parameters Private endpoint resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<PrivateEndpoint>, PrivateEndpoint> beginCreateOrUpdate(
        String resourceGroupName, String privateEndpointName, PrivateEndpoint parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, privateEndpointName, parameters, context);
    }

    /**
     * Creates or updates an private endpoint in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param parameters Private endpoint resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpoint createOrUpdate(
        String resourceGroupName, String privateEndpointName, PrivateEndpoint parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, privateEndpointName, parameters);
    }

    /**
     * Creates or updates an private endpoint in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param parameters Private endpoint resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpoint createOrUpdate(
        String resourceGroupName, String privateEndpointName, PrivateEndpoint parameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, privateEndpointName, parameters, context);
    }

    /**
     * Gets all private endpoints in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoints in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpoint> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Gets all private endpoints in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoints in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpoint> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Gets all private endpoints in a subscription.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoints in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpoint> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all private endpoints in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoints in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpoint> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Deletes the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String privateEndpointName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, privateEndpointName);
    }

    /**
     * Deletes the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String privateEndpointName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, privateEndpointName, context);
    }

    /**
     * Creates or updates an private endpoint in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param parameters Private endpoint resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpoint beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String privateEndpointName, PrivateEndpoint parameters) {
        return this.serviceClient.beginCreateOrUpdateWithoutPolling(resourceGroupName, privateEndpointName, parameters);
    }

    /**
     * Creates or updates an private endpoint in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param parameters Private endpoint resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpoint beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String privateEndpointName, PrivateEndpoint parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, privateEndpointName, parameters, context);
    }
}
