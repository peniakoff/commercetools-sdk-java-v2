package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import java.time.ZonedDateTime;
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
public final class PaymentChangeTransactionTimestampActionImpl implements PaymentChangeTransactionTimestampAction {

    private String action;
    
    private String transactionId;
    
    private java.time.ZonedDateTime timestamp;

    @JsonCreator
    PaymentChangeTransactionTimestampActionImpl(@JsonProperty("transactionId") final String transactionId, @JsonProperty("timestamp") final java.time.ZonedDateTime timestamp) {
        this.transactionId = transactionId;
        this.timestamp = timestamp;
        this.action = "changeTransactionTimestamp";
    }
    public PaymentChangeTransactionTimestampActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getTransactionId(){
        return this.transactionId;
    }
    
    
    public java.time.ZonedDateTime getTimestamp(){
        return this.timestamp;
    }

    public void setTransactionId(final String transactionId){
        this.transactionId = transactionId;
    }
    
    public void setTimestamp(final java.time.ZonedDateTime timestamp){
        this.timestamp = timestamp;
    }

}