package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order.OrderTransitionCustomLineItemStateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderTransitionCustomLineItemStateActionBuilder {

    
    private String customLineItemId;
    
    
    private Long quantity;
    
    
    private com.commercetools.api.models.state.StateResourceIdentifier fromState;
    
    
    private com.commercetools.api.models.state.StateResourceIdentifier toState;
    
    @Nullable
    private java.time.ZonedDateTime actualTransitionDate;

    public OrderTransitionCustomLineItemStateActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    public OrderTransitionCustomLineItemStateActionBuilder quantity( final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    public OrderTransitionCustomLineItemStateActionBuilder fromState( final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
        return this;
    }
    
    public OrderTransitionCustomLineItemStateActionBuilder toState( final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
        return this;
    }
    
    public OrderTransitionCustomLineItemStateActionBuilder actualTransitionDate(@Nullable final java.time.ZonedDateTime actualTransitionDate) {
        this.actualTransitionDate = actualTransitionDate;
        return this;
    }

    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    
    public com.commercetools.api.models.state.StateResourceIdentifier getFromState(){
        return this.fromState;
    }
    
    
    public com.commercetools.api.models.state.StateResourceIdentifier getToState(){
        return this.toState;
    }
    
    @Nullable
    public java.time.ZonedDateTime getActualTransitionDate(){
        return this.actualTransitionDate;
    }

    public OrderTransitionCustomLineItemStateAction build() {
        return new OrderTransitionCustomLineItemStateActionImpl(customLineItemId, quantity, fromState, toState, actualTransitionDate);
    }

    public static OrderTransitionCustomLineItemStateActionBuilder of() {
        return new OrderTransitionCustomLineItemStateActionBuilder();
    }

    public static OrderTransitionCustomLineItemStateActionBuilder of(final OrderTransitionCustomLineItemStateAction template) {
        OrderTransitionCustomLineItemStateActionBuilder builder = new OrderTransitionCustomLineItemStateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        builder.actualTransitionDate = template.getActualTransitionDate();
        return builder;
    }

}
