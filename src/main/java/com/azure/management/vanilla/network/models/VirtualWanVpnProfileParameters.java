// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualWanVpnProfileParameters model. */
@Fluent
public final class VirtualWanVpnProfileParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualWanVpnProfileParameters.class);

    /*
     * VpnServerConfiguration partial resource uri with which VirtualWan is
     * associated to.
     */
    @JsonProperty(value = "vpnServerConfigurationResourceId")
    private String vpnServerConfigurationResourceId;

    /*
     * VPN client authentication method.
     */
    @JsonProperty(value = "authenticationMethod")
    private AuthenticationMethod authenticationMethod;

    /**
     * Get the vpnServerConfigurationResourceId property: VpnServerConfiguration partial resource uri with which
     * VirtualWan is associated to.
     *
     * @return the vpnServerConfigurationResourceId value.
     */
    public String getVpnServerConfigurationResourceId() {
        return this.vpnServerConfigurationResourceId;
    }

    /**
     * Set the vpnServerConfigurationResourceId property: VpnServerConfiguration partial resource uri with which
     * VirtualWan is associated to.
     *
     * @param vpnServerConfigurationResourceId the vpnServerConfigurationResourceId value to set.
     * @return the VirtualWanVpnProfileParameters object itself.
     */
    public VirtualWanVpnProfileParameters setVpnServerConfigurationResourceId(String vpnServerConfigurationResourceId) {
        this.vpnServerConfigurationResourceId = vpnServerConfigurationResourceId;
        return this;
    }

    /**
     * Get the authenticationMethod property: VPN client authentication method.
     *
     * @return the authenticationMethod value.
     */
    public AuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * Set the authenticationMethod property: VPN client authentication method.
     *
     * @param authenticationMethod the authenticationMethod value to set.
     * @return the VirtualWanVpnProfileParameters object itself.
     */
    public VirtualWanVpnProfileParameters setAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
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
