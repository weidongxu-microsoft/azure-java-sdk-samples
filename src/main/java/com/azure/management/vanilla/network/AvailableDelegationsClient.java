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
import com.azure.management.vanilla.network.implementation.AvailableDelegationsImpl;
import com.azure.management.vanilla.network.models.AvailableDelegation;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class AvailableDelegationsClient {
    private AvailableDelegationsImpl serviceClient;

    /** Initializes an instance of AvailableDelegations client. */
    AvailableDelegationsClient(AvailableDelegationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets all of the available subnet delegations for this subscription in this region.
     *
     * @param location The location of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of the available subnet delegations for this subscription in this region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailableDelegation> list(String location) {
        return this.serviceClient.list(location);
    }

    /**
     * Gets all of the available subnet delegations for this subscription in this region.
     *
     * @param location The location of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of the available subnet delegations for this subscription in this region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailableDelegation> list(String location, Context context) {
        return this.serviceClient.list(location, context);
    }
}