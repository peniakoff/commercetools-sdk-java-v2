
package com.commercetools.importapi.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import com.commercetools.importapi.models.common.ProcessingState;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Retrieves all import operations of an import sink key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet extends
        ApiMethod<ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet, com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>
        implements
        com.commercetools.importapi.client.Secured_by_view_productsTrait<ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet> {

    private String projectKey;
    private String importSinkKey;

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet(final ApiHttpClient apiHttpClient,
            String projectKey, String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet(
            ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-drafts/importSinkKey=%s/import-operations", this.projectKey,
            this.importSinkKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client
                .execute(request,
                    com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse.class)
                .toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>> execute(
            final ApiHttpClient client) {
        return client
                .execute(this.createHttpRequest(),
                    com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public List<String> getResourceKey() {
        return this.getQueryParam("resourceKey");
    }

    public List<String> getState() {
        return this.getQueryParam("state");
    }

    public List<String> getDebug() {
        return this.getQueryParam("debug");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(final double limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(final double limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specificied values
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(
            final List<Double> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(final List<Double> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(final double offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(final double offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specificied values
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(
            final List<Double> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(
            final List<Double> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specificied values
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withSort(final List<String> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addSort(final List<String> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set resourceKey with the specificied value
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final String resourceKey) {
        return copy().withQueryParam("resourceKey", resourceKey);
    }

    /**
     * add additional resourceKey query parameter
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final String resourceKey) {
        return copy().addQueryParam("resourceKey", resourceKey);
    }

    /**
     * set resourceKey with the specificied values
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final List<String> resourceKey) {
        return copy().withoutQueryParam("resourceKey")
                .addQueryParams(resourceKey.stream()
                        .map(s -> new ParamEntry<>("resourceKey", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceKey query parameters
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final List<String> resourceKey) {
        return copy().addQueryParams(
            resourceKey.stream().map(s -> new ParamEntry<>("resourceKey", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set state with the specificied value
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final ProcessingState state) {
        return copy().withQueryParam("state", state);
    }

    /**
     * add additional state query parameter
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final ProcessingState state) {
        return copy().addQueryParam("state", state);
    }

    /**
     * set state with the specificied values
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final List<ProcessingState> state) {
        return copy().withoutQueryParam("state")
                .addQueryParams(
                    state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional state query parameters
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final List<ProcessingState> state) {
        return copy().addQueryParams(
            state.stream().map(s -> new ParamEntry<>("state", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set debug with the specificied value
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(final boolean debug) {
        return copy().withQueryParam("debug", debug);
    }

    /**
     * add additional debug query parameter
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(final boolean debug) {
        return copy().addQueryParam("debug", debug);
    }

    /**
     * set debug with the specificied values
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withDebug(
            final List<Boolean> debug) {
        return copy().withoutQueryParam("debug")
                .addQueryParams(
                    debug.stream().map(s -> new ParamEntry<>("debug", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional debug query parameters
     */
    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addDebug(
            final List<Boolean> debug) {
        return copy().addQueryParams(
            debug.stream().map(s -> new ParamEntry<>("debug", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet that = (ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importSinkKey).toHashCode();
    }

    @Override
    protected ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet copy() {
        return new ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet(this);
    }
}
