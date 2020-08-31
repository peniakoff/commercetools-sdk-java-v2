package com.commercetools.ml.client;

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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMissingDataAttributesPost extends ApiMethod<ByProjectKeyMissingDataAttributesPost> {

    
    private String projectKey;
    
    private com.commercetools.ml.models.missing_data.MissingAttributesSearchRequest missingAttributesSearchRequest;

    public ByProjectKeyMissingDataAttributesPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.ml.models.missing_data.MissingAttributesSearchRequest missingAttributesSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.missingAttributesSearchRequest = missingAttributesSearchRequest;
    }

    public ByProjectKeyMissingDataAttributesPost(ByProjectKeyMissingDataAttributesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.missingAttributesSearchRequest = t.missingAttributesSearchRequest;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/attributes", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(missingAttributesSearchRequest));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.ml.models.common.TaskToken> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.common.TaskToken>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.ml.models.common.TaskToken.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

}