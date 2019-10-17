package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyApiClientsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyApiClientsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyApiClientsByIDGet get() {
      return new ByProjectKeyApiClientsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyApiClientsByIDDelete delete() {
      return new ByProjectKeyApiClientsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}