// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ObjectReplicationPolicyFilter model. */
@Fluent
public final class ObjectReplicationPolicyFilter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ObjectReplicationPolicyFilter.class);

    /*
     * Optional. Filters the results to replicate only blobs whose names begin
     * with the specified prefix.
     */
    @JsonProperty(value = "prefixMatch")
    private List<String> prefixMatch;

    /*
     * Blobs created after the time will be replicated to the destination. It
     * must be in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example:
     * 2020-02-19T16:05:00Z
     */
    @JsonProperty(value = "minCreationTime")
    private String minCreationTime;

    /**
     * Get the prefixMatch property: Optional. Filters the results to replicate only blobs whose names begin with the
     * specified prefix.
     *
     * @return the prefixMatch value.
     */
    public List<String> getPrefixMatch() {
        return this.prefixMatch;
    }

    /**
     * Set the prefixMatch property: Optional. Filters the results to replicate only blobs whose names begin with the
     * specified prefix.
     *
     * @param prefixMatch the prefixMatch value to set.
     * @return the ObjectReplicationPolicyFilter object itself.
     */
    public ObjectReplicationPolicyFilter setPrefixMatch(List<String> prefixMatch) {
        this.prefixMatch = prefixMatch;
        return this;
    }

    /**
     * Get the minCreationTime property: Blobs created after the time will be replicated to the destination. It must be
     * in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example: 2020-02-19T16:05:00Z.
     *
     * @return the minCreationTime value.
     */
    public String getMinCreationTime() {
        return this.minCreationTime;
    }

    /**
     * Set the minCreationTime property: Blobs created after the time will be replicated to the destination. It must be
     * in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example: 2020-02-19T16:05:00Z.
     *
     * @param minCreationTime the minCreationTime value to set.
     * @return the ObjectReplicationPolicyFilter object itself.
     */
    public ObjectReplicationPolicyFilter setMinCreationTime(String minCreationTime) {
        this.minCreationTime = minCreationTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
