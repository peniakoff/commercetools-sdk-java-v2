package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomLineItemTaxRateActionBuilder {
   
   
   private String customLineItemId;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   public StagedOrderSetCustomLineItemTaxRateActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderSetCustomLineItemTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }

   public StagedOrderSetCustomLineItemTaxRateAction build() {
       return new StagedOrderSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
   }
   
   public static StagedOrderSetCustomLineItemTaxRateActionBuilder of() {
      return new StagedOrderSetCustomLineItemTaxRateActionBuilder();
   }
   
   public static StagedOrderSetCustomLineItemTaxRateActionBuilder of(final StagedOrderSetCustomLineItemTaxRateAction template) {
      StagedOrderSetCustomLineItemTaxRateActionBuilder builder = new StagedOrderSetCustomLineItemTaxRateActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.externalTaxRate = template.getExternalTaxRate();
      return builder;
   }
   
}