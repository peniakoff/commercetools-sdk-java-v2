package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountActionImpl;

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
@JsonDeserialize(as = StagedOrderSetLineItemTaxAmountActionImpl.class)
public interface StagedOrderSetLineItemTaxAmountAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setLineItemId(final String lineItemId);
    
    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static StagedOrderSetLineItemTaxAmountActionImpl of(){
        return new StagedOrderSetLineItemTaxAmountActionImpl();
    }
    

    public static StagedOrderSetLineItemTaxAmountActionImpl of(final StagedOrderSetLineItemTaxAmountAction template) {
        StagedOrderSetLineItemTaxAmountActionImpl instance = new StagedOrderSetLineItemTaxAmountActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    default <T> T withStagedOrderSetLineItemTaxAmountAction(Function<StagedOrderSetLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }
}
