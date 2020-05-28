// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.compute.implementation.VirtualMachineRunCommandsImpl;
import com.azure.management.vanilla.compute.models.RunCommandDocument;
import com.azure.management.vanilla.compute.models.RunCommandDocumentBase;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class VirtualMachineRunCommandsClient {
    private VirtualMachineRunCommandsImpl serviceClient;

    /** Initializes an instance of VirtualMachineRunCommands client. */
    VirtualMachineRunCommandsClient(VirtualMachineRunCommandsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RunCommandDocumentBase> list(String location) {
        return this.serviceClient.list(location);
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RunCommandDocumentBase> list(String location, Context context) {
        return this.serviceClient.list(location, context);
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific run command for a subscription in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RunCommandDocument get(String location, String commandId) {
        return this.serviceClient.get(location, commandId);
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific run command for a subscription in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RunCommandDocument get(String location, String commandId, Context context) {
        return this.serviceClient.get(location, commandId, context);
    }
}
