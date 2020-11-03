package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderShippingRateInputSetMessagePayloadBuilder {

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;
    
    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInput oldShippingRateInput;

    public OrderShippingRateInputSetMessagePayloadBuilder shippingRateInput(@Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }
    
    public OrderShippingRateInputSetMessagePayloadBuilder oldShippingRateInput(@Nullable final com.commercetools.api.models.cart.ShippingRateInput oldShippingRateInput) {
        this.oldShippingRateInput = oldShippingRateInput;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput(){
        return this.shippingRateInput;
    }
    
    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getOldShippingRateInput(){
        return this.oldShippingRateInput;
    }

    public OrderShippingRateInputSetMessagePayload build() {
        return new OrderShippingRateInputSetMessagePayloadImpl(shippingRateInput, oldShippingRateInput);
    }

    public static OrderShippingRateInputSetMessagePayloadBuilder of() {
        return new OrderShippingRateInputSetMessagePayloadBuilder();
    }

    public static OrderShippingRateInputSetMessagePayloadBuilder of(final OrderShippingRateInputSetMessagePayload template) {
        OrderShippingRateInputSetMessagePayloadBuilder builder = new OrderShippingRateInputSetMessagePayloadBuilder();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.oldShippingRateInput = template.getOldShippingRateInput();
        return builder;
    }

}
