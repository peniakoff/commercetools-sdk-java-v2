package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeChangeLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeLabelActionBuilder {
   
   
   private String attributeName;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString label;
   
   public ProductTypeChangeLabelActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeChangeLabelActionBuilder label( final com.commercetools.api.generated.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getLabel(){
      return this.label;
   }

   public ProductTypeChangeLabelAction build() {
       return new ProductTypeChangeLabelActionImpl(attributeName, label);
   }
   
   public static ProductTypeChangeLabelActionBuilder of() {
      return new ProductTypeChangeLabelActionBuilder();
   }
   
   public static ProductTypeChangeLabelActionBuilder of(final ProductTypeChangeLabelAction template) {
      ProductTypeChangeLabelActionBuilder builder = new ProductTypeChangeLabelActionBuilder();
      builder.attributeName = template.getAttributeName();
      builder.label = template.getLabel();
      return builder;
   }
   
}