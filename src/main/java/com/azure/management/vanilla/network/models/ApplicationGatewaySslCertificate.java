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

/** The ApplicationGatewaySslCertificate model. */
@JsonFlatten
@Fluent
public class ApplicationGatewaySslCertificate extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewaySslCertificate.class);

    /*
     * Name of the SSL certificate that is unique within an Application
     * Gateway.
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
     * Base-64 encoded pfx certificate. Only applicable in PUT Request.
     */
    @JsonProperty(value = "properties.data")
    private String data;

    /*
     * Password for the pfx file specified in data. Only applicable in PUT
     * request.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /*
     * Base-64 encoded Public cert data corresponding to pfx specified in data.
     * Only applicable in GET request.
     */
    @JsonProperty(value = "properties.publicCertData", access = JsonProperty.Access.WRITE_ONLY)
    private String publicCertData;

    /*
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     */
    @JsonProperty(value = "properties.keyVaultSecretId")
    private String keyVaultSecretId;

    /*
     * The provisioning state of the SSL certificate resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the SSL certificate that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the SSL certificate that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate setName(String name) {
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
     * Get the data property: Base-64 encoded pfx certificate. Only applicable in PUT Request.
     *
     * @return the data value.
     */
    public String getData() {
        return this.data;
    }

    /**
     * Set the data property: Base-64 encoded pfx certificate. Only applicable in PUT Request.
     *
     * @param data the data value to set.
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate setData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the password property: Password for the pfx file specified in data. Only applicable in PUT request.
     *
     * @return the password value.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password for the pfx file specified in data. Only applicable in PUT request.
     *
     * @param password the password value to set.
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the publicCertData property: Base-64 encoded Public cert data corresponding to pfx specified in data. Only
     * applicable in GET request.
     *
     * @return the publicCertData value.
     */
    public String getPublicCertData() {
        return this.publicCertData;
    }

    /**
     * Get the keyVaultSecretId property: Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     *
     * @return the keyVaultSecretId value.
     */
    public String getKeyVaultSecretId() {
        return this.keyVaultSecretId;
    }

    /**
     * Set the keyVaultSecretId property: Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     *
     * @param keyVaultSecretId the keyVaultSecretId value to set.
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate setKeyVaultSecretId(String keyVaultSecretId) {
        this.keyVaultSecretId = keyVaultSecretId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the SSL certificate resource.
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
    }
}
