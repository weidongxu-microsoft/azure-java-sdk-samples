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

/** The VirtualMachineScaleSetUpdateNetworkConfiguration model. */
@JsonFlatten
@Fluent
public class VirtualMachineScaleSetUpdateNetworkConfiguration extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetUpdateNetworkConfiguration.class);

    /*
     * The network configuration name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Whether this is a primary NIC on a virtual machine.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /*
     * Specifies whether the network interface is accelerated
     * networking-enabled.
     */
    @JsonProperty(value = "properties.enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /*
     * The network security group.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private SubResource networkSecurityGroup;

    /*
     * The dns settings to be applied on the network interfaces.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings;

    /*
     * The virtual machine scale set IP Configuration.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<VirtualMachineScaleSetUpdateIpConfiguration> ipConfigurations;

    /*
     * Whether IP forwarding enabled on this NIC.
     */
    @JsonProperty(value = "properties.enableIPForwarding")
    private Boolean enableIpForwarding;

    /**
     * Get the name property: The network configuration name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The network configuration name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the primary property: Whether this is a primary NIC on a virtual machine.
     *
     * @return the primary value.
     */
    public Boolean isPrimary() {
        return this.primary;
    }

    /**
     * Set the primary property: Whether this is a primary NIC on a virtual machine.
     *
     * @param primary the primary value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration setPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     *
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean isEnableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration setEnableAcceleratedNetworking(
        Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the networkSecurityGroup property: The network security group.
     *
     * @return the networkSecurityGroup value.
     */
    public SubResource getNetworkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The network security group.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration setNetworkSecurityGroup(SubResource networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the network interfaces.
     *
     * @return the dnsSettings value.
     */
    public VirtualMachineScaleSetNetworkConfigurationDnsSettings getDnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the network interfaces.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration setDnsSettings(
        VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ipConfigurations property: The virtual machine scale set IP Configuration.
     *
     * @return the ipConfigurations value.
     */
    public List<VirtualMachineScaleSetUpdateIpConfiguration> getIpConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: The virtual machine scale set IP Configuration.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration setIpConfigurations(
        List<VirtualMachineScaleSetUpdateIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     *
     * @return the enableIpForwarding value.
     */
    public Boolean isEnableIpForwarding() {
        return this.enableIpForwarding;
    }

    /**
     * Set the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     *
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration setEnableIpForwarding(Boolean enableIpForwarding) {
        this.enableIpForwarding = enableIpForwarding;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getDnsSettings() != null) {
            getDnsSettings().validate();
        }
        if (getIpConfigurations() != null) {
            getIpConfigurations().forEach(e -> e.validate());
        }
    }
}