// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ManagementPolicyFilter model. */
@Fluent
public final class ManagementPolicyFilter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementPolicyFilter.class);

    /*
     * An array of strings for prefixes to be match.
     */
    @JsonProperty(value = "prefixMatch")
    private List<String> prefixMatch;

    /*
     * An array of predefined enum values. Only blockBlob is supported.
     */
    @JsonProperty(value = "blobTypes", required = true)
    private List<String> blobTypes;

    /*
     * An array of blob index tag based filters, there can be at most 10 tag
     * filters
     */
    @JsonProperty(value = "blobIndexMatch")
    private List<TagFilter> blobIndexMatch;

    /**
     * Get the prefixMatch property: An array of strings for prefixes to be match.
     *
     * @return the prefixMatch value.
     */
    public List<String> getPrefixMatch() {
        return this.prefixMatch;
    }

    /**
     * Set the prefixMatch property: An array of strings for prefixes to be match.
     *
     * @param prefixMatch the prefixMatch value to set.
     * @return the ManagementPolicyFilter object itself.
     */
    public ManagementPolicyFilter setPrefixMatch(List<String> prefixMatch) {
        this.prefixMatch = prefixMatch;
        return this;
    }

    /**
     * Get the blobTypes property: An array of predefined enum values. Only blockBlob is supported.
     *
     * @return the blobTypes value.
     */
    public List<String> getBlobTypes() {
        return this.blobTypes;
    }

    /**
     * Set the blobTypes property: An array of predefined enum values. Only blockBlob is supported.
     *
     * @param blobTypes the blobTypes value to set.
     * @return the ManagementPolicyFilter object itself.
     */
    public ManagementPolicyFilter setBlobTypes(List<String> blobTypes) {
        this.blobTypes = blobTypes;
        return this;
    }

    /**
     * Get the blobIndexMatch property: An array of blob index tag based filters, there can be at most 10 tag filters.
     *
     * @return the blobIndexMatch value.
     */
    public List<TagFilter> getBlobIndexMatch() {
        return this.blobIndexMatch;
    }

    /**
     * Set the blobIndexMatch property: An array of blob index tag based filters, there can be at most 10 tag filters.
     *
     * @param blobIndexMatch the blobIndexMatch value to set.
     * @return the ManagementPolicyFilter object itself.
     */
    public ManagementPolicyFilter setBlobIndexMatch(List<TagFilter> blobIndexMatch) {
        this.blobIndexMatch = blobIndexMatch;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getBlobTypes() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property blobTypes in model ManagementPolicyFilter"));
        }
        if (getBlobIndexMatch() != null) {
            getBlobIndexMatch().forEach(e -> e.validate());
        }
    }
}
