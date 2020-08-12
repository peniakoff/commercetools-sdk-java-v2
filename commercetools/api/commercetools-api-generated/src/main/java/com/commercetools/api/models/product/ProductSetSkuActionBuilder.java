package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetSkuAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetSkuActionBuilder {

   @Nullable
   private Boolean staged;


   private Long variantId;

   @Nullable
   private String sku;

   public ProductSetSkuActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }

   public ProductSetSkuActionBuilder variantId( final Long variantId) {
      this.variantId = variantId;
      return this;
   }

   public ProductSetSkuActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }

   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }


   public Long getVariantId(){
      return this.variantId;
   }

   @Nullable
   public String getSku(){
      return this.sku;
   }

   public ProductSetSkuAction build() {
       return new ProductSetSkuActionImpl(staged, variantId, sku);
   }

   public static ProductSetSkuActionBuilder of() {
      return new ProductSetSkuActionBuilder();
   }

   public static ProductSetSkuActionBuilder of(final ProductSetSkuAction template) {
      ProductSetSkuActionBuilder builder = new ProductSetSkuActionBuilder();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }

}