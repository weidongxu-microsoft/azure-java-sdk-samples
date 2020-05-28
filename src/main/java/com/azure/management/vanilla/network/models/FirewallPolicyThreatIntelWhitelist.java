// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FirewallPolicyThreatIntelWhitelist model. */
@Fluent
public final class FirewallPolicyThreatIntelWhitelist {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicyThreatIntelWhitelist.class);

    /*
     * List of IP addresses for the ThreatIntel Whitelist.
     */
    @JsonProperty(value = "ipAddresses")
    private List<String> ipAddresses;

    /*
     * List of FQDNs for the ThreatIntel Whitelist.
     */
    @JsonProperty(value = "fqdns")
    private List<String> fqdns;

    /**
     * Get the ipAddresses property: List of IP addresses for the ThreatIntel Whitelist.
     *
     * @return the ipAddresses value.
     */
    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set the ipAddresses property: List of IP addresses for the ThreatIntel Whitelist.
     *
     * @param ipAddresses the ipAddresses value to set.
     * @return the FirewallPolicyThreatIntelWhitelist object itself.
     */
    public FirewallPolicyThreatIntelWhitelist setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    /**
     * Get the fqdns property: List of FQDNs for the ThreatIntel Whitelist.
     *
     * @return the fqdns value.
     */
    public List<String> getFqdns() {
        return this.fqdns;
    }

    /**
     * Set the fqdns property: List of FQDNs for the ThreatIntel Whitelist.
     *
     * @param fqdns the fqdns value to set.
     * @return the FirewallPolicyThreatIntelWhitelist object itself.
     */
    public FirewallPolicyThreatIntelWhitelist setFqdns(List<String> fqdns) {
        this.fqdns = fqdns;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
