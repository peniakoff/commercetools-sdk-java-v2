package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeLineItemsOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyShoppingListChangeLineItemsOrderActionBuilder {
   
   
   private java.util.List<String> lineItemOrder;
   
   public MyShoppingListChangeLineItemsOrderActionBuilder lineItemOrder( final java.util.List<String> lineItemOrder) {
      this.lineItemOrder = lineItemOrder;
      return this;
   }
   
   
   public java.util.List<String> getLineItemOrder(){
      return this.lineItemOrder;
   }

   public MyShoppingListChangeLineItemsOrderAction build() {
       return new MyShoppingListChangeLineItemsOrderActionImpl(lineItemOrder);
   }
   
   public static MyShoppingListChangeLineItemsOrderActionBuilder of() {
      return new MyShoppingListChangeLineItemsOrderActionBuilder();
   }
   
   public static MyShoppingListChangeLineItemsOrderActionBuilder of(final MyShoppingListChangeLineItemsOrderAction template) {
      MyShoppingListChangeLineItemsOrderActionBuilder builder = new MyShoppingListChangeLineItemsOrderActionBuilder();
      builder.lineItemOrder = template.getLineItemOrder();
      return builder;
   }
   
}