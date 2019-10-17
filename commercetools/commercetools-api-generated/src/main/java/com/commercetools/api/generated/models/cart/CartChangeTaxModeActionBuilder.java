package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.TaxMode;
import com.commercetools.api.generated.models.cart.CartChangeTaxModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartChangeTaxModeActionBuilder {
   
   
   private com.commercetools.api.generated.models.cart.TaxMode taxMode;
   
   public CartChangeTaxModeActionBuilder taxMode( final com.commercetools.api.generated.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }

   public CartChangeTaxModeAction build() {
       return new CartChangeTaxModeActionImpl(taxMode);
   }
   
   public static CartChangeTaxModeActionBuilder of() {
      return new CartChangeTaxModeActionBuilder();
   }
   
   public static CartChangeTaxModeActionBuilder of(final CartChangeTaxModeAction template) {
      CartChangeTaxModeActionBuilder builder = new CartChangeTaxModeActionBuilder();
      builder.taxMode = template.getTaxMode();
      return builder;
   }
   
}