package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.OrderEditUpdateAction;
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
public final class OrderEditAddStagedActionActionImpl implements OrderEditAddStagedActionAction {

   private String action;
   
   private com.commercetools.api.generated.models.order.StagedOrderUpdateAction stagedAction;

   @JsonCreator
   OrderEditAddStagedActionActionImpl(@JsonProperty("stagedAction") final com.commercetools.api.generated.models.order.StagedOrderUpdateAction stagedAction) {
      this.stagedAction = stagedAction;
      this.action = "addStagedAction";
   }
   public OrderEditAddStagedActionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.order.StagedOrderUpdateAction getStagedAction(){
      return this.stagedAction;
   }

   public void setStagedAction(final com.commercetools.api.generated.models.order.StagedOrderUpdateAction stagedAction){
      this.stagedAction = stagedAction;
   }

}