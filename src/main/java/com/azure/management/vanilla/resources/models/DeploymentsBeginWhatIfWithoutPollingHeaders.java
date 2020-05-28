// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeploymentsBeginWhatIfWithoutPollingHeaders model. */
@Fluent
public final class DeploymentsBeginWhatIfWithoutPollingHeaders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentsBeginWhatIfWithoutPollingHeaders.class);

    /*
     * The Retry-After property.
     */
    @JsonProperty(value = "Retry-After")
    private String retryAfter;

    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the retryAfter property: The Retry-After property.
     *
     * @return the retryAfter value.
     */
    public String getRetryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter property: The Retry-After property.
     *
     * @param retryAfter the retryAfter value to set.
     * @return the DeploymentsBeginWhatIfWithoutPollingHeaders object itself.
     */
    public DeploymentsBeginWhatIfWithoutPollingHeaders setRetryAfter(String retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

    /**
     * Get the location property: The Location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     *
     * @param location the location value to set.
     * @return the DeploymentsBeginWhatIfWithoutPollingHeaders object itself.
     */
    public DeploymentsBeginWhatIfWithoutPollingHeaders setLocation(String location) {
        this.location = location;
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