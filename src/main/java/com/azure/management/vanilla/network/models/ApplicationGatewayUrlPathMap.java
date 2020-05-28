// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGatewayUrlPathMap model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayUrlPathMap extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayUrlPathMap.class);

    /*
     * Name of the URL path map that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Default backend address pool resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultBackendAddressPool")
    private SubResource defaultBackendAddressPool;

    /*
     * Default backend http settings resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultBackendHttpSettings")
    private SubResource defaultBackendHttpSettings;

    /*
     * Default Rewrite rule set resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultRewriteRuleSet")
    private SubResource defaultRewriteRuleSet;

    /*
     * Default redirect configuration resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultRedirectConfiguration")
    private SubResource defaultRedirectConfiguration;

    /*
     * Path rule of URL path map resource.
     */
    @JsonProperty(value = "properties.pathRules")
    private List<ApplicationGatewayPathRule> pathRules;

    /*
     * The provisioning state of the URL path map resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the URL path map that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the URL path map that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap setName(String name) {
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
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the defaultBackendAddressPool property: Default backend address pool resource of URL path map.
     *
     * @return the defaultBackendAddressPool value.
     */
    public SubResource getDefaultBackendAddressPool() {
        return this.defaultBackendAddressPool;
    }

    /**
     * Set the defaultBackendAddressPool property: Default backend address pool resource of URL path map.
     *
     * @param defaultBackendAddressPool the defaultBackendAddressPool value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap setDefaultBackendAddressPool(SubResource defaultBackendAddressPool) {
        this.defaultBackendAddressPool = defaultBackendAddressPool;
        return this;
    }

    /**
     * Get the defaultBackendHttpSettings property: Default backend http settings resource of URL path map.
     *
     * @return the defaultBackendHttpSettings value.
     */
    public SubResource getDefaultBackendHttpSettings() {
        return this.defaultBackendHttpSettings;
    }

    /**
     * Set the defaultBackendHttpSettings property: Default backend http settings resource of URL path map.
     *
     * @param defaultBackendHttpSettings the defaultBackendHttpSettings value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap setDefaultBackendHttpSettings(SubResource defaultBackendHttpSettings) {
        this.defaultBackendHttpSettings = defaultBackendHttpSettings;
        return this;
    }

    /**
     * Get the defaultRewriteRuleSet property: Default Rewrite rule set resource of URL path map.
     *
     * @return the defaultRewriteRuleSet value.
     */
    public SubResource getDefaultRewriteRuleSet() {
        return this.defaultRewriteRuleSet;
    }

    /**
     * Set the defaultRewriteRuleSet property: Default Rewrite rule set resource of URL path map.
     *
     * @param defaultRewriteRuleSet the defaultRewriteRuleSet value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap setDefaultRewriteRuleSet(SubResource defaultRewriteRuleSet) {
        this.defaultRewriteRuleSet = defaultRewriteRuleSet;
        return this;
    }

    /**
     * Get the defaultRedirectConfiguration property: Default redirect configuration resource of URL path map.
     *
     * @return the defaultRedirectConfiguration value.
     */
    public SubResource getDefaultRedirectConfiguration() {
        return this.defaultRedirectConfiguration;
    }

    /**
     * Set the defaultRedirectConfiguration property: Default redirect configuration resource of URL path map.
     *
     * @param defaultRedirectConfiguration the defaultRedirectConfiguration value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap setDefaultRedirectConfiguration(SubResource defaultRedirectConfiguration) {
        this.defaultRedirectConfiguration = defaultRedirectConfiguration;
        return this;
    }

    /**
     * Get the pathRules property: Path rule of URL path map resource.
     *
     * @return the pathRules value.
     */
    public List<ApplicationGatewayPathRule> getPathRules() {
        return this.pathRules;
    }

    /**
     * Set the pathRules property: Path rule of URL path map resource.
     *
     * @param pathRules the pathRules value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap setPathRules(List<ApplicationGatewayPathRule> pathRules) {
        this.pathRules = pathRules;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the URL path map resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getPathRules() != null) {
            getPathRules().forEach(e -> e.validate());
        }
    }
}
