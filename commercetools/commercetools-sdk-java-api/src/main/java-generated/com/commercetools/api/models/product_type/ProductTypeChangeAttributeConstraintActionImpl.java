package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeConstraintEnumDraft;
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
public final class ProductTypeChangeAttributeConstraintActionImpl implements ProductTypeChangeAttributeConstraintAction {

    private String action;
    
    private String attributeName;
    
    private com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue;

    @JsonCreator
    ProductTypeChangeAttributeConstraintActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("newValue") final com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue) {
        this.attributeName = attributeName;
        this.newValue = newValue;
        this.action = "changeAttributeConstraint";
    }
    public ProductTypeChangeAttributeConstraintActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    
    public com.commercetools.api.models.product_type.AttributeConstraintEnumDraft getNewValue(){
        return this.newValue;
    }

    public void setAttributeName(final String attributeName){
        this.attributeName = attributeName;
    }
    
    public void setNewValue(final com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue){
        this.newValue = newValue;
    }

}
