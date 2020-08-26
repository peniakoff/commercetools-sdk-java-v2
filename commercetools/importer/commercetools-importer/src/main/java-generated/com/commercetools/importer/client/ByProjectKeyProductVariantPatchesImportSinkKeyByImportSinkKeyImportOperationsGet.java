package com.commercetools.importer.client;

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
import com.commercetools.importer.models.common.ProcessingState;

/**
*  <p>Retrieves all product-variant-patches import operations of an import sink key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet {

    
    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient; 
    private List<Double> limit = new ArrayList<>();
    private List<Double> offset = new ArrayList<>();
    private List<String> resourceKey = new ArrayList<>();
    private List<ProcessingState> state = new ArrayList<>();
    private String projectKey;
    private String importSinkKey;
    

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();
        params.add(this.limit.stream().map(s -> "limit=" + s).collect(Collectors.joining("&")));
        params.add(this.offset.stream().map(s -> "offset=" + s).collect(Collectors.joining("&")));
        params.add(this.resourceKey.stream().map(s -> "resourceKey=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.state.stream().map(s -> "state=" + s).collect(Collectors.joining("&")));
        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/product-variant-patches/importSinkKey=%s/import-operations", this.projectKey, this.importSinkKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(headers);
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.importer.models.importoperations.ImportOperationPagedResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.importer.models.importoperations.ImportOperationPagedResponse>> execute(){
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.importer.models.importoperations.ImportOperationPagedResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportSinkKey() {return this.importSinkKey;}

    public List<Double> getLimit() {
        return this.limit;
    }
    
    public List<Double> getOffset() {
        return this.offset;
    }
    
    public List<String> getResourceKey() {
        return this.resourceKey;
    }
    
    public List<ProcessingState> getState() {
        return this.state;
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
    
    public void setImportSinkKey(final String importSinkKey) {this.importSinkKey = importSinkKey;}

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(final Double limit){
        this.limit.add(limit);
        return this;
    }
    
    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(final List<Double> limit){
        this.limit = limit;
        return this;
    }
    
    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(final Double offset){
        this.offset.add(offset);
        return this;
    }
    
    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(final List<Double> offset){
        this.offset = offset;
        return this;
    }
    
    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(final String resourceKey){
        this.resourceKey.add(resourceKey);
        return this;
    }
    
    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(final List<String> resourceKey){
        this.resourceKey = resourceKey;
        return this;
    }
    
    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addState(final ProcessingState state){
        this.state.add(state);
        return this;
    }
    
    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withState(final List<ProcessingState> state){
        this.state = state;
        return this;
    }

    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }
    
    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    public String getHeaderValue(final String key) {
        return this.headers.getHeaderValue(key);
    }
    
    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }
    
    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }
    
    public ByProjectKeyProductVariantPatchesImportSinkKeyByImportSinkKeyImportOperationsGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
        this.additionalQueryParams = additionalQueryParams;
        return this;
    }
    
    public Map<String, String> getAdditionalQueryParams() {
        return this.additionalQueryParams;
    }
    
    private String urlEncode(final String s){
        try{
             return URLEncoder.encode(s, "UTF-8");
         }catch (UnsupportedEncodingException e) {
             //this will never happen
             return null;
         }
    }

}