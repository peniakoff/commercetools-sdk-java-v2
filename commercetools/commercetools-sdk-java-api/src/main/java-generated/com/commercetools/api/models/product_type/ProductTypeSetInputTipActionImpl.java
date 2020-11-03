package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
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
public final class ProductTypeSetInputTipActionImpl implements ProductTypeSetInputTipAction {

    private String action;
    
    private String attributeName;
    
    private com.commercetools.api.models.common.LocalizedString inputTip;

    @JsonCreator
    ProductTypeSetInputTipActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("inputTip") final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.attributeName = attributeName;
        this.inputTip = inputTip;
        this.action = "setInputTip";
    }
    public ProductTypeSetInputTipActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getInputTip(){
        return this.inputTip;
    }

    public void setAttributeName(final String attributeName){
        this.attributeName = attributeName;
    }
    
    public void setInputTip(final com.commercetools.api.models.common.LocalizedString inputTip){
        this.inputTip = inputTip;
    }

}
