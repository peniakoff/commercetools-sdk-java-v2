package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.payment.PaymentMethodInfo;
import com.commercetools.api.models.payment.PaymentStatusDraft;
import com.commercetools.api.models.payment.TransactionDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
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
public final class PaymentDraftImpl implements PaymentDraft {

   private com.commercetools.api.models.common.Money amountAuthorized;

   private String anonymousId;

   private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   private String authorizedUntil;

   private String externalId;

   private java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions;

   private com.commercetools.api.models.common.Money amountPaid;

   private com.commercetools.api.models.common.Money amountRefunded;

   private com.commercetools.api.models.common.Money amountPlanned;

   private java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions;

   private String interfaceId;

   private String key;

   private com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus;

   private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

   @JsonCreator
   PaymentDraftImpl(@JsonProperty("amountAuthorized") final com.commercetools.api.models.common.Money amountAuthorized, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("paymentMethodInfo") final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("authorizedUntil") final String authorizedUntil, @JsonProperty("externalId") final String externalId, @JsonProperty("transactions") final java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions, @JsonProperty("amountPaid") final com.commercetools.api.models.common.Money amountPaid, @JsonProperty("amountRefunded") final com.commercetools.api.models.common.Money amountRefunded, @JsonProperty("amountPlanned") final com.commercetools.api.models.common.Money amountPlanned, @JsonProperty("interfaceInteractions") final java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions, @JsonProperty("interfaceId") final String interfaceId, @JsonProperty("key") final String key, @JsonProperty("paymentStatus") final com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
      this.amountAuthorized = amountAuthorized;
      this.anonymousId = anonymousId;
      this.paymentMethodInfo = paymentMethodInfo;
      this.custom = custom;
      this.authorizedUntil = authorizedUntil;
      this.externalId = externalId;
      this.transactions = transactions;
      this.amountPaid = amountPaid;
      this.amountRefunded = amountRefunded;
      this.amountPlanned = amountPlanned;
      this.interfaceInteractions = interfaceInteractions;
      this.interfaceId = interfaceId;
      this.key = key;
      this.paymentStatus = paymentStatus;
      this.customer = customer;
   }
   public PaymentDraftImpl() {

   }


   public com.commercetools.api.models.common.Money getAmountAuthorized(){
      return this.amountAuthorized;
   }

   /**
   *  <p>Identifies payments belonging to an anonymous session (the customer has not signed up/in yet).</p>
   */
   public String getAnonymousId(){
      return this.anonymousId;
   }


   public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }


   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }


   public String getAuthorizedUntil(){
      return this.authorizedUntil;
   }


   public String getExternalId(){
      return this.externalId;
   }

   /**
   *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
   */
   public java.util.List<com.commercetools.api.models.payment.TransactionDraft> getTransactions(){
      return this.transactions;
   }


   public com.commercetools.api.models.common.Money getAmountPaid(){
      return this.amountPaid;
   }


   public com.commercetools.api.models.common.Money getAmountRefunded(){
      return this.amountRefunded;
   }

   /**
   *  <p>How much money this payment intends to receive from the customer.
   *  The value usually matches the cart or order gross total.</p>
   */
   public com.commercetools.api.models.common.Money getAmountPlanned(){
      return this.amountPlanned;
   }

   /**
   *  <p>Interface interactions can be requests send to the PSP, responses received from the PSP or notifications received from the PSP.
   *  Some interactions may result in a transaction.
   *  If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction.
   *  Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
   */
   public java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> getInterfaceInteractions(){
      return this.interfaceInteractions;
   }

   /**
   *  <p>The identifier that is used by the interface that manages the payment (usually the PSP).
   *  Cannot be changed once it has been set.
   *  The combination of this ID and the PaymentMethodInfo <code>paymentInterface</code> must be unique.</p>
   */
   public String getInterfaceId(){
      return this.interfaceId;
   }

   /**
   *  <p>User-specific unique identifier for the payment (max.
   *  256 characters).</p>
   */
   public String getKey(){
      return this.key;
   }


   public com.commercetools.api.models.payment.PaymentStatusDraft getPaymentStatus(){
      return this.paymentStatus;
   }

   /**
   *  <p>A reference to the customer this payment belongs to.</p>
   */
   public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public void setAmountAuthorized(final com.commercetools.api.models.common.Money amountAuthorized){
      this.amountAuthorized = amountAuthorized;
   }

   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }

   public void setPaymentMethodInfo(final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo){
      this.paymentMethodInfo = paymentMethodInfo;
   }

   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

   public void setAuthorizedUntil(final String authorizedUntil){
      this.authorizedUntil = authorizedUntil;
   }

   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }

   public void setTransactions(final java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions){
      this.transactions = transactions;
   }

   public void setAmountPaid(final com.commercetools.api.models.common.Money amountPaid){
      this.amountPaid = amountPaid;
   }

   public void setAmountRefunded(final com.commercetools.api.models.common.Money amountRefunded){
      this.amountRefunded = amountRefunded;
   }

   public void setAmountPlanned(final com.commercetools.api.models.common.Money amountPlanned){
      this.amountPlanned = amountPlanned;
   }

   public void setInterfaceInteractions(final java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions){
      this.interfaceInteractions = interfaceInteractions;
   }

   public void setInterfaceId(final String interfaceId){
      this.interfaceId = interfaceId;
   }

   public void setKey(final String key){
      this.key = key;
   }

   public void setPaymentStatus(final com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus){
      this.paymentStatus = paymentStatus;
   }

   public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer){
      this.customer = customer;
   }

}