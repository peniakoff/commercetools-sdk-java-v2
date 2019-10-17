package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.ReturnShipmentState;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetReturnShipmentStateActionImpl implements OrderSetReturnShipmentStateAction {

   private String action;
   
   private com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState;
   
   private String returnItemId;

   @JsonCreator
   OrderSetReturnShipmentStateActionImpl(@JsonProperty("shipmentState") final com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState, @JsonProperty("returnItemId") final String returnItemId) {
      this.shipmentState = shipmentState;
      this.returnItemId = returnItemId;
      this.action = "setReturnShipmentState";
   }
   public OrderSetReturnShipmentStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public String getReturnItemId(){
      return this.returnItemId;
   }

   public void setShipmentState(final com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setReturnItemId(final String returnItemId){
      this.returnItemId = returnItemId;
   }

}