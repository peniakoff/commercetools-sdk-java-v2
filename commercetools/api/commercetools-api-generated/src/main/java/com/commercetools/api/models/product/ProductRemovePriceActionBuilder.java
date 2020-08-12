package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRemovePriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductRemovePriceActionBuilder {

   @Nullable
   private Boolean staged;


   private String priceId;

   public ProductRemovePriceActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }

   public ProductRemovePriceActionBuilder priceId( final String priceId) {
      this.priceId = priceId;
      return this;
   }

   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }


   public String getPriceId(){
      return this.priceId;
   }

   public ProductRemovePriceAction build() {
       return new ProductRemovePriceActionImpl(staged, priceId);
   }

   public static ProductRemovePriceActionBuilder of() {
      return new ProductRemovePriceActionBuilder();
   }

   public static ProductRemovePriceActionBuilder of(final ProductRemovePriceAction template) {
      ProductRemovePriceActionBuilder builder = new ProductRemovePriceActionBuilder();
      builder.staged = template.getStaged();
      builder.priceId = template.getPriceId();
      return builder;
   }

}