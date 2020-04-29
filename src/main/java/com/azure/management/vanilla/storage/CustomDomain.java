// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CustomDomain model. */
@Fluent
public final class CustomDomain {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomDomain.class);

    /*
     * Gets or sets the custom domain name assigned to the storage account.
     * Name is the CNAME source.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Indicates whether indirect CName validation is enabled. Default value is
     * false. This should only be set on updates.
     */
    @JsonProperty(value = "useSubDomainName")
    private Boolean useSubDomainName;

    /**
     * Get the name property: Gets or sets the custom domain name assigned to the storage account. Name is the CNAME
     * source.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the custom domain name assigned to the storage account. Name is the CNAME
     * source.
     *
     * @param name the name value to set.
     * @return the CustomDomain object itself.
     */
    public CustomDomain setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the useSubDomainName property: Indicates whether indirect CName validation is enabled. Default value is
     * false. This should only be set on updates.
     *
     * @return the useSubDomainName value.
     */
    public Boolean isUseSubDomainName() {
        return this.useSubDomainName;
    }

    /**
     * Set the useSubDomainName property: Indicates whether indirect CName validation is enabled. Default value is
     * false. This should only be set on updates.
     *
     * @param useSubDomainName the useSubDomainName value to set.
     * @return the CustomDomain object itself.
     */
    public CustomDomain setUseSubDomainName(Boolean useSubDomainName) {
        this.useSubDomainName = useSubDomainName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model CustomDomain"));
        }
    }
}
