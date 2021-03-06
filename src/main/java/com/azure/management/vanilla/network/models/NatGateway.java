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

/** The NatGateway model. */
@JsonFlatten
@Fluent
public class NatGateway extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NatGateway.class);

    /*
     * The nat gateway SKU.
     */
    @JsonProperty(value = "sku")
    private NatGatewaySku sku;

    /*
     * A list of availability zones denoting the zone in which Nat Gateway
     * should be deployed.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The idle timeout of the nat gateway.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * An array of public ip addresses associated with the nat gateway
     * resource.
     */
    @JsonProperty(value = "properties.publicIpAddresses")
    private List<SubResource> publicIpAddresses;

    /*
     * An array of public ip prefixes associated with the nat gateway resource.
     */
    @JsonProperty(value = "properties.publicIpPrefixes")
    private List<SubResource> publicIpPrefixes;

    /*
     * An array of references to the subnets using this nat gateway resource.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> subnets;

    /*
     * The resource GUID property of the NAT gateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the NAT gateway resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the sku property: The nat gateway SKU.
     *
     * @return the sku value.
     */
    public NatGatewaySku getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: The nat gateway SKU.
     *
     * @param sku the sku value to set.
     * @return the NatGateway object itself.
     */
    public NatGateway setSku(NatGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the zones property: A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     *
     * @return the zones value.
     */
    public List<String> getZones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     *
     * @param zones the zones value to set.
     * @return the NatGateway object itself.
     */
    public NatGateway setZones(List<String> zones) {
        this.zones = zones;
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
     * Get the idleTimeoutInMinutes property: The idle timeout of the nat gateway.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the nat gateway.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the NatGateway object itself.
     */
    public NatGateway setIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the publicIpAddresses property: An array of public ip addresses associated with the nat gateway resource.
     *
     * @return the publicIpAddresses value.
     */
    public List<SubResource> getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    /**
     * Set the publicIpAddresses property: An array of public ip addresses associated with the nat gateway resource.
     *
     * @param publicIpAddresses the publicIpAddresses value to set.
     * @return the NatGateway object itself.
     */
    public NatGateway setPublicIpAddresses(List<SubResource> publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
        return this;
    }

    /**
     * Get the publicIpPrefixes property: An array of public ip prefixes associated with the nat gateway resource.
     *
     * @return the publicIpPrefixes value.
     */
    public List<SubResource> getPublicIpPrefixes() {
        return this.publicIpPrefixes;
    }

    /**
     * Set the publicIpPrefixes property: An array of public ip prefixes associated with the nat gateway resource.
     *
     * @param publicIpPrefixes the publicIpPrefixes value to set.
     * @return the NatGateway object itself.
     */
    public NatGateway setPublicIpPrefixes(List<SubResource> publicIpPrefixes) {
        this.publicIpPrefixes = publicIpPrefixes;
        return this;
    }

    /**
     * Get the subnets property: An array of references to the subnets using this nat gateway resource.
     *
     * @return the subnets value.
     */
    public List<SubResource> getSubnets() {
        return this.subnets;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the NAT gateway resource.
     *
     * @return the resourceGuid value.
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the NAT gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
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
     * @return the NatGateway object itself.
     */
    public NatGateway setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSku() != null) {
            getSku().validate();
        }
    }
}
