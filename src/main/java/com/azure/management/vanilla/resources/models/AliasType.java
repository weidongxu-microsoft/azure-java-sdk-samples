// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AliasType model. */
@Fluent
public final class AliasType {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AliasType.class);

    /*
     * The alias name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The paths for an alias.
     */
    @JsonProperty(value = "paths")
    private List<AliasPathType> paths;

    /**
     * Get the name property: The alias name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The alias name.
     *
     * @param name the name value to set.
     * @return the AliasType object itself.
     */
    public AliasType setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the paths property: The paths for an alias.
     *
     * @return the paths value.
     */
    public List<AliasPathType> getPaths() {
        return this.paths;
    }

    /**
     * Set the paths property: The paths for an alias.
     *
     * @param paths the paths value to set.
     * @return the AliasType object itself.
     */
    public AliasType setPaths(List<AliasPathType> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getPaths() != null) {
            getPaths().forEach(e -> e.validate());
        }
    }
}
