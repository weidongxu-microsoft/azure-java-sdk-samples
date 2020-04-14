// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.vanilla.resources.TagCount;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TagDetails model. */
@Fluent
public final class TagDetailsInner {
    /*
     * The tag ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The tag name.
     */
    @JsonProperty(value = "tagName")
    private String tagName;

    /*
     * The total number of resources that use the resource tag. When a tag is
     * initially created and has no associated resources, the value is 0.
     */
    @JsonProperty(value = "count")
    private TagCount count;

    /*
     * The list of tag values.
     */
    @JsonProperty(value = "values")
    private List<TagValueInner> values;

    /**
     * Get the id property: The tag ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
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
     * @return the TagDetailsInner object itself.
     */
    public TagDetailsInner setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * Get the count property: The total number of resources that use the resource tag. When a tag is initially created
     * and has no associated resources, the value is 0.
     *
     * @return the count value.
     */
    public TagCount getCount() {
        return this.count;
    }

    /**
     * Set the count property: The total number of resources that use the resource tag. When a tag is initially created
     * and has no associated resources, the value is 0.
     *
     * @param count the count value to set.
     * @return the TagDetailsInner object itself.
     */
    public TagDetailsInner setCount(TagCount count) {
        this.count = count;
        return this;
    }

    /**
     * Get the values property: The list of tag values.
     *
     * @return the values value.
     */
    public List<TagValueInner> getValues() {
        return this.values;
    }

    /**
     * Set the values property: The list of tag values.
     *
     * @param values the values value to set.
     * @return the TagDetailsInner object itself.
     */
    public TagDetailsInner setValues(List<TagValueInner> values) {
        this.values = values;
        return this;
    }
}
