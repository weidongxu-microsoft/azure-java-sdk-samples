// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OutboundRule model. */
@JsonFlatten
@Fluent
public class OutboundRule extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OutboundRule.class);

    /*
     * The name of the resource that is unique within the set of outbound rules
     * used by the load balancer. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The number of outbound ports to be used for NAT.
     */
    @JsonProperty(value = "properties.allocatedOutboundPorts")
    private Integer allocatedOutboundPorts;

    /*
     * The Frontend IP addresses of the load balancer.
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<SubResource> frontendIpConfigurations;

    /*
     * A reference to a pool of DIPs. Outbound traffic is randomly load
     * balanced across IPs in the backend IPs.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /*
     * The provisioning state of the outbound rule resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The protocol for the outbound rule in load balancer.
     */
    @JsonProperty(value = "properties.protocol")
    private LoadBalancerOutboundRuleProtocol protocol;

    /*
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is
     * set to TCP.
     */
    @JsonProperty(value = "properties.enableTcpReset")
    private Boolean enableTcpReset;

    /*
     * The timeout for the TCP idle connection.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * Get the name property: The name of the resource that is unique within the set of outbound rules used by the load
     * balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of outbound rules used by the load
     * balancer. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the OutboundRule object itself.
     */
    public OutboundRule setName(String name) {
        this.name = name;
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
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the allocatedOutboundPorts property: The number of outbound ports to be used for NAT.
     *
     * @return the allocatedOutboundPorts value.
     */
    public Integer getAllocatedOutboundPorts() {
        return this.allocatedOutboundPorts;
    }

    /**
     * Set the allocatedOutboundPorts property: The number of outbound ports to be used for NAT.
     *
     * @param allocatedOutboundPorts the allocatedOutboundPorts value to set.
     * @return the OutboundRule object itself.
     */
    public OutboundRule setAllocatedOutboundPorts(Integer allocatedOutboundPorts) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        return this;
    }

    /**
     * Get the frontendIpConfigurations property: The Frontend IP addresses of the load balancer.
     *
     * @return the frontendIpConfigurations value.
     */
    public List<SubResource> getFrontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: The Frontend IP addresses of the load balancer.
     *
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the OutboundRule object itself.
     */
    public OutboundRule setFrontendIpConfigurations(List<SubResource> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Get the backendAddressPool property: A reference to a pool of DIPs. Outbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     *
     * @return the backendAddressPool value.
     */
    public SubResource getBackendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: A reference to a pool of DIPs. Outbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the OutboundRule object itself.
     */
    public OutboundRule setBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the outbound rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the protocol property: The protocol for the outbound rule in load balancer.
     *
     * @return the protocol value.
     */
    public LoadBalancerOutboundRuleProtocol getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol for the outbound rule in load balancer.
     *
     * @param protocol the protocol value to set.
     * @return the OutboundRule object itself.
     */
    public OutboundRule setProtocol(LoadBalancerOutboundRuleProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value.
     */
    public Boolean isEnableTcpReset() {
        return this.enableTcpReset;
    }

    /**
     * Set the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @param enableTcpReset the enableTcpReset value to set.
     * @return the OutboundRule object itself.
     */
    public OutboundRule setEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The timeout for the TCP idle connection.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The timeout for the TCP idle connection.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the OutboundRule object itself.
     */
    public OutboundRule setIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
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
