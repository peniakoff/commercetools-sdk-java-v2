package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMeOrdersByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyMeOrdersByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyMeOrdersByIDGet get() {
      return new ByProjectKeyMeOrdersByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyMeOrdersByIDPost post(com.commercetools.api.generated.models.common.Update update) {
      return new ByProjectKeyMeOrdersByIDPost(apiHttpClient, projectKey, ID, update);
   }
   
}