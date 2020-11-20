package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxRoundingModeActionImpl;

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
@JsonDeserialize(as = StagedOrderChangeTaxRoundingModeActionImpl.class)
public interface StagedOrderChangeTaxRoundingModeAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public static StagedOrderChangeTaxRoundingModeActionImpl of(){
        return new StagedOrderChangeTaxRoundingModeActionImpl();
    }
    

    public static StagedOrderChangeTaxRoundingModeActionImpl of(final StagedOrderChangeTaxRoundingModeAction template) {
        StagedOrderChangeTaxRoundingModeActionImpl instance = new StagedOrderChangeTaxRoundingModeActionImpl();
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    default <T> T withStagedOrderChangeTaxRoundingModeAction(Function<StagedOrderChangeTaxRoundingModeAction, T> helper) {
        return helper.apply(this);
    }
}