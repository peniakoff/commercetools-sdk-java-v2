package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.message.OrderDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderDeletedMessagePayloadBuilder {

    
    private com.commercetools.api.models.order.Order order;

    public OrderDeletedMessagePayloadBuilder order( final com.commercetools.api.models.order.Order order) {
        this.order = order;
        return this;
    }

    
    public com.commercetools.api.models.order.Order getOrder(){
        return this.order;
    }

    public OrderDeletedMessagePayload build() {
        return new OrderDeletedMessagePayloadImpl(order);
    }

    public static OrderDeletedMessagePayloadBuilder of() {
        return new OrderDeletedMessagePayloadBuilder();
    }

    public static OrderDeletedMessagePayloadBuilder of(final OrderDeletedMessagePayload template) {
        OrderDeletedMessagePayloadBuilder builder = new OrderDeletedMessagePayloadBuilder();
        builder.order = template.getOrder();
        return builder;
    }

}
