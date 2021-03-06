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

/** The PrivateDnsZoneGroup model. */
@JsonFlatten
@Fluent
public class PrivateDnsZoneGroup extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateDnsZoneGroup.class);

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
     * The provisioning state of the private dns zone group resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * A collection of private dns zone configurations of the private dns zone
     * group.
     */
    @JsonProperty(value = "properties.privateDnsZoneConfigs")
    private List<PrivateDnsZoneConfig> privateDnsZoneConfigs;

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
     * @return the PrivateDnsZoneGroup object itself.
     */
    public PrivateDnsZoneGroup setName(String name) {
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
     * Get the provisioningState property: The provisioning state of the private dns zone group resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateDnsZoneConfigs property: A collection of private dns zone configurations of the private dns zone
     * group.
     *
     * @return the privateDnsZoneConfigs value.
     */
    public List<PrivateDnsZoneConfig> getPrivateDnsZoneConfigs() {
        return this.privateDnsZoneConfigs;
    }

    /**
     * Set the privateDnsZoneConfigs property: A collection of private dns zone configurations of the private dns zone
     * group.
     *
     * @param privateDnsZoneConfigs the privateDnsZoneConfigs value to set.
     * @return the PrivateDnsZoneGroup object itself.
     */
    public PrivateDnsZoneGroup setPrivateDnsZoneConfigs(List<PrivateDnsZoneConfig> privateDnsZoneConfigs) {
        this.privateDnsZoneConfigs = privateDnsZoneConfigs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getPrivateDnsZoneConfigs() != null) {
            getPrivateDnsZoneConfigs().forEach(e -> e.validate());
        }
    }
}
