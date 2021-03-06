// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ObjectReplicationPolicies model. */
@Fluent
public final class ObjectReplicationPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ObjectReplicationPolicies.class);

    /*
     * The replication policy between two storage accounts.
     */
    @JsonProperty(value = "value")
    private List<ObjectReplicationPolicy> value;

    /**
     * Get the value property: The replication policy between two storage accounts.
     *
     * @return the value value.
     */
    public List<ObjectReplicationPolicy> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The replication policy between two storage accounts.
     *
     * @param value the value value to set.
     * @return the ObjectReplicationPolicies object itself.
     */
    public ObjectReplicationPolicies setValue(List<ObjectReplicationPolicy> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValue() != null) {
            getValue().forEach(e -> e.validate());
        }
    }
}
