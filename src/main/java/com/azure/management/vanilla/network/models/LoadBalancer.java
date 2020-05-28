// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LoadBalancer model. */
@JsonFlatten
@Fluent
public class LoadBalancer extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancer.class);

    /*
     * The load balancer SKU.
     */
    @JsonProperty(value = "sku")
    private LoadBalancerSku sku;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Object representing the frontend IPs to be used for the load balancer.
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<FrontendIpConfiguration> frontendIpConfigurations;

    /*
     * Collection of backend address pools used by a load balancer.
     */
    @JsonProperty(value = "properties.backendAddressPools")
    private List<BackendAddressPool> backendAddressPools;

    /*
     * Object collection representing the load balancing rules Gets the
     * provisioning.
     */
    @JsonProperty(value = "properties.loadBalancingRules")
    private List<LoadBalancingRule> loadBalancingRules;

    /*
     * Collection of probe objects used in the load balancer.
     */
    @JsonProperty(value = "properties.probes")
    private List<Probe> probes;

    /*
     * Collection of inbound NAT Rules used by a load balancer. Defining
     * inbound NAT rules on your load balancer is mutually exclusive with
     * defining an inbound NAT pool. Inbound NAT pools are referenced from
     * virtual machine scale sets. NICs that are associated with individual
     * virtual machines cannot reference an Inbound NAT pool. They have to
     * reference individual inbound NAT rules.
     */
    @JsonProperty(value = "properties.inboundNatRules")
    private List<InboundNatRule> inboundNatRules;

    /*
     * Defines an external port range for inbound NAT to a single backend port
     * on NICs associated with a load balancer. Inbound NAT rules are created
     * automatically for each NIC associated with the Load Balancer using an
     * external port from this range. Defining an Inbound NAT pool on your Load
     * Balancer is mutually exclusive with defining inbound Nat rules. Inbound
     * NAT pools are referenced from virtual machine scale sets. NICs that are
     * associated with individual virtual machines cannot reference an inbound
     * NAT pool. They have to reference individual inbound NAT rules.
     */
    @JsonProperty(value = "properties.inboundNatPools")
    private List<InboundNatPool> inboundNatPools;

    /*
     * The outbound rules.
     */
    @JsonProperty(value = "properties.outboundRules")
    private List<OutboundRule> outboundRules;

    /*
     * The resource GUID property of the load balancer resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the load balancer resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the sku property: The load balancer SKU.
     *
     * @return the sku value.
     */
    public LoadBalancerSku getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: The load balancer SKU.
     *
     * @param sku the sku value to set.
     * @return the LoadBalancer object itself.
     */
    public LoadBalancer setSku(LoadBalancerSku sku) {
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
     * Get the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load balancer.
     *
     * @return the frontendIpConfigurations value.
     */
    public List<FrontendIpConfiguration> getFrontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load balancer.
     *
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the LoadBalancer object itself.
     */
    public LoadBalancer setFrontendIpConfigurations(List<FrontendIpConfiguration> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Get the backendAddressPools property: Collection of backend address pools used by a load balancer.
     *
     * @return the backendAddressPools value.
     */
    public List<BackendAddressPool> getBackendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools property: Collection of backend address pools used by a load balancer.
     *
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the LoadBalancer object itself.
     */
    public LoadBalancer setBackendAddressPools(List<BackendAddressPool> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     *
     * @return the loadBalancingRules value.
     */
    public List<LoadBalancingRule> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Set the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     *
     * @param loadBalancingRules the loadBalancingRules value to set.
     * @return the LoadBalancer object itself.
     */
    public LoadBalancer setLoadBalancingRules(List<LoadBalancingRule> loadBalancingRules) {
        this.loadBalancingRules = loadBalancingRules;
        return this;
    }

    /**
     * Get the probes property: Collection of probe objects used in the load balancer.
     *
     * @return the probes value.
     */
    public List<Probe> getProbes() {
        return this.probes;
    }

    /**
     * Set the probes property: Collection of probe objects used in the load balancer.
     *
     * @param probes the probes value to set.
     * @return the LoadBalancer object itself.
     */
    public LoadBalancer setProbes(List<Probe> probes) {
        this.probes = probes;
        return this;
    }

    /**
     * Get the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @return the inboundNatRules value.
     */
    public List<InboundNatRule> getInboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Set the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @param inboundNatRules the inboundNatRules value to set.
     * @return the LoadBalancer object itself.
     */
    public LoadBalancer setInboundNatRules(List<InboundNatRule> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
        return this;
    }

    /**
     * Get the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on NICs
     * associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the
     * Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     *
     * @return the inboundNatPools value.
     */
    public List<InboundNatPool> getInboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on NICs
     * associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the
     * Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     *
     * @param inboundNatPools the inboundNatPools value to set.
     * @return the LoadBalancer object itself.
     */
    public LoadBalancer setInboundNatPools(List<InboundNatPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
        return this;
    }

    /**
     * Get the outboundRules property: The outbound rules.
     *
     * @return the outboundRules value.
     */
    public List<OutboundRule> getOutboundRules() {
        return this.outboundRules;
    }

    /**
     * Set the outboundRules property: The outbound rules.
     *
     * @param outboundRules the outboundRules value to set.
     * @return the LoadBalancer object itself.
     */
    public LoadBalancer setOutboundRules(List<OutboundRule> outboundRules) {
        this.outboundRules = outboundRules;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the load balancer resource.
     *
     * @return the resourceGuid value.
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the load balancer resource.
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
     * @return the LoadBalancer object itself.
     */
    public LoadBalancer setId(String id) {
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
        if (getFrontendIpConfigurations() != null) {
            getFrontendIpConfigurations().forEach(e -> e.validate());
        }
        if (getBackendAddressPools() != null) {
            getBackendAddressPools().forEach(e -> e.validate());
        }
        if (getLoadBalancingRules() != null) {
            getLoadBalancingRules().forEach(e -> e.validate());
        }
        if (getProbes() != null) {
            getProbes().forEach(e -> e.validate());
        }
        if (getInboundNatRules() != null) {
            getInboundNatRules().forEach(e -> e.validate());
        }
        if (getInboundNatPools() != null) {
            getInboundNatPools().forEach(e -> e.validate());
        }
        if (getOutboundRules() != null) {
            getOutboundRules().forEach(e -> e.validate());
        }
    }
}
