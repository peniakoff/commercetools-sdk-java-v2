
package com.commercetools.importapi.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.utils.Utils;

/**
*  <p>Retrieves the import operation with the given id.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdGet extends
        ApiMethod<ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdGet, com.commercetools.importapi.models.importoperations.ImportOperation>
        implements
        com.commercetools.importapi.client.Secured_by_view_productsTrait<ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdGet> {

    private String projectKey;
    private String importSinkKey;
    private String id;

    public ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdGet(final ApiHttpClient apiHttpClient,
            String projectKey, String importSinkKey, String id) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.id = id;
    }

    public ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdGet(
            ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.id = t.id;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/importSinkKey=%s/import-operations/%s", this.projectKey,
            this.importSinkKey, this.id);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.importapi.models.importoperations.ImportOperation.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public String getId() {
        return this.id;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    protected ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdGet copy() {
        return new ByProjectKeyProductsImportSinkKeyByImportSinkKeyImportOperationsByIdGet(this);
    }
}
