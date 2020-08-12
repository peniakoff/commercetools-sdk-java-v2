package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRevertStagedChangesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductRevertStagedChangesActionBuilder {
   
   
   

   public ProductRevertStagedChangesAction build() {
       return new ProductRevertStagedChangesActionImpl();
   }
   
   public static ProductRevertStagedChangesActionBuilder of() {
      return new ProductRevertStagedChangesActionBuilder();
   }
   
   public static ProductRevertStagedChangesActionBuilder of(final ProductRevertStagedChangesAction template) {
      ProductRevertStagedChangesActionBuilder builder = new ProductRevertStagedChangesActionBuilder();
      return builder;
   }
   
}