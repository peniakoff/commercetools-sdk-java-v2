package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderChangeOrderStateActionImpl;

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
@JsonDeserialize(as = OrderChangeOrderStateActionImpl.class)
public interface OrderChangeOrderStateAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    public void setOrderState(final OrderState orderState);

    public static OrderChangeOrderStateActionImpl of(){
        return new OrderChangeOrderStateActionImpl();
    }
    

    public static OrderChangeOrderStateActionImpl of(final OrderChangeOrderStateAction template) {
        OrderChangeOrderStateActionImpl instance = new OrderChangeOrderStateActionImpl();
        instance.setOrderState(template.getOrderState());
        return instance;
    }

    default <T> T withOrderChangeOrderStateAction(Function<OrderChangeOrderStateAction, T> helper) {
        return helper.apply(this);
    }
}
