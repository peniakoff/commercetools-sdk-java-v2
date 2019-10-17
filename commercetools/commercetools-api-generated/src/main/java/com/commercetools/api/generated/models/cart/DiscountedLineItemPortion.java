package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart_discount.CartDiscountReference;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.cart.DiscountedLineItemPortionImpl;

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
@JsonDeserialize(as = DiscountedLineItemPortionImpl.class)
public interface DiscountedLineItemPortion  {

   
   @NotNull
   @Valid
   @JsonProperty("discount")
   public CartDiscountReference getDiscount();
   
   @NotNull
   @Valid
   @JsonProperty("discountedAmount")
   public TypedMoney getDiscountedAmount();

   public void setDiscount(final CartDiscountReference discount);
   
   public void setDiscountedAmount(final TypedMoney discountedAmount);
   
   public static DiscountedLineItemPortionImpl of(){
      return new DiscountedLineItemPortionImpl();
   }
   

   public static DiscountedLineItemPortionImpl of(final DiscountedLineItemPortion template) {
      DiscountedLineItemPortionImpl instance = new DiscountedLineItemPortionImpl();
      instance.setDiscountedAmount(template.getDiscountedAmount());
      instance.setDiscount(template.getDiscount());
      return instance;
   }

}