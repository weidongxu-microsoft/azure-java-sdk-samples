// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ConnectionSharedKey model. */
@Fluent
public final class ConnectionSharedKey extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionSharedKey.class);

    /*
     * The virtual network connection shared key value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the value property: The virtual network connection shared key value.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The virtual network connection shared key value.
     *
     * @param value the value value to set.
     * @return the ConnectionSharedKey object itself.
     */
    public ConnectionSharedKey setValue(String value) {
        this.value = value;
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
                    new IllegalArgumentException("Missing required property value in model ConnectionSharedKey"));
        }
    }
}
