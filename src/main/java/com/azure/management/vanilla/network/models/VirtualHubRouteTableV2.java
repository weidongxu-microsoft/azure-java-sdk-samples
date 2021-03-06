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

/** The VirtualHubRouteTableV2 model. */
@JsonFlatten
@Fluent
public class VirtualHubRouteTableV2 extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualHubRouteTableV2.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * List of all routes.
     */
    @JsonProperty(value = "properties.routes")
    private List<VirtualHubRouteV2> routes;

    /*
     * List of all connections attached to this route table v2.
     */
    @JsonProperty(value = "properties.attachedConnections")
    private List<String> attachedConnections;

    /*
     * The provisioning state of the virtual hub route table v2 resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the VirtualHubRouteTableV2 object itself.
     */
    public VirtualHubRouteTableV2 setName(String name) {
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
     * Get the routes property: List of all routes.
     *
     * @return the routes value.
     */
    public List<VirtualHubRouteV2> getRoutes() {
        return this.routes;
    }

    /**
     * Set the routes property: List of all routes.
     *
     * @param routes the routes value to set.
     * @return the VirtualHubRouteTableV2 object itself.
     */
    public VirtualHubRouteTableV2 setRoutes(List<VirtualHubRouteV2> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the attachedConnections property: List of all connections attached to this route table v2.
     *
     * @return the attachedConnections value.
     */
    public List<String> getAttachedConnections() {
        return this.attachedConnections;
    }

    /**
     * Set the attachedConnections property: List of all connections attached to this route table v2.
     *
     * @param attachedConnections the attachedConnections value to set.
     * @return the VirtualHubRouteTableV2 object itself.
     */
    public VirtualHubRouteTableV2 setAttachedConnections(List<String> attachedConnections) {
        this.attachedConnections = attachedConnections;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual hub route table v2 resource.
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
        if (getRoutes() != null) {
            getRoutes().forEach(e -> e.validate());
        }
    }
}
