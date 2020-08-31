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


/**
*  <p>Response Representation: PagedQueryResult with a results array of ProjectCategoryrecommendation, sorted by confidence scores in descending order and the meta information of ProjectCategoryrecommendationMeta.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyRecommendationsProjectCategoriesByProductIdGet extends ApiMethod<ByProjectKeyRecommendationsProjectCategoriesByProductIdGet> {

    
    private String projectKey;
    private String productId;
    

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(final ApiHttpClient apiHttpClient, String projectKey, String productId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productId = productId;
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(ByProjectKeyRecommendationsProjectCategoriesByProductIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productId = t.productId;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/recommendations/project-categories/%s", this.projectKey, this.productId);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationPagedQueryResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getProductId() {return this.productId;}

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }
    
    public List<String> getConfidenceMin() {
        return this.getQueryParam("confidenceMin");
    }
    
    public List<String> getConfidenceMax() {
        return this.getQueryParam("confidenceMax");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setProductId(final String productId) { this.productId = productId; }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withLimit(final Integer limit){
        return new ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withOffset(final Integer offset){
        return new ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withStaged(final Boolean staged){
        return new ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(this).addQueryParam("staged", staged);
    }
    
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMin(final Double confidenceMin){
        return new ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(this).addQueryParam("confidenceMin", confidenceMin);
    }
    
    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet withConfidenceMax(final Double confidenceMax){
        return new ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(this).addQueryParam("confidenceMax", confidenceMax);
    }
}