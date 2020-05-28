// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ConnectivitySource model. */
@Fluent
public final class ConnectivitySource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectivitySource.class);

    /*
     * The ID of the resource from which a connectivity check will be
     * initiated.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * The source port from which a connectivity check will be performed.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the resourceId property: The ID of the resource from which a connectivity check will be initiated.
     *
     * @return the resourceId value.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ID of the resource from which a connectivity check will be initiated.
     *
     * @param resourceId the resourceId value to set.
     * @return the ConnectivitySource object itself.
     */
    public ConnectivitySource setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the port property: The source port from which a connectivity check will be performed.
     *
     * @return the port value.
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * Set the port property: The source port from which a connectivity check will be performed.
     *
     * @param port the port value to set.
     * @return the ConnectivitySource object itself.
     */
    public ConnectivitySource setPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property resourceId in model ConnectivitySource"));
        }
    }
}