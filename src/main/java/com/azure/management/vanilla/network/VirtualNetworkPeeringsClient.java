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
import com.azure.management.vanilla.network.implementation.VirtualNetworkPeeringsImpl;
import com.azure.management.vanilla.network.models.VirtualNetworkPeering;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class VirtualNetworkPeeringsClient {
    private VirtualNetworkPeeringsImpl serviceClient;

    /** Initializes an instance of VirtualNetworkPeerings client. */
    VirtualNetworkPeeringsClient(VirtualNetworkPeeringsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        return this.serviceClient.beginDelete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName);
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context) {
        return this
            .serviceClient
            .beginDelete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, context);
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        this.serviceClient.delete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName);
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context) {
        this.serviceClient.delete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, context);
    }

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network peering.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkPeering get(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        return this.serviceClient.get(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName);
    }

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network peering.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkPeering get(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context) {
        return this.serviceClient.get(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, context);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<VirtualNetworkPeering>, VirtualNetworkPeering> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeering virtualNetworkPeeringParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdate(
                resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<VirtualNetworkPeering>, VirtualNetworkPeering> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeering virtualNetworkPeeringParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(
                resourceGroupName,
                virtualNetworkName,
                virtualNetworkPeeringName,
                virtualNetworkPeeringParameters,
                context);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkPeering createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeering virtualNetworkPeeringParameters) {
        return this
            .serviceClient
            .createOrUpdate(
                resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkPeering createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeering virtualNetworkPeeringParameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdate(
                resourceGroupName,
                virtualNetworkName,
                virtualNetworkPeeringName,
                virtualNetworkPeeringParameters,
                context);
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual network peerings in a virtual network.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualNetworkPeering> list(String resourceGroupName, String virtualNetworkName) {
        return this.serviceClient.list(resourceGroupName, virtualNetworkName);
    }

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual network peerings in a virtual network.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualNetworkPeering> list(
        String resourceGroupName, String virtualNetworkName, Context context) {
        return this.serviceClient.list(resourceGroupName, virtualNetworkName, context);
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName);
    }

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context) {
        this
            .serviceClient
            .beginDeleteWithoutPolling(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, context);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkPeering beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeering virtualNetworkPeeringParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, virtualNetworkPeeringParameters);
    }

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Peerings in a virtual network resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetworkPeering beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeering virtualNetworkPeeringParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName,
                virtualNetworkName,
                virtualNetworkPeeringName,
                virtualNetworkPeeringParameters,
                context);
    }
}
