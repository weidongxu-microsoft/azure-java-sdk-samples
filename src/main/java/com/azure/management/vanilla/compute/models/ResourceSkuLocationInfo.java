// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceSkuLocationInfo model. */
@Immutable
public final class ResourceSkuLocationInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSkuLocationInfo.class);

    /*
     * Location of the SKU
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * List of availability zones where the SKU is supported.
     */
    @JsonProperty(value = "zones", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> zones;

    /*
     * Details of capabilities available to a SKU in specific zones.
     */
    @JsonProperty(value = "zoneDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuZoneDetails> zoneDetails;

    /**
     * Get the location property: Location of the SKU.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Get the zones property: List of availability zones where the SKU is supported.
     *
     * @return the zones value.
     */
    public List<String> getZones() {
        return this.zones;
    }

    /**
     * Get the zoneDetails property: Details of capabilities available to a SKU in specific zones.
     *
     * @return the zoneDetails value.
     */
    public List<ResourceSkuZoneDetails> getZoneDetails() {
        return this.zoneDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getZoneDetails() != null) {
            getZoneDetails().forEach(e -> e.validate());
        }
    }
}