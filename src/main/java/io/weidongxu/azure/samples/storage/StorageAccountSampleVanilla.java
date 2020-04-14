package io.weidongxu.azure.samples.storage;

import com.azure.management.vanilla.storage.Kind;
import com.azure.management.vanilla.storage.Sku;
import com.azure.management.vanilla.storage.SkuName;
import com.azure.management.vanilla.storage.StorageAccountCreateParameters;
import com.azure.management.vanilla.storage.models.StorageManagementClientImpl;
import io.weidongxu.azure.samples.ResourceContext;

public class StorageAccountSampleVanilla {

    public static void run(StorageManagementClientImpl client, ResourceContext context) {
        client.storageAccounts().create(context.resourceGroup(), "saSampleVanilla",
                new StorageAccountCreateParameters()
                        .setLocation(context.location())
                        .setKind(Kind.STORAGE_V2)
                        .setSku(new Sku()
                                .setName(SkuName.STANDARD_LRS))
                        .setIsHnsEnabled(true)
                        .setEnableHttpsTrafficOnly(true));
    }
}
