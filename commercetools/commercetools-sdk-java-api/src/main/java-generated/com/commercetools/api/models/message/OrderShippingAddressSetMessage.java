package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.OrderShippingAddressSetMessageImpl;

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
@JsonDeserialize(as = OrderShippingAddressSetMessageImpl.class)
public interface OrderShippingAddressSetMessage extends Message {

    
    @Valid
    @JsonProperty("address")
    public Address getAddress();
    
    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    public void setAddress(final Address address);
    
    public void setOldAddress(final Address oldAddress);

    public static OrderShippingAddressSetMessageImpl of(){
        return new OrderShippingAddressSetMessageImpl();
    }
    

    public static OrderShippingAddressSetMessageImpl of(final OrderShippingAddressSetMessage template) {
        OrderShippingAddressSetMessageImpl instance = new OrderShippingAddressSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    default <T> T withOrderShippingAddressSetMessage(Function<OrderShippingAddressSetMessage, T> helper) {
        return helper.apply(this);
    }
}
