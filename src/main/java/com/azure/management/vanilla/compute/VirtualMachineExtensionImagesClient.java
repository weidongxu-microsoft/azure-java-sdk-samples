// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.compute.implementation.VirtualMachineExtensionImagesImpl;
import com.azure.management.vanilla.compute.models.VirtualMachineExtensionImage;
import java.util.List;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class VirtualMachineExtensionImagesClient {
    private VirtualMachineExtensionImagesImpl serviceClient;

    /** Initializes an instance of VirtualMachineExtensionImages client. */
    VirtualMachineExtensionImagesClient(VirtualMachineExtensionImagesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName
     * @param type
     * @param version
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionImage get(String location, String publisherName, String type, String version) {
        return this.serviceClient.get(location, publisherName, type, version);
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName
     * @param type
     * @param version
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionImage get(
        String location, String publisherName, String type, String version, Context context) {
        return this.serviceClient.get(location, publisherName, type, version, context);
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<VirtualMachineExtensionImage> listTypes(String location, String publisherName) {
        return this.serviceClient.listTypes(location, publisherName);
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<VirtualMachineExtensionImage> listTypes(String location, String publisherName, Context context) {
        return this.serviceClient.listTypes(location, publisherName, context);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName
     * @param type
     * @param filter The filter to apply on the operation.
     * @param top
     * @param orderby
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<VirtualMachineExtensionImage> listVersions(
        String location, String publisherName, String type, String filter, Integer top, String orderby) {
        return this.serviceClient.listVersions(location, publisherName, type, filter, top, orderby);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName
     * @param type
     * @param filter The filter to apply on the operation.
     * @param top
     * @param orderby
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<VirtualMachineExtensionImage> listVersions(
        String location,
        String publisherName,
        String type,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        return this.serviceClient.listVersions(location, publisherName, type, filter, top, orderby, context);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName
     * @param type
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<VirtualMachineExtensionImage> listVersions(String location, String publisherName, String type) {
        return this.serviceClient.listVersions(location, publisherName, type);
    }
}