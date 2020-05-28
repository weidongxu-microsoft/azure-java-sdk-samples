// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for RouteFilterRuleType. */
public enum RouteFilterRuleType {
    /** Enum value Community. */
    COMMUNITY("Community");

    /** The actual serialized value for a RouteFilterRuleType instance. */
    private final String value;

    RouteFilterRuleType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RouteFilterRuleType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RouteFilterRuleType object, or null if unable to parse.
     */
    @JsonCreator
    public static RouteFilterRuleType fromString(String value) {
        RouteFilterRuleType[] items = RouteFilterRuleType.values();
        for (RouteFilterRuleType item : items) {
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