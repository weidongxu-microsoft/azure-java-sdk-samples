// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DiskList model. */
@Fluent
public final class DiskList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskList.class);

    /*
     * A list of disks.
     */
    @JsonProperty(value = "value", required = true)
    private List<Disk> value;

    /*
     * The uri to fetch the next page of disks. Call ListNext() with this to
     * fetch the next page of disks.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of disks.
     *
     * @return the value value.
     */
    public List<Disk> getValue() {
        return this.value;
    }

    /**
     * Set the value property: A list of disks.
     *
     * @param value the value value to set.
     * @return the DiskList object itself.
     */
    public DiskList setValue(List<Disk> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of disks. Call ListNext() with this to fetch the next
     * page of disks.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of disks. Call ListNext() with this to fetch the next
     * page of disks.
     *
     * @param nextLink the nextLink value to set.
     * @return the DiskList object itself.
     */
    public DiskList setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValue() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property value in model DiskList"));
        } else {
            getValue().forEach(e -> e.validate());
        }
    }
}