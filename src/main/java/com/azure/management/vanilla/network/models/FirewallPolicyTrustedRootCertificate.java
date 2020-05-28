// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FirewallPolicyTrustedRootCertificate model. */
@JsonFlatten
@Fluent
public class FirewallPolicyTrustedRootCertificate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicyTrustedRootCertificate.class);

    /*
     * Name of the trusted root certificate that is unique within a firewall
     * policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Secret Id of (base-64 encoded unencrypted pfx) the public certificate
     * data stored in KeyVault.
     */
    @JsonProperty(value = "properties.keyVaultSecretId")
    private String keyVaultSecretId;

    /**
     * Get the name property: Name of the trusted root certificate that is unique within a firewall policy.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the trusted root certificate that is unique within a firewall policy.
     *
     * @param name the name value to set.
     * @return the FirewallPolicyTrustedRootCertificate object itself.
     */
    public FirewallPolicyTrustedRootCertificate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the keyVaultSecretId property: Secret Id of (base-64 encoded unencrypted pfx) the public certificate data
     * stored in KeyVault.
     *
     * @return the keyVaultSecretId value.
     */
    public String getKeyVaultSecretId() {
        return this.keyVaultSecretId;
    }

    /**
     * Set the keyVaultSecretId property: Secret Id of (base-64 encoded unencrypted pfx) the public certificate data
     * stored in KeyVault.
     *
     * @param keyVaultSecretId the keyVaultSecretId value to set.
     * @return the FirewallPolicyTrustedRootCertificate object itself.
     */
    public FirewallPolicyTrustedRootCertificate setKeyVaultSecretId(String keyVaultSecretId) {
        this.keyVaultSecretId = keyVaultSecretId;
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
