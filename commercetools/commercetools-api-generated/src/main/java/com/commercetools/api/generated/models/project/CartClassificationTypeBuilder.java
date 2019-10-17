package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ShippingRateInputType;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.api.generated.models.project.CartClassificationType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartClassificationTypeBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue> values;
   
   public CartClassificationTypeBuilder values( final java.util.List<com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue> values) {
      this.values = values;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue> getValues(){
      return this.values;
   }

   public CartClassificationType build() {
       return new CartClassificationTypeImpl(values);
   }
   
   public static CartClassificationTypeBuilder of() {
      return new CartClassificationTypeBuilder();
   }
   
   public static CartClassificationTypeBuilder of(final CartClassificationType template) {
      CartClassificationTypeBuilder builder = new CartClassificationTypeBuilder();
      builder.values = template.getValues();
      return builder;
   }
   
}