// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Error model. */
@Immutable
public final class Error extends ManagementError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Error.class);

    /*
     * Inner error message.
     */
    @JsonProperty(value = "innerError", access = JsonProperty.Access.WRITE_ONLY)
    private String innerError;

    /**
     * Get the innerError property: Inner error message.
     *
     * @return the innerError value.
     */
    public String getInnerError() {
        return this.innerError;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
