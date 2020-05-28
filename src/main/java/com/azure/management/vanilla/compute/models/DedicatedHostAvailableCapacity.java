// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DedicatedHostAvailableCapacity model. */
@Fluent
public final class DedicatedHostAvailableCapacity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedHostAvailableCapacity.class);

    /*
     * The unutilized capacity of the dedicated host represented in terms of
     * each VM size that is allowed to be deployed to the dedicated host.
     */
    @JsonProperty(value = "allocatableVMs")
    private List<DedicatedHostAllocatableVM> allocatableVMs;

    /**
     * Get the allocatableVMs property: The unutilized capacity of the dedicated host represented in terms of each VM
     * size that is allowed to be deployed to the dedicated host.
     *
     * @return the allocatableVMs value.
     */
    public List<DedicatedHostAllocatableVM> getAllocatableVMs() {
        return this.allocatableVMs;
    }

    /**
     * Set the allocatableVMs property: The unutilized capacity of the dedicated host represented in terms of each VM
     * size that is allowed to be deployed to the dedicated host.
     *
     * @param allocatableVMs the allocatableVMs value to set.
     * @return the DedicatedHostAvailableCapacity object itself.
     */
    public DedicatedHostAvailableCapacity setAllocatableVMs(List<DedicatedHostAllocatableVM> allocatableVMs) {
        this.allocatableVMs = allocatableVMs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getAllocatableVMs() != null) {
            getAllocatableVMs().forEach(e -> e.validate());
        }
    }
}