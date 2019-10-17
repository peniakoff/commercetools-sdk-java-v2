package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.InventoryMode;
import com.commercetools.api.generated.models.cart.TaxMode;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.me.MyLineItemDraft;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
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
public final class MyCartDraftImpl implements MyCartDraft {

   private java.util.List<com.commercetools.api.generated.models.me.MyLineItemDraft> lineItems;
   
   private String country;
   
   private java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses;
   
   private com.commercetools.api.generated.models.cart.TaxMode taxMode;
   
   private Long deleteDaysAfterLastModification;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   private String customerEmail;
   
   private com.commercetools.api.generated.models.common.Address shippingAddress;
   
   private String currency;
   
   private com.commercetools.api.generated.models.common.Address billingAddress;
   
   private String locale;
   
   private com.commercetools.api.generated.models.cart.InventoryMode inventoryMode;

   @JsonCreator
   MyCartDraftImpl(@JsonProperty("lineItems") final java.util.List<com.commercetools.api.generated.models.me.MyLineItemDraft> lineItems, @JsonProperty("country") final String country, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses, @JsonProperty("taxMode") final com.commercetools.api.generated.models.cart.TaxMode taxMode, @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("shippingMethod") final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("customerEmail") final String customerEmail, @JsonProperty("shippingAddress") final com.commercetools.api.generated.models.common.Address shippingAddress, @JsonProperty("currency") final String currency, @JsonProperty("billingAddress") final com.commercetools.api.generated.models.common.Address billingAddress, @JsonProperty("locale") final String locale, @JsonProperty("inventoryMode") final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode) {
      this.lineItems = lineItems;
      this.country = country;
      this.itemShippingAddresses = itemShippingAddresses;
      this.taxMode = taxMode;
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      this.custom = custom;
      this.shippingMethod = shippingMethod;
      this.customerEmail = customerEmail;
      this.shippingAddress = shippingAddress;
      this.currency = currency;
      this.billingAddress = billingAddress;
      this.locale = locale;
      this.inventoryMode = inventoryMode;
   }
   public MyCartDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.me.MyLineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public String getCountry(){
      return this.country;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public com.commercetools.api.generated.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }
   
   
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   /**
   	<p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   public String getCurrency(){
      return this.currency;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   
   public String getLocale(){
      return this.locale;
   }
   
   
   public com.commercetools.api.generated.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }

   public void setLineItems(final java.util.List<com.commercetools.api.generated.models.me.MyLineItemDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setTaxMode(final com.commercetools.api.generated.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }
   
   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification){
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setShippingMethod(final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod){
      this.shippingMethod = shippingMethod;
   }
   
   public void setCustomerEmail(final String customerEmail){
      this.customerEmail = customerEmail;
   }
   
   public void setShippingAddress(final com.commercetools.api.generated.models.common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setCurrency(final String currency){
      this.currency = currency;
   }
   
   public void setBillingAddress(final com.commercetools.api.generated.models.common.Address billingAddress){
      this.billingAddress = billingAddress;
   }
   
   public void setLocale(final String locale){
      this.locale = locale;
   }
   
   public void setInventoryMode(final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }

}