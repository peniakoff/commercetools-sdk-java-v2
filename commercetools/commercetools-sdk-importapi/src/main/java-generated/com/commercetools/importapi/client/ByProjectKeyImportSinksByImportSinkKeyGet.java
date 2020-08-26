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


/**
*  <p>Retrieves the import sink given by the key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyImportSinksByImportSinkKeyGet {


    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient;

    private String projectKey;
    private String importSinkKey;


    public ByProjectKeyImportSinksByImportSinkKeyGet(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();

        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/import-sinks/%s", this.projectKey, this.importSinkKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath);
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(headers);

        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink>> execute(){
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.importapi.models.importsinks.ImportSink.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportSinkKey() {return this.importSinkKey;}


    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}

    public void setImportSinkKey(final String importSinkKey) {this.importSinkKey = importSinkKey;}


    public ByProjectKeyImportSinksByImportSinkKeyGet addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }

    public ByProjectKeyImportSinksByImportSinkKeyGet withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }

    public String getHeaderValue(final String key) {
        return this.headers.getHeaderValue(key);
    }

    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }

    public ByProjectKeyImportSinksByImportSinkKeyGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }

    public ByProjectKeyImportSinksByImportSinkKeyGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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