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

/** The PublicIpPrefix model. */
@JsonFlatten
@Fluent
public class PublicIpPrefix extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpPrefix.class);

    /*
     * The public IP prefix SKU.
     */
    @JsonProperty(value = "sku")
    private PublicIpPrefixSku sku;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The public IP address version.
     */
    @JsonProperty(value = "properties.publicIPAddressVersion")
    private IpVersion publicIpAddressVersion;

    /*
     * The list of tags associated with the public IP prefix.
     */
    @JsonProperty(value = "properties.ipTags")
    private List<IpTag> ipTags;

    /*
     * The Length of the Public IP Prefix.
     */
    @JsonProperty(value = "properties.prefixLength")
    private Integer prefixLength;

    /*
     * The allocated Prefix.
     */
    @JsonProperty(value = "properties.ipPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String ipPrefix;

    /*
     * The list of all referenced PublicIPAddresses.
     */
    @JsonProperty(value = "properties.publicIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReferencedPublicIpAddress> publicIpAddresses;

    /*
     * The reference to load balancer frontend IP configuration associated with
     * the public IP prefix.
     */
    @JsonProperty(value = "properties.loadBalancerFrontendIpConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource loadBalancerFrontendIpConfiguration;

    /*
     * The resource GUID property of the public IP prefix resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the public IP prefix resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the sku property: The public IP prefix SKU.
     *
     * @return the sku value.
     */
    public PublicIpPrefixSku getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: The public IP prefix SKU.
     *
     * @param sku the sku value to set.
     * @return the PublicIpPrefix object itself.
     */
    public PublicIpPrefix setSku(PublicIpPrefixSku sku) {
        this.sku = sku;
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
     * Get the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @return the zones value.
     */
    public List<String> getZones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @param zones the zones value to set.
     * @return the PublicIpPrefix object itself.
     */
    public PublicIpPrefix setZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the publicIpAddressVersion property: The public IP address version.
     *
     * @return the publicIpAddressVersion value.
     */
    public IpVersion getPublicIpAddressVersion() {
        return this.publicIpAddressVersion;
    }

    /**
     * Set the publicIpAddressVersion property: The public IP address version.
     *
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the PublicIpPrefix object itself.
     */
    public PublicIpPrefix setPublicIpAddressVersion(IpVersion publicIpAddressVersion) {
        this.publicIpAddressVersion = publicIpAddressVersion;
        return this;
    }

    /**
     * Get the ipTags property: The list of tags associated with the public IP prefix.
     *
     * @return the ipTags value.
     */
    public List<IpTag> getIpTags() {
        return this.ipTags;
    }

    /**
     * Set the ipTags property: The list of tags associated with the public IP prefix.
     *
     * @param ipTags the ipTags value to set.
     * @return the PublicIpPrefix object itself.
     */
    public PublicIpPrefix setIpTags(List<IpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the prefixLength property: The Length of the Public IP Prefix.
     *
     * @return the prefixLength value.
     */
    public Integer getPrefixLength() {
        return this.prefixLength;
    }

    /**
     * Set the prefixLength property: The Length of the Public IP Prefix.
     *
     * @param prefixLength the prefixLength value to set.
     * @return the PublicIpPrefix object itself.
     */
    public PublicIpPrefix setPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
        return this;
    }

    /**
     * Get the ipPrefix property: The allocated Prefix.
     *
     * @return the ipPrefix value.
     */
    public String getIpPrefix() {
        return this.ipPrefix;
    }

    /**
     * Get the publicIpAddresses property: The list of all referenced PublicIPAddresses.
     *
     * @return the publicIpAddresses value.
     */
    public List<ReferencedPublicIpAddress> getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    /**
     * Get the loadBalancerFrontendIpConfiguration property: The reference to load balancer frontend IP configuration
     * associated with the public IP prefix.
     *
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    public SubResource getLoadBalancerFrontendIpConfiguration() {
        return this.loadBalancerFrontendIpConfiguration;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the public IP prefix resource.
     *
     * @return the resourceGuid value.
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the public IP prefix resource.
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
     * @return the PublicIpPrefix object itself.
     */
    public PublicIpPrefix setId(String id) {
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
        if (getIpTags() != null) {
            getIpTags().forEach(e -> e.validate());
        }
        if (getPublicIpAddresses() != null) {
            getPublicIpAddresses().forEach(e -> e.validate());
        }
    }
}