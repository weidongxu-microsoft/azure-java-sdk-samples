// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.vanilla.storage.ErrorResponseException;
import com.azure.management.vanilla.storage.PrivateEndpoint;
import com.azure.management.vanilla.storage.PrivateLinkServiceConnectionState;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnections. */
public final class PrivateEndpointConnectionsInner {
    /** The proxy service used to perform REST calls. */
    private final PrivateEndpointConnectionsService service;

    /** The service client containing this operation class. */
    private final StorageManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateEndpointConnectionsInner(StorageManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    PrivateEndpointConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientPrivateEndpointConnections to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface PrivateEndpointConnectionsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionInner>> put(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @BodyParam("application/json") PrivateEndpointConnectionInner properties,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            Context context);
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            privateEndpointConnectionName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> getAsync(
        String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return getWithResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName)
            .flatMap(
                (SimpleResponse<PrivateEndpointConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner get(
        String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return getAsync(resourceGroupName, accountName, privateEndpointConnectionName).block();
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage
     *     Account.
     * @param privateEndpoint The Private Endpoint resource.
     * @param privateLinkServiceConnectionState A collection of information about the state of the connection between
     *     service consumer and provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> putWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpoint privateEndpoint,
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        PrivateEndpointConnectionInner properties = new PrivateEndpointConnectionInner();
        properties.setPrivateEndpoint(privateEndpoint);
        properties.setPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .put(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            privateEndpointConnectionName,
                            properties,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage
     *     Account.
     * @param privateEndpoint The Private Endpoint resource.
     * @param privateLinkServiceConnectionState A collection of information about the state of the connection between
     *     service consumer and provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> putAsync(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpoint privateEndpoint,
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        return putWithResponseAsync(
                resourceGroupName,
                accountName,
                privateEndpointConnectionName,
                privateEndpoint,
                privateLinkServiceConnectionState)
            .flatMap(
                (SimpleResponse<PrivateEndpointConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage
     *     Account.
     * @param privateEndpoint The Private Endpoint resource.
     * @param privateLinkServiceConnectionState A collection of information about the state of the connection between
     *     service consumer and provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner put(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpoint privateEndpoint,
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        return putAsync(
                resourceGroupName,
                accountName,
                privateEndpointConnectionName,
                privateEndpoint,
                privateLinkServiceConnectionState)
            .block();
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            privateEndpointConnectionName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return deleteWithResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        deleteAsync(resourceGroupName, accountName, privateEndpointConnectionName).block();
    }
}
