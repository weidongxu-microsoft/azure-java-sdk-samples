// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the deleteImmutabilityPolicy operation. */
public final class BlobContainersDeleteImmutabilityPolicyResponse
    extends ResponseBase<BlobContainersDeleteImmutabilityPolicyHeaders, ImmutabilityPolicy> {
    /**
     * Creates an instance of BlobContainersDeleteImmutabilityPolicyResponse.
     *
     * @param request the request which resulted in this BlobContainersDeleteImmutabilityPolicyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobContainersDeleteImmutabilityPolicyResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        ImmutabilityPolicy value,
        BlobContainersDeleteImmutabilityPolicyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ImmutabilityPolicy getValue() {
        return super.getValue();
    }
}
