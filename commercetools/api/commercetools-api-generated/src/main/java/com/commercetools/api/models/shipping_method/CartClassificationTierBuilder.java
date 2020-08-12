package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.shipping_method.CartClassificationTier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartClassificationTierBuilder {


   private com.commercetools.api.models.common.Money price;

   @Nullable
   private Boolean isMatching;


   private String value;

   public CartClassificationTierBuilder price( final com.commercetools.api.models.common.Money price) {
      this.price = price;
      return this;
   }

   public CartClassificationTierBuilder isMatching(@Nullable final Boolean isMatching) {
      this.isMatching = isMatching;
      return this;
   }

   public CartClassificationTierBuilder value( final String value) {
      this.value = value;
      return this;
   }


   public com.commercetools.api.models.common.Money getPrice(){
      return this.price;
   }

   @Nullable
   public Boolean getIsMatching(){
      return this.isMatching;
   }


   public String getValue(){
      return this.value;
   }

   public CartClassificationTier build() {
       return new CartClassificationTierImpl(price, isMatching, value);
   }

   public static CartClassificationTierBuilder of() {
      return new CartClassificationTierBuilder();
   }

   public static CartClassificationTierBuilder of(final CartClassificationTier template) {
      CartClassificationTierBuilder builder = new CartClassificationTierBuilder();
      builder.price = template.getPrice();
      builder.isMatching = template.getIsMatching();
      builder.value = template.getValue();
      return builder;
   }

}