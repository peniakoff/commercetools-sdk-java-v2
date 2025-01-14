
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductVariantsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductVariantsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductVariantsImportContainersRequestBuilder importContainers() {
        return new ByProjectKeyProductVariantsImportContainersRequestBuilder(apiHttpClient, projectKey);
    }

    @Deprecated
    public ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyRequestBuilder importSinkKeyWithImportSinkKeyValue(
            String importSinkKey) {
        return new ByProjectKeyProductVariantsImportSinkKeyByImportSinkKeyRequestBuilder(apiHttpClient, projectKey,
            importSinkKey);
    }
}
