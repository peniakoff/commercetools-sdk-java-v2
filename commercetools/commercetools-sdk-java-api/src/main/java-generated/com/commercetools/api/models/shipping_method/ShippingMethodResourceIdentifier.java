package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl;

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
@JsonDeserialize(as = ShippingMethodResourceIdentifierImpl.class)
public interface ShippingMethodResourceIdentifier extends ResourceIdentifier {



    public static ShippingMethodResourceIdentifierImpl of(){
        return new ShippingMethodResourceIdentifierImpl();
    }
    

    public static ShippingMethodResourceIdentifierImpl of(final ShippingMethodResourceIdentifier template) {
        ShippingMethodResourceIdentifierImpl instance = new ShippingMethodResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withShippingMethodResourceIdentifier(Function<ShippingMethodResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}