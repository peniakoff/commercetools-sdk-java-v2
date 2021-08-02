
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyTypesByIDGet
        extends ApiMethod<ByProjectKeyTypesByIDGet, com.commercetools.api.models.type.Type>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyTypesByIDGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyTypesByIDGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyTypesByIDGet> {

    private String projectKey;
    private String ID;

    public ByProjectKeyTypesByIDGet(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyTypesByIDGet(ByProjectKeyTypesByIDGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/types/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.type.Type> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.type.Type.class), request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.type.Type>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.type.Type.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    public ByProjectKeyTypesByIDGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyTypesByIDGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyTypesByIDGet copy() {
        return new ByProjectKeyTypesByIDGet(this);
    }
}
