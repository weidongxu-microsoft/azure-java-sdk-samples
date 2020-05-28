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

/** The VirtualNetworkGatewayConnectionListEntity model. */
@JsonFlatten
@Fluent
public class VirtualNetworkGatewayConnectionListEntity extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkGatewayConnectionListEntity.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The authorizationKey.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /*
     * The reference to virtual network gateway resource.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway1", required = true)
    private VirtualNetworkConnectionGatewayReference virtualNetworkGateway1;

    /*
     * The reference to virtual network gateway resource.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway2")
    private VirtualNetworkConnectionGatewayReference virtualNetworkGateway2;

    /*
     * The reference to local network gateway resource.
     */
    @JsonProperty(value = "properties.localNetworkGateway2")
    private VirtualNetworkConnectionGatewayReference localNetworkGateway2;

    /*
     * Gateway connection type.
     */
    @JsonProperty(value = "properties.connectionType", required = true)
    private VirtualNetworkGatewayConnectionType connectionType;

    /*
     * Connection protocol used for this connection.
     */
    @JsonProperty(value = "properties.connectionProtocol")
    private VirtualNetworkGatewayConnectionProtocol connectionProtocol;

    /*
     * The routing weight.
     */
    @JsonProperty(value = "properties.routingWeight")
    private Integer routingWeight;

    /*
     * The IPSec shared key.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /*
     * Virtual Network Gateway connection status.
     */
    @JsonProperty(value = "properties.connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkGatewayConnectionStatus connectionStatus;

    /*
     * Collection of all tunnels' connection health status.
     */
    @JsonProperty(value = "properties.tunnelConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private List<TunnelConnectionHealth> tunnelConnectionStatus;

    /*
     * The egress bytes transferred in this connection.
     */
    @JsonProperty(value = "properties.egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /*
     * The ingress bytes transferred in this connection.
     */
    @JsonProperty(value = "properties.ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /*
     * The reference to peerings resource.
     */
    @JsonProperty(value = "properties.peer")
    private SubResource peer;

    /*
     * EnableBgp flag.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /*
     * Enable policy-based traffic selectors.
     */
    @JsonProperty(value = "properties.usePolicyBasedTrafficSelectors")
    private Boolean usePolicyBasedTrafficSelectors;

    /*
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "properties.ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /*
     * The Traffic Selector Policies to be considered by this connection.
     */
    @JsonProperty(value = "properties.trafficSelectorPolicies")
    private List<TrafficSelectorPolicy> trafficSelectorPolicies;

    /*
     * The resource GUID property of the virtual network gateway connection
     * resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the virtual network gateway connection
     * resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Bypass ExpressRoute Gateway for data forwarding.
     */
    @JsonProperty(value = "properties.expressRouteGatewayBypass")
    private Boolean expressRouteGatewayBypass;

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
     * Get the authorizationKey property: The authorizationKey.
     *
     * @return the authorizationKey value.
     */
    public String getAuthorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: The authorizationKey.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the virtualNetworkGateway1 property: The reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway1 value.
     */
    public VirtualNetworkConnectionGatewayReference getVirtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }

    /**
     * Set the virtualNetworkGateway1 property: The reference to virtual network gateway resource.
     *
     * @param virtualNetworkGateway1 the virtualNetworkGateway1 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setVirtualNetworkGateway1(
        VirtualNetworkConnectionGatewayReference virtualNetworkGateway1) {
        this.virtualNetworkGateway1 = virtualNetworkGateway1;
        return this;
    }

    /**
     * Get the virtualNetworkGateway2 property: The reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway2 value.
     */
    public VirtualNetworkConnectionGatewayReference getVirtualNetworkGateway2() {
        return this.virtualNetworkGateway2;
    }

    /**
     * Set the virtualNetworkGateway2 property: The reference to virtual network gateway resource.
     *
     * @param virtualNetworkGateway2 the virtualNetworkGateway2 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setVirtualNetworkGateway2(
        VirtualNetworkConnectionGatewayReference virtualNetworkGateway2) {
        this.virtualNetworkGateway2 = virtualNetworkGateway2;
        return this;
    }

    /**
     * Get the localNetworkGateway2 property: The reference to local network gateway resource.
     *
     * @return the localNetworkGateway2 value.
     */
    public VirtualNetworkConnectionGatewayReference getLocalNetworkGateway2() {
        return this.localNetworkGateway2;
    }

    /**
     * Set the localNetworkGateway2 property: The reference to local network gateway resource.
     *
     * @param localNetworkGateway2 the localNetworkGateway2 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setLocalNetworkGateway2(
        VirtualNetworkConnectionGatewayReference localNetworkGateway2) {
        this.localNetworkGateway2 = localNetworkGateway2;
        return this;
    }

    /**
     * Get the connectionType property: Gateway connection type.
     *
     * @return the connectionType value.
     */
    public VirtualNetworkGatewayConnectionType getConnectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: Gateway connection type.
     *
     * @param connectionType the connectionType value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setConnectionType(
        VirtualNetworkGatewayConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get the connectionProtocol property: Connection protocol used for this connection.
     *
     * @return the connectionProtocol value.
     */
    public VirtualNetworkGatewayConnectionProtocol getConnectionProtocol() {
        return this.connectionProtocol;
    }

    /**
     * Set the connectionProtocol property: Connection protocol used for this connection.
     *
     * @param connectionProtocol the connectionProtocol value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setConnectionProtocol(
        VirtualNetworkGatewayConnectionProtocol connectionProtocol) {
        this.connectionProtocol = connectionProtocol;
        return this;
    }

    /**
     * Get the routingWeight property: The routing weight.
     *
     * @return the routingWeight value.
     */
    public Integer getRoutingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight property: The routing weight.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the sharedKey property: The IPSec shared key.
     *
     * @return the sharedKey value.
     */
    public String getSharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: The IPSec shared key.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the connectionStatus property: Virtual Network Gateway connection status.
     *
     * @return the connectionStatus value.
     */
    public VirtualNetworkGatewayConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the tunnelConnectionStatus property: Collection of all tunnels' connection health status.
     *
     * @return the tunnelConnectionStatus value.
     */
    public List<TunnelConnectionHealth> getTunnelConnectionStatus() {
        return this.tunnelConnectionStatus;
    }

    /**
     * Get the egressBytesTransferred property: The egress bytes transferred in this connection.
     *
     * @return the egressBytesTransferred value.
     */
    public Long getEgressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the ingressBytesTransferred property: The ingress bytes transferred in this connection.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long getIngressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the peer property: The reference to peerings resource.
     *
     * @return the peer value.
     */
    public SubResource getPeer() {
        return this.peer;
    }

    /**
     * Set the peer property: The reference to peerings resource.
     *
     * @param peer the peer value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setPeer(SubResource peer) {
        this.peer = peer;
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    public Boolean isEnableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value.
     */
    public Boolean isUsePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }

    /**
     * Set the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setUsePolicyBasedTrafficSelectors(
        Boolean usePolicyBasedTrafficSelectors) {
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> getIpsecPolicies() {
        return this.ipsecPolicies;
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @return the trafficSelectorPolicies value.
     */
    public List<TrafficSelectorPolicy> getTrafficSelectorPolicies() {
        return this.trafficSelectorPolicies;
    }

    /**
     * Set the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @param trafficSelectorPolicies the trafficSelectorPolicies value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setTrafficSelectorPolicies(
        List<TrafficSelectorPolicy> trafficSelectorPolicies) {
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the virtual network gateway connection resource.
     *
     * @return the resourceGuid value.
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway for data forwarding.
     *
     * @return the expressRouteGatewayBypass value.
     */
    public Boolean isExpressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }

    /**
     * Set the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway for data forwarding.
     *
     * @param expressRouteGatewayBypass the expressRouteGatewayBypass value to set.
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setExpressRouteGatewayBypass(Boolean expressRouteGatewayBypass) {
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
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
     * @return the VirtualNetworkGatewayConnectionListEntity object itself.
     */
    public VirtualNetworkGatewayConnectionListEntity setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getVirtualNetworkGateway1() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property virtualNetworkGateway1 in model"
                            + " VirtualNetworkGatewayConnectionListEntity"));
        } else {
            getVirtualNetworkGateway1().validate();
        }
        if (getVirtualNetworkGateway2() != null) {
            getVirtualNetworkGateway2().validate();
        }
        if (getLocalNetworkGateway2() != null) {
            getLocalNetworkGateway2().validate();
        }
        if (getConnectionType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionType in model VirtualNetworkGatewayConnectionListEntity"));
        }
        if (getTunnelConnectionStatus() != null) {
            getTunnelConnectionStatus().forEach(e -> e.validate());
        }
        if (getIpsecPolicies() != null) {
            getIpsecPolicies().forEach(e -> e.validate());
        }
        if (getTrafficSelectorPolicies() != null) {
            getTrafficSelectorPolicies().forEach(e -> e.validate());
        }
    }
}