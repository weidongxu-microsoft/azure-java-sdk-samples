// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FirewallPolicyRuleType. */
public final class FirewallPolicyRuleType extends ExpandableStringEnum<FirewallPolicyRuleType> {
    /** Static value FirewallPolicyNatRule for FirewallPolicyRuleType. */
    public static final FirewallPolicyRuleType FIREWALL_POLICY_NAT_RULE = fromString("FirewallPolicyNatRule");

    /** Static value FirewallPolicyFilterRule for FirewallPolicyRuleType. */
    public static final FirewallPolicyRuleType FIREWALL_POLICY_FILTER_RULE = fromString("FirewallPolicyFilterRule");

    /**
     * Creates or finds a FirewallPolicyRuleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyRuleType.
     */
    @JsonCreator
    public static FirewallPolicyRuleType fromString(String name) {
        return fromString(name, FirewallPolicyRuleType.class);
    }

    /** @return known FirewallPolicyRuleType values. */
    public static Collection<FirewallPolicyRuleType> values() {
        return values(FirewallPolicyRuleType.class);
    }
}
