// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ListServiceSasResponse model. */
@Immutable
public final class ListServiceSasResponseInner {
    private final ClientLogger logger = new ClientLogger(ListServiceSasResponseInner.class);

    /*
     * List service SAS credentials of specific resource.
     */
    @JsonProperty(value = "serviceSasToken", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceSasToken;

    /**
     * Get the serviceSasToken property: List service SAS credentials of specific resource.
     *
     * @return the serviceSasToken value.
     */
    public String getServiceSasToken() {
        return this.serviceSasToken;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
