// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DiagnosticsProfile model. */
@Fluent
public final class DiagnosticsProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticsProfile.class);

    /*
     * Boot Diagnostics is a debugging feature which allows you to view Console
     * Output and Screenshot to diagnose VM status. <br><br> You can easily
     * view the output of your console log. <br><br> Azure also enables you to
     * see a screenshot of the VM from the hypervisor.
     */
    @JsonProperty(value = "bootDiagnostics")
    private BootDiagnostics bootDiagnostics;

    /**
     * Get the bootDiagnostics property: Boot Diagnostics is a debugging feature which allows you to view Console Output
     * and Screenshot to diagnose VM status. &lt;br&gt;&lt;br&gt; You can easily view the output of your console log.
     * &lt;br&gt;&lt;br&gt; Azure also enables you to see a screenshot of the VM from the hypervisor.
     *
     * @return the bootDiagnostics value.
     */
    public BootDiagnostics getBootDiagnostics() {
        return this.bootDiagnostics;
    }

    /**
     * Set the bootDiagnostics property: Boot Diagnostics is a debugging feature which allows you to view Console Output
     * and Screenshot to diagnose VM status. &lt;br&gt;&lt;br&gt; You can easily view the output of your console log.
     * &lt;br&gt;&lt;br&gt; Azure also enables you to see a screenshot of the VM from the hypervisor.
     *
     * @param bootDiagnostics the bootDiagnostics value to set.
     * @return the DiagnosticsProfile object itself.
     */
    public DiagnosticsProfile setBootDiagnostics(BootDiagnostics bootDiagnostics) {
        this.bootDiagnostics = bootDiagnostics;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getBootDiagnostics() != null) {
            getBootDiagnostics().validate();
        }
    }
}
