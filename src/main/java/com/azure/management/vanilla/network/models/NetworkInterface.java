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

/** The NetworkInterface model. */
@JsonFlatten
@Fluent
public class NetworkInterface extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterface.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The reference to a virtual machine.
     */
    @JsonProperty(value = "properties.virtualMachine", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource virtualMachine;

    /*
     * The reference to the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private NetworkSecurityGroup networkSecurityGroup;

    /*
     * A reference to the private endpoint to which the network interface is
     * linked.
     */
    @JsonProperty(value = "properties.privateEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpoint privateEndpoint;

    /*
     * A list of IPConfigurations of the network interface.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<NetworkInterfaceIpConfiguration> ipConfigurations;

    /*
     * A list of TapConfigurations of the network interface.
     */
    @JsonProperty(value = "properties.tapConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceTapConfiguration> tapConfigurations;

    /*
     * The DNS settings in network interface.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private NetworkInterfaceDnsSettings dnsSettings;

    /*
     * The MAC address of the network interface.
     */
    @JsonProperty(value = "properties.macAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String macAddress;

    /*
     * Whether this is a primary network interface on a virtual machine.
     */
    @JsonProperty(value = "properties.primary", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean primary;

    /*
     * If the network interface is accelerated networking enabled.
     */
    @JsonProperty(value = "properties.enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /*
     * Indicates whether IP forwarding is enabled on this network interface.
     */
    @JsonProperty(value = "properties.enableIPForwarding")
    private Boolean enableIpForwarding;

    /*
     * A list of references to linked BareMetal resources.
     */
    @JsonProperty(value = "properties.hostedWorkloads", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hostedWorkloads;

    /*
     * The resource GUID property of the network interface resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the network interface resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

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
     * Get the virtualMachine property: The reference to a virtual machine.
     *
     * @return the virtualMachine value.
     */
    public SubResource getVirtualMachine() {
        return this.virtualMachine;
    }

    /**
     * Get the networkSecurityGroup property: The reference to the NetworkSecurityGroup resource.
     *
     * @return the networkSecurityGroup value.
     */
    public NetworkSecurityGroup getNetworkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The reference to the NetworkSecurityGroup resource.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface setNetworkSecurityGroup(NetworkSecurityGroup networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the privateEndpoint property: A reference to the private endpoint to which the network interface is linked.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Get the ipConfigurations property: A list of IPConfigurations of the network interface.
     *
     * @return the ipConfigurations value.
     */
    public List<NetworkInterfaceIpConfiguration> getIpConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: A list of IPConfigurations of the network interface.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface setIpConfigurations(List<NetworkInterfaceIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the tapConfigurations property: A list of TapConfigurations of the network interface.
     *
     * @return the tapConfigurations value.
     */
    public List<NetworkInterfaceTapConfiguration> getTapConfigurations() {
        return this.tapConfigurations;
    }

    /**
     * Get the dnsSettings property: The DNS settings in network interface.
     *
     * @return the dnsSettings value.
     */
    public NetworkInterfaceDnsSettings getDnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The DNS settings in network interface.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface setDnsSettings(NetworkInterfaceDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the macAddress property: The MAC address of the network interface.
     *
     * @return the macAddress value.
     */
    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * Get the primary property: Whether this is a primary network interface on a virtual machine.
     *
     * @return the primary value.
     */
    public Boolean isPrimary() {
        return this.primary;
    }

    /**
     * Get the enableAcceleratedNetworking property: If the network interface is accelerated networking enabled.
     *
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean isEnableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking property: If the network interface is accelerated networking enabled.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface setEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the enableIpForwarding property: Indicates whether IP forwarding is enabled on this network interface.
     *
     * @return the enableIpForwarding value.
     */
    public Boolean isEnableIpForwarding() {
        return this.enableIpForwarding;
    }

    /**
     * Set the enableIpForwarding property: Indicates whether IP forwarding is enabled on this network interface.
     *
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface setEnableIpForwarding(Boolean enableIpForwarding) {
        this.enableIpForwarding = enableIpForwarding;
        return this;
    }

    /**
     * Get the hostedWorkloads property: A list of references to linked BareMetal resources.
     *
     * @return the hostedWorkloads value.
     */
    public List<String> getHostedWorkloads() {
        return this.hostedWorkloads;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network interface resource.
     *
     * @return the resourceGuid value.
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network interface resource.
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
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getNetworkSecurityGroup() != null) {
            getNetworkSecurityGroup().validate();
        }
        if (getPrivateEndpoint() != null) {
            getPrivateEndpoint().validate();
        }
        if (getIpConfigurations() != null) {
            getIpConfigurations().forEach(e -> e.validate());
        }
        if (getTapConfigurations() != null) {
            getTapConfigurations().forEach(e -> e.validate());
        }
        if (getDnsSettings() != null) {
            getDnsSettings().validate();
        }
    }
}
