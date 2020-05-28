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
import com.azure.management.vanilla.network.implementation.DdosProtectionPlansImpl;
import com.azure.management.vanilla.network.models.DdosProtectionPlan;
import java.util.Map;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class DdosProtectionPlansClient {
    private DdosProtectionPlansImpl serviceClient;

    /** Initializes an instance of DdosProtectionPlans client. */
    DdosProtectionPlansClient(DdosProtectionPlansImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String ddosProtectionPlanName) {
        return this.serviceClient.beginDelete(resourceGroupName, ddosProtectionPlanName);
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String ddosProtectionPlanName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, ddosProtectionPlanName, context);
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String ddosProtectionPlanName) {
        this.serviceClient.delete(resourceGroupName, ddosProtectionPlanName);
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String ddosProtectionPlanName, Context context) {
        this.serviceClient.delete(resourceGroupName, ddosProtectionPlanName, context);
    }

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified DDoS protection plan.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DdosProtectionPlan getByResourceGroup(String resourceGroupName, String ddosProtectionPlanName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, ddosProtectionPlanName);
    }

    /**
     * Gets information about the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified DDoS protection plan.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DdosProtectionPlan getByResourceGroup(
        String resourceGroupName, String ddosProtectionPlanName, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, ddosProtectionPlanName, context);
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters A DDoS protection plan in a resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<DdosProtectionPlan>, DdosProtectionPlan> beginCreateOrUpdate(
        String resourceGroupName, String ddosProtectionPlanName, DdosProtectionPlan parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, ddosProtectionPlanName, parameters);
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters A DDoS protection plan in a resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<DdosProtectionPlan>, DdosProtectionPlan> beginCreateOrUpdate(
        String resourceGroupName, String ddosProtectionPlanName, DdosProtectionPlan parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, ddosProtectionPlanName, parameters, context);
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters A DDoS protection plan in a resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DdosProtectionPlan createOrUpdate(
        String resourceGroupName, String ddosProtectionPlanName, DdosProtectionPlan parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, ddosProtectionPlanName, parameters);
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters A DDoS protection plan in a resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DdosProtectionPlan createOrUpdate(
        String resourceGroupName, String ddosProtectionPlanName, DdosProtectionPlan parameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, ddosProtectionPlanName, parameters, context);
    }

    /**
     * Update a DDoS protection plan tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DdosProtectionPlan updateTags(
        String resourceGroupName, String ddosProtectionPlanName, Map<String, String> tags) {
        return this.serviceClient.updateTags(resourceGroupName, ddosProtectionPlanName, tags);
    }

    /**
     * Update a DDoS protection plan tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DdosProtectionPlan updateTags(
        String resourceGroupName, String ddosProtectionPlanName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTags(resourceGroupName, ddosProtectionPlanName, tags, context);
    }

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all DDoS protection plans in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DdosProtectionPlan> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all DDoS protection plans in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all DDoS protection plans in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DdosProtectionPlan> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DDoS protection plans in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DdosProtectionPlan> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Gets all the DDoS protection plans in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DDoS protection plans in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DdosProtectionPlan> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String ddosProtectionPlanName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, ddosProtectionPlanName);
    }

    /**
     * Deletes the specified DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String ddosProtectionPlanName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, ddosProtectionPlanName, context);
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters A DDoS protection plan in a resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DdosProtectionPlan beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String ddosProtectionPlanName, DdosProtectionPlan parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, ddosProtectionPlanName, parameters);
    }

    /**
     * Creates or updates a DDoS protection plan.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosProtectionPlanName The name of the DDoS protection plan.
     * @param parameters A DDoS protection plan in a resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS protection plan in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DdosProtectionPlan beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String ddosProtectionPlanName, DdosProtectionPlan parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, ddosProtectionPlanName, parameters, context);
    }
}