package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderSetShippingAddressActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = OrderSetShippingAddressActionImpl.class)
public interface OrderSetShippingAddressAction extends OrderUpdateAction {

   
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static OrderSetShippingAddressActionImpl of(){
      return new OrderSetShippingAddressActionImpl();
   }
   

   public static OrderSetShippingAddressActionImpl of(final OrderSetShippingAddressAction template) {
      OrderSetShippingAddressActionImpl instance = new OrderSetShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}