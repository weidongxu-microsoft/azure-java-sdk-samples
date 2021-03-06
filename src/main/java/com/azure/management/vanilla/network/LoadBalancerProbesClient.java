// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.network.implementation.LoadBalancerProbesImpl;
import com.azure.management.vanilla.network.models.Probe;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class LoadBalancerProbesClient {
    private LoadBalancerProbesImpl serviceClient;

    /** Initializes an instance of LoadBalancerProbes client. */
    LoadBalancerProbesClient(LoadBalancerProbesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets all the load balancer probes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancer probes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Probe> list(String resourceGroupName, String loadBalancerName) {
        return this.serviceClient.list(resourceGroupName, loadBalancerName);
    }

    /**
     * Gets all the load balancer probes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancer probes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Probe> list(String resourceGroupName, String loadBalancerName, Context context) {
        return this.serviceClient.list(resourceGroupName, loadBalancerName, context);
    }

    /**
     * Gets load balancer probe.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param probeName The name of the probe.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return load balancer probe.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Probe get(String resourceGroupName, String loadBalancerName, String probeName) {
        return this.serviceClient.get(resourceGroupName, loadBalancerName, probeName);
    }

    /**
     * Gets load balancer probe.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param probeName The name of the probe.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return load balancer probe.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Probe get(String resourceGroupName, String loadBalancerName, String probeName, Context context) {
        return this.serviceClient.get(resourceGroupName, loadBalancerName, probeName, context);
    }
}
