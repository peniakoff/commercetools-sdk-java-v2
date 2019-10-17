package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeReference;
import com.commercetools.api.generated.models.cart.CartRemoveDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartRemoveDiscountCodeActionBuilder {
   
   
   private com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode;
   
   public CartRemoveDiscountCodeActionBuilder discountCode( final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public CartRemoveDiscountCodeAction build() {
       return new CartRemoveDiscountCodeActionImpl(discountCode);
   }
   
   public static CartRemoveDiscountCodeActionBuilder of() {
      return new CartRemoveDiscountCodeActionBuilder();
   }
   
   public static CartRemoveDiscountCodeActionBuilder of(final CartRemoveDiscountCodeAction template) {
      CartRemoveDiscountCodeActionBuilder builder = new CartRemoveDiscountCodeActionBuilder();
      builder.discountCode = template.getDiscountCode();
      return builder;
   }
   
}