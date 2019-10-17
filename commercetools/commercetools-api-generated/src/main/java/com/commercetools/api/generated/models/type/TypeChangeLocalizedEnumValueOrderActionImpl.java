package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.TypeUpdateAction;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeChangeLocalizedEnumValueOrderActionImpl implements TypeChangeLocalizedEnumValueOrderAction {

   private String action;
   
   private String fieldName;
   
   private java.util.List<String> keys;

   @JsonCreator
   TypeChangeLocalizedEnumValueOrderActionImpl(@JsonProperty("fieldName") final String fieldName, @JsonProperty("keys") final java.util.List<String> keys) {
      this.fieldName = fieldName;
      this.keys = keys;
      this.action = "changeLocalizedEnumValueOrder";
   }
   public TypeChangeLocalizedEnumValueOrderActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public java.util.List<String> getKeys(){
      return this.keys;
   }

   public void setFieldName(final String fieldName){
      this.fieldName = fieldName;
   }
   
   public void setKeys(final java.util.List<String> keys){
      this.keys = keys;
   }

}