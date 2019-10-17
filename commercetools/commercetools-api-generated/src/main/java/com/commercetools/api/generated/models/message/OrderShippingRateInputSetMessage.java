package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.ShippingRateInput;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.OrderShippingRateInputSetMessageImpl;

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
@JsonDeserialize(as = OrderShippingRateInputSetMessageImpl.class)
public interface OrderShippingRateInputSetMessage extends Message {

   
   @Valid
   @JsonProperty("shippingRateInput")
   public ShippingRateInput getShippingRateInput();
   
   @Valid
   @JsonProperty("oldShippingRateInput")
   public ShippingRateInput getOldShippingRateInput();

   public void setShippingRateInput(final ShippingRateInput shippingRateInput);
   
   public void setOldShippingRateInput(final ShippingRateInput oldShippingRateInput);
   
   public static OrderShippingRateInputSetMessageImpl of(){
      return new OrderShippingRateInputSetMessageImpl();
   }
   

   public static OrderShippingRateInputSetMessageImpl of(final OrderShippingRateInputSetMessage template) {
      OrderShippingRateInputSetMessageImpl instance = new OrderShippingRateInputSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setShippingRateInput(template.getShippingRateInput());
      instance.setOldShippingRateInput(template.getOldShippingRateInput());
      return instance;
   }

}