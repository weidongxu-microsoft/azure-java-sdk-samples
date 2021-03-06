// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The GalleryArtifactPublishingProfileBase model. */
@Fluent
public class GalleryArtifactPublishingProfileBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryArtifactPublishingProfileBase.class);

    /*
     * The target regions where the Image Version is going to be replicated to.
     * This property is updatable.
     */
    @JsonProperty(value = "targetRegions")
    private List<TargetRegion> targetRegions;

    /*
     * The number of replicas of the Image Version to be created per region.
     * This property would take effect for a region when regionalReplicaCount
     * is not specified. This property is updatable.
     */
    @JsonProperty(value = "replicaCount")
    private Integer replicaCount;

    /*
     * If set to true, Virtual Machines deployed from the latest version of the
     * Image Definition won't use this Image Version.
     */
    @JsonProperty(value = "excludeFromLatest")
    private Boolean excludeFromLatest;

    /*
     * The timestamp for when the gallery Image Version is published.
     */
    @JsonProperty(value = "publishedDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime publishedDate;

    /*
     * The end of life date of the gallery Image Version. This property can be
     * used for decommissioning purposes. This property is updatable.
     */
    @JsonProperty(value = "endOfLifeDate")
    private OffsetDateTime endOfLifeDate;

    /*
     * Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountType storageAccountType;

    /**
     * Get the targetRegions property: The target regions where the Image Version is going to be replicated to. This
     * property is updatable.
     *
     * @return the targetRegions value.
     */
    public List<TargetRegion> getTargetRegions() {
        return this.targetRegions;
    }

    /**
     * Set the targetRegions property: The target regions where the Image Version is going to be replicated to. This
     * property is updatable.
     *
     * @param targetRegions the targetRegions value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase setTargetRegions(List<TargetRegion> targetRegions) {
        this.targetRegions = targetRegions;
        return this;
    }

    /**
     * Get the replicaCount property: The number of replicas of the Image Version to be created per region. This
     * property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     *
     * @return the replicaCount value.
     */
    public Integer getReplicaCount() {
        return this.replicaCount;
    }

    /**
     * Set the replicaCount property: The number of replicas of the Image Version to be created per region. This
     * property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     *
     * @param replicaCount the replicaCount value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * Get the excludeFromLatest property: If set to true, Virtual Machines deployed from the latest version of the
     * Image Definition won't use this Image Version.
     *
     * @return the excludeFromLatest value.
     */
    public Boolean isExcludeFromLatest() {
        return this.excludeFromLatest;
    }

    /**
     * Set the excludeFromLatest property: If set to true, Virtual Machines deployed from the latest version of the
     * Image Definition won't use this Image Version.
     *
     * @param excludeFromLatest the excludeFromLatest value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase setExcludeFromLatest(Boolean excludeFromLatest) {
        this.excludeFromLatest = excludeFromLatest;
        return this;
    }

    /**
     * Get the publishedDate property: The timestamp for when the gallery Image Version is published.
     *
     * @return the publishedDate value.
     */
    public OffsetDateTime getPublishedDate() {
        return this.publishedDate;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery Image Version. This property can be used for
     * decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime getEndOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery Image Version. This property can be used for
     * decommissioning purposes. This property is updatable.
     *
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase setEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get the storageAccountType property: Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     *
     * @return the storageAccountType value.
     */
    public StorageAccountType getStorageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     *
     * @param storageAccountType the storageAccountType value to set.
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase setStorageAccountType(StorageAccountType storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getTargetRegions() != null) {
            getTargetRegions().forEach(e -> e.validate());
        }
    }
}
