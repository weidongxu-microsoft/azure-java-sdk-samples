// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RecordSet model. */
@Fluent
public final class RecordSet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecordSet.class);

    /*
     * Resource record type.
     */
    @JsonProperty(value = "recordType")
    private String recordType;

    /*
     * Recordset name.
     */
    @JsonProperty(value = "recordSetName")
    private String recordSetName;

    /*
     * Fqdn that resolves to private endpoint ip address.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * The provisioning state of the recordset.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Recordset time to live.
     */
    @JsonProperty(value = "ttl")
    private Integer ttl;

    /*
     * The private ip address of the private endpoint.
     */
    @JsonProperty(value = "ipAddresses")
    private List<String> ipAddresses;

    /**
     * Get the recordType property: Resource record type.
     *
     * @return the recordType value.
     */
    public String getRecordType() {
        return this.recordType;
    }

    /**
     * Set the recordType property: Resource record type.
     *
     * @param recordType the recordType value to set.
     * @return the RecordSet object itself.
     */
    public RecordSet setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get the recordSetName property: Recordset name.
     *
     * @return the recordSetName value.
     */
    public String getRecordSetName() {
        return this.recordSetName;
    }

    /**
     * Set the recordSetName property: Recordset name.
     *
     * @param recordSetName the recordSetName value to set.
     * @return the RecordSet object itself.
     */
    public RecordSet setRecordSetName(String recordSetName) {
        this.recordSetName = recordSetName;
        return this;
    }

    /**
     * Get the fqdn property: Fqdn that resolves to private endpoint ip address.
     *
     * @return the fqdn value.
     */
    public String getFqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: Fqdn that resolves to private endpoint ip address.
     *
     * @param fqdn the fqdn value to set.
     * @return the RecordSet object itself.
     */
    public RecordSet setFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the recordset.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ttl property: Recordset time to live.
     *
     * @return the ttl value.
     */
    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * Set the ttl property: Recordset time to live.
     *
     * @param ttl the ttl value to set.
     * @return the RecordSet object itself.
     */
    public RecordSet setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Get the ipAddresses property: The private ip address of the private endpoint.
     *
     * @return the ipAddresses value.
     */
    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set the ipAddresses property: The private ip address of the private endpoint.
     *
     * @param ipAddresses the ipAddresses value to set.
     * @return the RecordSet object itself.
     */
    public RecordSet setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
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