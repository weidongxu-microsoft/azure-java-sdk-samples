// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for FirewallPolicyNatRuleActionType. */
public enum FirewallPolicyNatRuleActionType {
    /** Enum value DNAT. */
    DNAT("DNAT");

    /** The actual serialized value for a FirewallPolicyNatRuleActionType instance. */
    private final String value;

    FirewallPolicyNatRuleActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FirewallPolicyNatRuleActionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FirewallPolicyNatRuleActionType object, or null if unable to parse.
     */
    @JsonCreator
    public static FirewallPolicyNatRuleActionType fromString(String value) {
        FirewallPolicyNatRuleActionType[] items = FirewallPolicyNatRuleActionType.values();
        for (FirewallPolicyNatRuleActionType item : items) {
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
