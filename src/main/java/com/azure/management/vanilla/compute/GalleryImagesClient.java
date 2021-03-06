// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.compute.implementation.GalleryImagesImpl;
import com.azure.management.vanilla.compute.models.ApiErrorException;
import com.azure.management.vanilla.compute.models.GalleryImage;
import com.azure.management.vanilla.compute.models.GalleryImageUpdate;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class GalleryImagesClient {
    private GalleryImagesImpl serviceClient;

    /** Initializes an instance of GalleryImages client. */
    GalleryImagesClient(GalleryImagesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<GalleryImage>, GalleryImage> beginCreateOrUpdate(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImage galleryImage) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, galleryName, galleryImageName, galleryImage);
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<GalleryImage>, GalleryImage> beginCreateOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        GalleryImage galleryImage,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, galleryName, galleryImageName, galleryImage, context);
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImage createOrUpdate(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImage galleryImage) {
        return this.serviceClient.createOrUpdate(resourceGroupName, galleryName, galleryImageName, galleryImage);
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImage createOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        GalleryImage galleryImage,
        Context context) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, galleryName, galleryImageName, galleryImage, context);
    }

    /**
     * Update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be updated.
     * @param galleryImageName The name of the gallery Image Definition to be updated. The allowed characters are
     *     alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<GalleryImage>, GalleryImage> beginUpdate(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageUpdate galleryImage) {
        return this.serviceClient.beginUpdate(resourceGroupName, galleryName, galleryImageName, galleryImage);
    }

    /**
     * Update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be updated.
     * @param galleryImageName The name of the gallery Image Definition to be updated. The allowed characters are
     *     alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<GalleryImage>, GalleryImage> beginUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        GalleryImageUpdate galleryImage,
        Context context) {
        return this.serviceClient.beginUpdate(resourceGroupName, galleryName, galleryImageName, galleryImage, context);
    }

    /**
     * Update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be updated.
     * @param galleryImageName The name of the gallery Image Definition to be updated. The allowed characters are
     *     alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImage update(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageUpdate galleryImage) {
        return this.serviceClient.update(resourceGroupName, galleryName, galleryImageName, galleryImage);
    }

    /**
     * Update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be updated.
     * @param galleryImageName The name of the gallery Image Definition to be updated. The allowed characters are
     *     alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImage update(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        GalleryImageUpdate galleryImage,
        Context context) {
        return this.serviceClient.update(resourceGroupName, galleryName, galleryImageName, galleryImage, context);
    }

    /**
     * Retrieves information about a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
     * @param galleryImageName The name of the gallery Image Definition to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImage get(String resourceGroupName, String galleryName, String galleryImageName) {
        return this.serviceClient.get(resourceGroupName, galleryName, galleryImageName);
    }

    /**
     * Retrieves information about a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
     * @param galleryImageName The name of the gallery Image Definition to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImage get(String resourceGroupName, String galleryName, String galleryImageName, Context context) {
        return this.serviceClient.get(resourceGroupName, galleryName, galleryImageName, context);
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String galleryName, String galleryImageName) {
        return this.serviceClient.beginDelete(resourceGroupName, galleryName, galleryImageName);
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String galleryName, String galleryImageName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, galleryName, galleryImageName, context);
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String galleryName, String galleryImageName) {
        this.serviceClient.delete(resourceGroupName, galleryName, galleryImageName);
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String galleryName, String galleryImageName, Context context) {
        this.serviceClient.delete(resourceGroupName, galleryName, galleryImageName, context);
    }

    /**
     * List gallery Image Definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which Image Definitions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<GalleryImage> listByGallery(String resourceGroupName, String galleryName) {
        return this.serviceClient.listByGallery(resourceGroupName, galleryName);
    }

    /**
     * List gallery Image Definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which Image Definitions are to be listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<GalleryImage> listByGallery(String resourceGroupName, String galleryName, Context context) {
        return this.serviceClient.listByGallery(resourceGroupName, galleryName, context);
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImage beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImage galleryImage) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, galleryName, galleryImageName, galleryImage);
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImage beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        GalleryImage galleryImage,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, galleryName, galleryImageName, galleryImage, context);
    }

    /**
     * Update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be updated.
     * @param galleryImageName The name of the gallery Image Definition to be updated. The allowed characters are
     *     alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImage beginUpdateWithoutPolling(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageUpdate galleryImage) {
        return this
            .serviceClient
            .beginUpdateWithoutPolling(resourceGroupName, galleryName, galleryImageName, galleryImage);
    }

    /**
     * Update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be updated.
     * @param galleryImageName The name of the gallery Image Definition to be updated. The allowed characters are
     *     alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImage beginUpdateWithoutPolling(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        GalleryImageUpdate galleryImage,
        Context context) {
        return this
            .serviceClient
            .beginUpdateWithoutPolling(resourceGroupName, galleryName, galleryImageName, galleryImage, context);
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String galleryName, String galleryImageName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, galleryName, galleryImageName);
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String galleryName, String galleryImageName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, galleryName, galleryImageName, context);
    }
}
