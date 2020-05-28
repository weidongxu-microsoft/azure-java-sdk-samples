// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.storage.implementation.ManagementPoliciesImpl;
import com.azure.management.vanilla.storage.models.ManagementPolicy;
import com.azure.management.vanilla.storage.models.ManagementPolicySchema;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous StorageManagementClient type. */
@ServiceClient(builder = StorageManagementClientBuilder.class)
public final class ManagementPoliciesAsyncClient {
    private ManagementPoliciesImpl serviceClient;

    /** Initializes an instance of ManagementPolicies client. */
    ManagementPoliciesAsyncClient(ManagementPoliciesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ManagementPolicy>> getWithResponse(String resourceGroupName, String accountName) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, accountName);
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ManagementPolicy>> getWithResponse(
        String resourceGroupName, String accountName, Context context) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, accountName, context);
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagementPolicy> get(String resourceGroupName, String accountName) {
        return this.serviceClient.getAsync(resourceGroupName, accountName);
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagementPolicy> get(String resourceGroupName, String accountName, Context context) {
        return this.serviceClient.getAsync(resourceGroupName, accountName, context);
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param policy The Storage Account ManagementPolicies Rules. See more details in:
     *     https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ManagementPolicy>> createOrUpdateWithResponse(
        String resourceGroupName, String accountName, ManagementPolicySchema policy) {
        return this.serviceClient.createOrUpdateWithResponseAsync(resourceGroupName, accountName, policy);
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param policy The Storage Account ManagementPolicies Rules. See more details in:
     *     https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ManagementPolicy>> createOrUpdateWithResponse(
        String resourceGroupName, String accountName, ManagementPolicySchema policy, Context context) {
        return this.serviceClient.createOrUpdateWithResponseAsync(resourceGroupName, accountName, policy, context);
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param policy The Storage Account ManagementPolicies Rules. See more details in:
     *     https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagementPolicy> createOrUpdate(
        String resourceGroupName, String accountName, ManagementPolicySchema policy) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, accountName, policy);
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param policy The Storage Account ManagementPolicies Rules. See more details in:
     *     https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagementPolicy> createOrUpdate(
        String resourceGroupName, String accountName, ManagementPolicySchema policy, Context context) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, accountName, policy, context);
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(String resourceGroupName, String accountName) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, accountName);
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(String resourceGroupName, String accountName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, accountName, context);
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String accountName) {
        return this.serviceClient.deleteAsync(resourceGroupName, accountName);
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String accountName, Context context) {
        return this.serviceClient.deleteAsync(resourceGroupName, accountName, context);
    }
}
