// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SkuCapability model. */
@Immutable
public final class SkuCapability {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuCapability.class);

    /*
     * The name of capability, The capability information in the specified SKU,
     * including file encryption, network ACLs, change notification, etc.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * A string value to indicate states of given capability. Possibly 'true'
     * or 'false'.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the name property: The name of capability, The capability information in the specified SKU, including file
     * encryption, network ACLs, change notification, etc.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the value property: A string value to indicate states of given capability. Possibly 'true' or 'false'.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
