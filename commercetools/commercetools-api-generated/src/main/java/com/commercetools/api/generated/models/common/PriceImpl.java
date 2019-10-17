package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.common.DiscountedPrice;
import com.commercetools.api.generated.models.common.PriceTier;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.type.CustomFields;
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
public final class PriceImpl implements Price {

   private com.commercetools.api.generated.models.common.DiscountedPrice discounted;
   
   private String country;
   
   private java.util.List<com.commercetools.api.generated.models.common.PriceTier> tiers;
   
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private com.commercetools.api.generated.models.channel.ChannelReference channel;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.time.ZonedDateTime validFrom;
   
   private String id;
   
   private com.commercetools.api.generated.models.common.TypedMoney value;

   @JsonCreator
   PriceImpl(@JsonProperty("discounted") final com.commercetools.api.generated.models.common.DiscountedPrice discounted, @JsonProperty("country") final String country, @JsonProperty("tiers") final java.util.List<com.commercetools.api.generated.models.common.PriceTier> tiers, @JsonProperty("customerGroup") final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("channel") final com.commercetools.api.generated.models.channel.ChannelReference channel, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("id") final String id, @JsonProperty("value") final com.commercetools.api.generated.models.common.TypedMoney value) {
      this.discounted = discounted;
      this.country = country;
      this.tiers = tiers;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.channel = channel;
      this.validUntil = validUntil;
      this.validFrom = validFrom;
      this.id = id;
      this.value = value;
   }
   public PriceImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public String getCountry(){
      return this.country;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.PriceTier> getTiers(){
      return this.tiers;
   }
   
   
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getValue(){
      return this.value;
   }

   public void setDiscounted(final com.commercetools.api.generated.models.common.DiscountedPrice discounted){
      this.discounted = discounted;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setTiers(final java.util.List<com.commercetools.api.generated.models.common.PriceTier> tiers){
      this.tiers = tiers;
   }
   
   public void setCustomerGroup(final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setChannel(final com.commercetools.api.generated.models.channel.ChannelReference channel){
      this.channel = channel;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setValue(final com.commercetools.api.generated.models.common.TypedMoney value){
      this.value = value;
   }

}