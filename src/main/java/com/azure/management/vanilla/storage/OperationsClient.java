// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.storage.implementation.OperationsImpl;
import com.azure.management.vanilla.storage.models.Operation;

/** Initializes a new instance of the synchronous StorageManagementClient type. */
@ServiceClient(builder = StorageManagementClientBuilder.class)
public final class OperationsClient {
    private OperationsImpl serviceClient;

    /** Initializes an instance of Operations client. */
    OperationsClient(OperationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists all of the available Storage Rest API operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Storage operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Operation> list() {
        return this.serviceClient.list();
    }

    /**
     * Lists all of the available Storage Rest API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Storage operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Operation> list(Context context) {
        return this.serviceClient.list(context);
    }
}
