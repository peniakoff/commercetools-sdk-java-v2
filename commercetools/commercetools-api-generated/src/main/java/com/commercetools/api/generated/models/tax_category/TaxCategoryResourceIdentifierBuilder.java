package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryResourceIdentifierBuilder {
   
   @Nullable
   private String id;
   
   @Nullable
   private String key;
   
   public TaxCategoryResourceIdentifierBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }
   
   public TaxCategoryResourceIdentifierBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public TaxCategoryResourceIdentifier build() {
       return new TaxCategoryResourceIdentifierImpl(id, key);
   }
   
   public static TaxCategoryResourceIdentifierBuilder of() {
      return new TaxCategoryResourceIdentifierBuilder();
   }
   
   public static TaxCategoryResourceIdentifierBuilder of(final TaxCategoryResourceIdentifier template) {
      TaxCategoryResourceIdentifierBuilder builder = new TaxCategoryResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}