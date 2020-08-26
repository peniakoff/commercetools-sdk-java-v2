package com.commercetools.api.models.cart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum LineItemPriceMode {

    
    @JsonProperty("Platform")
    PLATFORM("Platform"),
    
    
    @JsonProperty("ExternalTotal")
    EXTERNAL_TOTAL("ExternalTotal"),
    
    
    @JsonProperty("ExternalPrice")
    EXTERNAL_PRICE("ExternalPrice");

    private final String jsonName;

    private LineItemPriceMode(final String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static Optional<LineItemPriceMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
}