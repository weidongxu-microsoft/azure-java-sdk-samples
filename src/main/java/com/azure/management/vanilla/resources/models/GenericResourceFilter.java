// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GenericResourceFilter model. */
@Fluent
public final class GenericResourceFilter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GenericResourceFilter.class);

    /*
     * The resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The tag name.
     */
    @JsonProperty(value = "tagname")
    private String tagName;

    /*
     * The tag value.
     */
    @JsonProperty(value = "tagvalue")
    private String tagValue;

    /**
     * Get the resourceType property: The resource type.
     *
     * @return the resourceType value.
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resource type.
     *
     * @param resourceType the resourceType value to set.
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the tagName property: The tag name.
     *
     * @return the tagName value.
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * Set the tagName property: The tag name.
     *
     * @param tagName the tagName value to set.
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * Get the tagValue property: The tag value.
     *
     * @return the tagValue value.
     */
    public String getTagValue() {
        return this.tagValue;
    }

    /**
     * Set the tagValue property: The tag value.
     *
     * @param tagValue the tagValue value to set.
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
