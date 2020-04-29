// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The TagProperty model. */
@Immutable
public final class TagProperty {
    private final ClientLogger logger = new ClientLogger(TagProperty.class);

    /*
     * The tag value.
     */
    @JsonProperty(value = "tag", access = JsonProperty.Access.WRITE_ONLY)
    private String tag;

    /*
     * Returns the date and time the tag was added.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * Returns the Object ID of the user who added the tag.
     */
    @JsonProperty(value = "objectIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String objectIdentifier;

    /*
     * Returns the Tenant ID that issued the token for the user who added the
     * tag.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * Returns the User Principal Name of the user who added the tag.
     */
    @JsonProperty(value = "upn", access = JsonProperty.Access.WRITE_ONLY)
    private String upn;

    /**
     * Get the tag property: The tag value.
     *
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Get the timestamp property: Returns the date and time the tag was added.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the objectIdentifier property: Returns the Object ID of the user who added the tag.
     *
     * @return the objectIdentifier value.
     */
    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * Get the tenantId property: Returns the Tenant ID that issued the token for the user who added the tag.
     *
     * @return the tenantId value.
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Get the upn property: Returns the User Principal Name of the user who added the tag.
     *
     * @return the upn value.
     */
    public String getUpn() {
        return this.upn;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
