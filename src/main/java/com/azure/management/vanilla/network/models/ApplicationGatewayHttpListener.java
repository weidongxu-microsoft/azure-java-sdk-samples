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

/** The ApplicationGatewayHttpListener model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayHttpListener extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayHttpListener.class);

    /*
     * Name of the HTTP listener that is unique within an Application Gateway.
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
     * Frontend IP configuration resource of an application gateway.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIpConfiguration;

    /*
     * Frontend port resource of an application gateway.
     */
    @JsonProperty(value = "properties.frontendPort")
    private SubResource frontendPort;

    /*
     * Protocol of the HTTP listener.
     */
    @JsonProperty(value = "properties.protocol")
    private ApplicationGatewayProtocol protocol;

    /*
     * Host name of HTTP listener.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostname;

    /*
     * SSL certificate resource of an application gateway.
     */
    @JsonProperty(value = "properties.sslCertificate")
    private SubResource sslCertificate;

    /*
     * Applicable only if protocol is https. Enables SNI for multi-hosting.
     */
    @JsonProperty(value = "properties.requireServerNameIndication")
    private Boolean requireServerNameIndication;

    /*
     * The provisioning state of the HTTP listener resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Custom error configurations of the HTTP listener.
     */
    @JsonProperty(value = "properties.customErrorConfigurations")
    private List<ApplicationGatewayCustomError> customErrorConfigurations;

    /*
     * Reference to the FirewallPolicy resource.
     */
    @JsonProperty(value = "properties.firewallPolicy")
    private SubResource firewallPolicy;

    /*
     * List of Host names for HTTP Listener that allows special wildcard
     * characters as well.
     */
    @JsonProperty(value = "properties.hostNames")
    private List<String> hostNames;

    /**
     * Get the name property: Name of the HTTP listener that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the HTTP listener that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener setName(String name) {
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
     * Get the frontendIpConfiguration property: Frontend IP configuration resource of an application gateway.
     *
     * @return the frontendIpConfiguration value.
     */
    public SubResource getFrontendIpConfiguration() {
        return this.frontendIpConfiguration;
    }

    /**
     * Set the frontendIpConfiguration property: Frontend IP configuration resource of an application gateway.
     *
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener setFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        this.frontendIpConfiguration = frontendIpConfiguration;
        return this;
    }

    /**
     * Get the frontendPort property: Frontend port resource of an application gateway.
     *
     * @return the frontendPort value.
     */
    public SubResource getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort property: Frontend port resource of an application gateway.
     *
     * @param frontendPort the frontendPort value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener setFrontendPort(SubResource frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the protocol property: Protocol of the HTTP listener.
     *
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol of the HTTP listener.
     *
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener setProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the hostname property: Host name of HTTP listener.
     *
     * @return the hostname value.
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Host name of HTTP listener.
     *
     * @param hostname the hostname value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the sslCertificate property: SSL certificate resource of an application gateway.
     *
     * @return the sslCertificate value.
     */
    public SubResource getSslCertificate() {
        return this.sslCertificate;
    }

    /**
     * Set the sslCertificate property: SSL certificate resource of an application gateway.
     *
     * @param sslCertificate the sslCertificate value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener setSslCertificate(SubResource sslCertificate) {
        this.sslCertificate = sslCertificate;
        return this;
    }

    /**
     * Get the requireServerNameIndication property: Applicable only if protocol is https. Enables SNI for
     * multi-hosting.
     *
     * @return the requireServerNameIndication value.
     */
    public Boolean isRequireServerNameIndication() {
        return this.requireServerNameIndication;
    }

    /**
     * Set the requireServerNameIndication property: Applicable only if protocol is https. Enables SNI for
     * multi-hosting.
     *
     * @param requireServerNameIndication the requireServerNameIndication value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener setRequireServerNameIndication(Boolean requireServerNameIndication) {
        this.requireServerNameIndication = requireServerNameIndication;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the HTTP listener resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the customErrorConfigurations property: Custom error configurations of the HTTP listener.
     *
     * @return the customErrorConfigurations value.
     */
    public List<ApplicationGatewayCustomError> getCustomErrorConfigurations() {
        return this.customErrorConfigurations;
    }

    /**
     * Set the customErrorConfigurations property: Custom error configurations of the HTTP listener.
     *
     * @param customErrorConfigurations the customErrorConfigurations value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener setCustomErrorConfigurations(
        List<ApplicationGatewayCustomError> customErrorConfigurations) {
        this.customErrorConfigurations = customErrorConfigurations;
        return this;
    }

    /**
     * Get the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @return the firewallPolicy value.
     */
    public SubResource getFirewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener setFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /**
     * Get the hostNames property: List of Host names for HTTP Listener that allows special wildcard characters as well.
     *
     * @return the hostNames value.
     */
    public List<String> getHostNames() {
        return this.hostNames;
    }

    /**
     * Set the hostNames property: List of Host names for HTTP Listener that allows special wildcard characters as well.
     *
     * @param hostNames the hostNames value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener setHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getCustomErrorConfigurations() != null) {
            getCustomErrorConfigurations().forEach(e -> e.validate());
        }
    }
}
