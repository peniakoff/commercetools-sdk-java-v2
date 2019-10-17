package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.CartSetShippingMethodTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetShippingMethodTaxRateActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   public CartSetShippingMethodTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }

   public CartSetShippingMethodTaxRateAction build() {
       return new CartSetShippingMethodTaxRateActionImpl(externalTaxRate);
   }
   
   public static CartSetShippingMethodTaxRateActionBuilder of() {
      return new CartSetShippingMethodTaxRateActionBuilder();
   }
   
   public static CartSetShippingMethodTaxRateActionBuilder of(final CartSetShippingMethodTaxRateAction template) {
      CartSetShippingMethodTaxRateActionBuilder builder = new CartSetShippingMethodTaxRateActionBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      return builder;
   }
   
}