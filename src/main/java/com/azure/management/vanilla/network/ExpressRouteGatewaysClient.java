// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.network.implementation.ExpressRouteGatewaysImpl;
import com.azure.management.vanilla.network.models.ExpressRouteGateway;
import com.azure.management.vanilla.network.models.ExpressRouteGatewayList;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class ExpressRouteGatewaysClient {
    private ExpressRouteGatewaysImpl serviceClient;

    /** Initializes an instance of ExpressRouteGateways client. */
    ExpressRouteGatewaysClient(ExpressRouteGatewaysImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists ExpressRoute gateways under a given subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteGatewayList listBySubscription() {
        return this.serviceClient.listBySubscription();
    }

    /**
     * Lists ExpressRoute gateways under a given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteGatewayList listBySubscription(Context context) {
        return this.serviceClient.listBySubscription(context);
    }

    /**
     * Lists ExpressRoute gateways in a given resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteGatewayList listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Lists ExpressRoute gateways in a given resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteGatewayList listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ExpressRouteGateway>, ExpressRouteGateway> beginCreateOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGateway putExpressRouteGatewayParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, expressRouteGatewayName, putExpressRouteGatewayParameters);
    }

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ExpressRouteGateway>, ExpressRouteGateway> beginCreateOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGateway putExpressRouteGatewayParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, expressRouteGatewayName, putExpressRouteGatewayParameters, context);
    }

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteGateway createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGateway putExpressRouteGatewayParameters) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, expressRouteGatewayName, putExpressRouteGatewayParameters);
    }

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteGateway createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGateway putExpressRouteGatewayParameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, expressRouteGatewayName, putExpressRouteGatewayParameters, context);
    }

    /**
     * Fetches the details of a ExpressRoute gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteGateway getByResourceGroup(String resourceGroupName, String expressRouteGatewayName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, expressRouteGatewayName);
    }

    /**
     * Fetches the details of a ExpressRoute gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteGateway getByResourceGroup(
        String resourceGroupName, String expressRouteGatewayName, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, expressRouteGatewayName, context);
    }

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String expressRouteGatewayName) {
        return this.serviceClient.beginDelete(resourceGroupName, expressRouteGatewayName);
    }

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String expressRouteGatewayName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, expressRouteGatewayName, context);
    }

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String expressRouteGatewayName) {
        this.serviceClient.delete(resourceGroupName, expressRouteGatewayName);
    }

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String expressRouteGatewayName, Context context) {
        this.serviceClient.delete(resourceGroupName, expressRouteGatewayName, context);
    }

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteGateway beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGateway putExpressRouteGatewayParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName, expressRouteGatewayName, putExpressRouteGatewayParameters);
    }

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteGateway beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGateway putExpressRouteGatewayParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName, expressRouteGatewayName, putExpressRouteGatewayParameters, context);
    }

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String expressRouteGatewayName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, expressRouteGatewayName);
    }

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String expressRouteGatewayName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, expressRouteGatewayName, context);
    }
}
