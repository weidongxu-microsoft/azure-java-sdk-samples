// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.compute.implementation.ImagesImpl;
import com.azure.management.vanilla.compute.models.Image;
import com.azure.management.vanilla.compute.models.ImageUpdate;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class ImagesClient {
    private ImagesImpl serviceClient;

    /** Initializes an instance of Images client. */
    ImagesClient(ImagesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create or update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. The virtual hard disk will be copied before being
     *     attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not
     *     exist.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Image>, Image> beginCreateOrUpdate(
        String resourceGroupName, String imageName, Image parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, imageName, parameters);
    }

    /**
     * Create or update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. The virtual hard disk will be copied before being
     *     attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not
     *     exist.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Image>, Image> beginCreateOrUpdate(
        String resourceGroupName, String imageName, Image parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, imageName, parameters, context);
    }

    /**
     * Create or update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. The virtual hard disk will be copied before being
     *     attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not
     *     exist.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image createOrUpdate(String resourceGroupName, String imageName, Image parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, imageName, parameters);
    }

    /**
     * Create or update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. The virtual hard disk will be copied before being
     *     attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not
     *     exist.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image createOrUpdate(String resourceGroupName, String imageName, Image parameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, imageName, parameters, context);
    }

    /**
     * Update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Image>, Image> beginUpdate(
        String resourceGroupName, String imageName, ImageUpdate parameters) {
        return this.serviceClient.beginUpdate(resourceGroupName, imageName, parameters);
    }

    /**
     * Update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. Only tags may be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Image>, Image> beginUpdate(
        String resourceGroupName, String imageName, ImageUpdate parameters, Context context) {
        return this.serviceClient.beginUpdate(resourceGroupName, imageName, parameters, context);
    }

    /**
     * Update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image update(String resourceGroupName, String imageName, ImageUpdate parameters) {
        return this.serviceClient.update(resourceGroupName, imageName, parameters);
    }

    /**
     * Update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. Only tags may be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image update(String resourceGroupName, String imageName, ImageUpdate parameters, Context context) {
        return this.serviceClient.update(resourceGroupName, imageName, parameters, context);
    }

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String imageName) {
        return this.serviceClient.beginDelete(resourceGroupName, imageName);
    }

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String imageName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, imageName, context);
    }

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String imageName) {
        this.serviceClient.delete(resourceGroupName, imageName);
    }

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String imageName, Context context) {
        this.serviceClient.delete(resourceGroupName, imageName, context);
    }

    /**
     * Gets an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param expand The expand expression to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image getByResourceGroup(String resourceGroupName, String imageName, String expand) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, imageName, expand);
    }

    /**
     * Gets an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image getByResourceGroup(String resourceGroupName, String imageName, String expand, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, imageName, expand, context);
    }

    /**
     * Gets an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image getByResourceGroup(String resourceGroupName, String imageName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, imageName);
    }

    /**
     * Gets the list of images under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of images under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Image> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Gets the list of images under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of images under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Image> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Images in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Image> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Images in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Image> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Create or update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. The virtual hard disk will be copied before being
     *     attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not
     *     exist.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image beginCreateOrUpdateWithoutPolling(String resourceGroupName, String imageName, Image parameters) {
        return this.serviceClient.beginCreateOrUpdateWithoutPolling(resourceGroupName, imageName, parameters);
    }

    /**
     * Create or update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. The virtual hard disk will be copied before being
     *     attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not
     *     exist.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String imageName, Image parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdateWithoutPolling(resourceGroupName, imageName, parameters, context);
    }

    /**
     * Update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image beginUpdateWithoutPolling(String resourceGroupName, String imageName, ImageUpdate parameters) {
        return this.serviceClient.beginUpdateWithoutPolling(resourceGroupName, imageName, parameters);
    }

    /**
     * Update an image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters The source user image virtual hard disk. Only tags may be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Image beginUpdateWithoutPolling(
        String resourceGroupName, String imageName, ImageUpdate parameters, Context context) {
        return this.serviceClient.beginUpdateWithoutPolling(resourceGroupName, imageName, parameters, context);
    }

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String imageName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, imageName);
    }

    /**
     * Deletes an Image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String imageName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, imageName, context);
    }
}