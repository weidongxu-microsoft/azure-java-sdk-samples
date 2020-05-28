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

/** The IpConfigurationProfile model. */
@JsonFlatten
@Fluent
public class IpConfigurationProfile extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpConfigurationProfile.class);

    /*
     * The name of the resource. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The reference to the subnet resource to create a container network
     * interface ip configuration.
     */
    @JsonProperty(value = "properties.subnet")
    private Subnet subnet;

    /*
     * The provisioning state of the IP configuration profile resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the IpConfigurationProfile object itself.
     */
    public IpConfigurationProfile setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Sub Resource type.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
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
     * Get the subnet property: The reference to the subnet resource to create a container network interface ip
     * configuration.
     *
     * @return the subnet value.
     */
    public Subnet getSubnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The reference to the subnet resource to create a container network interface ip
     * configuration.
     *
     * @param subnet the subnet value to set.
     * @return the IpConfigurationProfile object itself.
     */
    public IpConfigurationProfile setSubnet(Subnet subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the IP configuration profile resource.
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
        if (getSubnet() != null) {
            getSubnet().validate();
        }
    }
}