// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourcesMoveInfo model. */
@Fluent
public final class ResourcesMoveInfo {
    /*
     * The IDs of the resources.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /*
     * The target resource group.
     */
    @JsonProperty(value = "targetResourceGroup")
    private String targetResourceGroup;

    /**
     * Get the resources property: The IDs of the resources.
     *
     * @return the resources value.
     */
    public List<String> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: The IDs of the resources.
     *
     * @param resources the resources value to set.
     * @return the ResourcesMoveInfo object itself.
     */
    public ResourcesMoveInfo setResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the targetResourceGroup property: The target resource group.
     *
     * @return the targetResourceGroup value.
     */
    public String getTargetResourceGroup() {
        return this.targetResourceGroup;
    }

    /**
     * Set the targetResourceGroup property: The target resource group.
     *
     * @param targetResourceGroup the targetResourceGroup value to set.
     * @return the ResourcesMoveInfo object itself.
     */
    public ResourcesMoveInfo setTargetResourceGroup(String targetResourceGroup) {
        this.targetResourceGroup = targetResourceGroup;
        return this;
    }
}
