
package com.commercetools.api.client;

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
*  <p>Delete Cart by ID</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete
        extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete, com.commercetools.api.models.cart.Cart>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete> {

    private String projectKey;
    private String storeKey;
    private String ID;

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete(ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/carts/%s", this.projectKey, this.storeKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
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

    public void setID(final String ID) {
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete withDataErasure(final Boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete addDataErasure(final Boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete withVersion(final Long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete addVersion(final Long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete(this);
    }
}
