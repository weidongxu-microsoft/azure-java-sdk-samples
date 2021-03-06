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

/** The InboundNatPool model. */
@JsonFlatten
@Fluent
public class InboundNatPool extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InboundNatPool.class);

    /*
     * The name of the resource that is unique within the set of inbound NAT
     * pools used by the load balancer. This name can be used to access the
     * resource.
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
     * A reference to frontend IP addresses.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIpConfiguration;

    /*
     * The reference to the transport protocol used by the inbound NAT pool.
     */
    @JsonProperty(value = "properties.protocol")
    private TransportProtocol protocol;

    /*
     * The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer.
     * Acceptable values range between 1 and 65534.
     */
    @JsonProperty(value = "properties.frontendPortRangeStart")
    private Integer frontendPortRangeStart;

    /*
     * The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable
     * values range between 1 and 65535.
     */
    @JsonProperty(value = "properties.frontendPortRangeEnd")
    private Integer frontendPortRangeEnd;

    /*
     * The port used for internal connections on the endpoint. Acceptable
     * values are between 1 and 65535.
     */
    @JsonProperty(value = "properties.backendPort")
    private Integer backendPort;

    /*
     * The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only
     * used when the protocol is set to TCP.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is
     * required when using the SQL AlwaysOn Availability Groups in SQL server.
     * This setting can't be changed after you create the endpoint.
     */
    @JsonProperty(value = "properties.enableFloatingIP")
    private Boolean enableFloatingIp;

    /*
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is
     * set to TCP.
     */
    @JsonProperty(value = "properties.enableTcpReset")
    private Boolean enableTcpReset;

    /*
     * The provisioning state of the inbound NAT pool resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within the set of inbound NAT pools used by the
     * load balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of inbound NAT pools used by the
     * load balancer. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool setName(String name) {
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
     * Get the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @return the frontendIpConfiguration value.
     */
    public SubResource getFrontendIpConfiguration() {
        return this.frontendIpConfiguration;
    }

    /**
     * Set the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool setFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        this.frontendIpConfiguration = frontendIpConfiguration;
        return this;
    }

    /**
     * Get the protocol property: The reference to the transport protocol used by the inbound NAT pool.
     *
     * @return the protocol value.
     */
    public TransportProtocol getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The reference to the transport protocol used by the inbound NAT pool.
     *
     * @param protocol the protocol value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool setProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the frontendPortRangeStart property: The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     *
     * @return the frontendPortRangeStart value.
     */
    public Integer getFrontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * Set the frontendPortRangeStart property: The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     *
     * @param frontendPortRangeStart the frontendPortRangeStart value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool setFrontendPortRangeStart(Integer frontendPortRangeStart) {
        this.frontendPortRangeStart = frontendPortRangeStart;
        return this;
    }

    /**
     * Get the frontendPortRangeEnd property: The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     *
     * @return the frontendPortRangeEnd value.
     */
    public Integer getFrontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * Set the frontendPortRangeEnd property: The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     *
     * @param frontendPortRangeEnd the frontendPortRangeEnd value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool setFrontendPortRangeEnd(Integer frontendPortRangeEnd) {
        this.frontendPortRangeEnd = frontendPortRangeEnd;
        return this;
    }

    /**
     * Get the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 1 and 65535.
     *
     * @return the backendPort value.
     */
    public Integer getBackendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 1 and 65535.
     *
     * @param backendPort the backendPort value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool setIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @return the enableFloatingIp value.
     */
    public Boolean isEnableFloatingIp() {
        return this.enableFloatingIp;
    }

    /**
     * Set the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @param enableFloatingIp the enableFloatingIp value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool setEnableFloatingIp(Boolean enableFloatingIp) {
        this.enableFloatingIp = enableFloatingIp;
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
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool setEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the inbound NAT pool resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
