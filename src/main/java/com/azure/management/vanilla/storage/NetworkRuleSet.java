// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NetworkRuleSet model. */
@Fluent
public final class NetworkRuleSet {
    private final ClientLogger logger = new ClientLogger(NetworkRuleSet.class);

    /*
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices.
     * Possible values are any combination of Logging|Metrics|AzureServices
     * (For example, "Logging, Metrics"), or None to bypass none of those
     * traffics.
     */
    @JsonProperty(value = "bypass")
    private Bypass bypass;

    /*
     * Sets the virtual network rules
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * Sets the IP ACL rules
     */
    @JsonProperty(value = "ipRules")
    private List<IpRule> ipRules;

    /*
     * Specifies the default action of allow or deny when no other rules match.
     */
    @JsonProperty(value = "defaultAction", required = true)
    private DefaultAction defaultAction;

    /**
     * Get the bypass property: Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values
     * are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of
     * those traffics.
     *
     * @return the bypass value.
     */
    public Bypass getBypass() {
        return this.bypass;
    }

    /**
     * Set the bypass property: Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values
     * are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of
     * those traffics.
     *
     * @param bypass the bypass value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet setBypass(Bypass bypass) {
        this.bypass = bypass;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: Sets the virtual network rules.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: Sets the virtual network rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet setVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the ipRules property: Sets the IP ACL rules.
     *
     * @return the ipRules value.
     */
    public List<IpRule> getIpRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: Sets the IP ACL rules.
     *
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet setIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the defaultAction property: Specifies the default action of allow or deny when no other rules match.
     *
     * @return the defaultAction value.
     */
    public DefaultAction getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: Specifies the default action of allow or deny when no other rules match.
     *
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet setDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getVirtualNetworkRules() != null) {
            getVirtualNetworkRules().forEach(e -> e.validate());
        }
        if (getIpRules() != null) {
            getIpRules().forEach(e -> e.validate());
        }
        if (getDefaultAction() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property defaultAction in model NetworkRuleSet"));
        }
    }
}
