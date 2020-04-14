// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeploymentWhatIfProperties model. */
@Fluent
public final class DeploymentWhatIfProperties extends DeploymentProperties {
    /*
     * Optional What-If operation settings.
     */
    @JsonProperty(value = "whatIfSettings")
    private DeploymentWhatIfSettings whatIfSettings;

    /**
     * Get the whatIfSettings property: Optional What-If operation settings.
     *
     * @return the whatIfSettings value.
     */
    public DeploymentWhatIfSettings getWhatIfSettings() {
        return this.whatIfSettings;
    }

    /**
     * Set the whatIfSettings property: Optional What-If operation settings.
     *
     * @param whatIfSettings the whatIfSettings value to set.
     * @return the DeploymentWhatIfProperties object itself.
     */
    public DeploymentWhatIfProperties setWhatIfSettings(DeploymentWhatIfSettings whatIfSettings) {
        this.whatIfSettings = whatIfSettings;
        return this;
    }
}