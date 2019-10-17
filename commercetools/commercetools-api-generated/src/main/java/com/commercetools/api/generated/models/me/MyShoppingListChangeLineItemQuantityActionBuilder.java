package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListChangeLineItemQuantityActionBuilder {
   
   
   private Long quantity;
   
   
   private String lineItemId;
   
   public MyShoppingListChangeLineItemQuantityActionBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyShoppingListChangeLineItemQuantityActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }

   public MyShoppingListChangeLineItemQuantityAction build() {
       return new MyShoppingListChangeLineItemQuantityActionImpl(quantity, lineItemId);
   }
   
   public static MyShoppingListChangeLineItemQuantityActionBuilder of() {
      return new MyShoppingListChangeLineItemQuantityActionBuilder();
   }
   
   public static MyShoppingListChangeLineItemQuantityActionBuilder of(final MyShoppingListChangeLineItemQuantityAction template) {
      MyShoppingListChangeLineItemQuantityActionBuilder builder = new MyShoppingListChangeLineItemQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}