package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.generated.models.shipping_method.CartValueTier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartValueTierBuilder {
   
   
   private Long minimumCentAmount;
   
   
   private com.commercetools.api.generated.models.common.Money price;
   
   @Nullable
   private Boolean isMatching;
   
   public CartValueTierBuilder minimumCentAmount( final Long minimumCentAmount) {
      this.minimumCentAmount = minimumCentAmount;
      return this;
   }
   
   public CartValueTierBuilder price( final com.commercetools.api.generated.models.common.Money price) {
      this.price = price;
      return this;
   }
   
   public CartValueTierBuilder isMatching(@Nullable final Boolean isMatching) {
      this.isMatching = isMatching;
      return this;
   }
   
   
   public Long getMinimumCentAmount(){
      return this.minimumCentAmount;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getPrice(){
      return this.price;
   }
   
   @Nullable
   public Boolean getIsMatching(){
      return this.isMatching;
   }

   public CartValueTier build() {
       return new CartValueTierImpl(minimumCentAmount, price, isMatching);
   }
   
   public static CartValueTierBuilder of() {
      return new CartValueTierBuilder();
   }
   
   public static CartValueTierBuilder of(final CartValueTier template) {
      CartValueTierBuilder builder = new CartValueTierBuilder();
      builder.minimumCentAmount = template.getMinimumCentAmount();
      builder.price = template.getPrice();
      builder.isMatching = template.getIsMatching();
      return builder;
   }
   
}