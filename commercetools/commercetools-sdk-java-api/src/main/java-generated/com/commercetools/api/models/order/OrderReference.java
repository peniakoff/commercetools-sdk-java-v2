package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderReferenceImpl;

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
@JsonDeserialize(as = OrderReferenceImpl.class)
public interface OrderReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public Order getObj();

    public void setObj(final Order obj);

    public static OrderReferenceImpl of(){
        return new OrderReferenceImpl();
    }
    

    public static OrderReferenceImpl of(final OrderReference template) {
        OrderReferenceImpl instance = new OrderReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    default <T> T withOrderReference(Function<OrderReference, T> helper) {
        return helper.apply(this);
    }
}