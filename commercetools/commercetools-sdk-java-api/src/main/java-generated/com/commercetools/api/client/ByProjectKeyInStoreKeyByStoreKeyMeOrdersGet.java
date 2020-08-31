package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.nio.file.Files;

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


/**
*  <p>Query orders</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet> {

    
    private String projectKey;
    private String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(final ApiHttpClient apiHttpClient, String projectKey, String storeKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/orders", this.projectKey, this.storeKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.order.OrderPagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.OrderPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.order.OrderPagedQueryResponse.class);
                });
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

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withExpand(final String expand){
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withSort(final String sort){
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withLimit(final Integer limit){
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withOffset(final Integer offset){
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet withWhere(final String where){
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(this).addQueryParam("where", where);
    }
}