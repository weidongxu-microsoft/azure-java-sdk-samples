// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGatewayListResult model. */
@Fluent
public final class ApplicationGatewayListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayListResult.class);

    /*
     * List of an application gateways in a resource group.
     */
    @JsonProperty(value = "value")
    private List<ApplicationGateway> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of an application gateways in a resource group.
     *
     * @return the value value.
     */
    public List<ApplicationGateway> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of an application gateways in a resource group.
     *
     * @param value the value value to set.
     * @return the ApplicationGatewayListResult object itself.
     */
    public ApplicationGatewayListResult setValue(List<ApplicationGateway> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ApplicationGatewayListResult object itself.
     */
    public ApplicationGatewayListResult setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValue() != null) {
            getValue().forEach(e -> e.validate());
        }
    }
}
