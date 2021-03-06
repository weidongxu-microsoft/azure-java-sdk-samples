// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UpgradePolicy model. */
@Fluent
public final class UpgradePolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpgradePolicy.class);

    /*
     * Specifies the mode of an upgrade to virtual machines in the scale
     * set.<br /><br /> Possible values are:<br /><br /> **Manual** - You
     * control the application of updates to virtual machines in the scale set.
     * You do this by using the manualUpgrade action.<br /><br /> **Automatic**
     * - All virtual machines in the scale set are  automatically updated at
     * the same time.
     */
    @JsonProperty(value = "mode")
    private UpgradeMode mode;

    /*
     * The configuration parameters used while performing a rolling upgrade.
     */
    @JsonProperty(value = "rollingUpgradePolicy")
    private RollingUpgradePolicy rollingUpgradePolicy;

    /*
     * Configuration parameters used for performing automatic OS Upgrade.
     */
    @JsonProperty(value = "automaticOSUpgradePolicy")
    private AutomaticOSUpgradePolicy automaticOSUpgradePolicy;

    /**
     * Get the mode property: Specifies the mode of an upgrade to virtual machines in the scale set.&lt;br /&gt;&lt;br
     * /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **Manual** - You control the application of updates to virtual
     * machines in the scale set. You do this by using the manualUpgrade action.&lt;br /&gt;&lt;br /&gt; **Automatic** -
     * All virtual machines in the scale set are automatically updated at the same time.
     *
     * @return the mode value.
     */
    public UpgradeMode getMode() {
        return this.mode;
    }

    /**
     * Set the mode property: Specifies the mode of an upgrade to virtual machines in the scale set.&lt;br /&gt;&lt;br
     * /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **Manual** - You control the application of updates to virtual
     * machines in the scale set. You do this by using the manualUpgrade action.&lt;br /&gt;&lt;br /&gt; **Automatic** -
     * All virtual machines in the scale set are automatically updated at the same time.
     *
     * @param mode the mode value to set.
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy setMode(UpgradeMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the rollingUpgradePolicy property: The configuration parameters used while performing a rolling upgrade.
     *
     * @return the rollingUpgradePolicy value.
     */
    public RollingUpgradePolicy getRollingUpgradePolicy() {
        return this.rollingUpgradePolicy;
    }

    /**
     * Set the rollingUpgradePolicy property: The configuration parameters used while performing a rolling upgrade.
     *
     * @param rollingUpgradePolicy the rollingUpgradePolicy value to set.
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy setRollingUpgradePolicy(RollingUpgradePolicy rollingUpgradePolicy) {
        this.rollingUpgradePolicy = rollingUpgradePolicy;
        return this;
    }

    /**
     * Get the automaticOSUpgradePolicy property: Configuration parameters used for performing automatic OS Upgrade.
     *
     * @return the automaticOSUpgradePolicy value.
     */
    public AutomaticOSUpgradePolicy getAutomaticOSUpgradePolicy() {
        return this.automaticOSUpgradePolicy;
    }

    /**
     * Set the automaticOSUpgradePolicy property: Configuration parameters used for performing automatic OS Upgrade.
     *
     * @param automaticOSUpgradePolicy the automaticOSUpgradePolicy value to set.
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy setAutomaticOSUpgradePolicy(AutomaticOSUpgradePolicy automaticOSUpgradePolicy) {
        this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getRollingUpgradePolicy() != null) {
            getRollingUpgradePolicy().validate();
        }
        if (getAutomaticOSUpgradePolicy() != null) {
            getAutomaticOSUpgradePolicy().validate();
        }
    }
}
