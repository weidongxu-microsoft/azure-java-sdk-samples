// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PrivateLinkResource model. */
@JsonFlatten
@Fluent
public class PrivateLinkResource extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResource.class);

    /*
     * The private link resource group id.
     */
    @JsonProperty(value = "properties.groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /*
     * The private link resource required member names.
     */
    @JsonProperty(value = "properties.requiredMembers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredMembers;

    /*
     * The private link resource Private link DNS zone name.
     */
    @JsonProperty(value = "properties.requiredZoneNames")
    private List<String> requiredZoneNames;

    /**
     * Get the groupId property: The private link resource group id.
     *
     * @return the groupId value.
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Get the requiredMembers property: The private link resource required member names.
     *
     * @return the requiredMembers value.
     */
    public List<String> getRequiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Get the requiredZoneNames property: The private link resource Private link DNS zone name.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> getRequiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set the requiredZoneNames property: The private link resource Private link DNS zone name.
     *
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResource object itself.
     */
    public PrivateLinkResource setRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
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
