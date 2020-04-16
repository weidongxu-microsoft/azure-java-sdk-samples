package io.weidongxu.azure.samples.storage;

import com.azure.management.vanilla.storage.AccessTier;
import com.azure.management.vanilla.storage.Kind;
import com.azure.management.vanilla.storage.LargeFileSharesState;
import com.azure.management.vanilla.storage.LeaseContainerRequest;
import com.azure.management.vanilla.storage.PublicAccess;
import com.azure.management.vanilla.storage.Sku;
import com.azure.management.vanilla.storage.SkuName;
import com.azure.management.vanilla.storage.StorageAccountCreateParameters;
import com.azure.management.vanilla.storage.StorageAccountUpdateParameters;
import com.azure.management.vanilla.storage.models.BlobContainerInner;
import com.azure.management.vanilla.storage.models.ImmutabilityPolicyInner;
import com.azure.management.vanilla.storage.models.LeaseContainerResponseInner;
import com.azure.management.vanilla.storage.models.StorageAccountInner;
import com.azure.management.vanilla.storage.models.StorageManagementClientImpl;
import io.weidongxu.azure.samples.ResourceContext;

import java.util.Map;

public class StorageAccountSampleVanilla {

    public static void run(StorageManagementClientImpl client, ResourceContext context) {
        final String saName = "sasamplevanilla";

        // create storage account
        StorageAccountInner storageAccount = client.storageAccounts().create(context.resourceGroup(), saName,
                new StorageAccountCreateParameters()
                        .setLocation(context.location())
                        .setKind(Kind.STORAGE_V2)
                        .setSku(new Sku()
                                .setName(SkuName.STANDARD_LRS))
                        .setLargeFileSharesState(LargeFileSharesState.ENABLED)
                        .setEnableHttpsTrafficOnly(true)
                        .setTags(Map.of("product", "javasdk",
                                "cause", "automation")));

        context.logger().info("tags after create: {}", storageAccount.getTags());

        // update storage account
        /* vanilla can skip this, on update if id or name is known and no info required from the resource.
        storageAccount = client.storageAccounts().getByResourceGroup(context.resourceGroup(), saName);
         */
        storageAccount = client.storageAccounts().update(context.resourceGroup(), saName,
                new StorageAccountUpdateParameters()
                        .setTags(Map.of("product", "javasdk"))
                        .setAccessTier(AccessTier.COOL));

        context.logger().info("tags after update: {}", storageAccount.getTags());

        // create container under storage account
        BlobContainerInner blobContainer = client.blobContainers().create(context.resourceGroup(), saName, "container1",
                new BlobContainerInner()
                        .setPublicAccess(PublicAccess.BLOB));

        context.logger().info("container public access: {}", blobContainer.getPublicAccess());

        // lease on container
        LeaseContainerResponseInner leaseResponse = client.blobContainers().lease(context.resourceGroup(), saName, "container1",
                new LeaseContainerRequest().setLeaseDuration(15));

        context.logger().info("container lease duration: {}", leaseResponse.getLeaseTimeSeconds());

        // create immutability policy under container
        ImmutabilityPolicyInner immutabilityPolicy = client.blobContainers().createOrUpdateImmutabilityPolicy(context.resourceGroup(), saName, "container1",
                null,
                new ImmutabilityPolicyInner()
                        .setImmutabilityPeriodSinceCreationInDays(7)
                        .setAllowProtectedAppendWrites(false));

        context.logger().info("immutability policy period: {}", immutabilityPolicy.getImmutabilityPeriodSinceCreationInDays());

        // delete storage account
        client.storageAccounts().delete(context.resourceGroup(), saName);
    }
}
