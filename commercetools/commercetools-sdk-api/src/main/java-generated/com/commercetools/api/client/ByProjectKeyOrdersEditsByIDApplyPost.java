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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyOrdersEditsByIDApplyPost extends ApiMethod<ByProjectKeyOrdersEditsByIDApplyPost> {

    
    private String projectKey;
    private String ID;
    
    private com.commercetools.api.models.order_edit.OrderEditApply orderEditApply;

    public ByProjectKeyOrdersEditsByIDApplyPost(final ApiHttpClient apiHttpClient, String projectKey, String ID, com.commercetools.api.models.order_edit.OrderEditApply orderEditApply){
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.orderEditApply = orderEditApply;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/edits/%s/apply", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(orderEditApply));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.fasterxml.jackson.databind.JsonNode.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}


    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
    
    public void setID(final String ID) {this.ID = ID;}

}
