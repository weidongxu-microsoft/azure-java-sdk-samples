package io.weidongxu.azure.samples.storage;

import com.azure.management.vanilla.storage.models.StorageManagementClientBuilder;
import com.azure.management.vanilla.storage.models.StorageManagementClientImpl;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.StorageManager;
import com.microsoft.rest.LogLevel;
import io.weidongxu.azure.samples.SampleBase;

public class StorageAccountSample extends SampleBase {

    public StorageAccountSample() {
        super("rg-sample-storage");
    }

    public void runFluentLite() {
        try {
            StorageManager client = StorageManager
                    .configure().withLogLevel(LogLevel.BASIC)
                    .authenticate(azureTokenCredentials(), subscriptionId);

            StorageAccountSampleFluentLite.run(client, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void runVanilla() {
        StorageManagementClientImpl client = new StorageManagementClientBuilder()
                .pipeline(httpPipeline())
                .subscriptionId(subscriptionId)
                .buildClient();

        StorageAccountSampleVanilla.run(client, this);
    }

    public static void main(String[] args) {
        StorageAccountSample sample = new StorageAccountSample();
        try {
            sample.createResourceGroup();

            sample.runFluentLite();
            //sample.runVanilla();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sample.deleteResourceGroup();
        }
    }
}
