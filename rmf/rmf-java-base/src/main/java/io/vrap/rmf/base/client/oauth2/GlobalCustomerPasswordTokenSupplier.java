package io.vrap.rmf.base.client.oauth2;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;

public class GlobalCustomerPasswordTokenSupplier implements TokenSupplier {

    private final VrapHttpClient vrapHttpClient;
    private final ApiHttpRequest apiHttpRequest;

    public GlobalCustomerPasswordTokenSupplier(String clientId, String clientSecret, String email, String password, String scope, String tokenEndpoint, VrapHttpClient vrapHttpClient) {
        this.vrapHttpClient = vrapHttpClient;
        this.apiHttpRequest = constructApiHttpRequest(clientId, clientSecret, email, password, scope, tokenEndpoint);
    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        return vrapHttpClient
                .execute(apiHttpRequest)
                .thenApply(
                        Utils.wrapToCompletionException(
                                (ApiHttpResponse<byte[]> response) -> VrapJsonUtils.fromJsonByteArray(response.getBody(), AuthenticationToken.class)
                        )
                );
    }

    private static ApiHttpRequest constructApiHttpRequest(final String clientId,
                                                          final String clientSecret,
                                                          final String email,
                                                          final String password,
                                                          final String scope,
                                                          final String tokenEndpoint) {
        String auth = Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));
        ApiHttpRequest apiHttpRequest = new ApiHttpRequest();
        apiHttpRequest.setBaseUrl(tokenEndpoint);
        if (scope == null || scope.isEmpty()) {
            apiHttpRequest.setBody("grant_type=password&username=" + email + "&password=" + password);
        } else {
            apiHttpRequest.setBody("grant_type=password&username=" + email + "&password=" + password + "&scope=" + scope);
        }
        ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders();
        apiHttpHeaders.addHeader("Authorization", "Basic " + auth);
        apiHttpHeaders.addHeader("Content-Type", "application/x-www-form-urlencoded");
        apiHttpRequest.setHeaders(apiHttpHeaders);
        apiHttpRequest.setMethod(ApiHttpMethod.POST);
        return apiHttpRequest;
    }
}