package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.payment.PaymentReference;
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
public final class PaymentInfoImpl implements PaymentInfo {

   private java.util.List<com.commercetools.api.generated.models.payment.PaymentReference> payments;

   @JsonCreator
   PaymentInfoImpl(@JsonProperty("payments") final java.util.List<com.commercetools.api.generated.models.payment.PaymentReference> payments) {
      this.payments = payments;
   }
   public PaymentInfoImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.payment.PaymentReference> getPayments(){
      return this.payments;
   }

   public void setPayments(final java.util.List<com.commercetools.api.generated.models.payment.PaymentReference> payments){
      this.payments = payments;
   }

}