package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartOrigin;
import com.commercetools.api.generated.models.cart.CustomLineItemDraft;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.InventoryMode;
import com.commercetools.api.generated.models.cart.LineItemDraft;
import com.commercetools.api.generated.models.cart.RoundingMode;
import com.commercetools.api.generated.models.cart.ShippingRateInputDraft;
import com.commercetools.api.generated.models.cart.TaxCalculationMode;
import com.commercetools.api.generated.models.cart.TaxMode;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.generated.models.store.StoreResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.cart.CartDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDraftBuilder {
   
   @Nullable
   private String country;
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput;
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.CartOrigin origin;
   
   @Nullable
   private Long deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode;
   
   @Nullable
   private com.commercetools.api.generated.models.store.StoreResourceIdentifier store;
   
   @Nullable
   private String locale;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.InventoryMode inventoryMode;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.cart.LineItemDraft> lineItems;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> customLineItems;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.TaxMode taxMode;
   
   @Nullable
   private String customerEmail;
   
   @Nullable
   private String customerId;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address shippingAddress;
   
   
   private String currency;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address billingAddress;
   
   public CartDraftBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public CartDraftBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public CartDraftBuilder shippingRateInput(@Nullable final com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public CartDraftBuilder customerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public CartDraftBuilder origin(@Nullable final com.commercetools.api.generated.models.cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public CartDraftBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public CartDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public CartDraftBuilder shippingMethod(@Nullable final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   public CartDraftBuilder taxCalculationMode(@Nullable final com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   public CartDraftBuilder store(@Nullable final com.commercetools.api.generated.models.store.StoreResourceIdentifier store) {
      this.store = store;
      return this;
   }
   
   public CartDraftBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   public CartDraftBuilder externalTaxRateForShippingMethod(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod) {
      this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
      return this;
   }
   
   public CartDraftBuilder inventoryMode(@Nullable final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public CartDraftBuilder lineItems(@Nullable final java.util.List<com.commercetools.api.generated.models.cart.LineItemDraft> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public CartDraftBuilder taxRoundingMode(@Nullable final com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public CartDraftBuilder customLineItems(@Nullable final java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public CartDraftBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public CartDraftBuilder taxMode(@Nullable final com.commercetools.api.generated.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public CartDraftBuilder customerEmail(@Nullable final String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public CartDraftBuilder customerId(@Nullable final String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public CartDraftBuilder shippingAddress(@Nullable final com.commercetools.api.generated.models.common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public CartDraftBuilder currency( final String currency) {
      this.currency = currency;
      return this;
   }
   
   public CartDraftBuilder billingAddress(@Nullable final com.commercetools.api.generated.models.common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ShippingRateInputDraft getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   @Nullable
   public Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.store.StoreResourceIdentifier getStore(){
      return this.store;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod(){
      return this.externalTaxRateForShippingMethod;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.cart.LineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   @Nullable
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   @Nullable
   public String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   
   public String getCurrency(){
      return this.currency;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }

   public CartDraft build() {
       return new CartDraftImpl(country, anonymousId, shippingRateInput, customerGroup, origin, deleteDaysAfterLastModification, custom, shippingMethod, taxCalculationMode, store, locale, externalTaxRateForShippingMethod, inventoryMode, lineItems, taxRoundingMode, customLineItems, itemShippingAddresses, taxMode, customerEmail, customerId, shippingAddress, currency, billingAddress);
   }
   
   public static CartDraftBuilder of() {
      return new CartDraftBuilder();
   }
   
   public static CartDraftBuilder of(final CartDraft template) {
      CartDraftBuilder builder = new CartDraftBuilder();
      builder.country = template.getCountry();
      builder.anonymousId = template.getAnonymousId();
      builder.shippingRateInput = template.getShippingRateInput();
      builder.customerGroup = template.getCustomerGroup();
      builder.origin = template.getOrigin();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      builder.custom = template.getCustom();
      builder.shippingMethod = template.getShippingMethod();
      builder.taxCalculationMode = template.getTaxCalculationMode();
      builder.store = template.getStore();
      builder.locale = template.getLocale();
      builder.externalTaxRateForShippingMethod = template.getExternalTaxRateForShippingMethod();
      builder.inventoryMode = template.getInventoryMode();
      builder.lineItems = template.getLineItems();
      builder.taxRoundingMode = template.getTaxRoundingMode();
      builder.customLineItems = template.getCustomLineItems();
      builder.itemShippingAddresses = template.getItemShippingAddresses();
      builder.taxMode = template.getTaxMode();
      builder.customerEmail = template.getCustomerEmail();
      builder.customerId = template.getCustomerId();
      builder.shippingAddress = template.getShippingAddress();
      builder.currency = template.getCurrency();
      builder.billingAddress = template.getBillingAddress();
      return builder;
   }
   
}