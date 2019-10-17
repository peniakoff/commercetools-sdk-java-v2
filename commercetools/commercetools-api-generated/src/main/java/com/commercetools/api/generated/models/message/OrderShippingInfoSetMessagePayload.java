package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.ShippingInfo;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderShippingInfoSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderShippingInfoSetMessagePayloadImpl.class)
public interface OrderShippingInfoSetMessagePayload extends MessagePayload {

   
   @Valid
   @JsonProperty("shippingInfo")
   public ShippingInfo getShippingInfo();
   
   @Valid
   @JsonProperty("oldShippingInfo")
   public ShippingInfo getOldShippingInfo();

   public void setShippingInfo(final ShippingInfo shippingInfo);
   
   public void setOldShippingInfo(final ShippingInfo oldShippingInfo);
   
   public static OrderShippingInfoSetMessagePayloadImpl of(){
      return new OrderShippingInfoSetMessagePayloadImpl();
   }
   

   public static OrderShippingInfoSetMessagePayloadImpl of(final OrderShippingInfoSetMessagePayload template) {
      OrderShippingInfoSetMessagePayloadImpl instance = new OrderShippingInfoSetMessagePayloadImpl();
      instance.setShippingInfo(template.getShippingInfo());
      instance.setOldShippingInfo(template.getOldShippingInfo());
      return instance;
   }

}