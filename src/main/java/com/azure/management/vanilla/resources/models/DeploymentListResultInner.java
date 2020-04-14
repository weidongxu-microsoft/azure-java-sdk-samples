// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DeploymentListResult model. */
@Fluent
public final class DeploymentListResultInner {
    /*
     * An array of deployments.
     */
    @JsonProperty(value = "value")
    private List<DeploymentExtendedInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: An array of deployments.
     *
     * @return the value value.
     */
    public List<DeploymentExtendedInner> getValue() {
        return this.value;
    }

    /**
     * Set the value property: An array of deployments.
     *
     * @param value the value value to set.
     * @return the DeploymentListResultInner object itself.
     */
    public DeploymentListResultInner setValue(List<DeploymentExtendedInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
