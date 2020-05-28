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
import com.azure.management.vanilla.network.implementation.ConnectionMonitorsImpl;
import com.azure.management.vanilla.network.models.ConnectionMonitor;
import com.azure.management.vanilla.network.models.ConnectionMonitorQueryResult;
import com.azure.management.vanilla.network.models.ConnectionMonitorResult;
import java.util.Map;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class ConnectionMonitorsClient {
    private ConnectionMonitorsImpl serviceClient;

    /** Initializes an instance of ConnectionMonitors client. */
    ConnectionMonitorsClient(ConnectionMonitorsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create or update a connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param parameters Parameters that define the operation to create a connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the connection monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ConnectionMonitorResult>, ConnectionMonitorResult> beginCreateOrUpdate(
        String resourceGroupName,
        String networkWatcherName,
        String connectionMonitorName,
        ConnectionMonitor parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, networkWatcherName, connectionMonitorName, parameters);
    }

    /**
     * Create or update a connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param parameters Parameters that define the operation to create a connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the connection monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ConnectionMonitorResult>, ConnectionMonitorResult> beginCreateOrUpdate(
        String resourceGroupName,
        String networkWatcherName,
        String connectionMonitorName,
        ConnectionMonitor parameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, networkWatcherName, connectionMonitorName, parameters, context);
    }

    /**
     * Create or update a connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param parameters Parameters that define the operation to create a connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the connection monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorResult createOrUpdate(
        String resourceGroupName,
        String networkWatcherName,
        String connectionMonitorName,
        ConnectionMonitor parameters) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, networkWatcherName, connectionMonitorName, parameters);
    }

    /**
     * Create or update a connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param parameters Parameters that define the operation to create a connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the connection monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorResult createOrUpdate(
        String resourceGroupName,
        String networkWatcherName,
        String connectionMonitorName,
        ConnectionMonitor parameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, networkWatcherName, connectionMonitorName, parameters, context);
    }

    /**
     * Gets a connection monitor by name.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connection monitor by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorResult get(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        return this.serviceClient.get(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Gets a connection monitor by name.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connection monitor by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorResult get(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        return this.serviceClient.get(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Deletes the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        return this.serviceClient.beginDelete(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Deletes the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Deletes the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        this.serviceClient.delete(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Deletes the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        this.serviceClient.delete(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Update tags of the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param connectionMonitorName The name of the connection monitor.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the connection monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorResult updateTags(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Map<String, String> tags) {
        return this.serviceClient.updateTags(resourceGroupName, networkWatcherName, connectionMonitorName, tags);
    }

    /**
     * Update tags of the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param connectionMonitorName The name of the connection monitor.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the connection monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorResult updateTags(
        String resourceGroupName,
        String networkWatcherName,
        String connectionMonitorName,
        Map<String, String> tags,
        Context context) {
        return this
            .serviceClient
            .updateTags(resourceGroupName, networkWatcherName, connectionMonitorName, tags, context);
    }

    /**
     * Stops the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginStop(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        return this.serviceClient.beginStop(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Stops the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginStop(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        return this.serviceClient.beginStop(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Stops the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void stop(String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        this.serviceClient.stop(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Stops the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void stop(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        this.serviceClient.stop(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Starts the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginStart(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        return this.serviceClient.beginStart(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Starts the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginStart(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        return this.serviceClient.beginStart(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Starts the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void start(String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        this.serviceClient.start(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Starts the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void start(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        this.serviceClient.start(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Query a snapshot of the most recent connection states.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name given to the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection states snapshots.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ConnectionMonitorQueryResult>, ConnectionMonitorQueryResult> beginQuery(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        return this.serviceClient.beginQuery(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Query a snapshot of the most recent connection states.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name given to the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection states snapshots.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ConnectionMonitorQueryResult>, ConnectionMonitorQueryResult> beginQuery(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        return this.serviceClient.beginQuery(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Query a snapshot of the most recent connection states.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name given to the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection states snapshots.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorQueryResult query(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        return this.serviceClient.query(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Query a snapshot of the most recent connection states.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name given to the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection states snapshots.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorQueryResult query(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        return this.serviceClient.query(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Lists all connection monitors for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection monitors.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ConnectionMonitorResult> list(String resourceGroupName, String networkWatcherName) {
        return this.serviceClient.list(resourceGroupName, networkWatcherName);
    }

    /**
     * Lists all connection monitors for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection monitors.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ConnectionMonitorResult> list(
        String resourceGroupName, String networkWatcherName, Context context) {
        return this.serviceClient.list(resourceGroupName, networkWatcherName, context);
    }

    /**
     * Create or update a connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param parameters Parameters that define the operation to create a connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the connection monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorResult beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String networkWatcherName,
        String connectionMonitorName,
        ConnectionMonitor parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName, networkWatcherName, connectionMonitorName, parameters);
    }

    /**
     * Create or update a connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param parameters Parameters that define the operation to create a connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the connection monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorResult beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String networkWatcherName,
        String connectionMonitorName,
        ConnectionMonitor parameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName, networkWatcherName, connectionMonitorName, parameters, context);
    }

    /**
     * Deletes the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Deletes the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        this
            .serviceClient
            .beginDeleteWithoutPolling(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Stops the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginStopWithoutPolling(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        this.serviceClient.beginStopWithoutPolling(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Stops the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginStopWithoutPolling(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        this
            .serviceClient
            .beginStopWithoutPolling(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Starts the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginStartWithoutPolling(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        this.serviceClient.beginStartWithoutPolling(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Starts the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginStartWithoutPolling(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        this
            .serviceClient
            .beginStartWithoutPolling(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }

    /**
     * Query a snapshot of the most recent connection states.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name given to the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection states snapshots.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorQueryResult beginQueryWithoutPolling(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        return this
            .serviceClient
            .beginQueryWithoutPolling(resourceGroupName, networkWatcherName, connectionMonitorName);
    }

    /**
     * Query a snapshot of the most recent connection states.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name given to the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection states snapshots.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConnectionMonitorQueryResult beginQueryWithoutPolling(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context) {
        return this
            .serviceClient
            .beginQueryWithoutPolling(resourceGroupName, networkWatcherName, connectionMonitorName, context);
    }
}
