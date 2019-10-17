package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetValidUntilAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountSetValidUntilActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   public CartDiscountSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }

   public CartDiscountSetValidUntilAction build() {
       return new CartDiscountSetValidUntilActionImpl(validUntil);
   }
   
   public static CartDiscountSetValidUntilActionBuilder of() {
      return new CartDiscountSetValidUntilActionBuilder();
   }
   
   public static CartDiscountSetValidUntilActionBuilder of(final CartDiscountSetValidUntilAction template) {
      CartDiscountSetValidUntilActionBuilder builder = new CartDiscountSetValidUntilActionBuilder();
      builder.validUntil = template.getValidUntil();
      return builder;
   }
   
}