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

/** The VirtualNetwork model. */
@JsonFlatten
@Fluent
public class VirtualNetwork extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetwork.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The AddressSpace that contains an array of IP address ranges that can be
     * used by subnets.
     */
    @JsonProperty(value = "properties.addressSpace")
    private AddressSpace addressSpace;

    /*
     * The dhcpOptions that contains an array of DNS servers available to VMs
     * deployed in the virtual network.
     */
    @JsonProperty(value = "properties.dhcpOptions")
    private DhcpOptions dhcpOptions;

    /*
     * A list of subnets in a Virtual Network.
     */
    @JsonProperty(value = "properties.subnets")
    private List<Subnet> subnets;

    /*
     * A list of peerings in a Virtual Network.
     */
    @JsonProperty(value = "properties.virtualNetworkPeerings")
    private List<VirtualNetworkPeering> virtualNetworkPeerings;

    /*
     * The resourceGuid property of the Virtual Network resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the virtual network resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Indicates if DDoS protection is enabled for all the protected resources
     * in the virtual network. It requires a DDoS protection plan associated
     * with the resource.
     */
    @JsonProperty(value = "properties.enableDdosProtection")
    private Boolean enableDdosProtection;

    /*
     * Indicates if VM protection is enabled for all the subnets in the virtual
     * network.
     */
    @JsonProperty(value = "properties.enableVmProtection")
    private Boolean enableVmProtection;

    /*
     * The DDoS protection plan associated with the virtual network.
     */
    @JsonProperty(value = "properties.ddosProtectionPlan")
    private SubResource ddosProtectionPlan;

    /*
     * Bgp Communities sent over ExpressRoute with each route corresponding to
     * a prefix in this VNET.
     */
    @JsonProperty(value = "properties.bgpCommunities")
    private VirtualNetworkBgpCommunities bgpCommunities;

    /*
     * Array of IpAllocation which reference this VNET.
     */
    @JsonProperty(value = "properties.ipAllocations")
    private List<SubResource> ipAllocations;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the addressSpace property: The AddressSpace that contains an array of IP address ranges that can be used by
     * subnets.
     *
     * @return the addressSpace value.
     */
    public AddressSpace getAddressSpace() {
        return this.addressSpace;
    }

    /**
     * Set the addressSpace property: The AddressSpace that contains an array of IP address ranges that can be used by
     * subnets.
     *
     * @param addressSpace the addressSpace value to set.
     * @return the VirtualNetwork object itself.
     */
    public VirtualNetwork setAddressSpace(AddressSpace addressSpace) {
        this.addressSpace = addressSpace;
        return this;
    }

    /**
     * Get the dhcpOptions property: The dhcpOptions that contains an array of DNS servers available to VMs deployed in
     * the virtual network.
     *
     * @return the dhcpOptions value.
     */
    public DhcpOptions getDhcpOptions() {
        return this.dhcpOptions;
    }

    /**
     * Set the dhcpOptions property: The dhcpOptions that contains an array of DNS servers available to VMs deployed in
     * the virtual network.
     *
     * @param dhcpOptions the dhcpOptions value to set.
     * @return the VirtualNetwork object itself.
     */
    public VirtualNetwork setDhcpOptions(DhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
        return this;
    }

    /**
     * Get the subnets property: A list of subnets in a Virtual Network.
     *
     * @return the subnets value.
     */
    public List<Subnet> getSubnets() {
        return this.subnets;
    }

    /**
     * Set the subnets property: A list of subnets in a Virtual Network.
     *
     * @param subnets the subnets value to set.
     * @return the VirtualNetwork object itself.
     */
    public VirtualNetwork setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * Get the virtualNetworkPeerings property: A list of peerings in a Virtual Network.
     *
     * @return the virtualNetworkPeerings value.
     */
    public List<VirtualNetworkPeering> getVirtualNetworkPeerings() {
        return this.virtualNetworkPeerings;
    }

    /**
     * Set the virtualNetworkPeerings property: A list of peerings in a Virtual Network.
     *
     * @param virtualNetworkPeerings the virtualNetworkPeerings value to set.
     * @return the VirtualNetwork object itself.
     */
    public VirtualNetwork setVirtualNetworkPeerings(List<VirtualNetworkPeering> virtualNetworkPeerings) {
        this.virtualNetworkPeerings = virtualNetworkPeerings;
        return this;
    }

    /**
     * Get the resourceGuid property: The resourceGuid property of the Virtual Network resource.
     *
     * @return the resourceGuid value.
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the enableDdosProtection property: Indicates if DDoS protection is enabled for all the protected resources in
     * the virtual network. It requires a DDoS protection plan associated with the resource.
     *
     * @return the enableDdosProtection value.
     */
    public Boolean isEnableDdosProtection() {
        return this.enableDdosProtection;
    }

    /**
     * Set the enableDdosProtection property: Indicates if DDoS protection is enabled for all the protected resources in
     * the virtual network. It requires a DDoS protection plan associated with the resource.
     *
     * @param enableDdosProtection the enableDdosProtection value to set.
     * @return the VirtualNetwork object itself.
     */
    public VirtualNetwork setEnableDdosProtection(Boolean enableDdosProtection) {
        this.enableDdosProtection = enableDdosProtection;
        return this;
    }

    /**
     * Get the enableVmProtection property: Indicates if VM protection is enabled for all the subnets in the virtual
     * network.
     *
     * @return the enableVmProtection value.
     */
    public Boolean isEnableVmProtection() {
        return this.enableVmProtection;
    }

    /**
     * Set the enableVmProtection property: Indicates if VM protection is enabled for all the subnets in the virtual
     * network.
     *
     * @param enableVmProtection the enableVmProtection value to set.
     * @return the VirtualNetwork object itself.
     */
    public VirtualNetwork setEnableVmProtection(Boolean enableVmProtection) {
        this.enableVmProtection = enableVmProtection;
        return this;
    }

    /**
     * Get the ddosProtectionPlan property: The DDoS protection plan associated with the virtual network.
     *
     * @return the ddosProtectionPlan value.
     */
    public SubResource getDdosProtectionPlan() {
        return this.ddosProtectionPlan;
    }

    /**
     * Set the ddosProtectionPlan property: The DDoS protection plan associated with the virtual network.
     *
     * @param ddosProtectionPlan the ddosProtectionPlan value to set.
     * @return the VirtualNetwork object itself.
     */
    public VirtualNetwork setDdosProtectionPlan(SubResource ddosProtectionPlan) {
        this.ddosProtectionPlan = ddosProtectionPlan;
        return this;
    }

    /**
     * Get the bgpCommunities property: Bgp Communities sent over ExpressRoute with each route corresponding to a prefix
     * in this VNET.
     *
     * @return the bgpCommunities value.
     */
    public VirtualNetworkBgpCommunities getBgpCommunities() {
        return this.bgpCommunities;
    }

    /**
     * Set the bgpCommunities property: Bgp Communities sent over ExpressRoute with each route corresponding to a prefix
     * in this VNET.
     *
     * @param bgpCommunities the bgpCommunities value to set.
     * @return the VirtualNetwork object itself.
     */
    public VirtualNetwork setBgpCommunities(VirtualNetworkBgpCommunities bgpCommunities) {
        this.bgpCommunities = bgpCommunities;
        return this;
    }

    /**
     * Get the ipAllocations property: Array of IpAllocation which reference this VNET.
     *
     * @return the ipAllocations value.
     */
    public List<SubResource> getIpAllocations() {
        return this.ipAllocations;
    }

    /**
     * Set the ipAllocations property: Array of IpAllocation which reference this VNET.
     *
     * @param ipAllocations the ipAllocations value to set.
     * @return the VirtualNetwork object itself.
     */
    public VirtualNetwork setIpAllocations(List<SubResource> ipAllocations) {
        this.ipAllocations = ipAllocations;
        return this;
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
     * @return the VirtualNetwork object itself.
     */
    public VirtualNetwork setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getAddressSpace() != null) {
            getAddressSpace().validate();
        }
        if (getDhcpOptions() != null) {
            getDhcpOptions().validate();
        }
        if (getSubnets() != null) {
            getSubnets().forEach(e -> e.validate());
        }
        if (getVirtualNetworkPeerings() != null) {
            getVirtualNetworkPeerings().forEach(e -> e.validate());
        }
        if (getBgpCommunities() != null) {
            getBgpCommunities().validate();
        }
    }
}
