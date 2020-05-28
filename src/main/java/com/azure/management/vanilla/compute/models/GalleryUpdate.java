// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GalleryUpdate model. */
@JsonFlatten
@Fluent
public class GalleryUpdate extends UpdateResourceDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryUpdate.class);

    /*
     * The description of this Shared Image Gallery resource. This property is
     * updatable.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Describes the gallery unique name.
     */
    @JsonProperty(value = "properties.identifier")
    private GalleryIdentifier identifier;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryPropertiesProvisioningState provisioningState;

    /**
     * Get the description property: The description of this Shared Image Gallery resource. This property is updatable.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of this Shared Image Gallery resource. This property is updatable.
     *
     * @param description the description value to set.
     * @return the GalleryUpdate object itself.
     */
    public GalleryUpdate setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the identifier property: Describes the gallery unique name.
     *
     * @return the identifier value.
     */
    public GalleryIdentifier getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Describes the gallery unique name.
     *
     * @param identifier the identifier value to set.
     * @return the GalleryUpdate object itself.
     */
    public GalleryUpdate setIdentifier(GalleryIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryPropertiesProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (getIdentifier() != null) {
            getIdentifier().validate();
        }
    }
}
