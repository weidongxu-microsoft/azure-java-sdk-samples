// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetExtensionProfile model. */
@Fluent
public final class VirtualMachineScaleSetExtensionProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetExtensionProfile.class);

    /*
     * The virtual machine scale set child extension resources.
     */
    @JsonProperty(value = "extensions")
    private List<VirtualMachineScaleSetExtension> extensions;

    /**
     * Get the extensions property: The virtual machine scale set child extension resources.
     *
     * @return the extensions value.
     */
    public List<VirtualMachineScaleSetExtension> getExtensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The virtual machine scale set child extension resources.
     *
     * @param extensions the extensions value to set.
     * @return the VirtualMachineScaleSetExtensionProfile object itself.
     */
    public VirtualMachineScaleSetExtensionProfile setExtensions(List<VirtualMachineScaleSetExtension> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getExtensions() != null) {
            getExtensions().forEach(e -> e.validate());
        }
    }
}