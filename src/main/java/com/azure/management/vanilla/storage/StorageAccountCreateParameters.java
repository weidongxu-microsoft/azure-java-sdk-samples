// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The StorageAccountCreateParameters model. */
@JsonFlatten
@Fluent
public class StorageAccountCreateParameters {
    /*
     * Required. Gets or sets the SKU name.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Required. Indicates the type of storage account.
     */
    @JsonProperty(value = "kind", required = true)
    private Kind kind;

    /*
     * Required. Gets or sets the location of the resource. This will be one of
     * the supported and registered Azure Geo Regions (e.g. West US, East US,
     * Southeast Asia, etc.). The geo region of a resource cannot be changed
     * once it is created, but if an identical geo region is specified on
     * update, the request will succeed.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Gets or sets a list of key value pairs that describe the resource. These
     * tags can be used for viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key with a length no greater than 128 characters and a value
     * with a length no greater than 256 characters.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * User domain assigned to the storage account. Name is the CNAME source.
     * Only one custom domain is supported per storage account at this time. To
     * clear the existing custom domain, use an empty string for the custom
     * domain name property.
     */
    @JsonProperty(value = "properties.customDomain")
    private CustomDomain customDomain;

    /*
     * Not applicable. Azure Storage encryption is enabled for all storage
     * accounts and cannot be disabled.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /*
     * Network rule set
     */
    @JsonProperty(value = "properties.networkAcls")
    private NetworkRuleSet networkRuleSet;

    /*
     * Required for storage accounts where kind = BlobStorage. The access tier
     * used for billing.
     */
    @JsonProperty(value = "properties.accessTier")
    private AccessTier accessTier;

    /*
     * Provides the identity based authentication settings for Azure Files.
     */
    @JsonProperty(value = "properties.azureFilesIdentityBasedAuthentication")
    private AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication;

    /*
     * Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     */
    @JsonProperty(value = "properties.supportsHttpsTrafficOnly")
    private Boolean enableHttpsTrafficOnly;

    /*
     * Account HierarchicalNamespace enabled if sets to true.
     */
    @JsonProperty(value = "properties.isHnsEnabled")
    private Boolean isHnsEnabled;

    /*
     * Allow large file shares if sets to Enabled. It cannot be disabled once
     * it is enabled.
     */
    @JsonProperty(value = "properties.largeFileSharesState")
    private LargeFileSharesState largeFileSharesState;

    /*
     * Maintains information about the network routing choice opted by the user
     * for data transfer
     */
    @JsonProperty(value = "properties.routingPreference")
    private RoutingPreference routingPreference;

    /**
     * Get the sku property: Required. Gets or sets the SKU name.
     *
     * @return the sku value.
     */
    public Sku getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: Required. Gets or sets the SKU name.
     *
     * @param sku the sku value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: Required. Indicates the type of storage account.
     *
     * @return the kind value.
     */
    public Kind getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: Required. Indicates the type of storage account.
     *
     * @param kind the kind value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the location property: Required. Gets or sets the location of the resource. This will be one of the supported
     * and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource
     * cannot be changed once it is created, but if an identical geo region is specified on update, the request will
     * succeed.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: Required. Gets or sets the location of the resource. This will be one of the supported
     * and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource
     * cannot be changed once it is created, but if an identical geo region is specified on update, the request will
     * succeed.
     *
     * @param location the location value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no
     * greater than 256 characters.
     *
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no
     * greater than 256 characters.
     *
     * @param tags the tags value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the customDomain property: User domain assigned to the storage account. Name is the CNAME source. Only one
     * custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty
     * string for the custom domain name property.
     *
     * @return the customDomain value.
     */
    public CustomDomain getCustomDomain() {
        return this.customDomain;
    }

    /**
     * Set the customDomain property: User domain assigned to the storage account. Name is the CNAME source. Only one
     * custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty
     * string for the custom domain name property.
     *
     * @param customDomain the customDomain value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setCustomDomain(CustomDomain customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * Get the encryption property: Not applicable. Azure Storage encryption is enabled for all storage accounts and
     * cannot be disabled.
     *
     * @return the encryption value.
     */
    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Not applicable. Azure Storage encryption is enabled for all storage accounts and
     * cannot be disabled.
     *
     * @param encryption the encryption value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the networkRuleSet property: Network rule set.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet getNetworkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet property: Network rule set.
     *
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @return the accessTier value.
     */
    public AccessTier getAccessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @param accessTier the accessTier value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setAccessTier(AccessTier accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * Get the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    public AzureFilesIdentityBasedAuthentication getAzureFilesIdentityBasedAuthentication() {
        return this.azureFilesIdentityBasedAuthentication;
    }

    /**
     * Set the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @param azureFilesIdentityBasedAuthentication the azureFilesIdentityBasedAuthentication value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     *
     * @return the enableHttpsTrafficOnly value.
     */
    public Boolean isEnableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    /**
     * Set the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        return this;
    }

    /**
     * Get the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @return the isHnsEnabled value.
     */
    public Boolean isHnsEnabled() {
        return this.isHnsEnabled;
    }

    /**
     * Set the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @param isHnsEnabled the isHnsEnabled value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setIsHnsEnabled(Boolean isHnsEnabled) {
        this.isHnsEnabled = isHnsEnabled;
        return this;
    }

    /**
     * Get the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @return the largeFileSharesState value.
     */
    public LargeFileSharesState getLargeFileSharesState() {
        return this.largeFileSharesState;
    }

    /**
     * Set the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @param largeFileSharesState the largeFileSharesState value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        this.largeFileSharesState = largeFileSharesState;
        return this;
    }

    /**
     * Get the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @return the routingPreference value.
     */
    public RoutingPreference getRoutingPreference() {
        return this.routingPreference;
    }

    /**
     * Set the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @param routingPreference the routingPreference value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters setRoutingPreference(RoutingPreference routingPreference) {
        this.routingPreference = routingPreference;
        return this;
    }
}
