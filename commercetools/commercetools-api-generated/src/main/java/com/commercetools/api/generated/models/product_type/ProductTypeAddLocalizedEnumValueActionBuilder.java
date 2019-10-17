package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeAddLocalizedEnumValueAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeAddLocalizedEnumValueActionBuilder {
   
   
   private String attributeName;
   
   
   private com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue value;
   
   public ProductTypeAddLocalizedEnumValueActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeAddLocalizedEnumValueActionBuilder value( final com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue getValue(){
      return this.value;
   }

   public ProductTypeAddLocalizedEnumValueAction build() {
       return new ProductTypeAddLocalizedEnumValueActionImpl(attributeName, value);
   }
   
   public static ProductTypeAddLocalizedEnumValueActionBuilder of() {
      return new ProductTypeAddLocalizedEnumValueActionBuilder();
   }
   
   public static ProductTypeAddLocalizedEnumValueActionBuilder of(final ProductTypeAddLocalizedEnumValueAction template) {
      ProductTypeAddLocalizedEnumValueActionBuilder builder = new ProductTypeAddLocalizedEnumValueActionBuilder();
      builder.attributeName = template.getAttributeName();
      builder.value = template.getValue();
      return builder;
   }
   
}