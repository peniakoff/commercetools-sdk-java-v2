package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCustomersEmailConfirmRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomersEmailConfirmRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomersEmailConfirmPost post(com.commercetools.api.generated.models.customer.CustomerEmailVerify customerEmailVerify) {
      return new ByProjectKeyCustomersEmailConfirmPost(apiHttpClient, projectKey, customerEmailVerify);
   }
   
}