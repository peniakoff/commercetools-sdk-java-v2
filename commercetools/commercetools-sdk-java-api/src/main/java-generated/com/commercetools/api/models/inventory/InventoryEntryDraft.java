package com.commercetools.api.models.inventory;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.inventory.InventoryEntryDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InventoryEntryDraftImpl.class)
public interface InventoryEntryDraft  {

    
    @NotNull
    @JsonProperty("sku")
    public String getSku();
    
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();
    
    @NotNull
    @JsonProperty("quantityOnStock")
    public Long getQuantityOnStock();
    
    
    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();
    
    
    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();
    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setSku(final String sku);
    
    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
    
    public void setQuantityOnStock(final Long quantityOnStock);
    
    public void setRestockableInDays(final Long restockableInDays);
    
    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);
    
    public void setCustom(final CustomFieldsDraft custom);

    public static InventoryEntryDraftImpl of(){
        return new InventoryEntryDraftImpl();
    }
    

    public static InventoryEntryDraftImpl of(final InventoryEntryDraft template) {
        InventoryEntryDraftImpl instance = new InventoryEntryDraftImpl();
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setCustom(template.getCustom());
        return instance;
    }

    default <T> T withInventoryEntryDraft(Function<InventoryEntryDraft, T> helper) {
        return helper.apply(this);
    }
}
