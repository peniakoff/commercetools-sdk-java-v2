package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.generated.models.cart.TaxedItemPrice;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderLineItemDiscountSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderLineItemDiscountSetMessagePayloadImpl.class)
public interface OrderLineItemDiscountSetMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @Valid
   @JsonProperty("discountedPricePerQuantity")
   public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();
   
   @NotNull
   @Valid
   @JsonProperty("totalPrice")
   public Money getTotalPrice();
   
   @Valid
   @JsonProperty("taxedPrice")
   public TaxedItemPrice getTaxedPrice();

   public void setLineItemId(final String lineItemId);
   
   public void setDiscountedPricePerQuantity(final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);
   
   public void setTotalPrice(final Money totalPrice);
   
   public void setTaxedPrice(final TaxedItemPrice taxedPrice);
   
   public static OrderLineItemDiscountSetMessagePayloadImpl of(){
      return new OrderLineItemDiscountSetMessagePayloadImpl();
   }
   

   public static OrderLineItemDiscountSetMessagePayloadImpl of(final OrderLineItemDiscountSetMessagePayload template) {
      OrderLineItemDiscountSetMessagePayloadImpl instance = new OrderLineItemDiscountSetMessagePayloadImpl();
      instance.setTotalPrice(template.getTotalPrice());
      instance.setLineItemId(template.getLineItemId());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
      return instance;
   }

}