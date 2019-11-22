package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ItemShippingTarget;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class ItemShippingDetailsDraftImpl implements ItemShippingDetailsDraft {

   private java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targets;

   @JsonCreator
   ItemShippingDetailsDraftImpl(@JsonProperty("targets") final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targets) {
      this.targets = targets;
   }
   public ItemShippingDetailsDraftImpl() {
      
   }
   
   /**
   	<p>Used to capture one or more (custom) line item specific shipping addresses.
   	By specifying sub-quantities, it is possible to set multiple shipping addresses for one line item.
   	A cart can have <code>shippingDetails</code> where the <code>targets</code> sum does not match the quantity of the line item or custom line item.
   	For the order creation and order updates the <code>targets</code> sum must match the quantity.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> getTargets(){
      return this.targets;
   }

   public void setTargets(final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targets){
      this.targets = targets;
   }

}