package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetLineItemShippingDetailsActionImpl implements CartSetLineItemShippingDetailsAction {

   private String action;

   private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

   private String lineItemId;

   @JsonCreator
   CartSetLineItemShippingDetailsActionImpl(@JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("lineItemId") final String lineItemId) {
      this.shippingDetails = shippingDetails;
      this.lineItemId = lineItemId;
      this.action = "setLineItemShippingDetails";
   }
   public CartSetLineItemShippingDetailsActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }


   public String getLineItemId(){
      return this.lineItemId;
   }

   public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }

}