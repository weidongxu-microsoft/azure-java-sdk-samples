// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.vanilla.storage.AccessTier;
import com.azure.management.vanilla.storage.AccountStatus;
import com.azure.management.vanilla.storage.AzureFilesIdentityBasedAuthentication;
import com.azure.management.vanilla.storage.CustomDomain;
import com.azure.management.vanilla.storage.Encryption;
import com.azure.management.vanilla.storage.Endpoints;
import com.azure.management.vanilla.storage.GeoReplicationStats;
import com.azure.management.vanilla.storage.Identity;
import com.azure.management.vanilla.storage.Kind;
import com.azure.management.vanilla.storage.LargeFileSharesState;
import com.azure.management.vanilla.storage.NetworkRuleSet;
import com.azure.management.vanilla.storage.ProvisioningState;
import com.azure.management.vanilla.storage.RoutingPreference;
import com.azure.management.vanilla.storage.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The StorageAccount model. */
@JsonFlatten
@Fluent
public class StorageAccountInner extends Resource {
    private final ClientLogger logger = new ClientLogger(StorageAccountInner.class);

    /*
     * Gets the SKU.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /*
     * Gets the Kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private Kind kind;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Gets the status of the storage account at the time the operation was
     * called.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Gets the URLs that are used to perform a retrieval of a public blob,
     * queue, or table object. Note that Standard_ZRS and Premium_LRS accounts
     * only return the blob endpoint.
     */
    @JsonProperty(value = "properties.primaryEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Endpoints primaryEndpoints;

    /*
     * Gets the location of the primary data center for the storage account.
     */
    @JsonProperty(value = "properties.primaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryLocation;

    /*
     * Gets the status indicating whether the primary location of the storage
     * account is available or unavailable.
     */
    @JsonProperty(value = "properties.statusOfPrimary", access = JsonProperty.Access.WRITE_ONLY)
    private AccountStatus statusOfPrimary;

    /*
     * Gets the timestamp of the most recent instance of a failover to the
     * secondary location. Only the most recent timestamp is retained. This
     * element is not returned if there has never been a failover instance.
     * Only available if the accountType is Standard_GRS or Standard_RAGRS.
     */
    @JsonProperty(value = "properties.lastGeoFailoverTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastGeoFailoverTime;

    /*
     * Gets the location of the geo-replicated secondary for the storage
     * account. Only available if the accountType is Standard_GRS or
     * Standard_RAGRS.
     */
    @JsonProperty(value = "properties.secondaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryLocation;

    /*
     * Gets the status indicating whether the secondary location of the storage
     * account is available or unavailable. Only available if the SKU name is
     * Standard_GRS or Standard_RAGRS.
     */
    @JsonProperty(value = "properties.statusOfSecondary", access = JsonProperty.Access.WRITE_ONLY)
    private AccountStatus statusOfSecondary;

    /*
     * Gets the creation date and time of the storage account in UTC.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Gets the custom domain the user assigned to this storage account.
     */
    @JsonProperty(value = "properties.customDomain", access = JsonProperty.Access.WRITE_ONLY)
    private CustomDomain customDomain;

    /*
     * Gets the URLs that are used to perform a retrieval of a public blob,
     * queue, or table object from the secondary location of the storage
     * account. Only available if the SKU name is Standard_RAGRS.
     */
    @JsonProperty(value = "properties.secondaryEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Endpoints secondaryEndpoints;

    /*
     * Gets the encryption settings on the account. If unspecified, the account
     * is unencrypted.
     */
    @JsonProperty(value = "properties.encryption", access = JsonProperty.Access.WRITE_ONLY)
    private Encryption encryption;

    /*
     * Required for storage accounts where kind = BlobStorage. The access tier
     * used for billing.
     */
    @JsonProperty(value = "properties.accessTier", access = JsonProperty.Access.WRITE_ONLY)
    private AccessTier accessTier;

    /*
     * Provides the identity based authentication settings for Azure Files.
     */
    @JsonProperty(value = "properties.azureFilesIdentityBasedAuthentication")
    private AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication;

    /*
     * Allows https traffic only to storage service if sets to true.
     */
    @JsonProperty(value = "properties.supportsHttpsTrafficOnly")
    private Boolean enableHttpsTrafficOnly;

    /*
     * Network rule set
     */
    @JsonProperty(value = "properties.networkAcls", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkRuleSet networkRuleSet;

    /*
     * Account HierarchicalNamespace enabled if sets to true.
     */
    @JsonProperty(value = "properties.isHnsEnabled")
    private Boolean isHnsEnabled;

    /*
     * Geo Replication Stats
     */
    @JsonProperty(value = "properties.geoReplicationStats", access = JsonProperty.Access.WRITE_ONLY)
    private GeoReplicationStats geoReplicationStats;

    /*
     * If the failover is in progress, the value will be true, otherwise, it
     * will be null.
     */
    @JsonProperty(value = "properties.failoverInProgress", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean failoverInProgress;

    /*
     * Allow large file shares if sets to Enabled. It cannot be disabled once
     * it is enabled.
     */
    @JsonProperty(value = "properties.largeFileSharesState")
    private LargeFileSharesState largeFileSharesState;

    /*
     * List of private endpoint connection associated with the specified
     * storage account
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Maintains information about the network routing choice opted by the user
     * for data transfer
     */
    @JsonProperty(value = "properties.routingPreference")
    private RoutingPreference routingPreference;

    /*
     * Blob restore status
     */
    @JsonProperty(value = "properties.blobRestoreStatus", access = JsonProperty.Access.WRITE_ONLY)
    private BlobRestoreStatusInner blobRestoreStatus;

    /**
     * Get the sku property: Gets the SKU.
     *
     * @return the sku value.
     */
    public Sku getSku() {
        return this.sku;
    }

    /**
     * Get the kind property: Gets the Kind.
     *
     * @return the kind value.
     */
    public Kind getKind() {
        return this.kind;
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
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState property: Gets the status of the storage account at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the primaryEndpoints property: Gets the URLs that are used to perform a retrieval of a public blob, queue, or
     * table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     *
     * @return the primaryEndpoints value.
     */
    public Endpoints getPrimaryEndpoints() {
        return this.primaryEndpoints;
    }

    /**
     * Get the primaryLocation property: Gets the location of the primary data center for the storage account.
     *
     * @return the primaryLocation value.
     */
    public String getPrimaryLocation() {
        return this.primaryLocation;
    }

    /**
     * Get the statusOfPrimary property: Gets the status indicating whether the primary location of the storage account
     * is available or unavailable.
     *
     * @return the statusOfPrimary value.
     */
    public AccountStatus getStatusOfPrimary() {
        return this.statusOfPrimary;
    }

    /**
     * Get the lastGeoFailoverTime property: Gets the timestamp of the most recent instance of a failover to the
     * secondary location. Only the most recent timestamp is retained. This element is not returned if there has never
     * been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     *
     * @return the lastGeoFailoverTime value.
     */
    public OffsetDateTime getLastGeoFailoverTime() {
        return this.lastGeoFailoverTime;
    }

    /**
     * Get the secondaryLocation property: Gets the location of the geo-replicated secondary for the storage account.
     * Only available if the accountType is Standard_GRS or Standard_RAGRS.
     *
     * @return the secondaryLocation value.
     */
    public String getSecondaryLocation() {
        return this.secondaryLocation;
    }

    /**
     * Get the statusOfSecondary property: Gets the status indicating whether the secondary location of the storage
     * account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS.
     *
     * @return the statusOfSecondary value.
     */
    public AccountStatus getStatusOfSecondary() {
        return this.statusOfSecondary;
    }

    /**
     * Get the creationTime property: Gets the creation date and time of the storage account in UTC.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Get the customDomain property: Gets the custom domain the user assigned to this storage account.
     *
     * @return the customDomain value.
     */
    public CustomDomain getCustomDomain() {
        return this.customDomain;
    }

    /**
     * Get the secondaryEndpoints property: Gets the URLs that are used to perform a retrieval of a public blob, queue,
     * or table object from the secondary location of the storage account. Only available if the SKU name is
     * Standard_RAGRS.
     *
     * @return the secondaryEndpoints value.
     */
    public Endpoints getSecondaryEndpoints() {
        return this.secondaryEndpoints;
    }

    /**
     * Get the encryption property: Gets the encryption settings on the account. If unspecified, the account is
     * unencrypted.
     *
     * @return the encryption value.
     */
    public Encryption getEncryption() {
        return this.encryption;
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
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner setAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @return the enableHttpsTrafficOnly value.
     */
    public Boolean isEnableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    /**
     * Set the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set.
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner setEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
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
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner setIsHnsEnabled(Boolean isHnsEnabled) {
        this.isHnsEnabled = isHnsEnabled;
        return this;
    }

    /**
     * Get the geoReplicationStats property: Geo Replication Stats.
     *
     * @return the geoReplicationStats value.
     */
    public GeoReplicationStats getGeoReplicationStats() {
        return this.geoReplicationStats;
    }

    /**
     * Get the failoverInProgress property: If the failover is in progress, the value will be true, otherwise, it will
     * be null.
     *
     * @return the failoverInProgress value.
     */
    public Boolean isFailoverInProgress() {
        return this.failoverInProgress;
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
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner setLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        this.largeFileSharesState = largeFileSharesState;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connection associated with the specified
     * storage account.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
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
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner setRoutingPreference(RoutingPreference routingPreference) {
        this.routingPreference = routingPreference;
        return this;
    }

    /**
     * Get the blobRestoreStatus property: Blob restore status.
     *
     * @return the blobRestoreStatus value.
     */
    public BlobRestoreStatusInner getBlobRestoreStatus() {
        return this.blobRestoreStatus;
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
        if (getIdentity() != null) {
            getIdentity().validate();
        }
        if (getPrimaryEndpoints() != null) {
            getPrimaryEndpoints().validate();
        }
        if (getCustomDomain() != null) {
            getCustomDomain().validate();
        }
        if (getSecondaryEndpoints() != null) {
            getSecondaryEndpoints().validate();
        }
        if (getEncryption() != null) {
            getEncryption().validate();
        }
        if (getAzureFilesIdentityBasedAuthentication() != null) {
            getAzureFilesIdentityBasedAuthentication().validate();
        }
        if (getNetworkRuleSet() != null) {
            getNetworkRuleSet().validate();
        }
        if (getGeoReplicationStats() != null) {
            getGeoReplicationStats().validate();
        }
        if (getPrivateEndpointConnections() != null) {
            getPrivateEndpointConnections().forEach(e -> e.validate());
        }
        if (getRoutingPreference() != null) {
            getRoutingPreference().validate();
        }
        if (getBlobRestoreStatus() != null) {
            getBlobRestoreStatus().validate();
        }
    }
}
