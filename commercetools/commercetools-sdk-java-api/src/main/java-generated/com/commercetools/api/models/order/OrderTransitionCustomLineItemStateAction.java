package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order.OrderTransitionCustomLineItemStateActionImpl;

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
@JsonDeserialize(as = OrderTransitionCustomLineItemStateActionImpl.class)
public interface OrderTransitionCustomLineItemStateAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();
    
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateResourceIdentifier getFromState();
    
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateResourceIdentifier getToState();
    
    
    @JsonProperty("actualTransitionDate")
    public ZonedDateTime getActualTransitionDate();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setQuantity(final Long quantity);
    
    public void setFromState(final StateResourceIdentifier fromState);
    
    public void setToState(final StateResourceIdentifier toState);
    
    public void setActualTransitionDate(final ZonedDateTime actualTransitionDate);

    public static OrderTransitionCustomLineItemStateActionImpl of(){
        return new OrderTransitionCustomLineItemStateActionImpl();
    }
    

    public static OrderTransitionCustomLineItemStateActionImpl of(final OrderTransitionCustomLineItemStateAction template) {
        OrderTransitionCustomLineItemStateActionImpl instance = new OrderTransitionCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    default <T> T withOrderTransitionCustomLineItemStateAction(Function<OrderTransitionCustomLineItemStateAction, T> helper) {
        return helper.apply(this);
    }
}
