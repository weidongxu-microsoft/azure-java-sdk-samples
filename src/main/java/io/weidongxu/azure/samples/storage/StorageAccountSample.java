package io.weidongxu.azure.samples.storage;

import com.azure.management.vanilla.storage.StorageManagementClientBuilder;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.StorageManager;
import com.microsoft.rest.LogLevel;
import io.weidongxu.azure.samples.SampleBase;

public class StorageAccountSample extends SampleBase {

    public StorageAccountSample() {
        super("rg-sample-storage");
    }

    public void runFluentLite() {
        StorageManager client = StorageManager
                .configure().withLogLevel(LogLevel.BASIC)
                .authenticate(azureTokenCredentials(), subscriptionId);

        StorageAccountSampleFluentLite.run(client, this);
    }

    public void runVanilla() {
        StorageManagementClientBuilder builder = new StorageManagementClientBuilder()
                .pipeline(httpPipeline())
                .subscriptionId(subscriptionId);

        StorageAccountSampleVanilla.run(builder, this);
    }

    public static void main(String[] args) {
        StorageAccountSample sample = new StorageAccountSample();
        try {
            sample.createResourceGroup();

            sample.runFluentLite();
            sample.runVanilla();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            sample.deleteResourceGroup();
        }
    }
}
