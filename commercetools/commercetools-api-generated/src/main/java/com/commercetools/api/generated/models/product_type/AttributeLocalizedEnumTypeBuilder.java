package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.generated.models.product_type.AttributeType;
import com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeLocalizedEnumTypeBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue> values;
   
   public AttributeLocalizedEnumTypeBuilder values( final java.util.List<com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue> values) {
      this.values = values;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue> getValues(){
      return this.values;
   }

   public AttributeLocalizedEnumType build() {
       return new AttributeLocalizedEnumTypeImpl(values);
   }
   
   public static AttributeLocalizedEnumTypeBuilder of() {
      return new AttributeLocalizedEnumTypeBuilder();
   }
   
   public static AttributeLocalizedEnumTypeBuilder of(final AttributeLocalizedEnumType template) {
      AttributeLocalizedEnumTypeBuilder builder = new AttributeLocalizedEnumTypeBuilder();
      builder.values = template.getValues();
      return builder;
   }
   
}