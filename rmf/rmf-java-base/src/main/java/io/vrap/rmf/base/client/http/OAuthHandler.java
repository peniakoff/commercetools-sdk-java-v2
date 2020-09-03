package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

public class OAuthHandler {
    private final TokenSupplier supplier;
    private AuthenticationToken token;

    public OAuthHandler(TokenSupplier supplier) {
        this.supplier = supplier;
    }

    static String authHeader(AuthenticationToken token) {
        return "Bearer " + token.getAccessToken();
    }

    public AuthenticationToken getToken() {
        if (token == null)
            synchronized (this) {
                if (token == null)
                    supplier.getToken().thenApply(authenticationToken -> token = authenticationToken).join();
            }
        return token;
    }

    public AuthenticationToken refreshToken() {
        token = null;
        return getToken();
    }
}