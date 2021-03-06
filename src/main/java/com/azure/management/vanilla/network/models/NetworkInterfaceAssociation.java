// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NetworkInterfaceAssociation model. */
@Fluent
public final class NetworkInterfaceAssociation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceAssociation.class);

    /*
     * Network interface ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Collection of custom security rules.
     */
    @JsonProperty(value = "securityRules")
    private List<SecurityRule> securityRules;

    /**
     * Get the id property: Network interface ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the securityRules property: Collection of custom security rules.
     *
     * @return the securityRules value.
     */
    public List<SecurityRule> getSecurityRules() {
        return this.securityRules;
    }

    /**
     * Set the securityRules property: Collection of custom security rules.
     *
     * @param securityRules the securityRules value to set.
     * @return the NetworkInterfaceAssociation object itself.
     */
    public NetworkInterfaceAssociation setSecurityRules(List<SecurityRule> securityRules) {
        this.securityRules = securityRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSecurityRules() != null) {
            getSecurityRules().forEach(e -> e.validate());
        }
    }
}
