package io.weidongxu.azure.samples.storage;

import com.microsoft.azure.management.storage.v2019_06_01.AccessTier;
import com.microsoft.azure.management.storage.v2019_06_01.BlobContainer;
import com.microsoft.azure.management.storage.v2019_06_01.ImmutabilityPolicy;
import com.microsoft.azure.management.storage.v2019_06_01.Kind;
import com.microsoft.azure.management.storage.v2019_06_01.LargeFileSharesState;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseContainerResponse;
import com.microsoft.azure.management.storage.v2019_06_01.PublicAccess;
import com.microsoft.azure.management.storage.v2019_06_01.SkuName;
import com.microsoft.azure.management.storage.v2019_06_01.StorageAccount;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.SkuInner;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.StorageManager;
import io.weidongxu.azure.samples.ResourceContext;

public class StorageAccountSampleFluentLite {

    public static void run(StorageManager client, ResourceContext context) {
        final String saName = "sasamplefluentlite";

        // create storage account
        StorageAccount storageAccount = client.storageAccounts().define(saName)
                .withRegion(context.location())
                .withExistingResourceGroup(context.resourceGroup())
                .withKind(Kind.STORAGE_V2)
                .withSku(new SkuInner()
                        .withName(SkuName.STANDARD_LRS))
                .withLargeFileSharesState(LargeFileSharesState.ENABLED)
                .withEnableHttpsTrafficOnly(true)
                .withTag("product", "javasdk")
                .withTag("cause", "automation")
                .create();

        context.logger().info("tags after create: {}", storageAccount.tags());

        // update storage account
        storageAccount = client.storageAccounts().getByResourceGroup(context.resourceGroup(), saName);
        storageAccount = storageAccount.update()
                .withoutTag("cause")    // bug, no effect
                .withAccessTier(AccessTier.COOL)
                .apply();

        context.logger().info("tags after update: {}", storageAccount.tags());

        // create container under storage account
        BlobContainer blobContainer = client.blobContainers().defineContainer("container1")
                .withExistingBlobService(context.resourceGroup(), saName)
                .withPublicAccess(PublicAccess.BLOB)
                .create();

        context.logger().info("container public access: {}", blobContainer.publicAccess());

        // bug, lease method with parameterLeaseContainerRequest is not exposed
        // and OkHttp throws "IllegalArgumentException: Body parameter value must not be null. (parameter #6)"
        /*
        // lease on container
        LeaseContainerResponse leaseResponse = client.blobContainers().leaseAsync(context.resourceGroup(), saName, "container1").toBlocking().last();

        context.logger().info("container lease duration: {}", leaseResponse.leaseTimeSeconds());
         */

        // create immutability policy under container
        ImmutabilityPolicy immutabilityPolicy = client.blobContainers().defineImmutabilityPolicy("policy1")
                .withExistingContainer(context.resourceGroup(), saName, "container1")
                .withIfMatch(null)
                .withImmutabilityPeriodSinceCreationInDays(7)
                .withAllowProtectedAppendWrites(false)
                .create();

        context.logger().info("immutability policy period: {}", immutabilityPolicy.immutabilityPeriodSinceCreationInDays());

        // delete storage account
        client.storageAccounts().deleteByResourceGroup(context.resourceGroup(), saName);
    }
}
