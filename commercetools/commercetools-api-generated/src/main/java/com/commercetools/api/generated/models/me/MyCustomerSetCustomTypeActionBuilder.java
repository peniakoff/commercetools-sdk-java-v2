package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.me.MyCustomerSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   public MyCustomerSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.generated.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public MyCustomerSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public MyCustomerSetCustomTypeAction build() {
       return new MyCustomerSetCustomTypeActionImpl(fields, type);
   }
   
   public static MyCustomerSetCustomTypeActionBuilder of() {
      return new MyCustomerSetCustomTypeActionBuilder();
   }
   
   public static MyCustomerSetCustomTypeActionBuilder of(final MyCustomerSetCustomTypeAction template) {
      MyCustomerSetCustomTypeActionBuilder builder = new MyCustomerSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}