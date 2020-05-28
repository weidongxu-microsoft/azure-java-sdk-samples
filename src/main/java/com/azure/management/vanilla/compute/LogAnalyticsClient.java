// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.compute.implementation.LogAnalyticsImpl;
import com.azure.management.vanilla.compute.models.LogAnalyticsInputBase;
import com.azure.management.vanilla.compute.models.LogAnalyticsOperationResult;
import com.azure.management.vanilla.compute.models.RequestRateByIntervalInput;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class LogAnalyticsClient {
    private LogAnalyticsImpl serviceClient;

    /** Initializes an instance of LogAnalytics client. */
    LogAnalyticsClient(LogAnalyticsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<LogAnalyticsOperationResult>, LogAnalyticsOperationResult>
        beginExportRequestRateByInterval(String location, RequestRateByIntervalInput parameters) {
        return this.serviceClient.beginExportRequestRateByInterval(location, parameters);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<LogAnalyticsOperationResult>, LogAnalyticsOperationResult>
        beginExportRequestRateByInterval(String location, RequestRateByIntervalInput parameters, Context context) {
        return this.serviceClient.beginExportRequestRateByInterval(location, parameters, context);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResult exportRequestRateByInterval(
        String location, RequestRateByIntervalInput parameters) {
        return this.serviceClient.exportRequestRateByInterval(location, parameters);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResult exportRequestRateByInterval(
        String location, RequestRateByIntervalInput parameters, Context context) {
        return this.serviceClient.exportRequestRateByInterval(location, parameters, context);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api input base class for LogAnalytics Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<LogAnalyticsOperationResult>, LogAnalyticsOperationResult>
        beginExportThrottledRequests(String location, LogAnalyticsInputBase parameters) {
        return this.serviceClient.beginExportThrottledRequests(location, parameters);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api input base class for LogAnalytics Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<LogAnalyticsOperationResult>, LogAnalyticsOperationResult>
        beginExportThrottledRequests(String location, LogAnalyticsInputBase parameters, Context context) {
        return this.serviceClient.beginExportThrottledRequests(location, parameters, context);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api input base class for LogAnalytics Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResult exportThrottledRequests(String location, LogAnalyticsInputBase parameters) {
        return this.serviceClient.exportThrottledRequests(location, parameters);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api input base class for LogAnalytics Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResult exportThrottledRequests(
        String location, LogAnalyticsInputBase parameters, Context context) {
        return this.serviceClient.exportThrottledRequests(location, parameters, context);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResult beginExportRequestRateByIntervalWithoutPolling(
        String location, RequestRateByIntervalInput parameters) {
        return this.serviceClient.beginExportRequestRateByIntervalWithoutPolling(location, parameters);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResult beginExportRequestRateByIntervalWithoutPolling(
        String location, RequestRateByIntervalInput parameters, Context context) {
        return this.serviceClient.beginExportRequestRateByIntervalWithoutPolling(location, parameters, context);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api input base class for LogAnalytics Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResult beginExportThrottledRequestsWithoutPolling(
        String location, LogAnalyticsInputBase parameters) {
        return this.serviceClient.beginExportThrottledRequestsWithoutPolling(location, parameters);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api input base class for LogAnalytics Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResult beginExportThrottledRequestsWithoutPolling(
        String location, LogAnalyticsInputBase parameters, Context context) {
        return this.serviceClient.beginExportThrottledRequestsWithoutPolling(location, parameters, context);
    }
}
