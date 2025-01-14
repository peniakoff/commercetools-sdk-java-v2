
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCustomersRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomersImportContainersRequestBuilder importContainers() {
        return new ByProjectKeyCustomersImportContainersRequestBuilder(apiHttpClient, projectKey);
    }

    @Deprecated
    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyRequestBuilder importSinkKeyWithImportSinkKeyValue(
            String importSinkKey) {
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyRequestBuilder(apiHttpClient, projectKey,
            importSinkKey);
    }
}
