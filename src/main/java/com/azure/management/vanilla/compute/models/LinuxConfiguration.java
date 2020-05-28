// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinuxConfiguration model. */
@Fluent
public final class LinuxConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinuxConfiguration.class);

    /*
     * Specifies whether password authentication should be disabled.
     */
    @JsonProperty(value = "disablePasswordAuthentication")
    private Boolean disablePasswordAuthentication;

    /*
     * Specifies the ssh key configuration for a Linux OS.
     */
    @JsonProperty(value = "ssh")
    private SshConfiguration ssh;

    /*
     * Indicates whether virtual machine agent should be provisioned on the
     * virtual machine. <br><br> When this property is not specified in the
     * request body, default behavior is to set it to true.  This will ensure
     * that VM Agent is installed on the VM so that extensions can be added to
     * the VM later.
     */
    @JsonProperty(value = "provisionVMAgent")
    private Boolean provisionVMAgent;

    /**
     * Get the disablePasswordAuthentication property: Specifies whether password authentication should be disabled.
     *
     * @return the disablePasswordAuthentication value.
     */
    public Boolean isDisablePasswordAuthentication() {
        return this.disablePasswordAuthentication;
    }

    /**
     * Set the disablePasswordAuthentication property: Specifies whether password authentication should be disabled.
     *
     * @param disablePasswordAuthentication the disablePasswordAuthentication value to set.
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration setDisablePasswordAuthentication(Boolean disablePasswordAuthentication) {
        this.disablePasswordAuthentication = disablePasswordAuthentication;
        return this;
    }

    /**
     * Get the ssh property: Specifies the ssh key configuration for a Linux OS.
     *
     * @return the ssh value.
     */
    public SshConfiguration getSsh() {
        return this.ssh;
    }

    /**
     * Set the ssh property: Specifies the ssh key configuration for a Linux OS.
     *
     * @param ssh the ssh value to set.
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration setSsh(SshConfiguration ssh) {
        this.ssh = ssh;
        return this;
    }

    /**
     * Get the provisionVMAgent property: Indicates whether virtual machine agent should be provisioned on the virtual
     * machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set
     * it to true. This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM
     * later.
     *
     * @return the provisionVMAgent value.
     */
    public Boolean isProvisionVMAgent() {
        return this.provisionVMAgent;
    }

    /**
     * Set the provisionVMAgent property: Indicates whether virtual machine agent should be provisioned on the virtual
     * machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set
     * it to true. This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM
     * later.
     *
     * @param provisionVMAgent the provisionVMAgent value to set.
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration setProvisionVMAgent(Boolean provisionVMAgent) {
        this.provisionVMAgent = provisionVMAgent;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSsh() != null) {
            getSsh().validate();
        }
    }
}