package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerAddShippingAddressIdActionImpl;

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
@JsonDeserialize(as = CustomerAddShippingAddressIdActionImpl.class)
public interface CustomerAddShippingAddressIdAction extends CustomerUpdateAction {


   @NotNull
   @JsonProperty("addressId")
   public String getAddressId();

   public void setAddressId(final String addressId);

   public static CustomerAddShippingAddressIdActionImpl of(){
      return new CustomerAddShippingAddressIdActionImpl();
   }


   public static CustomerAddShippingAddressIdActionImpl of(final CustomerAddShippingAddressIdAction template) {
      CustomerAddShippingAddressIdActionImpl instance = new CustomerAddShippingAddressIdActionImpl();
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}