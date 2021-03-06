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

/** The VpnGateway model. */
@JsonFlatten
@Fluent
public class VpnGateway extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnGateway.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The VirtualHub to which the gateway belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /*
     * List of all vpn connections to the gateway.
     */
    @JsonProperty(value = "properties.connections")
    private List<VpnConnection> connections;

    /*
     * Local network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "properties.bgpSettings")
    private BgpSettings bgpSettings;

    /*
     * The provisioning state of the VPN gateway resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The scale unit for this vpn gateway.
     */
    @JsonProperty(value = "properties.vpnGatewayScaleUnit")
    private Integer vpnGatewayScaleUnit;

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
     * Get the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @return the virtualHub value.
     */
    public SubResource getVirtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the VpnGateway object itself.
     */
    public VpnGateway setVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the connections property: List of all vpn connections to the gateway.
     *
     * @return the connections value.
     */
    public List<VpnConnection> getConnections() {
        return this.connections;
    }

    /**
     * Set the connections property: List of all vpn connections to the gateway.
     *
     * @param connections the connections value to set.
     * @return the VpnGateway object itself.
     */
    public VpnGateway setConnections(List<VpnConnection> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * Get the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value.
     */
    public BgpSettings getBgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set.
     * @return the VpnGateway object itself.
     */
    public VpnGateway setBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     *
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer getVpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     *
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the VpnGateway object itself.
     */
    public VpnGateway setVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
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
     * @return the VpnGateway object itself.
     */
    public VpnGateway setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getConnections() != null) {
            getConnections().forEach(e -> e.validate());
        }
        if (getBgpSettings() != null) {
            getBgpSettings().validate();
        }
    }
}
