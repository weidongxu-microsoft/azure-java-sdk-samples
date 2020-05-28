// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The TroubleshootingResult model. */
@Fluent
public final class TroubleshootingResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TroubleshootingResult.class);

    /*
     * The start time of the troubleshooting.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The end time of the troubleshooting.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The result code of the troubleshooting.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Information from troubleshooting.
     */
    @JsonProperty(value = "results")
    private List<TroubleshootingDetails> results;

    /**
     * Get the startTime property: The start time of the troubleshooting.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the troubleshooting.
     *
     * @param startTime the startTime value to set.
     * @return the TroubleshootingResult object itself.
     */
    public TroubleshootingResult setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the troubleshooting.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the troubleshooting.
     *
     * @param endTime the endTime value to set.
     * @return the TroubleshootingResult object itself.
     */
    public TroubleshootingResult setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the code property: The result code of the troubleshooting.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The result code of the troubleshooting.
     *
     * @param code the code value to set.
     * @return the TroubleshootingResult object itself.
     */
    public TroubleshootingResult setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the results property: Information from troubleshooting.
     *
     * @return the results value.
     */
    public List<TroubleshootingDetails> getResults() {
        return this.results;
    }

    /**
     * Set the results property: Information from troubleshooting.
     *
     * @param results the results value to set.
     * @return the TroubleshootingResult object itself.
     */
    public TroubleshootingResult setResults(List<TroubleshootingDetails> results) {
        this.results = results;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getResults() != null) {
            getResults().forEach(e -> e.validate());
        }
    }
}
