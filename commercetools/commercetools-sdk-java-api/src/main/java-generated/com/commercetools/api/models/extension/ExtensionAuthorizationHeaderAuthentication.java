package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication;
import com.commercetools.api.models.extension.ExtensionAuthorizationHeaderAuthenticationImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExtensionAuthorizationHeaderAuthenticationImpl.class)
public interface ExtensionAuthorizationHeaderAuthentication extends ExtensionHttpDestinationAuthentication {

    
    @NotNull
    @JsonProperty("headerValue")
    public String getHeaderValue();

    public void setHeaderValue(final String headerValue);

    public static ExtensionAuthorizationHeaderAuthenticationImpl of(){
        return new ExtensionAuthorizationHeaderAuthenticationImpl();
    }
    

    public static ExtensionAuthorizationHeaderAuthenticationImpl of(final ExtensionAuthorizationHeaderAuthentication template) {
        ExtensionAuthorizationHeaderAuthenticationImpl instance = new ExtensionAuthorizationHeaderAuthenticationImpl();
        instance.setHeaderValue(template.getHeaderValue());
        return instance;
    }

    default <T> T withExtensionAuthorizationHeaderAuthentication(Function<ExtensionAuthorizationHeaderAuthentication, T> helper) {
        return helper.apply(this);
    }
}