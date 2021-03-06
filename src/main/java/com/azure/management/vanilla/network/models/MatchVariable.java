// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MatchVariable model. */
@Fluent
public final class MatchVariable {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MatchVariable.class);

    /*
     * Match Variable.
     */
    @JsonProperty(value = "variableName", required = true)
    private WebApplicationFirewallMatchVariable variableName;

    /*
     * The selector of match variable.
     */
    @JsonProperty(value = "selector")
    private String selector;

    /**
     * Get the variableName property: Match Variable.
     *
     * @return the variableName value.
     */
    public WebApplicationFirewallMatchVariable getVariableName() {
        return this.variableName;
    }

    /**
     * Set the variableName property: Match Variable.
     *
     * @param variableName the variableName value to set.
     * @return the MatchVariable object itself.
     */
    public MatchVariable setVariableName(WebApplicationFirewallMatchVariable variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * Get the selector property: The selector of match variable.
     *
     * @return the selector value.
     */
    public String getSelector() {
        return this.selector;
    }

    /**
     * Set the selector property: The selector of match variable.
     *
     * @param selector the selector value to set.
     * @return the MatchVariable object itself.
     */
    public MatchVariable setSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getVariableName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property variableName in model MatchVariable"));
        }
    }
}
