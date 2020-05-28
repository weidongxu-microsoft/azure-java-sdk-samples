// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.network.implementation.VpnServerConfigurationsAssociatedWithVirtualWansImpl;
import com.azure.management.vanilla.network.models.VpnServerConfigurationsResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class VpnServerConfigurationsAssociatedWithVirtualWanAsyncClient {
    private VpnServerConfigurationsAssociatedWithVirtualWansImpl serviceClient;

    /** Initializes an instance of VpnServerConfigurationsAssociatedWithVirtualWans client. */
    VpnServerConfigurationsAssociatedWithVirtualWanAsyncClient(
        VpnServerConfigurationsAssociatedWithVirtualWansImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> listWithResponse(String resourceGroupName, String virtualWanName) {
        return this.serviceClient.listWithResponseAsync(resourceGroupName, virtualWanName);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> listWithResponse(
        String resourceGroupName, String virtualWanName, Context context) {
        return this.serviceClient.listWithResponseAsync(resourceGroupName, virtualWanName, context);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<VpnServerConfigurationsResponse>, VpnServerConfigurationsResponse> beginList(
        String resourceGroupName, String virtualWanName) {
        return this.serviceClient.beginList(resourceGroupName, virtualWanName);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<VpnServerConfigurationsResponse>, VpnServerConfigurationsResponse> beginList(
        String resourceGroupName, String virtualWanName, Context context) {
        return this.serviceClient.beginList(resourceGroupName, virtualWanName, context);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponse> list(String resourceGroupName, String virtualWanName) {
        return this.serviceClient.listAsync(resourceGroupName, virtualWanName);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponse> list(
        String resourceGroupName, String virtualWanName, Context context) {
        return this.serviceClient.listAsync(resourceGroupName, virtualWanName, context);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<VpnServerConfigurationsResponse>> beginListWithoutPollingWithResponse(
        String resourceGroupName, String virtualWanName) {
        return this.serviceClient.beginListWithoutPollingWithResponseAsync(resourceGroupName, virtualWanName);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<VpnServerConfigurationsResponse>> beginListWithoutPollingWithResponse(
        String resourceGroupName, String virtualWanName, Context context) {
        return this.serviceClient.beginListWithoutPollingWithResponseAsync(resourceGroupName, virtualWanName, context);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponse> beginListWithoutPolling(
        String resourceGroupName, String virtualWanName) {
        return this.serviceClient.beginListWithoutPollingAsync(resourceGroupName, virtualWanName);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponse> beginListWithoutPolling(
        String resourceGroupName, String virtualWanName, Context context) {
        return this.serviceClient.beginListWithoutPollingAsync(resourceGroupName, virtualWanName, context);
    }
}