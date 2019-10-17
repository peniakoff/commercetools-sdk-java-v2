package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.product.ProductProjection;
import com.commercetools.api.generated.models.message.ProductCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.product.ProductProjection productProjection;
   
   public ProductCreatedMessagePayloadBuilder productProjection( final com.commercetools.api.generated.models.product.ProductProjection productProjection) {
      this.productProjection = productProjection;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductProjection getProductProjection(){
      return this.productProjection;
   }

   public ProductCreatedMessagePayload build() {
       return new ProductCreatedMessagePayloadImpl(productProjection);
   }
   
   public static ProductCreatedMessagePayloadBuilder of() {
      return new ProductCreatedMessagePayloadBuilder();
   }
   
   public static ProductCreatedMessagePayloadBuilder of(final ProductCreatedMessagePayload template) {
      ProductCreatedMessagePayloadBuilder builder = new ProductCreatedMessagePayloadBuilder();
      builder.productProjection = template.getProductProjection();
      return builder;
   }
   
}