// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The RestorePolicyProperties model. */
@Fluent
public final class RestorePolicyProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorePolicyProperties.class);

    /*
     * Blob restore is enabled if set to true.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * how long this blob can be restored. It should be great than zero and
     * less than DeleteRetentionPolicy.days.
     */
    @JsonProperty(value = "days")
    private Integer days;

    /*
     * Returns the date and time the restore policy was last enabled.
     */
    @JsonProperty(value = "lastEnabledTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastEnabledTime;

    /**
     * Get the enabled property: Blob restore is enabled if set to true.
     *
     * @return the enabled value.
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Blob restore is enabled if set to true.
     *
     * @param enabled the enabled value to set.
     * @return the RestorePolicyProperties object itself.
     */
    public RestorePolicyProperties setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the days property: how long this blob can be restored. It should be great than zero and less than
     * DeleteRetentionPolicy.days.
     *
     * @return the days value.
     */
    public Integer getDays() {
        return this.days;
    }

    /**
     * Set the days property: how long this blob can be restored. It should be great than zero and less than
     * DeleteRetentionPolicy.days.
     *
     * @param days the days value to set.
     * @return the RestorePolicyProperties object itself.
     */
    public RestorePolicyProperties setDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * Get the lastEnabledTime property: Returns the date and time the restore policy was last enabled.
     *
     * @return the lastEnabledTime value.
     */
    public OffsetDateTime getLastEnabledTime() {
        return this.lastEnabledTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
