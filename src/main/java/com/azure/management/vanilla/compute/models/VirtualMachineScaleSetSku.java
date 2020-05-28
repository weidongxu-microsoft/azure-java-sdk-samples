// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualMachineScaleSetSku model. */
@Immutable
public final class VirtualMachineScaleSetSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetSku.class);

    /*
     * The type of resource the sku applies to.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * The Sku.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /*
     * Specifies the number of virtual machines in the scale set.
     */
    @JsonProperty(value = "capacity", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineScaleSetSkuCapacity capacity;

    /**
     * Get the resourceType property: The type of resource the sku applies to.
     *
     * @return the resourceType value.
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Get the sku property: The Sku.
     *
     * @return the sku value.
     */
    public Sku getSku() {
        return this.sku;
    }

    /**
     * Get the capacity property: Specifies the number of virtual machines in the scale set.
     *
     * @return the capacity value.
     */
    public VirtualMachineScaleSetSkuCapacity getCapacity() {
        return this.capacity;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSku() != null) {
            getSku().validate();
        }
        if (getCapacity() != null) {
            getCapacity().validate();
        }
    }
}