// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetVM model. */
@JsonFlatten
@Fluent
public class VirtualMachineScaleSetVM extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetVM.class);

    /*
     * The virtual machine instance ID.
     */
    @JsonProperty(value = "instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceId;

    /*
     * The virtual machine SKU.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /*
     * Specifies information about the marketplace image used to create the
     * virtual machine. This element is only used for marketplace images.
     * Before you can use a marketplace image from an API, you must enable the
     * image for programmatic use.  In the Azure portal, find the marketplace
     * image that you want to use and then click **Want to deploy
     * programmatically, Get Started ->**. Enter any required information and
     * then click **Save**.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /*
     * The virtual machine child extension resources.
     */
    @JsonProperty(value = "resources", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineExtension> resources;

    /*
     * The virtual machine zones.
     */
    @JsonProperty(value = "zones", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> zones;

    /*
     * Specifies whether the latest model has been applied to the virtual
     * machine.
     */
    @JsonProperty(value = "properties.latestModelApplied", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean latestModelApplied;

    /*
     * Azure VM unique ID.
     */
    @JsonProperty(value = "properties.vmId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmId;

    /*
     * The virtual machine instance view.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineScaleSetVMInstanceView instanceView;

    /*
     * Specifies the hardware settings for the virtual machine.
     */
    @JsonProperty(value = "properties.hardwareProfile")
    private HardwareProfile hardwareProfile;

    /*
     * Specifies the storage settings for the virtual machine disks.
     */
    @JsonProperty(value = "properties.storageProfile")
    private StorageProfile storageProfile;

    /*
     * Specifies additional capabilities enabled or disabled on the virtual
     * machine in the scale set. For instance: whether the virtual machine has
     * the capability to support attaching managed data disks with UltraSSD_LRS
     * storage account type.
     */
    @JsonProperty(value = "properties.additionalCapabilities")
    private AdditionalCapabilities additionalCapabilities;

    /*
     * Specifies the operating system settings for the virtual machine.
     */
    @JsonProperty(value = "properties.osProfile")
    private OSProfile osProfile;

    /*
     * Specifies the network interfaces of the virtual machine.
     */
    @JsonProperty(value = "properties.networkProfile")
    private NetworkProfile networkProfile;

    /*
     * Specifies the network profile configuration of the virtual machine.
     */
    @JsonProperty(value = "properties.networkProfileConfiguration")
    private VirtualMachineScaleSetVMNetworkProfileConfiguration networkProfileConfiguration;

    /*
     * Specifies the boot diagnostic settings state. <br><br>Minimum
     * api-version: 2015-06-15.
     */
    @JsonProperty(value = "properties.diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /*
     * Specifies information about the availability set that the virtual
     * machine should be assigned to. Virtual machines specified in the same
     * availability set are allocated to different nodes to maximize
     * availability. For more information about availability sets, see [Manage
     * the availability of virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * <br><br> For more information on Azure planned maintenance, see [Planned
     * maintenance for virtual machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * <br><br> Currently, a VM can only be added to availability set at
     * creation time. An existing VM cannot be added to an availability set.
     */
    @JsonProperty(value = "properties.availabilitySet")
    private SubResource availabilitySet;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Specifies that the image or disk that is being used was licensed
     * on-premises. This element is only used for images that contain the
     * Windows Server operating system. <br><br> Possible values are: <br><br>
     * Windows_Client <br><br> Windows_Server <br><br> If this element is
     * included in a request for an update, the value must match the initial
     * value. This value cannot be updated. <br><br> For more information, see
     * [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * <br><br> Minimum api-version: 2015-06-15
     */
    @JsonProperty(value = "properties.licenseType")
    private String licenseType;

    /*
     * Specifies whether the model applied to the virtual machine is the model
     * of the virtual machine scale set or the customized model for the virtual
     * machine.
     */
    @JsonProperty(value = "properties.modelDefinitionApplied", access = JsonProperty.Access.WRITE_ONLY)
    private String modelDefinitionApplied;

    /*
     * Specifies the protection policy of the virtual machine.
     */
    @JsonProperty(value = "properties.protectionPolicy")
    private VirtualMachineScaleSetVMProtectionPolicy protectionPolicy;

    /**
     * Get the instanceId property: The virtual machine instance ID.
     *
     * @return the instanceId value.
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * Get the sku property: The virtual machine SKU.
     *
     * @return the sku value.
     */
    public Sku getSku() {
        return this.sku;
    }

    /**
     * Get the plan property: Specifies information about the marketplace image used to create the virtual machine. This
     * element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable
     * the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and then
     * click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     *
     * @return the plan value.
     */
    public Plan getPlan() {
        return this.plan;
    }

    /**
     * Set the plan property: Specifies information about the marketplace image used to create the virtual machine. This
     * element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable
     * the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and then
     * click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     *
     * @param plan the plan value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the resources property: The virtual machine child extension resources.
     *
     * @return the resources value.
     */
    public List<VirtualMachineExtension> getResources() {
        return this.resources;
    }

    /**
     * Get the zones property: The virtual machine zones.
     *
     * @return the zones value.
     */
    public List<String> getZones() {
        return this.zones;
    }

    /**
     * Get the latestModelApplied property: Specifies whether the latest model has been applied to the virtual machine.
     *
     * @return the latestModelApplied value.
     */
    public Boolean isLatestModelApplied() {
        return this.latestModelApplied;
    }

    /**
     * Get the vmId property: Azure VM unique ID.
     *
     * @return the vmId value.
     */
    public String getVmId() {
        return this.vmId;
    }

    /**
     * Get the instanceView property: The virtual machine instance view.
     *
     * @return the instanceView value.
     */
    public VirtualMachineScaleSetVMInstanceView getInstanceView() {
        return this.instanceView;
    }

    /**
     * Get the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     *
     * @return the hardwareProfile value.
     */
    public HardwareProfile getHardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     *
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value.
     */
    public StorageProfile getStorageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine in the scale set. For instance: whether the virtual machine has the capability to support attaching
     * managed data disks with UltraSSD_LRS storage account type.
     *
     * @return the additionalCapabilities value.
     */
    public AdditionalCapabilities getAdditionalCapabilities() {
        return this.additionalCapabilities;
    }

    /**
     * Set the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine in the scale set. For instance: whether the virtual machine has the capability to support attaching
     * managed data disks with UltraSSD_LRS storage account type.
     *
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        this.additionalCapabilities = additionalCapabilities;
        return this;
    }

    /**
     * Get the osProfile property: Specifies the operating system settings for the virtual machine.
     *
     * @return the osProfile value.
     */
    public OSProfile getOsProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies the operating system settings for the virtual machine.
     *
     * @param osProfile the osProfile value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the networkProfile property: Specifies the network interfaces of the virtual machine.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile getNetworkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Specifies the network interfaces of the virtual machine.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the networkProfileConfiguration property: Specifies the network profile configuration of the virtual machine.
     *
     * @return the networkProfileConfiguration value.
     */
    public VirtualMachineScaleSetVMNetworkProfileConfiguration getNetworkProfileConfiguration() {
        return this.networkProfileConfiguration;
    }

    /**
     * Set the networkProfileConfiguration property: Specifies the network profile configuration of the virtual machine.
     *
     * @param networkProfileConfiguration the networkProfileConfiguration value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setNetworkProfileConfiguration(
        VirtualMachineScaleSetVMNetworkProfileConfiguration networkProfileConfiguration) {
        this.networkProfileConfiguration = networkProfileConfiguration;
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @return the diagnosticsProfile value.
     */
    public DiagnosticsProfile getDiagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Manage the availability of virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     * machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     * cannot be added to an availability set.
     *
     * @return the availabilitySet value.
     */
    public SubResource getAvailabilitySet() {
        return this.availabilitySet;
    }

    /**
     * Set the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Manage the availability of virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     * machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     * cannot be added to an availability set.
     *
     * @param availabilitySet the availabilitySet value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setAvailabilitySet(SubResource availabilitySet) {
        this.availabilitySet = availabilitySet;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the licenseType property: Specifies that the image or disk that is being used was licensed on-premises. This
     * element is only used for images that contain the Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible
     * values are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; If this
     * element is included in a request for an update, the value must match the initial value. This value cannot be
     * updated. &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     *
     * @return the licenseType value.
     */
    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Specifies that the image or disk that is being used was licensed on-premises. This
     * element is only used for images that contain the Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible
     * values are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; If this
     * element is included in a request for an update, the value must match the initial value. This value cannot be
     * updated. &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     *
     * @param licenseType the licenseType value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the modelDefinitionApplied property: Specifies whether the model applied to the virtual machine is the model
     * of the virtual machine scale set or the customized model for the virtual machine.
     *
     * @return the modelDefinitionApplied value.
     */
    public String getModelDefinitionApplied() {
        return this.modelDefinitionApplied;
    }

    /**
     * Get the protectionPolicy property: Specifies the protection policy of the virtual machine.
     *
     * @return the protectionPolicy value.
     */
    public VirtualMachineScaleSetVMProtectionPolicy getProtectionPolicy() {
        return this.protectionPolicy;
    }

    /**
     * Set the protectionPolicy property: Specifies the protection policy of the virtual machine.
     *
     * @param protectionPolicy the protectionPolicy value to set.
     * @return the VirtualMachineScaleSetVM object itself.
     */
    public VirtualMachineScaleSetVM setProtectionPolicy(VirtualMachineScaleSetVMProtectionPolicy protectionPolicy) {
        this.protectionPolicy = protectionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSku() != null) {
            getSku().validate();
        }
        if (getPlan() != null) {
            getPlan().validate();
        }
        if (getResources() != null) {
            getResources().forEach(e -> e.validate());
        }
        if (getInstanceView() != null) {
            getInstanceView().validate();
        }
        if (getHardwareProfile() != null) {
            getHardwareProfile().validate();
        }
        if (getStorageProfile() != null) {
            getStorageProfile().validate();
        }
        if (getAdditionalCapabilities() != null) {
            getAdditionalCapabilities().validate();
        }
        if (getOsProfile() != null) {
            getOsProfile().validate();
        }
        if (getNetworkProfile() != null) {
            getNetworkProfile().validate();
        }
        if (getNetworkProfileConfiguration() != null) {
            getNetworkProfileConfiguration().validate();
        }
        if (getDiagnosticsProfile() != null) {
            getDiagnosticsProfile().validate();
        }
        if (getProtectionPolicy() != null) {
            getProtectionPolicy().validate();
        }
    }
}
