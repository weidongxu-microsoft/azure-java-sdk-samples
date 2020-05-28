package io.weidongxu.azure.samples.storage;

import com.azure.management.vanilla.storage.BlobContainersClient;
import com.azure.management.vanilla.storage.StorageAccountsClient;
import com.azure.management.vanilla.storage.StorageManagementClientBuilder;
import com.azure.management.vanilla.storage.models.AccessTier;
import com.azure.management.vanilla.storage.models.BlobContainer;
import com.azure.management.vanilla.storage.models.ImmutabilityPolicy;
import com.azure.management.vanilla.storage.models.Kind;
import com.azure.management.vanilla.storage.models.LargeFileSharesState;
import com.azure.management.vanilla.storage.models.LeaseContainerRequest;
import com.azure.management.vanilla.storage.models.LeaseContainerRequestAction;
import com.azure.management.vanilla.storage.models.LeaseContainerResponse;
import com.azure.management.vanilla.storage.models.PublicAccess;
import com.azure.management.vanilla.storage.models.Sku;
import com.azure.management.vanilla.storage.models.SkuName;
import com.azure.management.vanilla.storage.models.StorageAccount;
import com.azure.management.vanilla.storage.models.StorageAccountCreateParameters;
import com.azure.management.vanilla.storage.models.StorageAccountUpdateParameters;
import io.weidongxu.azure.samples.ResourceContext;

import java.util.Map;

public class StorageAccountSampleVanilla {

    public static void run(StorageManagementClientBuilder builder, ResourceContext context) {
        final String saName = "sasamplevanilla";

        // create storage account
        StorageAccountsClient storageAccountsClient = builder.buildStorageAccountsClient();
        StorageAccount storageAccount = storageAccountsClient.create(context.resourceGroup(), saName,
                new StorageAccountCreateParameters()
                        .setLocation(context.location())
                        .setKind(Kind.STORAGE_V2)
                        .setSku(new Sku()
                                .setName(SkuName.STANDARD_LRS))
                        .setLargeFileSharesState(LargeFileSharesState.ENABLED)
                        .setEnableHttpsTrafficOnly(true)
                        .setTags(Map.of("product", "javasdk",
                                "cause", "automation")));

        context.logger().info("tags after create: {}", storageAccount.tags());

        // update storage account
        /* vanilla can skip this, on update if id or name is known and no info required from the resource.
        storageAccount = client.storageAccounts().getByResourceGroup(context.resourceGroup(), saName);
         */
        storageAccount = storageAccountsClient.update(context.resourceGroup(), saName,
                new StorageAccountUpdateParameters()
                        .setTags(Map.of("product", "javasdk"))
                        .setAccessTier(AccessTier.COOL));

        context.logger().info("tags after update: {}", storageAccount.tags());

        // create container under storage account
        BlobContainersClient blobContainersClient = builder.buildBlobContainersClient();
        BlobContainer blobContainer = blobContainersClient.create(context.resourceGroup(), saName, "container1",
                new BlobContainer()
                        .setPublicAccess(PublicAccess.BLOB));

        context.logger().info("container public access: {}", blobContainer.getPublicAccess());

        // lease on container
        LeaseContainerResponse leaseResponse = blobContainersClient.lease(context.resourceGroup(), saName, "container1",
                new LeaseContainerRequest()
                        .setAction(LeaseContainerRequestAction.ACQUIRE)
                        .setLeaseDuration(15));

        context.logger().info("container lease duration: {}", leaseResponse.getLeaseTimeSeconds());

        // create immutability policy under container
        ImmutabilityPolicy immutabilityPolicy = blobContainersClient.createOrUpdateImmutabilityPolicy(context.resourceGroup(), saName, "container1",
                null,
                new ImmutabilityPolicy()
                        .setImmutabilityPeriodSinceCreationInDays(7)
                        .setAllowProtectedAppendWrites(false));

        context.logger().info("immutability policy period: {}", immutabilityPolicy.getImmutabilityPeriodSinceCreationInDays());

        // delete storage account
        storageAccountsClient.delete(context.resourceGroup(), saName);
    }
}
