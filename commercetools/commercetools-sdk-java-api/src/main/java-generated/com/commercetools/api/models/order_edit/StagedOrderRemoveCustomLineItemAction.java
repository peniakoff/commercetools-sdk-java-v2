package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveCustomLineItemActionImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderRemoveCustomLineItemActionImpl.class)
public interface StagedOrderRemoveCustomLineItemAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    public void setCustomLineItemId(final String customLineItemId);

    public static StagedOrderRemoveCustomLineItemActionImpl of(){
        return new StagedOrderRemoveCustomLineItemActionImpl();
    }
    

    public static StagedOrderRemoveCustomLineItemActionImpl of(final StagedOrderRemoveCustomLineItemAction template) {
        StagedOrderRemoveCustomLineItemActionImpl instance = new StagedOrderRemoveCustomLineItemActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    default <T> T withStagedOrderRemoveCustomLineItemAction(Function<StagedOrderRemoveCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }
}