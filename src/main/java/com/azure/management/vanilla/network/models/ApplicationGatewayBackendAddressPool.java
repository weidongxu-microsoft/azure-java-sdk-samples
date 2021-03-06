// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGatewayBackendAddressPool model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayBackendAddressPool extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayBackendAddressPool.class);

    /*
     * Name of the backend address pool that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Collection of references to IPs defined in network interfaces.
     */
    @JsonProperty(value = "properties.backendIPConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceIpConfiguration> backendIpConfigurations;

    /*
     * Backend addresses.
     */
    @JsonProperty(value = "properties.backendAddresses")
    private List<ApplicationGatewayBackendAddress> backendAddresses;

    /*
     * The provisioning state of the backend address pool resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the backend address pool that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the backend address pool that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the backendIpConfigurations property: Collection of references to IPs defined in network interfaces.
     *
     * @return the backendIpConfigurations value.
     */
    public List<NetworkInterfaceIpConfiguration> getBackendIpConfigurations() {
        return this.backendIpConfigurations;
    }

    /**
     * Get the backendAddresses property: Backend addresses.
     *
     * @return the backendAddresses value.
     */
    public List<ApplicationGatewayBackendAddress> getBackendAddresses() {
        return this.backendAddresses;
    }

    /**
     * Set the backendAddresses property: Backend addresses.
     *
     * @param backendAddresses the backendAddresses value to set.
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool setBackendAddresses(
        List<ApplicationGatewayBackendAddress> backendAddresses) {
        this.backendAddresses = backendAddresses;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the backend address pool resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getBackendIpConfigurations() != null) {
            getBackendIpConfigurations().forEach(e -> e.validate());
        }
        if (getBackendAddresses() != null) {
            getBackendAddresses().forEach(e -> e.validate());
        }
    }
}
