// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IPRule model. */
@Fluent
public final class IPRule {
    /*
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is
     * allowed.
     */
    @JsonProperty(value = "value", required = true)
    private String iPAddressOrRange;

    /*
     * The action of IP ACL rule.
     */
    @JsonProperty(value = "action")
    private Action action;

    /**
     * Get the iPAddressOrRange property: Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     *
     * @return the iPAddressOrRange value.
     */
    public String getIPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    /**
     * Set the iPAddressOrRange property: Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     *
     * @param iPAddressOrRange the iPAddressOrRange value to set.
     * @return the IPRule object itself.
     */
    public IPRule setIPAddressOrRange(String iPAddressOrRange) {
        this.iPAddressOrRange = iPAddressOrRange;
        return this;
    }

    /**
     * Get the action property: The action of IP ACL rule.
     *
     * @return the action value.
     */
    public Action getAction() {
        return this.action;
    }

    /**
     * Set the action property: The action of IP ACL rule.
     *
     * @param action the action value to set.
     * @return the IPRule object itself.
     */
    public IPRule setAction(Action action) {
        this.action = action;
        return this;
    }
}