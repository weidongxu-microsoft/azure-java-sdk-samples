// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.network.implementation.ResourceNavigationLinksImpl;
import com.azure.management.vanilla.network.models.ResourceNavigationLinksListResult;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class ResourceNavigationLinksClient {
    private ResourceNavigationLinksImpl serviceClient;

    /** Initializes an instance of ResourceNavigationLinks client. */
    ResourceNavigationLinksClient(ResourceNavigationLinksImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets a list of resource navigation links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of resource navigation links for a subnet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceNavigationLinksListResult list(
        String resourceGroupName, String virtualNetworkName, String subnetName) {
        return this.serviceClient.list(resourceGroupName, virtualNetworkName, subnetName);
    }

    /**
     * Gets a list of resource navigation links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of resource navigation links for a subnet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceNavigationLinksListResult list(
        String resourceGroupName, String virtualNetworkName, String subnetName, Context context) {
        return this.serviceClient.list(resourceGroupName, virtualNetworkName, subnetName, context);
    }
}
