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
import com.azure.management.vanilla.network.implementation.VirtualNetworksImpl;
import com.azure.management.vanilla.network.models.IpAddressAvailabilityResult;
import com.azure.management.vanilla.network.models.VirtualNetwork;
import com.azure.management.vanilla.network.models.VirtualNetworkUsage;
import java.util.Map;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class VirtualNetworksClient {
    private VirtualNetworksImpl serviceClient;

    /** Initializes an instance of VirtualNetworks client. */
    VirtualNetworksClient(VirtualNetworksImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualNetworkName) {
        return this.serviceClient.beginDelete(resourceGroupName, virtualNetworkName);
    }

    /**
     * Deletes the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualNetworkName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, virtualNetworkName, context);
    }

    /**
     * Deletes the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String virtualNetworkName) {
        this.serviceClient.delete(resourceGroupName, virtualNetworkName);
    }

    /**
     * Deletes the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String virtualNetworkName, Context context) {
        this.serviceClient.delete(resourceGroupName, virtualNetworkName, context);
    }

    /**
     * Gets the specified virtual network by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetwork getByResourceGroup(String resourceGroupName, String virtualNetworkName, String expand) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, virtualNetworkName, expand);
    }

    /**
     * Gets the specified virtual network by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetwork getByResourceGroup(
        String resourceGroupName, String virtualNetworkName, String expand, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, virtualNetworkName, expand, context);
    }

    /**
     * Gets the specified virtual network by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetwork getByResourceGroup(String resourceGroupName, String virtualNetworkName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, virtualNetworkName);
    }

    /**
     * Creates or updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Virtual Network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<VirtualNetwork>, VirtualNetwork> beginCreateOrUpdate(
        String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, virtualNetworkName, parameters);
    }

    /**
     * Creates or updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Virtual Network resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<VirtualNetwork>, VirtualNetwork> beginCreateOrUpdate(
        String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, virtualNetworkName, parameters, context);
    }

    /**
     * Creates or updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Virtual Network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetwork createOrUpdate(
        String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, virtualNetworkName, parameters);
    }

    /**
     * Creates or updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Virtual Network resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetwork createOrUpdate(
        String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, virtualNetworkName, parameters, context);
    }

    /**
     * Updates a virtual network tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetwork updateTags(String resourceGroupName, String virtualNetworkName, Map<String, String> tags) {
        return this.serviceClient.updateTags(resourceGroupName, virtualNetworkName, tags);
    }

    /**
     * Updates a virtual network tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetwork updateTags(
        String resourceGroupName, String virtualNetworkName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTags(resourceGroupName, virtualNetworkName, tags, context);
    }

    /**
     * Gets all virtual networks in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual networks in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualNetwork> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all virtual networks in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual networks in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualNetwork> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Gets all virtual networks in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual networks in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualNetwork> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Gets all virtual networks in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual networks in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualNetwork> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Checks whether a private IP address is available for use.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param ipAddress The private IP address to be verified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for CheckIPAddressAvailability API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IpAddressAvailabilityResult checkIpAddressAvailability(
        String resourceGroupName, String virtualNetworkName, String ipAddress) {
        return this.serviceClient.checkIpAddressAvailability(resourceGroupName, virtualNetworkName, ipAddress);
    }

    /**
     * Checks whether a private IP address is available for use.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param ipAddress The private IP address to be verified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for CheckIPAddressAvailability API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IpAddressAvailabilityResult checkIpAddressAvailability(
        String resourceGroupName, String virtualNetworkName, String ipAddress, Context context) {
        return this.serviceClient.checkIpAddressAvailability(resourceGroupName, virtualNetworkName, ipAddress, context);
    }

    /**
     * Lists usage stats.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the virtual networks GetUsage API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualNetworkUsage> listUsage(String resourceGroupName, String virtualNetworkName) {
        return this.serviceClient.listUsage(resourceGroupName, virtualNetworkName);
    }

    /**
     * Lists usage stats.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the virtual networks GetUsage API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualNetworkUsage> listUsage(
        String resourceGroupName, String virtualNetworkName, Context context) {
        return this.serviceClient.listUsage(resourceGroupName, virtualNetworkName, context);
    }

    /**
     * Deletes the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String virtualNetworkName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, virtualNetworkName);
    }

    /**
     * Deletes the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String virtualNetworkName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, virtualNetworkName, context);
    }

    /**
     * Creates or updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Virtual Network resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetwork beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters) {
        return this.serviceClient.beginCreateOrUpdateWithoutPolling(resourceGroupName, virtualNetworkName, parameters);
    }

    /**
     * Creates or updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Virtual Network resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualNetwork beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, virtualNetworkName, parameters, context);
    }
}
