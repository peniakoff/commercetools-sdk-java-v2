package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
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
public final class DiscountCodeUpdateImpl implements DiscountCodeUpdate {

   private java.util.List<com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction> actions;
   
   private Long version;

   @JsonCreator
   DiscountCodeUpdateImpl(@JsonProperty("actions") final java.util.List<com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction> actions, @JsonProperty("version") final Long version) {
      this.actions = actions;
      this.version = version;
   }
   public DiscountCodeUpdateImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public void setActions(final java.util.List<com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction> actions){
      this.actions = actions;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }

}