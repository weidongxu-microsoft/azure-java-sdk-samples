// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DnsNameAvailabilityResult model. */
@Fluent
public final class DnsNameAvailabilityResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DnsNameAvailabilityResult.class);

    /*
     * Domain availability (True/False).
     */
    @JsonProperty(value = "available")
    private Boolean available;

    /**
     * Get the available property: Domain availability (True/False).
     *
     * @return the available value.
     */
    public Boolean isAvailable() {
        return this.available;
    }

    /**
     * Set the available property: Domain availability (True/False).
     *
     * @param available the available value to set.
     * @return the DnsNameAvailabilityResult object itself.
     */
    public DnsNameAvailabilityResult setAvailable(Boolean available) {
        this.available = available;
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
