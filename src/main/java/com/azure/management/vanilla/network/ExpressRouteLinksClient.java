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
import com.azure.management.vanilla.network.implementation.ExpressRouteLinksImpl;
import com.azure.management.vanilla.network.models.ExpressRouteLink;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class ExpressRouteLinksClient {
    private ExpressRouteLinksImpl serviceClient;

    /** Initializes an instance of ExpressRouteLinks client. */
    ExpressRouteLinksClient(ExpressRouteLinksImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteLink child resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteLink get(String resourceGroupName, String expressRoutePortName, String linkName) {
        return this.serviceClient.get(resourceGroupName, expressRoutePortName, linkName);
    }

    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteLink child resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteLink get(
        String resourceGroupName, String expressRoutePortName, String linkName, Context context) {
        return this.serviceClient.get(resourceGroupName, expressRoutePortName, linkName, context);
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteLinks API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteLink> list(String resourceGroupName, String expressRoutePortName) {
        return this.serviceClient.list(resourceGroupName, expressRoutePortName);
    }

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteLinks API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteLink> list(
        String resourceGroupName, String expressRoutePortName, Context context) {
        return this.serviceClient.list(resourceGroupName, expressRoutePortName, context);
    }
}
