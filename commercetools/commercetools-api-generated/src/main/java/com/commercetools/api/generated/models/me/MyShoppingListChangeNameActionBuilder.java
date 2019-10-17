package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListChangeNameActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   public MyShoppingListChangeNameActionBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }

   public MyShoppingListChangeNameAction build() {
       return new MyShoppingListChangeNameActionImpl(name);
   }
   
   public static MyShoppingListChangeNameActionBuilder of() {
      return new MyShoppingListChangeNameActionBuilder();
   }
   
   public static MyShoppingListChangeNameActionBuilder of(final MyShoppingListChangeNameAction template) {
      MyShoppingListChangeNameActionBuilder builder = new MyShoppingListChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}