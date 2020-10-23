package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.CartChangeLineItemQuantityActionImpl;

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
@JsonDeserialize(as = CartChangeLineItemQuantityActionImpl.class)
public interface CartChangeLineItemQuantityAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();
    
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();
    
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    public void setLineItemId(final String lineItemId);
    
    public void setQuantity(final Long quantity);
    
    public void setExternalPrice(final Money externalPrice);
    
    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public static CartChangeLineItemQuantityActionImpl of(){
        return new CartChangeLineItemQuantityActionImpl();
    }
    

    public static CartChangeLineItemQuantityActionImpl of(final CartChangeLineItemQuantityAction template) {
        CartChangeLineItemQuantityActionImpl instance = new CartChangeLineItemQuantityActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    default <T> T withCartChangeLineItemQuantityAction(Function<CartChangeLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }
}
