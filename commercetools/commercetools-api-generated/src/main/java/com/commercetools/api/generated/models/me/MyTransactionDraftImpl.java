package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.payment.TransactionType;
import java.time.ZonedDateTime;
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
public final class MyTransactionDraftImpl implements MyTransactionDraft {

   private String interactionId;
   
   private com.commercetools.api.generated.models.common.Money amount;
   
   private com.commercetools.api.generated.models.payment.TransactionType type;
   
   private java.time.ZonedDateTime timestamp;

   @JsonCreator
   MyTransactionDraftImpl(@JsonProperty("interactionId") final String interactionId, @JsonProperty("amount") final com.commercetools.api.generated.models.common.Money amount, @JsonProperty("type") final com.commercetools.api.generated.models.payment.TransactionType type, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
      this.interactionId = interactionId;
      this.amount = amount;
      this.type = type;
      this.timestamp = timestamp;
   }
   public MyTransactionDraftImpl() {
      
   }
   
   
   public String getInteractionId(){
      return this.interactionId;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getAmount(){
      return this.amount;
   }
   
   
   public com.commercetools.api.generated.models.payment.TransactionType getType(){
      return this.type;
   }
   
   
   public java.time.ZonedDateTime getTimestamp(){
      return this.timestamp;
   }

   public void setInteractionId(final String interactionId){
      this.interactionId = interactionId;
   }
   
   public void setAmount(final com.commercetools.api.generated.models.common.Money amount){
      this.amount = amount;
   }
   
   public void setType(final com.commercetools.api.generated.models.payment.TransactionType type){
      this.type = type;
   }
   
   public void setTimestamp(final java.time.ZonedDateTime timestamp){
      this.timestamp = timestamp;
   }

}