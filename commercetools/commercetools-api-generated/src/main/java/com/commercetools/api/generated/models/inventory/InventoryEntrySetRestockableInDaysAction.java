package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetRestockableInDaysActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InventoryEntrySetRestockableInDaysActionImpl.class)
public interface InventoryEntrySetRestockableInDaysAction extends InventoryEntryUpdateAction {

   
   
   @JsonProperty("restockableInDays")
   public Long getRestockableInDays();

   public void setRestockableInDays(final Long restockableInDays);
   
   public static InventoryEntrySetRestockableInDaysActionImpl of(){
      return new InventoryEntrySetRestockableInDaysActionImpl();
   }
   

   public static InventoryEntrySetRestockableInDaysActionImpl of(final InventoryEntrySetRestockableInDaysAction template) {
      InventoryEntrySetRestockableInDaysActionImpl instance = new InventoryEntrySetRestockableInDaysActionImpl();
      instance.setRestockableInDays(template.getRestockableInDays());
      return instance;
   }

}