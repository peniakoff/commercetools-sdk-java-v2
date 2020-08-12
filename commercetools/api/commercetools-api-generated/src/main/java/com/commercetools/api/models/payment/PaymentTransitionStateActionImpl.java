package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentTransitionStateActionImpl implements PaymentTransitionStateAction {

   private String action;

   private Boolean force;

   private com.commercetools.api.models.state.StateResourceIdentifier state;

   @JsonCreator
   PaymentTransitionStateActionImpl(@JsonProperty("force") final Boolean force, @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state) {
      this.force = force;
      this.state = state;
      this.action = "transitionState";
   }
   public PaymentTransitionStateActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public Boolean getForce(){
      return this.force;
   }


   public com.commercetools.api.models.state.StateResourceIdentifier getState(){
      return this.state;
   }

   public void setForce(final Boolean force){
      this.force = force;
   }

   public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state){
      this.state = state;
   }

}