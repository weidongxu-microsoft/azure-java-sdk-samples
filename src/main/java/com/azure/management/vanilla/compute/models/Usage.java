// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Usage model. */
@Fluent
public final class Usage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Usage.class);

    /*
     * An enum describing the unit of usage measurement.
     */
    @JsonProperty(value = "unit", required = true)
    private String unit;

    /*
     * The current usage of the resource.
     */
    @JsonProperty(value = "currentValue", required = true)
    private int currentValue;

    /*
     * The maximum permitted usage of the resource.
     */
    @JsonProperty(value = "limit", required = true)
    private long limit;

    /*
     * The name of the type of usage.
     */
    @JsonProperty(value = "name", required = true)
    private UsageName name;

    /** Creates an instance of Usage class. */
    public Usage() {
        unit = "Count";
    }

    /**
     * Get the unit property: An enum describing the unit of usage measurement.
     *
     * @return the unit value.
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: An enum describing the unit of usage measurement.
     *
     * @param unit the unit value to set.
     * @return the Usage object itself.
     */
    public Usage setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the currentValue property: The current usage of the resource.
     *
     * @return the currentValue value.
     */
    public int getCurrentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current usage of the resource.
     *
     * @param currentValue the currentValue value to set.
     * @return the Usage object itself.
     */
    public Usage setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: The maximum permitted usage of the resource.
     *
     * @return the limit value.
     */
    public long getLimit() {
        return this.limit;
    }

    /**
     * Set the limit property: The maximum permitted usage of the resource.
     *
     * @param limit the limit value to set.
     * @return the Usage object itself.
     */
    public Usage setLimit(long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name property: The name of the type of usage.
     *
     * @return the name value.
     */
    public UsageName getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the type of usage.
     *
     * @param name the name value to set.
     * @return the Usage object itself.
     */
    public Usage setName(UsageName name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Usage"));
        } else {
            getName().validate();
        }
    }
}
