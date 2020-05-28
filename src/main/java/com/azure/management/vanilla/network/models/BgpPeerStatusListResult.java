// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The BgpPeerStatusListResult model. */
@Fluent
public final class BgpPeerStatusListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BgpPeerStatusListResult.class);

    /*
     * List of BGP peers.
     */
    @JsonProperty(value = "value")
    private List<BgpPeerStatus> value;

    /**
     * Get the value property: List of BGP peers.
     *
     * @return the value value.
     */
    public List<BgpPeerStatus> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of BGP peers.
     *
     * @param value the value value to set.
     * @return the BgpPeerStatusListResult object itself.
     */
    public BgpPeerStatusListResult setValue(List<BgpPeerStatus> value) {
        this.value = value;
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
