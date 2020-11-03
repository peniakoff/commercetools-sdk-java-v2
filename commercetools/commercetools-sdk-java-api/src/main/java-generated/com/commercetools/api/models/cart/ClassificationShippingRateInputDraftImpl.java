package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ShippingRateInputDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ClassificationShippingRateInputDraftImpl implements ClassificationShippingRateInputDraft {

    private String type;
    
    private String key;

    @JsonCreator
    ClassificationShippingRateInputDraftImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.type = "Classification";
    }
    public ClassificationShippingRateInputDraftImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getKey(){
        return this.key;
    }

    public void setKey(final String key){
        this.key = key;
    }

}
