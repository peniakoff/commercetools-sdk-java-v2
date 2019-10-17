package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.ReturnItemDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order.OrderAddReturnInfoActionImpl;

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
@JsonDeserialize(as = OrderAddReturnInfoActionImpl.class)
public interface OrderAddReturnInfoAction extends OrderUpdateAction {

   
   
   @JsonProperty("returnTrackingId")
   public String getReturnTrackingId();
   
   @NotNull
   @Valid
   @JsonProperty("items")
   public List<ReturnItemDraft> getItems();
   
   
   @JsonProperty("returnDate")
   public ZonedDateTime getReturnDate();

   public void setReturnTrackingId(final String returnTrackingId);
   
   public void setItems(final List<ReturnItemDraft> items);
   
   public void setReturnDate(final ZonedDateTime returnDate);
   
   public static OrderAddReturnInfoActionImpl of(){
      return new OrderAddReturnInfoActionImpl();
   }
   

   public static OrderAddReturnInfoActionImpl of(final OrderAddReturnInfoAction template) {
      OrderAddReturnInfoActionImpl instance = new OrderAddReturnInfoActionImpl();
      instance.setReturnDate(template.getReturnDate());
      instance.setReturnTrackingId(template.getReturnTrackingId());
      instance.setItems(template.getItems());
      return instance;
   }

}