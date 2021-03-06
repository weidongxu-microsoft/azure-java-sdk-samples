// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureFirewallRCAction model. */
@Fluent
public final class AzureFirewallRCAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFirewallRCAction.class);

    /*
     * The type of action.
     */
    @JsonProperty(value = "type")
    private AzureFirewallRCActionType type;

    /**
     * Get the type property: The type of action.
     *
     * @return the type value.
     */
    public AzureFirewallRCActionType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of action.
     *
     * @param type the type value to set.
     * @return the AzureFirewallRCAction object itself.
     */
    public AzureFirewallRCAction setType(AzureFirewallRCActionType type) {
        this.type = type;
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
