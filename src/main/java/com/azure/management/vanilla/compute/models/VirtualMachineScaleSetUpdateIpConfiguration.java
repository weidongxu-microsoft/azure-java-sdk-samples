// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetUpdateIpConfiguration model. */
@JsonFlatten
@Fluent
public class VirtualMachineScaleSetUpdateIpConfiguration extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetUpdateIpConfiguration.class);

    /*
     * The IP configuration name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The subnet.
     */
    @JsonProperty(value = "properties.subnet")
    private ApiEntityReference subnet;

    /*
     * Specifies the primary IP Configuration in case the network interface has
     * more than one IP Configuration.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /*
     * The publicIPAddressConfiguration.
     */
    @JsonProperty(value = "properties.publicIPAddressConfiguration")
    private VirtualMachineScaleSetUpdatePublicIpAddressConfiguration publicIpAddressConfiguration;

    /*
     * Available from Api-Version 2017-03-30 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * Possible values are: 'IPv4' and 'IPv6'.
     */
    @JsonProperty(value = "properties.privateIPAddressVersion")
    private IpVersion privateIpAddressVersion;

    /*
     * The application gateway backend address pools.
     */
    @JsonProperty(value = "properties.applicationGatewayBackendAddressPools")
    private List<SubResource> applicationGatewayBackendAddressPools;

    /*
     * Specifies an array of references to application security group.
     */
    @JsonProperty(value = "properties.applicationSecurityGroups")
    private List<SubResource> applicationSecurityGroups;

    /*
     * The load balancer backend address pools.
     */
    @JsonProperty(value = "properties.loadBalancerBackendAddressPools")
    private List<SubResource> loadBalancerBackendAddressPools;

    /*
     * The load balancer inbound nat pools.
     */
    @JsonProperty(value = "properties.loadBalancerInboundNatPools")
    private List<SubResource> loadBalancerInboundNatPools;

    /**
     * Get the name property: The IP configuration name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The IP configuration name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subnet property: The subnet.
     *
     * @return the subnet value.
     */
    public ApiEntityReference getSubnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The subnet.
     *
     * @param subnet the subnet value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration setSubnet(ApiEntityReference subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the primary property: Specifies the primary IP Configuration in case the network interface has more than one
     * IP Configuration.
     *
     * @return the primary value.
     */
    public Boolean isPrimary() {
        return this.primary;
    }

    /**
     * Set the primary property: Specifies the primary IP Configuration in case the network interface has more than one
     * IP Configuration.
     *
     * @param primary the primary value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration setPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     *
     * @return the publicIpAddressConfiguration value.
     */
    public VirtualMachineScaleSetUpdatePublicIpAddressConfiguration getPublicIpAddressConfiguration() {
        return this.publicIpAddressConfiguration;
    }

    /**
     * Set the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     *
     * @param publicIpAddressConfiguration the publicIpAddressConfiguration value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration setPublicIpAddressConfiguration(
        VirtualMachineScaleSetUpdatePublicIpAddressConfiguration publicIpAddressConfiguration) {
        this.publicIpAddressConfiguration = publicIpAddressConfiguration;
        return this;
    }

    /**
     * Get the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @return the privateIpAddressVersion value.
     */
    public IpVersion getPrivateIpAddressVersion() {
        return this.privateIpAddressVersion;
    }

    /**
     * Set the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration setPrivateIpAddressVersion(IpVersion privateIpAddressVersion) {
        this.privateIpAddressVersion = privateIpAddressVersion;
        return this;
    }

    /**
     * Get the applicationGatewayBackendAddressPools property: The application gateway backend address pools.
     *
     * @return the applicationGatewayBackendAddressPools value.
     */
    public List<SubResource> getApplicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools;
    }

    /**
     * Set the applicationGatewayBackendAddressPools property: The application gateway backend address pools.
     *
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration setApplicationGatewayBackendAddressPools(
        List<SubResource> applicationGatewayBackendAddressPools) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        return this;
    }

    /**
     * Get the applicationSecurityGroups property: Specifies an array of references to application security group.
     *
     * @return the applicationSecurityGroups value.
     */
    public List<SubResource> getApplicationSecurityGroups() {
        return this.applicationSecurityGroups;
    }

    /**
     * Set the applicationSecurityGroups property: Specifies an array of references to application security group.
     *
     * @param applicationSecurityGroups the applicationSecurityGroups value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration setApplicationSecurityGroups(
        List<SubResource> applicationSecurityGroups) {
        this.applicationSecurityGroups = applicationSecurityGroups;
        return this;
    }

    /**
     * Get the loadBalancerBackendAddressPools property: The load balancer backend address pools.
     *
     * @return the loadBalancerBackendAddressPools value.
     */
    public List<SubResource> getLoadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * Set the loadBalancerBackendAddressPools property: The load balancer backend address pools.
     *
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration setLoadBalancerBackendAddressPools(
        List<SubResource> loadBalancerBackendAddressPools) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancerInboundNatPools property: The load balancer inbound nat pools.
     *
     * @return the loadBalancerInboundNatPools value.
     */
    public List<SubResource> getLoadBalancerInboundNatPools() {
        return this.loadBalancerInboundNatPools;
    }

    /**
     * Set the loadBalancerInboundNatPools property: The load balancer inbound nat pools.
     *
     * @param loadBalancerInboundNatPools the loadBalancerInboundNatPools value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration setLoadBalancerInboundNatPools(
        List<SubResource> loadBalancerInboundNatPools) {
        this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSubnet() != null) {
            getSubnet().validate();
        }
        if (getPublicIpAddressConfiguration() != null) {
            getPublicIpAddressConfiguration().validate();
        }
    }
}
