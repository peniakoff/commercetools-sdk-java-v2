package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.cart.CartSetShippingRateInputAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetShippingRateInputActionBuilder {

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    public CartSetShippingRateInputActionBuilder shippingRateInput(@Nullable final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput(){
        return this.shippingRateInput;
    }

    public CartSetShippingRateInputAction build() {
        return new CartSetShippingRateInputActionImpl(shippingRateInput);
    }

    public static CartSetShippingRateInputActionBuilder of() {
        return new CartSetShippingRateInputActionBuilder();
    }

    public static CartSetShippingRateInputActionBuilder of(final CartSetShippingRateInputAction template) {
        CartSetShippingRateInputActionBuilder builder = new CartSetShippingRateInputActionBuilder();
        builder.shippingRateInput = template.getShippingRateInput();
        return builder;
    }

}