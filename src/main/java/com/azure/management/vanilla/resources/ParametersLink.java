// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ParametersLink model. */
@Fluent
public final class ParametersLink {
    /*
     * The URI of the parameters file.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /*
     * If included, must match the ContentVersion in the template.
     */
    @JsonProperty(value = "contentVersion")
    private String contentVersion;

    /**
     * Get the uri property: The URI of the parameters file.
     *
     * @return the uri value.
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI of the parameters file.
     *
     * @param uri the uri value to set.
     * @return the ParametersLink object itself.
     */
    public ParametersLink setUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the contentVersion property: If included, must match the ContentVersion in the template.
     *
     * @return the contentVersion value.
     */
    public String getContentVersion() {
        return this.contentVersion;
    }

    /**
     * Set the contentVersion property: If included, must match the ContentVersion in the template.
     *
     * @param contentVersion the contentVersion value to set.
     * @return the ParametersLink object itself.
     */
    public ParametersLink setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
        return this;
    }
}
