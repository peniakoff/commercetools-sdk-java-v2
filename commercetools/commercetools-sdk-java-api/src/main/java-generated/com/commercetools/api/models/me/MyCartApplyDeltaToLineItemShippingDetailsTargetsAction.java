package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ItemShippingTarget;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl;

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
@JsonDeserialize(as = MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class)
public interface MyCartApplyDeltaToLineItemShippingDetailsTargetsAction extends MyCartUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @NotNull
    @Valid
    @JsonProperty("targetsDelta")
    public List<ItemShippingTarget> getTargetsDelta();

    public void setLineItemId(final String lineItemId);
    
    @JsonIgnore
    public void setTargetsDelta(final ItemShippingTarget ...targetsDelta);
    public void setTargetsDelta(final List<ItemShippingTarget> targetsDelta);

    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl of(){
        return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
    }
    

    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl of(final MyCartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl instance = new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setTargetsDelta(template.getTargetsDelta());
        return instance;
    }

    default <T> T withMyCartApplyDeltaToLineItemShippingDetailsTargetsAction(Function<MyCartApplyDeltaToLineItemShippingDetailsTargetsAction, T> helper) {
        return helper.apply(this);
    }
}
