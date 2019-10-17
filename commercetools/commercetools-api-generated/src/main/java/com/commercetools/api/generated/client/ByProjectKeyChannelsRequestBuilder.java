package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyChannelsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyChannelsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyChannelsGet get() {
      return new ByProjectKeyChannelsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyChannelsPost post(com.commercetools.api.generated.models.channel.ChannelDraft channelDraft) {
      return new ByProjectKeyChannelsPost(apiHttpClient, projectKey, channelDraft);
   }
   
   public ByProjectKeyChannelsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyChannelsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}