// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GalleryApplicationList model. */
@Fluent
public final class GalleryApplicationList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryApplicationList.class);

    /*
     * A list of Gallery Applications.
     */
    @JsonProperty(value = "value", required = true)
    private List<GalleryApplication> value;

    /*
     * The uri to fetch the next page of Application Definitions in the
     * Application Gallery. Call ListNext() with this to fetch the next page of
     * gallery Application Definitions.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of Gallery Applications.
     *
     * @return the value value.
     */
    public List<GalleryApplication> getValue() {
        return this.value;
    }

    /**
     * Set the value property: A list of Gallery Applications.
     *
     * @param value the value value to set.
     * @return the GalleryApplicationList object itself.
     */
    public GalleryApplicationList setValue(List<GalleryApplication> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Application Definitions in the Application Gallery.
     * Call ListNext() with this to fetch the next page of gallery Application Definitions.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Application Definitions in the Application Gallery.
     * Call ListNext() with this to fetch the next page of gallery Application Definitions.
     *
     * @param nextLink the nextLink value to set.
     * @return the GalleryApplicationList object itself.
     */
    public GalleryApplicationList setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValue() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model GalleryApplicationList"));
        } else {
            getValue().forEach(e -> e.validate());
        }
    }
}