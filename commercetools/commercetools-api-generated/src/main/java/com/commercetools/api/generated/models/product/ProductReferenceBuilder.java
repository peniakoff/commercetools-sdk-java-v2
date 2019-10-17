package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.product.Product;
import com.commercetools.api.generated.models.product.ProductReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.product.Product obj;
   
   public ProductReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ProductReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.product.Product obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.product.Product getObj(){
      return this.obj;
   }

   public ProductReference build() {
       return new ProductReferenceImpl(id, obj);
   }
   
   public static ProductReferenceBuilder of() {
      return new ProductReferenceBuilder();
   }
   
   public static ProductReferenceBuilder of(final ProductReference template) {
      ProductReferenceBuilder builder = new ProductReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}