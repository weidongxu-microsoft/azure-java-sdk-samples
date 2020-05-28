// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListVpnServerConfigurationsResult model. */
@Fluent
public final class ListVpnServerConfigurationsResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListVpnServerConfigurationsResult.class);

    /*
     * List of VpnServerConfigurations.
     */
    @JsonProperty(value = "value")
    private List<VpnServerConfiguration> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of VpnServerConfigurations.
     *
     * @return the value value.
     */
    public List<VpnServerConfiguration> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of VpnServerConfigurations.
     *
     * @param value the value value to set.
     * @return the ListVpnServerConfigurationsResult object itself.
     */
    public ListVpnServerConfigurationsResult setValue(List<VpnServerConfiguration> value) {
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
     * @return the ListVpnServerConfigurationsResult object itself.
     */
    public ListVpnServerConfigurationsResult setNextLink(String nextLink) {
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