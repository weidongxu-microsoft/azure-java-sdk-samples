// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NextHopParameters model. */
@Fluent
public final class NextHopParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NextHopParameters.class);

    /*
     * The resource identifier of the target resource against which the action
     * is to be performed.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /*
     * The source IP address.
     */
    @JsonProperty(value = "sourceIPAddress", required = true)
    private String sourceIpAddress;

    /*
     * The destination IP address.
     */
    @JsonProperty(value = "destinationIPAddress", required = true)
    private String destinationIpAddress;

    /*
     * The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any
     * of the nics, then this parameter must be specified. Otherwise optional).
     */
    @JsonProperty(value = "targetNicResourceId")
    private String targetNicResourceId;

    /**
     * Get the targetResourceId property: The resource identifier of the target resource against which the action is to
     * be performed.
     *
     * @return the targetResourceId value.
     */
    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The resource identifier of the target resource against which the action is to
     * be performed.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the NextHopParameters object itself.
     */
    public NextHopParameters setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the sourceIpAddress property: The source IP address.
     *
     * @return the sourceIpAddress value.
     */
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    /**
     * Set the sourceIpAddress property: The source IP address.
     *
     * @param sourceIpAddress the sourceIpAddress value to set.
     * @return the NextHopParameters object itself.
     */
    public NextHopParameters setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }

    /**
     * Get the destinationIpAddress property: The destination IP address.
     *
     * @return the destinationIpAddress value.
     */
    public String getDestinationIpAddress() {
        return this.destinationIpAddress;
    }

    /**
     * Set the destinationIpAddress property: The destination IP address.
     *
     * @param destinationIpAddress the destinationIpAddress value to set.
     * @return the NextHopParameters object itself.
     */
    public NextHopParameters setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
        return this;
    }

    /**
     * Get the targetNicResourceId property: The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any of
     * the nics, then this parameter must be specified. Otherwise optional).
     *
     * @return the targetNicResourceId value.
     */
    public String getTargetNicResourceId() {
        return this.targetNicResourceId;
    }

    /**
     * Set the targetNicResourceId property: The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any of
     * the nics, then this parameter must be specified. Otherwise optional).
     *
     * @param targetNicResourceId the targetNicResourceId value to set.
     * @return the NextHopParameters object itself.
     */
    public NextHopParameters setTargetNicResourceId(String targetNicResourceId) {
        this.targetNicResourceId = targetNicResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getTargetResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceId in model NextHopParameters"));
        }
        if (getSourceIpAddress() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceIpAddress in model NextHopParameters"));
        }
        if (getDestinationIpAddress() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property destinationIpAddress in model NextHopParameters"));
        }
    }
}
