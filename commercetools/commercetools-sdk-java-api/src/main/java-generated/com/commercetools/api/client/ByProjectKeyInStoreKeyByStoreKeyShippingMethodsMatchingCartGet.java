
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
public class ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet extends
        ApiMethod<ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>
        implements
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet> {

    private String projectKey;
    private String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet(
            ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/shipping-methods/matching-cart", this.projectKey,
            this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class)
                    .toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client
                .execute(this.createHttpRequest(),
                    com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public List<String> getCartId() {
        return this.getQueryParam("cartId");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    /**
     * set cartId with the specificied value
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet withCartId(final String cartId) {
        return copy().withQueryParam("cartId", cartId);
    }

    /**
     * add additional cartId query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet addCartId(final String cartId) {
        return copy().addQueryParam("cartId", cartId);
    }

    /**
     * set cartId with the specificied values
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet withCartId(final List<String> cartId) {
        return copy().withoutQueryParam("cartId")
                .addQueryParams(
                    cartId.stream().map(s -> new ParamEntry<>("cartId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional cartId query parameters
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet addCartId(final List<String> cartId) {
        return copy().addQueryParams(
            cartId.stream().map(s -> new ParamEntry<>("cartId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet that = (ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(storeKey, that.storeKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyShippingMethodsMatchingCartGet(this);
    }
}
