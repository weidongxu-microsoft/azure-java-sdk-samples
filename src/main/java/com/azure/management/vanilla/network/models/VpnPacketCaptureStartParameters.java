// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VpnPacketCaptureStartParameters model. */
@Fluent
public final class VpnPacketCaptureStartParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnPacketCaptureStartParameters.class);

    /*
     * Start Packet capture parameters.
     */
    @JsonProperty(value = "filterData")
    private String filterData;

    /**
     * Get the filterData property: Start Packet capture parameters.
     *
     * @return the filterData value.
     */
    public String getFilterData() {
        return this.filterData;
    }

    /**
     * Set the filterData property: Start Packet capture parameters.
     *
     * @param filterData the filterData value to set.
     * @return the VpnPacketCaptureStartParameters object itself.
     */
    public VpnPacketCaptureStartParameters setFilterData(String filterData) {
        this.filterData = filterData;
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
