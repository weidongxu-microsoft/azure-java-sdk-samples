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
import com.azure.management.vanilla.network.implementation.FlowLogsImpl;
import com.azure.management.vanilla.network.models.FlowLog;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class FlowLogsClient {
    private FlowLogsImpl serviceClient;

    /** Initializes an instance of FlowLogs client. */
    FlowLogsClient(FlowLogsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create or update a flow log for the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters A flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<FlowLog>, FlowLog> beginCreateOrUpdate(
        String resourceGroupName, String networkWatcherName, String flowLogName, FlowLog parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, networkWatcherName, flowLogName, parameters);
    }

    /**
     * Create or update a flow log for the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters A flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<FlowLog>, FlowLog> beginCreateOrUpdate(
        String resourceGroupName, String networkWatcherName, String flowLogName, FlowLog parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, networkWatcherName, flowLogName, parameters, context);
    }

    /**
     * Create or update a flow log for the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters A flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FlowLog createOrUpdate(
        String resourceGroupName, String networkWatcherName, String flowLogName, FlowLog parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, networkWatcherName, flowLogName, parameters);
    }

    /**
     * Create or update a flow log for the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters A flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FlowLog createOrUpdate(
        String resourceGroupName, String networkWatcherName, String flowLogName, FlowLog parameters, Context context) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, networkWatcherName, flowLogName, parameters, context);
    }

    /**
     * Gets a flow log resource by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FlowLog get(String resourceGroupName, String networkWatcherName, String flowLogName) {
        return this.serviceClient.get(resourceGroupName, networkWatcherName, flowLogName);
    }

    /**
     * Gets a flow log resource by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FlowLog get(String resourceGroupName, String networkWatcherName, String flowLogName, Context context) {
        return this.serviceClient.get(resourceGroupName, networkWatcherName, flowLogName, context);
    }

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkWatcherName, String flowLogName) {
        return this.serviceClient.beginDelete(resourceGroupName, networkWatcherName, flowLogName);
    }

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkWatcherName, String flowLogName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, networkWatcherName, flowLogName, context);
    }

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String networkWatcherName, String flowLogName) {
        this.serviceClient.delete(resourceGroupName, networkWatcherName, flowLogName);
    }

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String networkWatcherName, String flowLogName, Context context) {
        this.serviceClient.delete(resourceGroupName, networkWatcherName, flowLogName, context);
    }

    /**
     * Lists all flow log resources for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of flow logs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FlowLog> list(String resourceGroupName, String networkWatcherName) {
        return this.serviceClient.list(resourceGroupName, networkWatcherName);
    }

    /**
     * Lists all flow log resources for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of flow logs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FlowLog> list(String resourceGroupName, String networkWatcherName, Context context) {
        return this.serviceClient.list(resourceGroupName, networkWatcherName, context);
    }

    /**
     * Create or update a flow log for the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters A flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FlowLog beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String networkWatcherName, String flowLogName, FlowLog parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, networkWatcherName, flowLogName, parameters);
    }

    /**
     * Create or update a flow log for the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters A flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FlowLog beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String networkWatcherName, String flowLogName, FlowLog parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, networkWatcherName, flowLogName, parameters, context);
    }

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String networkWatcherName, String flowLogName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, networkWatcherName, flowLogName);
    }

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String networkWatcherName, String flowLogName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, networkWatcherName, flowLogName, context);
    }
}
