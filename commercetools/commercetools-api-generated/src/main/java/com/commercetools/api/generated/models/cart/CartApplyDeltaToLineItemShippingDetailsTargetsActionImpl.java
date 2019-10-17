package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ItemShippingTarget;
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
public final class CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl implements CartApplyDeltaToLineItemShippingDetailsTargetsAction {

   private String action;
   
   private String lineItemId;
   
   private java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targetsDelta;

   @JsonCreator
   CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("targetsDelta") final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targetsDelta) {
      this.lineItemId = lineItemId;
      this.targetsDelta = targetsDelta;
      this.action = "applyDeltaToLineItemShippingDetailsTargets";
   }
   public CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setTargetsDelta(final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targetsDelta){
      this.targetsDelta = targetsDelta;
   }

}