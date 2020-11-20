package com.commercetools.importapi.models.inventories;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.customfields.Custom;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.inventories.InventoryImportImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>Import representation for a inventory.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InventoryImportImpl.class)
public interface InventoryImport extends ImportResource {

    
    @NotNull
    @JsonProperty("sku")
    public String getSku();
    /**
    *  <p>Maps to <code>Inventory.quantityOnStock</code></p>
    */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Double getQuantityOnStock();
    /**
    *  <p>Maps to <code>Inventory.restockableInDays</code></p>
    */
    
    @JsonProperty("restockableInDays")
    public Double getRestockableInDays();
    
    
    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();
    /**
    *  <p>References a channel by its key.</p>
    */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelKeyReference getSupplyChannel();
    /**
    *  <p>Maps to <code>Inventory.custom</code>.</p>
    */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    public void setSku(final String sku);
    
    public void setQuantityOnStock(final Double quantityOnStock);
    
    public void setRestockableInDays(final Double restockableInDays);
    
    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);
    
    public void setSupplyChannel(final ChannelKeyReference supplyChannel);
    
    public void setCustom(final Custom custom);

    public static InventoryImportImpl of(){
        return new InventoryImportImpl();
    }
    

    public static InventoryImportImpl of(final InventoryImport template) {
        InventoryImportImpl instance = new InventoryImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setCustom(template.getCustom());
        return instance;
    }

    default <T> T withInventoryImport(Function<InventoryImport, T> helper) {
        return helper.apply(this);
    }
}