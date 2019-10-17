package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.generated.models.tax_category.TaxCategoryChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryChangeNameActionBuilder {
   
   
   private String name;
   
   public TaxCategoryChangeNameActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }

   public TaxCategoryChangeNameAction build() {
       return new TaxCategoryChangeNameActionImpl(name);
   }
   
   public static TaxCategoryChangeNameActionBuilder of() {
      return new TaxCategoryChangeNameActionBuilder();
   }
   
   public static TaxCategoryChangeNameActionBuilder of(final TaxCategoryChangeNameAction template) {
      TaxCategoryChangeNameActionBuilder builder = new TaxCategoryChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}