package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.generated.models.inventory.InventoryEntryChangeQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryChangeQuantityActionBuilder {
   
   
   private Long quantity;
   
   public InventoryEntryChangeQuantityActionBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }

   public InventoryEntryChangeQuantityAction build() {
       return new InventoryEntryChangeQuantityActionImpl(quantity);
   }
   
   public static InventoryEntryChangeQuantityActionBuilder of() {
      return new InventoryEntryChangeQuantityActionBuilder();
   }
   
   public static InventoryEntryChangeQuantityActionBuilder of(final InventoryEntryChangeQuantityAction template) {
      InventoryEntryChangeQuantityActionBuilder builder = new InventoryEntryChangeQuantityActionBuilder();
      builder.quantity = template.getQuantity();
      return builder;
   }
   
}