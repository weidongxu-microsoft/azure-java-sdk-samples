package io.weidongxu.azure.samples.storage;

import com.microsoft.azure.management.storage.v2019_06_01.AccessTier;
import com.microsoft.azure.management.storage.v2019_06_01.Kind;
import com.microsoft.azure.management.storage.v2019_06_01.SkuName;
import com.microsoft.azure.management.storage.v2019_06_01.StorageAccount;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.SkuInner;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.StorageManager;
import io.weidongxu.azure.samples.ResourceContext;

public class StorageAccountSampleFluentLite {

    public static void run(StorageManager client, ResourceContext context) {
        client.storageAccounts().define("sasamplefluentlite")
                .withRegion(context.location())
                .withExistingResourceGroup(context.resourceGroup())
                .withKind(Kind.STORAGE_V2)
                .withSku(new SkuInner()
                        .withName(SkuName.STANDARD_LRS))
                .withIsHnsEnabled(true)
                .withEnableHttpsTrafficOnly(true)
                .withTag("product", "javasdk")
                .withTag("cause", "automation")
                .create();

        StorageAccount storageAccount = client.storageAccounts().getByResourceGroup(context.resourceGroup(), "sasamplefluentlite");
        storageAccount.update()
                .withoutTag("cause")    // bug, no effect
                .withAccessTier(AccessTier.COOL)
                .apply();
    }
}
