// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.network.implementation.AzureFirewallFqdnTagsImpl;
import com.azure.management.vanilla.network.models.AzureFirewallFqdnTag;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class AzureFirewallFqdnTagsClient {
    private AzureFirewallFqdnTagsImpl serviceClient;

    /** Initializes an instance of AzureFirewallFqdnTags client. */
    AzureFirewallFqdnTagsClient(AzureFirewallFqdnTagsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets all the Azure Firewall FQDN Tags in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Azure Firewall FQDN Tags in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AzureFirewallFqdnTag> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all the Azure Firewall FQDN Tags in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Azure Firewall FQDN Tags in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AzureFirewallFqdnTag> list(Context context) {
        return this.serviceClient.list(context);
    }
}