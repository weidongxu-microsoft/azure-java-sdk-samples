// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ExpressRoute Port List Resultnull. */
@Fluent
public final class ExpressRoutePortListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRoutePortListResult.class);

    /*
     * A list of ExpressRoutePort resources.
     */
    @JsonProperty(value = "value")
    private List<ExpressRoutePort> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of ExpressRoutePort resources.
     *
     * @return the value value.
     */
    public List<ExpressRoutePort> getValue() {
        return this.value;
    }

    /**
     * Set the value property: A list of ExpressRoutePort resources.
     *
     * @param value the value value to set.
     * @return the ExpressRoutePortListResult object itself.
     */
    public ExpressRoutePortListResult setValue(List<ExpressRoutePort> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ExpressRoutePortListResult object itself.
     */
    public ExpressRoutePortListResult setNextLink(String nextLink) {
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
