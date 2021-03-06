// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetExtensionListResult model. */
@Fluent
public final class VirtualMachineScaleSetExtensionListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetExtensionListResult.class);

    /*
     * The list of VM scale set extensions.
     */
    @JsonProperty(value = "value", required = true)
    private List<VirtualMachineScaleSetExtension> value;

    /*
     * The uri to fetch the next page of VM scale set extensions. Call
     * ListNext() with this to fetch the next page of VM scale set extensions.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of VM scale set extensions.
     *
     * @return the value value.
     */
    public List<VirtualMachineScaleSetExtension> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The list of VM scale set extensions.
     *
     * @param value the value value to set.
     * @return the VirtualMachineScaleSetExtensionListResult object itself.
     */
    public VirtualMachineScaleSetExtensionListResult setValue(List<VirtualMachineScaleSetExtension> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of VM scale set extensions. Call ListNext() with this
     * to fetch the next page of VM scale set extensions.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of VM scale set extensions. Call ListNext() with this
     * to fetch the next page of VM scale set extensions.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineScaleSetExtensionListResult object itself.
     */
    public VirtualMachineScaleSetExtensionListResult setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValue() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model VirtualMachineScaleSetExtensionListResult"));
        } else {
            getValue().forEach(e -> e.validate());
        }
    }
}
