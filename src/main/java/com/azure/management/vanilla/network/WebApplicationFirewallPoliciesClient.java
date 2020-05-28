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
import com.azure.management.vanilla.network.implementation.WebApplicationFirewallPoliciesImpl;
import com.azure.management.vanilla.network.models.WebApplicationFirewallPolicy;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class WebApplicationFirewallPoliciesClient {
    private WebApplicationFirewallPoliciesImpl serviceClient;

    /** Initializes an instance of WebApplicationFirewallPolicies client. */
    WebApplicationFirewallPoliciesClient(WebApplicationFirewallPoliciesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list WebApplicationFirewallPolicies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WebApplicationFirewallPolicy> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list WebApplicationFirewallPolicies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WebApplicationFirewallPolicy> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Gets all the WAF policies in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the WAF policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WebApplicationFirewallPolicy> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all the WAF policies in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the WAF policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WebApplicationFirewallPolicy> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WebApplicationFirewallPolicy getByResourceGroup(String resourceGroupName, String policyName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, policyName);
    }

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WebApplicationFirewallPolicy getByResourceGroup(
        String resourceGroupName, String policyName, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, policyName, context);
    }

    /**
     * Creates or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param parameters Defines web application firewall policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WebApplicationFirewallPolicy createOrUpdate(
        String resourceGroupName, String policyName, WebApplicationFirewallPolicy parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, policyName, parameters);
    }

    /**
     * Creates or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param parameters Defines web application firewall policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WebApplicationFirewallPolicy createOrUpdate(
        String resourceGroupName, String policyName, WebApplicationFirewallPolicy parameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, policyName, parameters, context);
    }

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String policyName) {
        return this.serviceClient.beginDelete(resourceGroupName, policyName);
    }

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String policyName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, policyName, context);
    }

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String policyName) {
        this.serviceClient.delete(resourceGroupName, policyName);
    }

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String policyName, Context context) {
        this.serviceClient.delete(resourceGroupName, policyName, context);
    }

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String policyName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, policyName);
    }

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param policyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String policyName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, policyName, context);
    }
}