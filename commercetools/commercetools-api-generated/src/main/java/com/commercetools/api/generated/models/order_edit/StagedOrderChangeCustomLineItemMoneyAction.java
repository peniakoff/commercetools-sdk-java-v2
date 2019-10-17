package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeCustomLineItemMoneyActionImpl;

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
@JsonDeserialize(as = StagedOrderChangeCustomLineItemMoneyActionImpl.class)
public interface StagedOrderChangeCustomLineItemMoneyAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @NotNull
   @Valid
   @JsonProperty("money")
   public Money getMoney();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setMoney(final Money money);
   
   public static StagedOrderChangeCustomLineItemMoneyActionImpl of(){
      return new StagedOrderChangeCustomLineItemMoneyActionImpl();
   }
   

   public static StagedOrderChangeCustomLineItemMoneyActionImpl of(final StagedOrderChangeCustomLineItemMoneyAction template) {
      StagedOrderChangeCustomLineItemMoneyActionImpl instance = new StagedOrderChangeCustomLineItemMoneyActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setMoney(template.getMoney());
      return instance;
   }

}