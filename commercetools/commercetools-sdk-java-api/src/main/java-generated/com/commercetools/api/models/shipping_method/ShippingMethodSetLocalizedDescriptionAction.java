package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodSetLocalizedDescriptionActionImpl.class)
public interface ShippingMethodSetLocalizedDescriptionAction extends ShippingMethodUpdateAction {

    
    
    @JsonProperty("localizedDescription")
    public String getLocalizedDescription();

    public void setLocalizedDescription(final String localizedDescription);

    public static ShippingMethodSetLocalizedDescriptionActionImpl of(){
        return new ShippingMethodSetLocalizedDescriptionActionImpl();
    }
    

    public static ShippingMethodSetLocalizedDescriptionActionImpl of(final ShippingMethodSetLocalizedDescriptionAction template) {
        ShippingMethodSetLocalizedDescriptionActionImpl instance = new ShippingMethodSetLocalizedDescriptionActionImpl();
        instance.setLocalizedDescription(template.getLocalizedDescription());
        return instance;
    }

}