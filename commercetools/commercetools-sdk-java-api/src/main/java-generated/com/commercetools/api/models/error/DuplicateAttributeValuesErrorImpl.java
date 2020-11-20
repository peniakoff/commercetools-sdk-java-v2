package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.product.Attribute;
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
public final class DuplicateAttributeValuesErrorImpl implements DuplicateAttributeValuesError {

    private String code;
    
    private String message;
    
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @JsonCreator
    DuplicateAttributeValuesErrorImpl(@JsonProperty("message") final String message, @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.message = message;
        this.attributes = attributes;
        this.code = "DuplicateAttributeValues";
    }
    public DuplicateAttributeValuesErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes(){
        return this.attributes;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setAttributes(final com.commercetools.api.models.product.Attribute ...attributes){
       this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }
    
    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes){
       this.attributes = attributes;
    }

}