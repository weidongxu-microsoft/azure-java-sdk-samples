// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StorageAccountMicrosoftEndpoints model. */
@Immutable
public final class StorageAccountMicrosoftEndpoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccountMicrosoftEndpoints.class);

    /*
     * Gets the blob endpoint.
     */
    @JsonProperty(value = "blob", access = JsonProperty.Access.WRITE_ONLY)
    private String blob;

    /*
     * Gets the queue endpoint.
     */
    @JsonProperty(value = "queue", access = JsonProperty.Access.WRITE_ONLY)
    private String queue;

    /*
     * Gets the table endpoint.
     */
    @JsonProperty(value = "table", access = JsonProperty.Access.WRITE_ONLY)
    private String table;

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
     * Get the queue property: Gets the queue endpoint.
     *
     * @return the queue value.
     */
    public String getQueue() {
        return this.queue;
    }

    /**
     * Get the table property: Gets the table endpoint.
     *
     * @return the table value.
     */
    public String getTable() {
        return this.table;
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
