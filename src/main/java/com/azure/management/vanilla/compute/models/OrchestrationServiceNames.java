// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for OrchestrationServiceNames. */
public enum OrchestrationServiceNames {
    /** Enum value AutomaticRepairs. */
    AUTOMATIC_REPAIRS("AutomaticRepairs");

    /** The actual serialized value for a OrchestrationServiceNames instance. */
    private final String value;

    OrchestrationServiceNames(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OrchestrationServiceNames instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OrchestrationServiceNames object, or null if unable to parse.
     */
    @JsonCreator
    public static OrchestrationServiceNames fromString(String value) {
        OrchestrationServiceNames[] items = OrchestrationServiceNames.values();
        for (OrchestrationServiceNames item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}