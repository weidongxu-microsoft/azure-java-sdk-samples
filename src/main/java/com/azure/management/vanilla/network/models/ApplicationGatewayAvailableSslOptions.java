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

/** The ApplicationGatewayAvailableSslOptions model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayAvailableSslOptions extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayAvailableSslOptions.class);

    /*
     * List of available Ssl predefined policy.
     */
    @JsonProperty(value = "properties.predefinedPolicies")
    private List<SubResource> predefinedPolicies;

    /*
     * Name of the Ssl predefined policy applied by default to application
     * gateway.
     */
    @JsonProperty(value = "properties.defaultPolicy")
    private ApplicationGatewaySslPolicyName defaultPolicy;

    /*
     * List of available Ssl cipher suites.
     */
    @JsonProperty(value = "properties.availableCipherSuites")
    private List<ApplicationGatewaySslCipherSuite> availableCipherSuites;

    /*
     * List of available Ssl protocols.
     */
    @JsonProperty(value = "properties.availableProtocols")
    private List<ApplicationGatewaySslProtocol> availableProtocols;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the predefinedPolicies property: List of available Ssl predefined policy.
     *
     * @return the predefinedPolicies value.
     */
    public List<SubResource> getPredefinedPolicies() {
        return this.predefinedPolicies;
    }

    /**
     * Set the predefinedPolicies property: List of available Ssl predefined policy.
     *
     * @param predefinedPolicies the predefinedPolicies value to set.
     * @return the ApplicationGatewayAvailableSslOptions object itself.
     */
    public ApplicationGatewayAvailableSslOptions setPredefinedPolicies(List<SubResource> predefinedPolicies) {
        this.predefinedPolicies = predefinedPolicies;
        return this;
    }

    /**
     * Get the defaultPolicy property: Name of the Ssl predefined policy applied by default to application gateway.
     *
     * @return the defaultPolicy value.
     */
    public ApplicationGatewaySslPolicyName getDefaultPolicy() {
        return this.defaultPolicy;
    }

    /**
     * Set the defaultPolicy property: Name of the Ssl predefined policy applied by default to application gateway.
     *
     * @param defaultPolicy the defaultPolicy value to set.
     * @return the ApplicationGatewayAvailableSslOptions object itself.
     */
    public ApplicationGatewayAvailableSslOptions setDefaultPolicy(ApplicationGatewaySslPolicyName defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
        return this;
    }

    /**
     * Get the availableCipherSuites property: List of available Ssl cipher suites.
     *
     * @return the availableCipherSuites value.
     */
    public List<ApplicationGatewaySslCipherSuite> getAvailableCipherSuites() {
        return this.availableCipherSuites;
    }

    /**
     * Set the availableCipherSuites property: List of available Ssl cipher suites.
     *
     * @param availableCipherSuites the availableCipherSuites value to set.
     * @return the ApplicationGatewayAvailableSslOptions object itself.
     */
    public ApplicationGatewayAvailableSslOptions setAvailableCipherSuites(
        List<ApplicationGatewaySslCipherSuite> availableCipherSuites) {
        this.availableCipherSuites = availableCipherSuites;
        return this;
    }

    /**
     * Get the availableProtocols property: List of available Ssl protocols.
     *
     * @return the availableProtocols value.
     */
    public List<ApplicationGatewaySslProtocol> getAvailableProtocols() {
        return this.availableProtocols;
    }

    /**
     * Set the availableProtocols property: List of available Ssl protocols.
     *
     * @param availableProtocols the availableProtocols value to set.
     * @return the ApplicationGatewayAvailableSslOptions object itself.
     */
    public ApplicationGatewayAvailableSslOptions setAvailableProtocols(
        List<ApplicationGatewaySslProtocol> availableProtocols) {
        this.availableProtocols = availableProtocols;
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
     * @return the ApplicationGatewayAvailableSslOptions object itself.
     */
    public ApplicationGatewayAvailableSslOptions setId(String id) {
        this.id = id;
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
