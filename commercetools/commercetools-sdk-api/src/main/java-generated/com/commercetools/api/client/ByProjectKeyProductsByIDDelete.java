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
*  <p>Delete Product by ID</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductsByIDDelete extends ApiMethod<ByProjectKeyProductsByIDDelete> {

    
    private String projectKey;
    private String ID;
    

    public ByProjectKeyProductsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID){
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/%s", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.DELETE);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.product.Product> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.Product>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.product.Product.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getPriceCurrency() {
        return this.getQueryParam("priceCurrency");
    }
    
    public List<String> getPriceCountry() {
        return this.getQueryParam("priceCountry");
    }
    
    public List<String> getPriceCustomerGroup() {
        return this.getQueryParam("priceCustomerGroup");
    }
    
    public List<String> getPriceChannel() {
        return this.getQueryParam("priceChannel");
    }
    
    public List<String> getLocaleProjection() {
        return this.getQueryParam("localeProjection");
    }
    
    public List<String> getStoreProjection() {
        return this.getQueryParam("storeProjection");
    }
    
    public List<Long> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
    
    public void setID(final String ID) {this.ID = ID;}

    public ByProjectKeyProductsByIDDelete withPriceCurrency(final String priceCurrency){
        return this.addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductsByIDDelete withPriceCountry(final String priceCountry){
        return this.addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductsByIDDelete withPriceCustomerGroup(final String priceCustomerGroup){
        return this.addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductsByIDDelete withPriceChannel(final String priceChannel){
        return this.addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductsByIDDelete withLocaleProjection(final String localeProjection){
        return this.addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductsByIDDelete withStoreProjection(final String storeProjection){
        return this.addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductsByIDDelete withVersion(final Long version){
        return this.addQueryParam("version", version);
    }
    
    public ByProjectKeyProductsByIDDelete withExpand(final String expand){
        return this.addQueryParam("expand", expand);
    }
}
