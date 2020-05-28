// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RetentionPolicyParameters model. */
@Fluent
public final class RetentionPolicyParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RetentionPolicyParameters.class);

    /*
     * Number of days to retain flow log records.
     */
    @JsonProperty(value = "days")
    private Integer days;

    /*
     * Flag to enable/disable retention.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the days property: Number of days to retain flow log records.
     *
     * @return the days value.
     */
    public Integer getDays() {
        return this.days;
    }

    /**
     * Set the days property: Number of days to retain flow log records.
     *
     * @param days the days value to set.
     * @return the RetentionPolicyParameters object itself.
     */
    public RetentionPolicyParameters setDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * Get the enabled property: Flag to enable/disable retention.
     *
     * @return the enabled value.
     */
    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Flag to enable/disable retention.
     *
     * @param enabled the enabled value to set.
     * @return the RetentionPolicyParameters object itself.
     */
    public RetentionPolicyParameters setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
