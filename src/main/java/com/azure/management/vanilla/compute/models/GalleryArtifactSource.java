// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GalleryArtifactSource model. */
@Fluent
public final class GalleryArtifactSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryArtifactSource.class);

    /*
     * The managed artifact.
     */
    @JsonProperty(value = "managedImage", required = true)
    private ManagedArtifact managedImage;

    /**
     * Get the managedImage property: The managed artifact.
     *
     * @return the managedImage value.
     */
    public ManagedArtifact getManagedImage() {
        return this.managedImage;
    }

    /**
     * Set the managedImage property: The managed artifact.
     *
     * @param managedImage the managedImage value to set.
     * @return the GalleryArtifactSource object itself.
     */
    public GalleryArtifactSource setManagedImage(ManagedArtifact managedImage) {
        this.managedImage = managedImage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getManagedImage() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property managedImage in model GalleryArtifactSource"));
        } else {
            getManagedImage().validate();
        }
    }
}