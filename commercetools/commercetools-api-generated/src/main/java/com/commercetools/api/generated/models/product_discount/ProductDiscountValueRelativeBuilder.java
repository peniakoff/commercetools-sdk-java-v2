package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountValue;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueRelative;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountValueRelativeBuilder {
   
   
   private Long permyriad;
   
   public ProductDiscountValueRelativeBuilder permyriad( final Long permyriad) {
      this.permyriad = permyriad;
      return this;
   }
   
   
   public Long getPermyriad(){
      return this.permyriad;
   }

   public ProductDiscountValueRelative build() {
       return new ProductDiscountValueRelativeImpl(permyriad);
   }
   
   public static ProductDiscountValueRelativeBuilder of() {
      return new ProductDiscountValueRelativeBuilder();
   }
   
   public static ProductDiscountValueRelativeBuilder of(final ProductDiscountValueRelative template) {
      ProductDiscountValueRelativeBuilder builder = new ProductDiscountValueRelativeBuilder();
      builder.permyriad = template.getPermyriad();
      return builder;
   }
   
}