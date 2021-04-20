package com.commercetools.ml.client.resource;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.VrapHttpClient;
import com.commercetools.ml.client.ApiRoot;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import org.assertj.core.api.Assertions;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@RunWith(JUnitParamsRunner.class)
public class ByProjectKeyRecommendationsGeneralCategoriesTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @Test
    @Parameters(method = "requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().name().toLowerCase());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeServerException(ClientRequestCommand<?> httpRequest) throws Exception{
        Mockito.when(httpClientMock.execute(Mockito.any())).thenReturn(CompletableFuture.completedFuture(
                       new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(
               () -> client.execute(httpRequest).get()).hasCauseInstanceOf(ApiServerException.class); 
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception{
        Mockito.when(httpClientMock.execute(Mockito.any())).thenReturn(CompletableFuture.completedFuture(
                       new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(
           () -> client.execute(httpRequest).get()).hasCauseInstanceOf(ApiClientException.class);
    }

    private Object[] requestWithMethodParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withProductImageUrl("productImageUrl")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/recommendations/general-categories?productImageUrl=productImageUrl",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withProductName("productName")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/recommendations/general-categories?productName=productName",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withLimit("limit")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/recommendations/general-categories?limit=limit",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withOffset("offset")
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/recommendations/general-categories?offset=offset",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withConfidenceMin(0.7340351)
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/recommendations/general-categories?confidenceMin=0.7340351",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withConfidenceMax(0.30089796)
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/recommendations/general-categories?confidenceMax=0.30089796",
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .createHttpRequest(),
                   "get",
                   "/test_projectKey/recommendations/general-categories",
               }
       };
    }

    private Object[] executeMethodParameters() {
       return new Object [] {
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withProductImageUrl("productImageUrl"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withProductName("productName"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withLimit("limit"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withOffset("offset"),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withConfidenceMin(0.7340351),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get()
                   .withConfidenceMax(0.30089796),
               },
               new Object[] {           
                   apiRoot
                   .withProjectKey("test_projectKey")
                   .recommendations()
                   .generalCategories()
                   .get(),
               }
       };
    }
}
