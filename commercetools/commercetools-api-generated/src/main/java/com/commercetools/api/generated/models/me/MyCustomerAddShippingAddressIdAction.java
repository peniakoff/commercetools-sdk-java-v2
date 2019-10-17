package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerAddShippingAddressIdActionImpl;

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
@JsonDeserialize(as = MyCustomerAddShippingAddressIdActionImpl.class)
public interface MyCustomerAddShippingAddressIdAction extends MyCustomerUpdateAction {

   
   @NotNull
   @JsonProperty("addressId")
   public String getAddressId();

   public void setAddressId(final String addressId);
   
   public static MyCustomerAddShippingAddressIdActionImpl of(){
      return new MyCustomerAddShippingAddressIdActionImpl();
   }
   

   public static MyCustomerAddShippingAddressIdActionImpl of(final MyCustomerAddShippingAddressIdAction template) {
      MyCustomerAddShippingAddressIdActionImpl instance = new MyCustomerAddShippingAddressIdActionImpl();
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}