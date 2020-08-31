package com.commercetools.importapi.client;

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
import com.commercetools.importapi.models.common.ProcessingState;

/**
*  <p>Retrieves all category import operations of an import sink key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet extends ApiMethod<ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet> {

    
    private String projectKey;
    private String importSinkKey;
    

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet(ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/categories/importSinkKey=%s/import-operations", this.projectKey, this.importSinkKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportSinkKey() {return this.importSinkKey;}

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<String> getResourceKey() {
        return this.getQueryParam("resourceKey");
    }
    
    public List<String> getState() {
        return this.getQueryParam("state");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setImportSinkKey(final String importSinkKey) { this.importSinkKey = importSinkKey; }

    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(final Double limit){
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(final Double offset){
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(final String resourceKey){
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet(this).addQueryParam("resourceKey", resourceKey);
    }
    
    public ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet withState(final ProcessingState state){
        return new ByProjectKeyCategoriesImportSinkKeyByImportSinkKeyImportOperationsGet(this).addQueryParam("state", state);
    }
}