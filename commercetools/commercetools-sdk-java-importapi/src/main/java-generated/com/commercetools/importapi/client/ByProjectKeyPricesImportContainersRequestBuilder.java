
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyPricesImportContainersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyPricesImportContainersRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyPricesImportContainersByImportContainerKeyRequestBuilder withImportContainerKeyValue(
            String importContainerKey) {
        return new ByProjectKeyPricesImportContainersByImportContainerKeyRequestBuilder(apiHttpClient, projectKey,
            importContainerKey);
    }
}