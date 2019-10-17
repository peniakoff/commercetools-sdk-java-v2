package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodTaxAmountAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetShippingMethodTaxAmountActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxAmountDraft externalTaxAmount;
   
   public StagedOrderSetShippingMethodTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.externalTaxAmount = externalTaxAmount;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
      return this.externalTaxAmount;
   }

   public StagedOrderSetShippingMethodTaxAmountAction build() {
       return new StagedOrderSetShippingMethodTaxAmountActionImpl(externalTaxAmount);
   }
   
   public static StagedOrderSetShippingMethodTaxAmountActionBuilder of() {
      return new StagedOrderSetShippingMethodTaxAmountActionBuilder();
   }
   
   public static StagedOrderSetShippingMethodTaxAmountActionBuilder of(final StagedOrderSetShippingMethodTaxAmountAction template) {
      StagedOrderSetShippingMethodTaxAmountActionBuilder builder = new StagedOrderSetShippingMethodTaxAmountActionBuilder();
      builder.externalTaxAmount = template.getExternalTaxAmount();
      return builder;
   }
   
}