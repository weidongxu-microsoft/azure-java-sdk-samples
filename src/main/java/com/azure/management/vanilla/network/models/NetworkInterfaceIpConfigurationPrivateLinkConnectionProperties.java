// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties model. */
@Immutable
public final class NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties.class);

    /*
     * The group ID for current private link connection.
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /*
     * The required member name for current private link connection.
     */
    @JsonProperty(value = "requiredMemberName", access = JsonProperty.Access.WRITE_ONLY)
    private String requiredMemberName;

    /*
     * List of FQDNs for current private link connection.
     */
    @JsonProperty(value = "fqdns", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> fqdns;

    /**
     * Get the groupId property: The group ID for current private link connection.
     *
     * @return the groupId value.
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Get the requiredMemberName property: The required member name for current private link connection.
     *
     * @return the requiredMemberName value.
     */
    public String getRequiredMemberName() {
        return this.requiredMemberName;
    }

    /**
     * Get the fqdns property: List of FQDNs for current private link connection.
     *
     * @return the fqdns value.
     */
    public List<String> getFqdns() {
        return this.fqdns;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
