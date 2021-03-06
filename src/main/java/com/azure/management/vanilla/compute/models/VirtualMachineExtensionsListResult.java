// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineExtensionsListResult model. */
@Fluent
public final class VirtualMachineExtensionsListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineExtensionsListResult.class);

    /*
     * The list of extensions
     */
    @JsonProperty(value = "value")
    private List<VirtualMachineExtension> value;

    /**
     * Get the value property: The list of extensions.
     *
     * @return the value value.
     */
    public List<VirtualMachineExtension> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The list of extensions.
     *
     * @param value the value value to set.
     * @return the VirtualMachineExtensionsListResult object itself.
     */
    public VirtualMachineExtensionsListResult setValue(List<VirtualMachineExtension> value) {
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
