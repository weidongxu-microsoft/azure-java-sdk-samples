// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetVMInstanceRequiredIDs model. */
@Fluent
public final class VirtualMachineScaleSetVMInstanceRequiredIDs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetVMInstanceRequiredIDs.class);

    /*
     * The virtual machine scale set instance ids.
     */
    @JsonProperty(value = "instanceIds", required = true)
    private List<String> instanceIds;

    /**
     * Get the instanceIds property: The virtual machine scale set instance ids.
     *
     * @return the instanceIds value.
     */
    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * Set the instanceIds property: The virtual machine scale set instance ids.
     *
     * @param instanceIds the instanceIds value to set.
     * @return the VirtualMachineScaleSetVMInstanceRequiredIDs object itself.
     */
    public VirtualMachineScaleSetVMInstanceRequiredIDs setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getInstanceIds() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property instanceIds in model VirtualMachineScaleSetVMInstanceRequiredIDs"));
        }
    }
}