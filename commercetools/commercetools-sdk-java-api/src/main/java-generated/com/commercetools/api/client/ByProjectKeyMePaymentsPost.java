
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
public class ByProjectKeyMePaymentsPost
        extends ApiMethod<ByProjectKeyMePaymentsPost, com.commercetools.api.models.me.MyPayment>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyMePaymentsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyMePaymentsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePaymentsPost> {

    private String projectKey;

    private com.commercetools.api.models.me.MyPaymentDraft myPaymentDraft;

    public ByProjectKeyMePaymentsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.me.MyPaymentDraft myPaymentDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myPaymentDraft = myPaymentDraft;
    }

    public ByProjectKeyMePaymentsPost(ByProjectKeyMePaymentsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myPaymentDraft = t.myPaymentDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/payments", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(myPaymentDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.me.MyPayment> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.me.MyPayment.class).toCompletableFuture(), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyPayment>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.me.MyPayment.class)
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
    public ByProjectKeyMePaymentsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMePaymentsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyMePaymentsPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyMePaymentsPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMePaymentsPost that = (ByProjectKeyMePaymentsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myPaymentDraft, that.myPaymentDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myPaymentDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMePaymentsPost copy() {
        return new ByProjectKeyMePaymentsPost(this);
    }
}
