// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Encryption model. */
@Fluent
public final class Encryption {
    /*
     * List of services which support encryption.
     */
    @JsonProperty(value = "services")
    private EncryptionServices services;

    /*
     * The encryption keySource (provider). Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.Keyvault
     */
    @JsonProperty(value = "keySource", required = true)
    private KeySource keySource;

    /*
     * Properties provided by key vault.
     */
    @JsonProperty(value = "keyvaultproperties")
    private KeyVaultProperties keyVaultProperties;

    /**
     * Get the services property: List of services which support encryption.
     *
     * @return the services value.
     */
    public EncryptionServices getServices() {
        return this.services;
    }

    /**
     * Set the services property: List of services which support encryption.
     *
     * @param services the services value to set.
     * @return the Encryption object itself.
     */
    public Encryption setServices(EncryptionServices services) {
        this.services = services;
        return this;
    }

    /**
     * Get the keySource property: The encryption keySource (provider). Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.Keyvault.
     *
     * @return the keySource value.
     */
    public KeySource getKeySource() {
        return this.keySource;
    }

    /**
     * Set the keySource property: The encryption keySource (provider). Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.Keyvault.
     *
     * @param keySource the keySource value to set.
     * @return the Encryption object itself.
     */
    public Encryption setKeySource(KeySource keySource) {
        this.keySource = keySource;
        return this;
    }

    /**
     * Get the keyVaultProperties property: Properties provided by key vault.
     *
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties getKeyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: Properties provided by key vault.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the Encryption object itself.
     */
    public Encryption setKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }
}
