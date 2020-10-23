package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderImportLineItemStateActionImpl;

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
@JsonDeserialize(as = OrderImportLineItemStateActionImpl.class)
public interface OrderImportLineItemStateAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    public void setLineItemId(final String lineItemId);
    
    public void setState(final List<ItemState> state);

    public static OrderImportLineItemStateActionImpl of(){
        return new OrderImportLineItemStateActionImpl();
    }
    

    public static OrderImportLineItemStateActionImpl of(final OrderImportLineItemStateAction template) {
        OrderImportLineItemStateActionImpl instance = new OrderImportLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setState(template.getState());
        return instance;
    }

    default <T> T withOrderImportLineItemStateAction(Function<OrderImportLineItemStateAction, T> helper) {
        return helper.apply(this);
    }
}
