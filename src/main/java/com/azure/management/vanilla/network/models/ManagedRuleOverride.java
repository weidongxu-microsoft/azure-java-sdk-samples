// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagedRuleOverride model. */
@Fluent
public final class ManagedRuleOverride {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedRuleOverride.class);

    /*
     * Identifier for the managed rule.
     */
    @JsonProperty(value = "ruleId", required = true)
    private String ruleId;

    /*
     * The state of the managed rule. Defaults to Disabled if not specified.
     */
    @JsonProperty(value = "state")
    private ManagedRuleEnabledState state;

    /**
     * Get the ruleId property: Identifier for the managed rule.
     *
     * @return the ruleId value.
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * Set the ruleId property: Identifier for the managed rule.
     *
     * @param ruleId the ruleId value to set.
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the state property: The state of the managed rule. Defaults to Disabled if not specified.
     *
     * @return the state value.
     */
    public ManagedRuleEnabledState getState() {
        return this.state;
    }

    /**
     * Set the state property: The state of the managed rule. Defaults to Disabled if not specified.
     *
     * @param state the state value to set.
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride setState(ManagedRuleEnabledState state) {
        this.state = state;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getRuleId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ruleId in model ManagedRuleOverride"));
        }
    }
}
