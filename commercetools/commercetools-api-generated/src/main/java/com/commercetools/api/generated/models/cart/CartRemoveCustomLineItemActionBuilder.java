package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.CartRemoveCustomLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartRemoveCustomLineItemActionBuilder {
   
   
   private String customLineItemId;
   
   public CartRemoveCustomLineItemActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }

   public CartRemoveCustomLineItemAction build() {
       return new CartRemoveCustomLineItemActionImpl(customLineItemId);
   }
   
   public static CartRemoveCustomLineItemActionBuilder of() {
      return new CartRemoveCustomLineItemActionBuilder();
   }
   
   public static CartRemoveCustomLineItemActionBuilder of(final CartRemoveCustomLineItemAction template) {
      CartRemoveCustomLineItemActionBuilder builder = new CartRemoveCustomLineItemActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      return builder;
   }
   
}