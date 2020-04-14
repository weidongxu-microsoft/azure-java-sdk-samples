// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PrivateLinkServiceConnectionState model. */
@Fluent
public final class PrivateLinkServiceConnectionState {
    /*
     * Indicates whether the connection has been Approved/Rejected/Removed by
     * the owner of the service.
     */
    @JsonProperty(value = "status")
    private PrivateEndpointServiceConnectionStatus status;

    /*
     * The reason for approval/rejection of the connection.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A message indicating if changes on the service provider require any
     * updates on the consumer.
     */
    @JsonProperty(value = "actionRequired")
    private String actionRequired;

    /**
     * Get the status property: Indicates whether the connection has been Approved/Rejected/Removed by the owner of the
     * service.
     *
     * @return the status value.
     */
    public PrivateEndpointServiceConnectionStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Indicates whether the connection has been Approved/Rejected/Removed by the owner of the
     * service.
     *
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState setStatus(PrivateEndpointServiceConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The reason for approval/rejection of the connection.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The reason for approval/rejection of the connection.
     *
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionRequired property: A message indicating if changes on the service provider require any updates on
     * the consumer.
     *
     * @return the actionRequired value.
     */
    public String getActionRequired() {
        return this.actionRequired;
    }

    /**
     * Set the actionRequired property: A message indicating if changes on the service provider require any updates on
     * the consumer.
     *
     * @param actionRequired the actionRequired value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState setActionRequired(String actionRequired) {
        this.actionRequired = actionRequired;
        return this;
    }
}