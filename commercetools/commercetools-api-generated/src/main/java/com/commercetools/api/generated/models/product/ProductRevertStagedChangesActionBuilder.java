package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductRevertStagedChangesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

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