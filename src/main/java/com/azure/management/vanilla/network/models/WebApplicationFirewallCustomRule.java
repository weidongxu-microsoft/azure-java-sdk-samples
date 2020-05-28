// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The WebApplicationFirewallCustomRule model. */
@Fluent
public final class WebApplicationFirewallCustomRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebApplicationFirewallCustomRule.class);

    /*
     * The name of the resource that is unique within a policy. This name can
     * be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Priority of the rule. Rules with a lower value will be evaluated before
     * rules with a higher value.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /*
     * The rule type.
     */
    @JsonProperty(value = "ruleType", required = true)
    private WebApplicationFirewallRuleType ruleType;

    /*
     * List of match conditions.
     */
    @JsonProperty(value = "matchConditions", required = true)
    private List<MatchCondition> matchConditions;

    /*
     * Type of Actions.
     */
    @JsonProperty(value = "action", required = true)
    private WebApplicationFirewallAction action;

    /**
     * Get the name property: The name of the resource that is unique within a policy. This name can be used to access
     * the resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a policy. This name can be used to access
     * the resource.
     *
     * @param name the name value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the priority property: Priority of the rule. Rules with a lower value will be evaluated before rules with a
     * higher value.
     *
     * @return the priority value.
     */
    public int getPriority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the rule. Rules with a lower value will be evaluated before rules with a
     * higher value.
     *
     * @param priority the priority value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the ruleType property: The rule type.
     *
     * @return the ruleType value.
     */
    public WebApplicationFirewallRuleType getRuleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType property: The rule type.
     *
     * @param ruleType the ruleType value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule setRuleType(WebApplicationFirewallRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the matchConditions property: List of match conditions.
     *
     * @return the matchConditions value.
     */
    public List<MatchCondition> getMatchConditions() {
        return this.matchConditions;
    }

    /**
     * Set the matchConditions property: List of match conditions.
     *
     * @param matchConditions the matchConditions value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule setMatchConditions(List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    /**
     * Get the action property: Type of Actions.
     *
     * @return the action value.
     */
    public WebApplicationFirewallAction getAction() {
        return this.action;
    }

    /**
     * Set the action property: Type of Actions.
     *
     * @param action the action value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule setAction(WebApplicationFirewallAction action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getRuleType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ruleType in model WebApplicationFirewallCustomRule"));
        }
        if (getMatchConditions() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property matchConditions in model WebApplicationFirewallCustomRule"));
        } else {
            getMatchConditions().forEach(e -> e.validate());
        }
        if (getAction() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property action in model WebApplicationFirewallCustomRule"));
        }
    }
}