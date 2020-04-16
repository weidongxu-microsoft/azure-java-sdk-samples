package io.weidongxu.azure.samples;

import com.azure.core.util.logging.ClientLogger;

public interface ResourceContext {

    String resourceGroup();

    String location();

    ClientLogger logger();
}
