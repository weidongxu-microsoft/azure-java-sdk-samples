package io.weidongxu.azure.samples.storage;

import com.azure.management.vanilla.storage.AccessTier;
import com.azure.management.vanilla.storage.Kind;
import com.azure.management.vanilla.storage.Sku;
import com.azure.management.vanilla.storage.SkuName;
import com.azure.management.vanilla.storage.StorageAccountCreateParameters;
import com.azure.management.vanilla.storage.StorageAccountUpdateParameters;
import com.azure.management.vanilla.storage.models.StorageManagementClientImpl;
import io.weidongxu.azure.samples.ResourceContext;

import java.util.Map;

public class StorageAccountSampleVanilla {

    public static void run(StorageManagementClientImpl client, ResourceContext context) {
        client.storageAccounts().create(context.resourceGroup(), "sasamplevanilla",
                new StorageAccountCreateParameters()
                        .setLocation(context.location())
                        .setKind(Kind.STORAGE_V2)
                        .setSku(new Sku()
                                .setName(SkuName.STANDARD_LRS))
                        .setIsHnsEnabled(true)
                        .setEnableHttpsTrafficOnly(true)
                        .setTags(Map.of("product", "javasdk",
                                "cause", "automation")));

        /* vanilla can skip this, on update if id or name is known and no info required from the resource.
        StorageAccountInner storageAccount = client.storageAccounts().getByResourceGroup(context.resourceGroup(), "sasamplevanilla");
         */
        client.storageAccounts().update(context.resourceGroup(), "sasamplevanilla",
                new StorageAccountUpdateParameters()
                        .setTags(Map.of("product", "javasdk"))
                        .setAccessTier(AccessTier.COOL));
    }
}
