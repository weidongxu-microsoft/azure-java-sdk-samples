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
import com.azure.management.vanilla.network.implementation.NetworkProfilesImpl;
import com.azure.management.vanilla.network.models.NetworkProfile;
import java.util.Map;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class NetworkProfilesClient {
    private NetworkProfilesImpl serviceClient;

    /** Initializes an instance of NetworkProfiles client. */
    NetworkProfilesClient(NetworkProfilesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkProfileName) {
        return this.serviceClient.beginDelete(resourceGroupName, networkProfileName);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkProfileName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, networkProfileName, context);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String networkProfileName) {
        this.serviceClient.delete(resourceGroupName, networkProfileName);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String networkProfileName, Context context) {
        this.serviceClient.delete(resourceGroupName, networkProfileName, context);
    }

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkProfile getByResourceGroup(String resourceGroupName, String networkProfileName, String expand) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, networkProfileName, expand);
    }

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkProfile getByResourceGroup(
        String resourceGroupName, String networkProfileName, String expand, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, networkProfileName, expand, context);
    }

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkProfile getByResourceGroup(String resourceGroupName, String networkProfileName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, networkProfileName);
    }

    /**
     * Creates or updates a network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param parameters Network profile resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkProfile createOrUpdate(
        String resourceGroupName, String networkProfileName, NetworkProfile parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, networkProfileName, parameters);
    }

    /**
     * Creates or updates a network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param parameters Network profile resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkProfile createOrUpdate(
        String resourceGroupName, String networkProfileName, NetworkProfile parameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, networkProfileName, parameters, context);
    }

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkProfile updateTags(String resourceGroupName, String networkProfileName, Map<String, String> tags) {
        return this.serviceClient.updateTags(resourceGroupName, networkProfileName, tags);
    }

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkProfile updateTags(
        String resourceGroupName, String networkProfileName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTags(resourceGroupName, networkProfileName, tags, context);
    }

    /**
     * Gets all the network profiles in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the network profiles in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NetworkProfile> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all the network profiles in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the network profiles in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NetworkProfile> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Gets all network profiles in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network profiles in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NetworkProfile> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Gets all network profiles in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network profiles in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NetworkProfile> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String networkProfileName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, networkProfileName);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String networkProfileName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, networkProfileName, context);
    }
}
