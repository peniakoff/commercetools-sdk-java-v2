package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetRestockableInDaysAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntrySetRestockableInDaysActionBuilder {
   
   @Nullable
   private Long restockableInDays;
   
   public InventoryEntrySetRestockableInDaysActionBuilder restockableInDays(@Nullable final Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   @Nullable
   public Long getRestockableInDays(){
      return this.restockableInDays;
   }

   public InventoryEntrySetRestockableInDaysAction build() {
       return new InventoryEntrySetRestockableInDaysActionImpl(restockableInDays);
   }
   
   public static InventoryEntrySetRestockableInDaysActionBuilder of() {
      return new InventoryEntrySetRestockableInDaysActionBuilder();
   }
   
   public static InventoryEntrySetRestockableInDaysActionBuilder of(final InventoryEntrySetRestockableInDaysAction template) {
      InventoryEntrySetRestockableInDaysActionBuilder builder = new InventoryEntrySetRestockableInDaysActionBuilder();
      builder.restockableInDays = template.getRestockableInDays();
      return builder;
   }
   
}