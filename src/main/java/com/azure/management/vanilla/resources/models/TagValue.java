// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TagValue model. */
@Fluent
public final class TagValue {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TagValue.class);

    /*
     * The tag ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The tag value.
     */
    @JsonProperty(value = "tagValue")
    private String tagValue;

    /*
     * The tag value count.
     */
    @JsonProperty(value = "count")
    private TagCount count;

    /**
     * Get the id property: The tag ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
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
     * @return the TagValue object itself.
     */
    public TagValue setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * Get the count property: The tag value count.
     *
     * @return the count value.
     */
    public TagCount getCount() {
        return this.count;
    }

    /**
     * Set the count property: The tag value count.
     *
     * @param count the count value to set.
     * @return the TagValue object itself.
     */
    public TagValue setCount(TagCount count) {
        this.count = count;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getCount() != null) {
            getCount().validate();
        }
    }
}