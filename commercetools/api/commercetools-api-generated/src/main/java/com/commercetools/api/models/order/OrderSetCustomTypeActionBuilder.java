package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order.OrderSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.api.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.api.models.type.TypeResourceIdentifier type;
   
   public OrderSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public OrderSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public OrderSetCustomTypeAction build() {
       return new OrderSetCustomTypeActionImpl(fields, type);
   }
   
   public static OrderSetCustomTypeActionBuilder of() {
      return new OrderSetCustomTypeActionBuilder();
   }
   
   public static OrderSetCustomTypeActionBuilder of(final OrderSetCustomTypeAction template) {
      OrderSetCustomTypeActionBuilder builder = new OrderSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}