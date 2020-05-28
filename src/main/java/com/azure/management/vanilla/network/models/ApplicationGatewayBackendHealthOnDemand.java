// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationGatewayBackendHealthOnDemand model. */
@Fluent
public final class ApplicationGatewayBackendHealthOnDemand {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayBackendHealthOnDemand.class);

    /*
     * Reference to an ApplicationGatewayBackendAddressPool resource.
     */
    @JsonProperty(value = "backendAddressPool")
    private ApplicationGatewayBackendAddressPool backendAddressPool;

    /*
     * Application gateway BackendHealthHttp settings.
     */
    @JsonProperty(value = "backendHealthHttpSettings")
    private ApplicationGatewayBackendHealthHttpSettings backendHealthHttpSettings;

    /**
     * Get the backendAddressPool property: Reference to an ApplicationGatewayBackendAddressPool resource.
     *
     * @return the backendAddressPool value.
     */
    public ApplicationGatewayBackendAddressPool getBackendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Reference to an ApplicationGatewayBackendAddressPool resource.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayBackendHealthOnDemand object itself.
     */
    public ApplicationGatewayBackendHealthOnDemand setBackendAddressPool(
        ApplicationGatewayBackendAddressPool backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHealthHttpSettings property: Application gateway BackendHealthHttp settings.
     *
     * @return the backendHealthHttpSettings value.
     */
    public ApplicationGatewayBackendHealthHttpSettings getBackendHealthHttpSettings() {
        return this.backendHealthHttpSettings;
    }

    /**
     * Set the backendHealthHttpSettings property: Application gateway BackendHealthHttp settings.
     *
     * @param backendHealthHttpSettings the backendHealthHttpSettings value to set.
     * @return the ApplicationGatewayBackendHealthOnDemand object itself.
     */
    public ApplicationGatewayBackendHealthOnDemand setBackendHealthHttpSettings(
        ApplicationGatewayBackendHealthHttpSettings backendHealthHttpSettings) {
        this.backendHealthHttpSettings = backendHealthHttpSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getBackendAddressPool() != null) {
            getBackendAddressPool().validate();
        }
        if (getBackendHealthHttpSettings() != null) {
            getBackendHealthHttpSettings().validate();
        }
    }
}