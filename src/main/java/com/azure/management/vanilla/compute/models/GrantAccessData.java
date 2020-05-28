// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GrantAccessData model. */
@Fluent
public final class GrantAccessData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GrantAccessData.class);

    /*
     * The access property.
     */
    @JsonProperty(value = "access", required = true)
    private AccessLevel access;

    /*
     * Time duration in seconds until the SAS access expires.
     */
    @JsonProperty(value = "durationInSeconds", required = true)
    private int durationInSeconds;

    /**
     * Get the access property: The access property.
     *
     * @return the access value.
     */
    public AccessLevel getAccess() {
        return this.access;
    }

    /**
     * Set the access property: The access property.
     *
     * @param access the access value to set.
     * @return the GrantAccessData object itself.
     */
    public GrantAccessData setAccess(AccessLevel access) {
        this.access = access;
        return this;
    }

    /**
     * Get the durationInSeconds property: Time duration in seconds until the SAS access expires.
     *
     * @return the durationInSeconds value.
     */
    public int getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * Set the durationInSeconds property: Time duration in seconds until the SAS access expires.
     *
     * @param durationInSeconds the durationInSeconds value to set.
     * @return the GrantAccessData object itself.
     */
    public GrantAccessData setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getAccess() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property access in model GrantAccessData"));
        }
    }
}
