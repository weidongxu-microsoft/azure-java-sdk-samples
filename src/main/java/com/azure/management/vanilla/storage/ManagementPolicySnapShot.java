// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagementPolicySnapShot model. */
@Fluent
public final class ManagementPolicySnapShot {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementPolicySnapShot.class);

    /*
     * The function to delete the blob snapshot
     */
    @JsonProperty(value = "delete")
    private DateAfterCreation delete;

    /**
     * Get the delete property: The function to delete the blob snapshot.
     *
     * @return the delete value.
     */
    public DateAfterCreation getDelete() {
        return this.delete;
    }

    /**
     * Set the delete property: The function to delete the blob snapshot.
     *
     * @param delete the delete value to set.
     * @return the ManagementPolicySnapShot object itself.
     */
    public ManagementPolicySnapShot setDelete(DateAfterCreation delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getDelete() != null) {
            getDelete().validate();
        }
    }
}
