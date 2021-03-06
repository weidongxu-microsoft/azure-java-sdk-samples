// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PeerExpressRouteCircuitConnectionListResult model. */
@Fluent
public final class PeerExpressRouteCircuitConnectionListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeerExpressRouteCircuitConnectionListResult.class);

    /*
     * The global reach peer circuit connection associated with Private Peering
     * in an ExpressRoute Circuit.
     */
    @JsonProperty(value = "value")
    private List<PeerExpressRouteCircuitConnection> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The global reach peer circuit connection associated with Private Peering in an
     * ExpressRoute Circuit.
     *
     * @return the value value.
     */
    public List<PeerExpressRouteCircuitConnection> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The global reach peer circuit connection associated with Private Peering in an
     * ExpressRoute Circuit.
     *
     * @param value the value value to set.
     * @return the PeerExpressRouteCircuitConnectionListResult object itself.
     */
    public PeerExpressRouteCircuitConnectionListResult setValue(List<PeerExpressRouteCircuitConnection> value) {
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
     * @return the PeerExpressRouteCircuitConnectionListResult object itself.
     */
    public PeerExpressRouteCircuitConnectionListResult setNextLink(String nextLink) {
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
