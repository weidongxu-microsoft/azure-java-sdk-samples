// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagementPolicyAction model. */
@Fluent
public final class ManagementPolicyAction {
    private final ClientLogger logger = new ClientLogger(ManagementPolicyAction.class);

    /*
     * The management policy action for base blob
     */
    @JsonProperty(value = "baseBlob")
    private ManagementPolicyBaseBlob baseBlob;

    /*
     * The management policy action for snapshot
     */
    @JsonProperty(value = "snapshot")
    private ManagementPolicySnapShot snapshot;

    /**
     * Get the baseBlob property: The management policy action for base blob.
     *
     * @return the baseBlob value.
     */
    public ManagementPolicyBaseBlob getBaseBlob() {
        return this.baseBlob;
    }

    /**
     * Set the baseBlob property: The management policy action for base blob.
     *
     * @param baseBlob the baseBlob value to set.
     * @return the ManagementPolicyAction object itself.
     */
    public ManagementPolicyAction setBaseBlob(ManagementPolicyBaseBlob baseBlob) {
        this.baseBlob = baseBlob;
        return this;
    }

    /**
     * Get the snapshot property: The management policy action for snapshot.
     *
     * @return the snapshot value.
     */
    public ManagementPolicySnapShot getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The management policy action for snapshot.
     *
     * @param snapshot the snapshot value to set.
     * @return the ManagementPolicyAction object itself.
     */
    public ManagementPolicyAction setSnapshot(ManagementPolicySnapShot snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getBaseBlob() != null) {
            getBaseBlob().validate();
        }
        if (getSnapshot() != null) {
            getSnapshot().validate();
        }
    }
}
