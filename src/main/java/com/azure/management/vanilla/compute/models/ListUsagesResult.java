// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListUsagesResult model. */
@Fluent
public final class ListUsagesResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListUsagesResult.class);

    /*
     * The list of compute resource usages.
     */
    @JsonProperty(value = "value", required = true)
    private List<Usage> value;

    /*
     * The URI to fetch the next page of compute resource usage information.
     * Call ListNext() with this to fetch the next page of compute resource
     * usage information.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of compute resource usages.
     *
     * @return the value value.
     */
    public List<Usage> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The list of compute resource usages.
     *
     * @param value the value value to set.
     * @return the ListUsagesResult object itself.
     */
    public ListUsagesResult setValue(List<Usage> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of compute resource usage information. Call ListNext()
     * with this to fetch the next page of compute resource usage information.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of compute resource usage information. Call ListNext()
     * with this to fetch the next page of compute resource usage information.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListUsagesResult object itself.
     */
    public ListUsagesResult setNextLink(String nextLink) {
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
                    new IllegalArgumentException("Missing required property value in model ListUsagesResult"));
        } else {
            getValue().forEach(e -> e.validate());
        }
    }
}
