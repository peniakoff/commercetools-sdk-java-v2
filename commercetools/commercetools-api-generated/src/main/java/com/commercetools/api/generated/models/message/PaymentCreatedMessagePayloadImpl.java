package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.payment.Payment;
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
public final class PaymentCreatedMessagePayloadImpl implements PaymentCreatedMessagePayload {

   private String type;
   
   private com.commercetools.api.generated.models.payment.Payment payment;

   @JsonCreator
   PaymentCreatedMessagePayloadImpl(@JsonProperty("payment") final com.commercetools.api.generated.models.payment.Payment payment) {
      this.payment = payment;
      this.type = "PaymentCreated";
   }
   public PaymentCreatedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.payment.Payment getPayment(){
      return this.payment;
   }

   public void setPayment(final com.commercetools.api.generated.models.payment.Payment payment){
      this.payment = payment;
   }

}