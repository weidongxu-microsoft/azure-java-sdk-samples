// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationGatewayHeaderConfiguration model. */
@Fluent
public final class ApplicationGatewayHeaderConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayHeaderConfiguration.class);

    /*
     * Header name of the header configuration.
     */
    @JsonProperty(value = "headerName")
    private String headerName;

    /*
     * Header value of the header configuration.
     */
    @JsonProperty(value = "headerValue")
    private String headerValue;

    /**
     * Get the headerName property: Header name of the header configuration.
     *
     * @return the headerName value.
     */
    public String getHeaderName() {
        return this.headerName;
    }

    /**
     * Set the headerName property: Header name of the header configuration.
     *
     * @param headerName the headerName value to set.
     * @return the ApplicationGatewayHeaderConfiguration object itself.
     */
    public ApplicationGatewayHeaderConfiguration setHeaderName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * Get the headerValue property: Header value of the header configuration.
     *
     * @return the headerValue value.
     */
    public String getHeaderValue() {
        return this.headerValue;
    }

    /**
     * Set the headerValue property: Header value of the header configuration.
     *
     * @param headerValue the headerValue value to set.
     * @return the ApplicationGatewayHeaderConfiguration object itself.
     */
    public ApplicationGatewayHeaderConfiguration setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
