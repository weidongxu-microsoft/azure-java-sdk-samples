// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NetworkConfigurationDiagnosticResult model. */
@Fluent
public final class NetworkConfigurationDiagnosticResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkConfigurationDiagnosticResult.class);

    /*
     * Network configuration diagnostic profile.
     */
    @JsonProperty(value = "profile")
    private NetworkConfigurationDiagnosticProfile profile;

    /*
     * Network security group result.
     */
    @JsonProperty(value = "networkSecurityGroupResult")
    private NetworkSecurityGroupResult networkSecurityGroupResult;

    /**
     * Get the profile property: Network configuration diagnostic profile.
     *
     * @return the profile value.
     */
    public NetworkConfigurationDiagnosticProfile getProfile() {
        return this.profile;
    }

    /**
     * Set the profile property: Network configuration diagnostic profile.
     *
     * @param profile the profile value to set.
     * @return the NetworkConfigurationDiagnosticResult object itself.
     */
    public NetworkConfigurationDiagnosticResult setProfile(NetworkConfigurationDiagnosticProfile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get the networkSecurityGroupResult property: Network security group result.
     *
     * @return the networkSecurityGroupResult value.
     */
    public NetworkSecurityGroupResult getNetworkSecurityGroupResult() {
        return this.networkSecurityGroupResult;
    }

    /**
     * Set the networkSecurityGroupResult property: Network security group result.
     *
     * @param networkSecurityGroupResult the networkSecurityGroupResult value to set.
     * @return the NetworkConfigurationDiagnosticResult object itself.
     */
    public NetworkConfigurationDiagnosticResult setNetworkSecurityGroupResult(
        NetworkSecurityGroupResult networkSecurityGroupResult) {
        this.networkSecurityGroupResult = networkSecurityGroupResult;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getProfile() != null) {
            getProfile().validate();
        }
        if (getNetworkSecurityGroupResult() != null) {
            getNetworkSecurityGroupResult().validate();
        }
    }
}
