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
import com.azure.management.vanilla.network.implementation.AvailablePrivateEndpointTypesImpl;
import com.azure.management.vanilla.network.models.AvailablePrivateEndpointType;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class AvailablePrivateEndpointTypesClient {
    private AvailablePrivateEndpointTypesImpl serviceClient;

    /** Initializes an instance of AvailablePrivateEndpointTypes client. */
    AvailablePrivateEndpointTypesClient(AvailablePrivateEndpointTypesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of available PrivateEndpoint types.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailablePrivateEndpointType> list(String location) {
        return this.serviceClient.list(location);
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of available PrivateEndpoint types.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailablePrivateEndpointType> list(String location, Context context) {
        return this.serviceClient.list(location, context);
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of available PrivateEndpoint types.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailablePrivateEndpointType> listByResourceGroup(String location, String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(location, resourceGroupName);
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of available PrivateEndpoint types.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailablePrivateEndpointType> listByResourceGroup(
        String location, String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(location, resourceGroupName, context);
    }
}