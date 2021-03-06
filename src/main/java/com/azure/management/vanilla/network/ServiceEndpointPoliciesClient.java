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
import com.azure.management.vanilla.network.implementation.ServiceEndpointPoliciesImpl;
import com.azure.management.vanilla.network.models.ServiceEndpointPolicy;
import java.util.Map;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class ServiceEndpointPoliciesClient {
    private ServiceEndpointPoliciesImpl serviceClient;

    /** Initializes an instance of ServiceEndpointPolicies client. */
    ServiceEndpointPoliciesClient(ServiceEndpointPoliciesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serviceEndpointPolicyName) {
        return this.serviceClient.beginDelete(resourceGroupName, serviceEndpointPolicyName);
    }

    /**
     * Deletes the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serviceEndpointPolicyName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, serviceEndpointPolicyName, context);
    }

    /**
     * Deletes the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serviceEndpointPolicyName) {
        this.serviceClient.delete(resourceGroupName, serviceEndpointPolicyName);
    }

    /**
     * Deletes the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serviceEndpointPolicyName, Context context) {
        this.serviceClient.delete(resourceGroupName, serviceEndpointPolicyName, context);
    }

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicy getByResourceGroup(
        String resourceGroupName, String serviceEndpointPolicyName, String expand) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, serviceEndpointPolicyName, expand);
    }

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicy getByResourceGroup(
        String resourceGroupName, String serviceEndpointPolicyName, String expand, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, serviceEndpointPolicyName, expand, context);
    }

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicy getByResourceGroup(String resourceGroupName, String serviceEndpointPolicyName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, serviceEndpointPolicyName);
    }

    /**
     * Creates or updates a service Endpoint Policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Service End point policy resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ServiceEndpointPolicy>, ServiceEndpointPolicy> beginCreateOrUpdate(
        String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicy parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, serviceEndpointPolicyName, parameters);
    }

    /**
     * Creates or updates a service Endpoint Policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Service End point policy resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ServiceEndpointPolicy>, ServiceEndpointPolicy> beginCreateOrUpdate(
        String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicy parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, serviceEndpointPolicyName, parameters, context);
    }

    /**
     * Creates or updates a service Endpoint Policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Service End point policy resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicy createOrUpdate(
        String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicy parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, serviceEndpointPolicyName, parameters);
    }

    /**
     * Creates or updates a service Endpoint Policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Service End point policy resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicy createOrUpdate(
        String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicy parameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, serviceEndpointPolicyName, parameters, context);
    }

    /**
     * Updates tags of a service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicy updateTags(
        String resourceGroupName, String serviceEndpointPolicyName, Map<String, String> tags) {
        return this.serviceClient.updateTags(resourceGroupName, serviceEndpointPolicyName, tags);
    }

    /**
     * Updates tags of a service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicy updateTags(
        String resourceGroupName, String serviceEndpointPolicyName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTags(resourceGroupName, serviceEndpointPolicyName, tags, context);
    }

    /**
     * Gets all the service endpoint policies in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service endpoint policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceEndpointPolicy> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all the service endpoint policies in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service endpoint policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceEndpointPolicy> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Gets all service endpoint Policies in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint Policies in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceEndpointPolicy> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Gets all service endpoint Policies in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint Policies in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceEndpointPolicy> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Deletes the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String serviceEndpointPolicyName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, serviceEndpointPolicyName);
    }

    /**
     * Deletes the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String serviceEndpointPolicyName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, serviceEndpointPolicyName, context);
    }

    /**
     * Creates or updates a service Endpoint Policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Service End point policy resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicy beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicy parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, serviceEndpointPolicyName, parameters);
    }

    /**
     * Creates or updates a service Endpoint Policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param parameters Service End point policy resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service End point policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicy beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String serviceEndpointPolicyName, ServiceEndpointPolicy parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, serviceEndpointPolicyName, parameters, context);
    }
}
