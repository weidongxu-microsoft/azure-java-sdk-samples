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

/** The VirtualMachineScaleSet model. */
@JsonFlatten
@Fluent
public class VirtualMachineScaleSet extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSet.class);

    /*
     * The virtual machine scale set sku.
     */
    @JsonProperty(value = "sku")
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
     * The identity of the virtual machine scale set, if configured.
     */
    @JsonProperty(value = "identity")
    private VirtualMachineScaleSetIdentity identity;

    /*
     * The virtual machine scale set zones. NOTE: Availability zones can only
     * be set when you create the scale set
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The upgrade policy.
     */
    @JsonProperty(value = "properties.upgradePolicy")
    private UpgradePolicy upgradePolicy;

    /*
     * Policy for automatic repairs.
     */
    @JsonProperty(value = "properties.automaticRepairsPolicy")
    private AutomaticRepairsPolicy automaticRepairsPolicy;

    /*
     * The virtual machine profile.
     */
    @JsonProperty(value = "properties.virtualMachineProfile")
    private VirtualMachineScaleSetVMProfile virtualMachineProfile;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Specifies whether the Virtual Machine Scale Set should be
     * overprovisioned.
     */
    @JsonProperty(value = "properties.overprovision")
    private Boolean overprovision;

    /*
     * When Overprovision is enabled, extensions are launched only on the
     * requested number of VMs which are finally kept. This property will hence
     * ensure that the extensions do not run on the extra overprovisioned VMs.
     */
    @JsonProperty(value = "properties.doNotRunExtensionsOnOverprovisionedVMs")
    private Boolean doNotRunExtensionsOnOverprovisionedVMs;

    /*
     * Specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     */
    @JsonProperty(value = "properties.uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /*
     * When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may
     * be modified to false. However, if singlePlacementGroup is false, it may
     * not be modified to true.
     */
    @JsonProperty(value = "properties.singlePlacementGroup")
    private Boolean singlePlacementGroup;

    /*
     * Whether to force strictly even Virtual Machine distribution cross
     * x-zones in case there is zone outage.
     */
    @JsonProperty(value = "properties.zoneBalance")
    private Boolean zoneBalance;

    /*
     * Fault Domain count for each placement group.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /*
     * Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. <br><br>Minimum
     * api-version: 2018-04-01.
     */
    @JsonProperty(value = "properties.proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /*
     * Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the
     * Virtual Machines have the capability to support attaching managed data
     * disks with UltraSSD_LRS storage account type.
     */
    @JsonProperty(value = "properties.additionalCapabilities")
    private AdditionalCapabilities additionalCapabilities;

    /*
     * Specifies the scale-in policy that decides which virtual machines are
     * chosen for removal when a Virtual Machine Scale Set is scaled-in.
     */
    @JsonProperty(value = "properties.scaleInPolicy")
    private ScaleInPolicy scaleInPolicy;

    /**
     * Get the sku property: The virtual machine scale set sku.
     *
     * @return the sku value.
     */
    public Sku getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: The virtual machine scale set sku.
     *
     * @param sku the sku value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setSku(Sku sku) {
        this.sku = sku;
        return this;
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
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the identity property: The identity of the virtual machine scale set, if configured.
     *
     * @return the identity value.
     */
    public VirtualMachineScaleSetIdentity getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the virtual machine scale set, if configured.
     *
     * @param identity the identity value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setIdentity(VirtualMachineScaleSetIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the zones property: The virtual machine scale set zones. NOTE: Availability zones can only be set when you
     * create the scale set.
     *
     * @return the zones value.
     */
    public List<String> getZones() {
        return this.zones;
    }

    /**
     * Set the zones property: The virtual machine scale set zones. NOTE: Availability zones can only be set when you
     * create the scale set.
     *
     * @param zones the zones value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the upgradePolicy property: The upgrade policy.
     *
     * @return the upgradePolicy value.
     */
    public UpgradePolicy getUpgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * Set the upgradePolicy property: The upgrade policy.
     *
     * @param upgradePolicy the upgradePolicy value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setUpgradePolicy(UpgradePolicy upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }

    /**
     * Get the automaticRepairsPolicy property: Policy for automatic repairs.
     *
     * @return the automaticRepairsPolicy value.
     */
    public AutomaticRepairsPolicy getAutomaticRepairsPolicy() {
        return this.automaticRepairsPolicy;
    }

    /**
     * Set the automaticRepairsPolicy property: Policy for automatic repairs.
     *
     * @param automaticRepairsPolicy the automaticRepairsPolicy value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setAutomaticRepairsPolicy(AutomaticRepairsPolicy automaticRepairsPolicy) {
        this.automaticRepairsPolicy = automaticRepairsPolicy;
        return this;
    }

    /**
     * Get the virtualMachineProfile property: The virtual machine profile.
     *
     * @return the virtualMachineProfile value.
     */
    public VirtualMachineScaleSetVMProfile getVirtualMachineProfile() {
        return this.virtualMachineProfile;
    }

    /**
     * Set the virtualMachineProfile property: The virtual machine profile.
     *
     * @param virtualMachineProfile the virtualMachineProfile value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setVirtualMachineProfile(VirtualMachineScaleSetVMProfile virtualMachineProfile) {
        this.virtualMachineProfile = virtualMachineProfile;
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
     * Get the overprovision property: Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @return the overprovision value.
     */
    public Boolean isOverprovision() {
        return this.overprovision;
    }

    /**
     * Set the overprovision property: Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @param overprovision the overprovision value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setOverprovision(Boolean overprovision) {
        this.overprovision = overprovision;
        return this;
    }

    /**
     * Get the doNotRunExtensionsOnOverprovisionedVMs property: When Overprovision is enabled, extensions are launched
     * only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions
     * do not run on the extra overprovisioned VMs.
     *
     * @return the doNotRunExtensionsOnOverprovisionedVMs value.
     */
    public Boolean isDoNotRunExtensionsOnOverprovisionedVMs() {
        return this.doNotRunExtensionsOnOverprovisionedVMs;
    }

    /**
     * Set the doNotRunExtensionsOnOverprovisionedVMs property: When Overprovision is enabled, extensions are launched
     * only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions
     * do not run on the extra overprovisioned VMs.
     *
     * @param doNotRunExtensionsOnOverprovisionedVMs the doNotRunExtensionsOnOverprovisionedVMs value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setDoNotRunExtensionsOnOverprovisionedVMs(
        Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        this.doNotRunExtensionsOnOverprovisionedVMs = doNotRunExtensionsOnOverprovisionedVMs;
        return this;
    }

    /**
     * Get the uniqueId property: Specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     *
     * @return the uniqueId value.
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    /**
     * Get the singlePlacementGroup property: When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if
     * singlePlacementGroup is false, it may not be modified to true.
     *
     * @return the singlePlacementGroup value.
     */
    public Boolean isSinglePlacementGroup() {
        return this.singlePlacementGroup;
    }

    /**
     * Set the singlePlacementGroup property: When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if
     * singlePlacementGroup is false, it may not be modified to true.
     *
     * @param singlePlacementGroup the singlePlacementGroup value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setSinglePlacementGroup(Boolean singlePlacementGroup) {
        this.singlePlacementGroup = singlePlacementGroup;
        return this;
    }

    /**
     * Get the zoneBalance property: Whether to force strictly even Virtual Machine distribution cross x-zones in case
     * there is zone outage.
     *
     * @return the zoneBalance value.
     */
    public Boolean isZoneBalance() {
        return this.zoneBalance;
    }

    /**
     * Set the zoneBalance property: Whether to force strictly even Virtual Machine distribution cross x-zones in case
     * there is zone outage.
     *
     * @param zoneBalance the zoneBalance value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setZoneBalance(Boolean zoneBalance) {
        this.zoneBalance = zoneBalance;
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Fault Domain count for each placement group.
     *
     * @return the platformFaultDomainCount value.
     */
    public Integer getPlatformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount property: Fault Domain count for each placement group.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    public SubResource getProximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Get the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to
     * support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @return the additionalCapabilities value.
     */
    public AdditionalCapabilities getAdditionalCapabilities() {
        return this.additionalCapabilities;
    }

    /**
     * Set the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to
     * support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        this.additionalCapabilities = additionalCapabilities;
        return this;
    }

    /**
     * Get the scaleInPolicy property: Specifies the scale-in policy that decides which virtual machines are chosen for
     * removal when a Virtual Machine Scale Set is scaled-in.
     *
     * @return the scaleInPolicy value.
     */
    public ScaleInPolicy getScaleInPolicy() {
        return this.scaleInPolicy;
    }

    /**
     * Set the scaleInPolicy property: Specifies the scale-in policy that decides which virtual machines are chosen for
     * removal when a Virtual Machine Scale Set is scaled-in.
     *
     * @param scaleInPolicy the scaleInPolicy value to set.
     * @return the VirtualMachineScaleSet object itself.
     */
    public VirtualMachineScaleSet setScaleInPolicy(ScaleInPolicy scaleInPolicy) {
        this.scaleInPolicy = scaleInPolicy;
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
        if (getIdentity() != null) {
            getIdentity().validate();
        }
        if (getUpgradePolicy() != null) {
            getUpgradePolicy().validate();
        }
        if (getAutomaticRepairsPolicy() != null) {
            getAutomaticRepairsPolicy().validate();
        }
        if (getVirtualMachineProfile() != null) {
            getVirtualMachineProfile().validate();
        }
        if (getAdditionalCapabilities() != null) {
            getAdditionalCapabilities().validate();
        }
        if (getScaleInPolicy() != null) {
            getScaleInPolicy().validate();
        }
    }
}
