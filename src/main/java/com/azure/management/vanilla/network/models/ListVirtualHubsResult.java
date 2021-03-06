// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListVirtualHubsResult model. */
@Fluent
public final class ListVirtualHubsResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListVirtualHubsResult.class);

    /*
     * List of VirtualHubs.
     */
    @JsonProperty(value = "value")
    private List<VirtualHub> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of VirtualHubs.
     *
     * @return the value value.
     */
    public List<VirtualHub> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of VirtualHubs.
     *
     * @param value the value value to set.
     * @return the ListVirtualHubsResult object itself.
     */
    public ListVirtualHubsResult setValue(List<VirtualHub> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListVirtualHubsResult object itself.
     */
    public ListVirtualHubsResult setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValue() != null) {
            getValue().forEach(e -> e.validate());
        }
    }
}
