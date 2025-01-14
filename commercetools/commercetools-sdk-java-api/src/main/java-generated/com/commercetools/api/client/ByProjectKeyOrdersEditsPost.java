
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrdersEditsPost
        extends ApiMethod<ByProjectKeyOrdersEditsPost, com.commercetools.api.models.order_edit.OrderEdit>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyOrdersEditsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyOrdersEditsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersEditsPost> {

    private String projectKey;

    private com.commercetools.api.models.order_edit.OrderEditDraft orderEditDraft;

    public ByProjectKeyOrdersEditsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.order_edit.OrderEditDraft orderEditDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderEditDraft = orderEditDraft;
    }

    public ByProjectKeyOrdersEditsPost(ByProjectKeyOrdersEditsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderEditDraft = t.orderEditDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/edits", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(orderEditDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEdit> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.order_edit.OrderEdit.class).toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEdit>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.order_edit.OrderEdit.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyOrdersEditsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyOrdersEditsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyOrdersEditsPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyOrdersEditsPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrdersEditsPost that = (ByProjectKeyOrdersEditsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(orderEditDraft, that.orderEditDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(orderEditDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersEditsPost copy() {
        return new ByProjectKeyOrdersEditsPost(this);
    }
}
