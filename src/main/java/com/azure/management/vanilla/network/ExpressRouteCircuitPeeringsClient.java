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
import com.azure.management.vanilla.network.implementation.ExpressRouteCircuitPeeringsImpl;
import com.azure.management.vanilla.network.models.ExpressRouteCircuitPeering;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class ExpressRouteCircuitPeeringsClient {
    private ExpressRouteCircuitPeeringsImpl serviceClient;

    /** Initializes an instance of ExpressRouteCircuitPeerings client. */
    ExpressRouteCircuitPeeringsClient(ExpressRouteCircuitPeeringsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String circuitName, String peeringName) {
        return this.serviceClient.beginDelete(resourceGroupName, circuitName, peeringName);
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String circuitName, String peeringName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, circuitName, peeringName, context);
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String circuitName, String peeringName) {
        this.serviceClient.delete(resourceGroupName, circuitName, peeringName);
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String circuitName, String peeringName, Context context) {
        this.serviceClient.delete(resourceGroupName, circuitName, peeringName, context);
    }

    /**
     * Gets the specified peering for the express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitPeering get(String resourceGroupName, String circuitName, String peeringName) {
        return this.serviceClient.get(resourceGroupName, circuitName, peeringName);
    }

    /**
     * Gets the specified peering for the express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitPeering get(
        String resourceGroupName, String circuitName, String peeringName, Context context) {
        return this.serviceClient.get(resourceGroupName, circuitName, peeringName, context);
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ExpressRouteCircuitPeering>, ExpressRouteCircuitPeering> beginCreateOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        ExpressRouteCircuitPeering peeringParameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, circuitName, peeringName, peeringParameters);
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ExpressRouteCircuitPeering>, ExpressRouteCircuitPeering> beginCreateOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        ExpressRouteCircuitPeering peeringParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, circuitName, peeringName, peeringParameters, context);
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitPeering createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        ExpressRouteCircuitPeering peeringParameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, circuitName, peeringName, peeringParameters);
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitPeering createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        ExpressRouteCircuitPeering peeringParameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, circuitName, peeringName, peeringParameters, context);
    }

    /**
     * Gets all peerings in a specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all peerings in a specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteCircuitPeering> list(String resourceGroupName, String circuitName) {
        return this.serviceClient.list(resourceGroupName, circuitName);
    }

    /**
     * Gets all peerings in a specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all peerings in a specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteCircuitPeering> list(
        String resourceGroupName, String circuitName, Context context) {
        return this.serviceClient.list(resourceGroupName, circuitName, context);
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String circuitName, String peeringName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, circuitName, peeringName);
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String circuitName, String peeringName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, circuitName, peeringName, context);
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitPeering beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        ExpressRouteCircuitPeering peeringParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, circuitName, peeringName, peeringParameters);
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitPeering beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        ExpressRouteCircuitPeering peeringParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, circuitName, peeringName, peeringParameters, context);
    }
}
