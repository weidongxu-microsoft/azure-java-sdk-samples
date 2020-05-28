// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.network.models.VpnServerConfigurationsResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VpnServerConfigurationsAssociatedWithVirtualWans.
 */
public final class VpnServerConfigurationsAssociatedWithVirtualWansImpl {
    private final ClientLogger logger = new ClientLogger(VpnServerConfigurationsAssociatedWithVirtualWansImpl.class);

    /** The proxy service used to perform REST calls. */
    private final VpnServerConfigurationsAssociatedWithVirtualWansService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnServerConfigurationsAssociatedWithVirtualWansImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VpnServerConfigurationsAssociatedWithVirtualWansImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    VpnServerConfigurationsAssociatedWithVirtualWansService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientVpnServerConfigurationsAssociatedWithVirtualWans to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface VpnServerConfigurationsAssociatedWithVirtualWansService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans"
                + "/{virtualWANName}/vpnServerConfigurations")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> list(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("virtualWANName") String virtualWanName,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans"
                + "/{virtualWANName}/vpnServerConfigurations")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VpnServerConfigurationsResponse>> beginListWithoutPolling(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("virtualWANName") String virtualWanName,
            @QueryParam("api-version") String apiVersion,
            Context context);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> listWithResponseAsync(String resourceGroupName, String virtualWanName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualWanName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualWanName is required and cannot be null."));
        }
        final String apiVersion = "2020-04-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            virtualWanName,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> listWithResponseAsync(
        String resourceGroupName, String virtualWanName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualWanName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualWanName is required and cannot be null."));
        }
        final String apiVersion = "2020-04-01";
        return service
            .list(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                virtualWanName,
                apiVersion,
                context);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<VpnServerConfigurationsResponse>, VpnServerConfigurationsResponse> beginList(
        String resourceGroupName, String virtualWanName) {
        Mono<Response<Flux<ByteBuffer>>> mono = listWithResponseAsync(resourceGroupName, virtualWanName);
        return this
            .client
            .<VpnServerConfigurationsResponse, VpnServerConfigurationsResponse>getLroResultAsync(
                mono,
                this.client.getHttpPipeline(),
                VpnServerConfigurationsResponse.class,
                VpnServerConfigurationsResponse.class);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<VpnServerConfigurationsResponse>, VpnServerConfigurationsResponse> beginList(
        String resourceGroupName, String virtualWanName, Context context) {
        Mono<Response<Flux<ByteBuffer>>> mono = listWithResponseAsync(resourceGroupName, virtualWanName, context);
        return this
            .client
            .<VpnServerConfigurationsResponse, VpnServerConfigurationsResponse>getLroResultAsync(
                mono,
                this.client.getHttpPipeline(),
                VpnServerConfigurationsResponse.class,
                VpnServerConfigurationsResponse.class);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponse> listAsync(String resourceGroupName, String virtualWanName) {
        Mono<Response<Flux<ByteBuffer>>> mono = listWithResponseAsync(resourceGroupName, virtualWanName);
        return this
            .client
            .<VpnServerConfigurationsResponse, VpnServerConfigurationsResponse>getLroResultAsync(
                mono,
                this.client.getHttpPipeline(),
                VpnServerConfigurationsResponse.class,
                VpnServerConfigurationsResponse.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponse> listAsync(
        String resourceGroupName, String virtualWanName, Context context) {
        Mono<Response<Flux<ByteBuffer>>> mono = listWithResponseAsync(resourceGroupName, virtualWanName, context);
        return this
            .client
            .<VpnServerConfigurationsResponse, VpnServerConfigurationsResponse>getLroResultAsync(
                mono,
                this.client.getHttpPipeline(),
                VpnServerConfigurationsResponse.class,
                VpnServerConfigurationsResponse.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationsResponse list(String resourceGroupName, String virtualWanName) {
        return listAsync(resourceGroupName, virtualWanName).block();
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationsResponse list(String resourceGroupName, String virtualWanName, Context context) {
        return listAsync(resourceGroupName, virtualWanName, context).block();
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<VpnServerConfigurationsResponse>> beginListWithoutPollingWithResponseAsync(
        String resourceGroupName, String virtualWanName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualWanName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualWanName is required and cannot be null."));
        }
        final String apiVersion = "2020-04-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginListWithoutPolling(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            virtualWanName,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<VpnServerConfigurationsResponse>> beginListWithoutPollingWithResponseAsync(
        String resourceGroupName, String virtualWanName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualWanName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualWanName is required and cannot be null."));
        }
        final String apiVersion = "2020-04-01";
        return service
            .beginListWithoutPolling(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                virtualWanName,
                apiVersion,
                context);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponse> beginListWithoutPollingAsync(
        String resourceGroupName, String virtualWanName) {
        return beginListWithoutPollingWithResponseAsync(resourceGroupName, virtualWanName)
            .flatMap(
                (Response<VpnServerConfigurationsResponse> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponse> beginListWithoutPollingAsync(
        String resourceGroupName, String virtualWanName, Context context) {
        return beginListWithoutPollingWithResponseAsync(resourceGroupName, virtualWanName, context)
            .flatMap(
                (Response<VpnServerConfigurationsResponse> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationsResponse beginListWithoutPolling(String resourceGroupName, String virtualWanName) {
        return beginListWithoutPollingAsync(resourceGroupName, virtualWanName).block();
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationsResponse beginListWithoutPolling(
        String resourceGroupName, String virtualWanName, Context context) {
        return beginListWithoutPollingAsync(resourceGroupName, virtualWanName, context).block();
    }
}