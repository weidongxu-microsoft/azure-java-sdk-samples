// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IpRule model. */
@Fluent
public final class IpRule {
    private final ClientLogger logger = new ClientLogger(IpRule.class);

    /*
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is
     * allowed.
     */
    @JsonProperty(value = "value", required = true)
    private String ipAddressOrRange;

    /*
     * The action of IP ACL rule.
     */
    @JsonProperty(value = "action")
    private Action action;

    /**
     * Get the ipAddressOrRange property: Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     *
     * @return the ipAddressOrRange value.
     */
    public String getIpAddressOrRange() {
        return this.ipAddressOrRange;
    }

    /**
     * Set the ipAddressOrRange property: Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     *
     * @param ipAddressOrRange the ipAddressOrRange value to set.
     * @return the IpRule object itself.
     */
    public IpRule setIpAddressOrRange(String ipAddressOrRange) {
        this.ipAddressOrRange = ipAddressOrRange;
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
     * @return the IpRule object itself.
     */
    public IpRule setAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getIpAddressOrRange() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ipAddressOrRange in model IpRule"));
        }
    }
}
