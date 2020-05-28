// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FirewallPolicy model. */
@JsonFlatten
@Fluent
public class FirewallPolicy extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicy.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The identity of the firewall policy.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * List of references to FirewallPolicyRuleGroups.
     */
    @JsonProperty(value = "properties.ruleGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> ruleGroups;

    /*
     * The provisioning state of the firewall policy resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The parent firewall policy from which rules are inherited.
     */
    @JsonProperty(value = "properties.basePolicy")
    private SubResource basePolicy;

    /*
     * List of references to Azure Firewalls that this Firewall Policy is
     * associated with.
     */
    @JsonProperty(value = "properties.firewalls", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> firewalls;

    /*
     * List of references to Child Firewall Policies.
     */
    @JsonProperty(value = "properties.childPolicies", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> childPolicies;

    /*
     * The operation mode for Threat Intelligence.
     */
    @JsonProperty(value = "properties.threatIntelMode")
    private AzureFirewallThreatIntelMode threatIntelMode;

    /*
     * ThreatIntel Whitelist for Firewall Policy.
     */
    @JsonProperty(value = "properties.threatIntelWhitelist")
    private FirewallPolicyThreatIntelWhitelist threatIntelWhitelist;

    /*
     * The operation mode for Intrusion system.
     */
    @JsonProperty(value = "properties.intrusionSystemMode")
    private FirewallPolicyIntrusionSystemMode intrusionSystemMode;

    /*
     * TLS Configuration definition.
     */
    @JsonProperty(value = "properties.transportSecurity")
    private FirewallPolicyTransportSecurity transportSecurity;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the identity property: The identity of the firewall policy.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the firewall policy.
     *
     * @param identity the identity value to set.
     * @return the FirewallPolicy object itself.
     */
    public FirewallPolicy setIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the ruleGroups property: List of references to FirewallPolicyRuleGroups.
     *
     * @return the ruleGroups value.
     */
    public List<SubResource> getRuleGroups() {
        return this.ruleGroups;
    }

    /**
     * Get the provisioningState property: The provisioning state of the firewall policy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the basePolicy property: The parent firewall policy from which rules are inherited.
     *
     * @return the basePolicy value.
     */
    public SubResource getBasePolicy() {
        return this.basePolicy;
    }

    /**
     * Set the basePolicy property: The parent firewall policy from which rules are inherited.
     *
     * @param basePolicy the basePolicy value to set.
     * @return the FirewallPolicy object itself.
     */
    public FirewallPolicy setBasePolicy(SubResource basePolicy) {
        this.basePolicy = basePolicy;
        return this;
    }

    /**
     * Get the firewalls property: List of references to Azure Firewalls that this Firewall Policy is associated with.
     *
     * @return the firewalls value.
     */
    public List<SubResource> getFirewalls() {
        return this.firewalls;
    }

    /**
     * Get the childPolicies property: List of references to Child Firewall Policies.
     *
     * @return the childPolicies value.
     */
    public List<SubResource> getChildPolicies() {
        return this.childPolicies;
    }

    /**
     * Get the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @return the threatIntelMode value.
     */
    public AzureFirewallThreatIntelMode getThreatIntelMode() {
        return this.threatIntelMode;
    }

    /**
     * Set the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @param threatIntelMode the threatIntelMode value to set.
     * @return the FirewallPolicy object itself.
     */
    public FirewallPolicy setThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.threatIntelMode = threatIntelMode;
        return this;
    }

    /**
     * Get the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     *
     * @return the threatIntelWhitelist value.
     */
    public FirewallPolicyThreatIntelWhitelist getThreatIntelWhitelist() {
        return this.threatIntelWhitelist;
    }

    /**
     * Set the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     *
     * @param threatIntelWhitelist the threatIntelWhitelist value to set.
     * @return the FirewallPolicy object itself.
     */
    public FirewallPolicy setThreatIntelWhitelist(FirewallPolicyThreatIntelWhitelist threatIntelWhitelist) {
        this.threatIntelWhitelist = threatIntelWhitelist;
        return this;
    }

    /**
     * Get the intrusionSystemMode property: The operation mode for Intrusion system.
     *
     * @return the intrusionSystemMode value.
     */
    public FirewallPolicyIntrusionSystemMode getIntrusionSystemMode() {
        return this.intrusionSystemMode;
    }

    /**
     * Set the intrusionSystemMode property: The operation mode for Intrusion system.
     *
     * @param intrusionSystemMode the intrusionSystemMode value to set.
     * @return the FirewallPolicy object itself.
     */
    public FirewallPolicy setIntrusionSystemMode(FirewallPolicyIntrusionSystemMode intrusionSystemMode) {
        this.intrusionSystemMode = intrusionSystemMode;
        return this;
    }

    /**
     * Get the transportSecurity property: TLS Configuration definition.
     *
     * @return the transportSecurity value.
     */
    public FirewallPolicyTransportSecurity getTransportSecurity() {
        return this.transportSecurity;
    }

    /**
     * Set the transportSecurity property: TLS Configuration definition.
     *
     * @param transportSecurity the transportSecurity value to set.
     * @return the FirewallPolicy object itself.
     */
    public FirewallPolicy setTransportSecurity(FirewallPolicyTransportSecurity transportSecurity) {
        this.transportSecurity = transportSecurity;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the FirewallPolicy object itself.
     */
    public FirewallPolicy setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getIdentity() != null) {
            getIdentity().validate();
        }
        if (getThreatIntelWhitelist() != null) {
            getThreatIntelWhitelist().validate();
        }
        if (getTransportSecurity() != null) {
            getTransportSecurity().validate();
        }
    }
}
