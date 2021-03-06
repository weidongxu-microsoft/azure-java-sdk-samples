// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FirewallPolicyIntrusionSystemMode. */
public final class FirewallPolicyIntrusionSystemMode extends ExpandableStringEnum<FirewallPolicyIntrusionSystemMode> {
    /** Static value Enabled for FirewallPolicyIntrusionSystemMode. */
    public static final FirewallPolicyIntrusionSystemMode ENABLED = fromString("Enabled");

    /** Static value Disabled for FirewallPolicyIntrusionSystemMode. */
    public static final FirewallPolicyIntrusionSystemMode DISABLED = fromString("Disabled");

    /**
     * Creates or finds a FirewallPolicyIntrusionSystemMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyIntrusionSystemMode.
     */
    @JsonCreator
    public static FirewallPolicyIntrusionSystemMode fromString(String name) {
        return fromString(name, FirewallPolicyIntrusionSystemMode.class);
    }

    /** @return known FirewallPolicyIntrusionSystemMode values. */
    public static Collection<FirewallPolicyIntrusionSystemMode> values() {
        return values(FirewallPolicyIntrusionSystemMode.class);
    }
}
