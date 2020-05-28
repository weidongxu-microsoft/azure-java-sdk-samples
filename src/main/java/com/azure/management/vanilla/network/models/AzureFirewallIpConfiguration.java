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

/** The AzureFirewallIpConfiguration model. */
@JsonFlatten
@Fluent
public class AzureFirewallIpConfiguration extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFirewallIpConfiguration.class);

    /*
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
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
     * The Firewall Internal Load Balancer IP to be used as the next hop in
     * User Defined Routes.
     */
    @JsonProperty(value = "properties.privateIPAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String privateIpAddress;

    /*
     * Reference to the subnet resource. This resource must be named
     * 'AzureFirewallSubnet' or 'AzureFirewallManagementSubnet'.
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /*
     * Reference to the PublicIP resource. This field is a mandatory input if
     * subnet is not null.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private SubResource publicIpAddress;

    /*
     * The provisioning state of the Azure firewall IP configuration resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the AzureFirewallIpConfiguration object itself.
     */
    public AzureFirewallIpConfiguration setName(String name) {
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
     * Get the privateIpAddress property: The Firewall Internal Load Balancer IP to be used as the next hop in User
     * Defined Routes.
     *
     * @return the privateIpAddress value.
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Get the subnet property: Reference to the subnet resource. This resource must be named 'AzureFirewallSubnet' or
     * 'AzureFirewallManagementSubnet'.
     *
     * @return the subnet value.
     */
    public SubResource getSubnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference to the subnet resource. This resource must be named 'AzureFirewallSubnet' or
     * 'AzureFirewallManagementSubnet'.
     *
     * @param subnet the subnet value to set.
     * @return the AzureFirewallIpConfiguration object itself.
     */
    public AzureFirewallIpConfiguration setSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIpAddress property: Reference to the PublicIP resource. This field is a mandatory input if subnet
     * is not null.
     *
     * @return the publicIpAddress value.
     */
    public SubResource getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: Reference to the PublicIP resource. This field is a mandatory input if subnet
     * is not null.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the AzureFirewallIpConfiguration object itself.
     */
    public AzureFirewallIpConfiguration setPublicIpAddress(SubResource publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Azure firewall IP configuration resource.
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
    }
}
