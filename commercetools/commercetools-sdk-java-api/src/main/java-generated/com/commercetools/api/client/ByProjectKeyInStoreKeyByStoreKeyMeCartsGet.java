package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Query carts</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyMeCartsGet extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeCartsGet> {

    
    private String projectKey;
    private String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(final ApiHttpClient apiHttpClient, String projectKey, String storeKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(ByProjectKeyInStoreKeyByStoreKeyMeCartsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/carts", this.projectKey, this.storeKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.cart.CartPagedQueryResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.cart.CartPagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.CartPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.cart.CartPagedQueryResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }
    
    public List<String> getSort() {
        return this.getQueryParam("sort");
    }
    
    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }
    
    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet withExpand(final String expand){
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet withSort(final String sort){
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet withLimit(final Integer limit){
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet withOffset(final Integer offset){
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet withWhere(final String where){
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(this).addQueryParam("where", where);
    }
}