package com.commercetools.api.models.me;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.payment.Transaction;
import com.commercetools.api.models.type.CustomFields;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentImpl implements MyPayment {

    private String id;
    
    private Long version;
    
    private com.commercetools.api.models.customer.CustomerReference customer;
    
    private String anonymousId;
    
    private com.commercetools.api.models.common.TypedMoney amountPlanned;
    
    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;
    
    private java.util.List<com.commercetools.api.models.payment.Transaction> transactions;
    
    private com.commercetools.api.models.type.CustomFields custom;

    @JsonCreator
    MyPaymentImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("amountPlanned") final com.commercetools.api.models.common.TypedMoney amountPlanned, @JsonProperty("paymentMethodInfo") final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("transactions") final java.util.List<com.commercetools.api.models.payment.Transaction> transactions, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.version = version;
        this.customer = customer;
        this.anonymousId = anonymousId;
        this.amountPlanned = amountPlanned;
        this.paymentMethodInfo = paymentMethodInfo;
        this.transactions = transactions;
        this.custom = custom;
    }
    public MyPaymentImpl() {
       
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
    *  <p>A reference to the customer this payment belongs to.</p>
    */
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }
    
    /**
    *  <p>Identifies payments belonging to an anonymous session (the customer has not signed up/in yet).</p>
    */
    public String getAnonymousId(){
        return this.anonymousId;
    }
    
    /**
    *  <p>How much money this payment intends to receive from the customer.
    *  The value usually matches the cart or order gross total.</p>
    */
    public com.commercetools.api.models.common.TypedMoney getAmountPlanned(){
        return this.amountPlanned;
    }
    
    
    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
        return this.paymentMethodInfo;
    }
    
    /**
    *  <p>A list of financial transactions of different TransactionTypes
    *  with different TransactionStates.</p>
    */
    public java.util.List<com.commercetools.api.models.payment.Transaction> getTransactions(){
        return this.transactions;
    }
    
    
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer){
        this.customer = customer;
    }
    
    public void setAnonymousId(final String anonymousId){
        this.anonymousId = anonymousId;
    }
    
    public void setAmountPlanned(final com.commercetools.api.models.common.TypedMoney amountPlanned){
        this.amountPlanned = amountPlanned;
    }
    
    public void setPaymentMethodInfo(final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo){
        this.paymentMethodInfo = paymentMethodInfo;
    }
    
    public void setTransactions(final com.commercetools.api.models.payment.Transaction ...transactions){
       this.transactions = new ArrayList<>(Arrays.asList(transactions));
    }
    
    public void setTransactions(final java.util.List<com.commercetools.api.models.payment.Transaction> transactions){
       this.transactions = transactions;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
        this.custom = custom;
    }

}
