// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetInstanceView model. */
@Fluent
public final class VirtualMachineScaleSetInstanceView {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetInstanceView.class);

    /*
     * The instance view status summary for the virtual machine scale set.
     */
    @JsonProperty(value = "virtualMachine", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineScaleSetInstanceViewStatusesSummary virtualMachine;

    /*
     * The extensions information.
     */
    @JsonProperty(value = "extensions", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineScaleSetVMExtensionsSummary> extensions;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /*
     * The orchestration services information.
     */
    @JsonProperty(value = "orchestrationServices", access = JsonProperty.Access.WRITE_ONLY)
    private List<OrchestrationServiceSummary> orchestrationServices;

    /**
     * Get the virtualMachine property: The instance view status summary for the virtual machine scale set.
     *
     * @return the virtualMachine value.
     */
    public VirtualMachineScaleSetInstanceViewStatusesSummary getVirtualMachine() {
        return this.virtualMachine;
    }

    /**
     * Get the extensions property: The extensions information.
     *
     * @return the extensions value.
     */
    public List<VirtualMachineScaleSetVMExtensionsSummary> getExtensions() {
        return this.extensions;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> getStatuses() {
        return this.statuses;
    }

    /**
     * Set the statuses property: The resource status information.
     *
     * @param statuses the statuses value to set.
     * @return the VirtualMachineScaleSetInstanceView object itself.
     */
    public VirtualMachineScaleSetInstanceView setStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Get the orchestrationServices property: The orchestration services information.
     *
     * @return the orchestrationServices value.
     */
    public List<OrchestrationServiceSummary> getOrchestrationServices() {
        return this.orchestrationServices;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getVirtualMachine() != null) {
            getVirtualMachine().validate();
        }
        if (getExtensions() != null) {
            getExtensions().forEach(e -> e.validate());
        }
        if (getStatuses() != null) {
            getStatuses().forEach(e -> e.validate());
        }
        if (getOrchestrationServices() != null) {
            getOrchestrationServices().forEach(e -> e.validate());
        }
    }
}
