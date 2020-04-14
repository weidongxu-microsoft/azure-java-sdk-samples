// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StorageAccountInternetEndpoints model. */
@Immutable
public final class StorageAccountInternetEndpoints {
    /*
     * Gets the blob endpoint.
     */
    @JsonProperty(value = "blob", access = JsonProperty.Access.WRITE_ONLY)
    private String blob;

    /*
     * Gets the file endpoint.
     */
    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)
    private String file;

    /*
     * Gets the web endpoint.
     */
    @JsonProperty(value = "web", access = JsonProperty.Access.WRITE_ONLY)
    private String web;

    /*
     * Gets the dfs endpoint.
     */
    @JsonProperty(value = "dfs", access = JsonProperty.Access.WRITE_ONLY)
    private String dfs;

    /**
     * Get the blob property: Gets the blob endpoint.
     *
     * @return the blob value.
     */
    public String getBlob() {
        return this.blob;
    }

    /**
     * Get the file property: Gets the file endpoint.
     *
     * @return the file value.
     */
    public String getFile() {
        return this.file;
    }

    /**
     * Get the web property: Gets the web endpoint.
     *
     * @return the web value.
     */
    public String getWeb() {
        return this.web;
    }

    /**
     * Get the dfs property: Gets the dfs endpoint.
     *
     * @return the dfs value.
     */
    public String getDfs() {
        return this.dfs;
    }
}
