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
import com.azure.management.vanilla.network.implementation.ExpressRouteServiceProvidersImpl;
import com.azure.management.vanilla.network.models.ExpressRouteServiceProvider;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class ExpressRouteServiceProvidersClient {
    private ExpressRouteServiceProvidersImpl serviceClient;

    /** Initializes an instance of ExpressRouteServiceProviders client. */
    ExpressRouteServiceProvidersClient(ExpressRouteServiceProvidersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets all the available express route service providers.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the available express route service providers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteServiceProvider> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all the available express route service providers.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the available express route service providers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteServiceProvider> list(Context context) {
        return this.serviceClient.list(context);
    }
}
