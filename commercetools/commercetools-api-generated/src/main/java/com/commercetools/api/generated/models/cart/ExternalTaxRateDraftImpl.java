package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.tax_category.SubRate;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class ExternalTaxRateDraftImpl implements ExternalTaxRateDraft {

   private String country;
   
   private Integer amount;
   
   private Boolean includedInPrice;
   
   private String name;
   
   private String state;
   
   private java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates;

   @JsonCreator
   ExternalTaxRateDraftImpl(@JsonProperty("country") final String country, @JsonProperty("amount") final Integer amount, @JsonProperty("includedInPrice") final Boolean includedInPrice, @JsonProperty("name") final String name, @JsonProperty("state") final String state, @JsonProperty("subRates") final java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates) {
      this.country = country;
      this.amount = amount;
      this.includedInPrice = includedInPrice;
      this.name = name;
      this.state = state;
      this.subRates = subRates;
   }
   public ExternalTaxRateDraftImpl() {
      
   }
   
   
   public String getCountry(){
      return this.country;
   }
   
   
   public Integer getAmount(){
      return this.amount;
   }
   
   
   public Boolean getIncludedInPrice(){
      return this.includedInPrice;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public String getState(){
      return this.state;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> getSubRates(){
      return this.subRates;
   }

   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setAmount(final Integer amount){
      this.amount = amount;
   }
   
   public void setIncludedInPrice(final Boolean includedInPrice){
      this.includedInPrice = includedInPrice;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setState(final String state){
      this.state = state;
   }
   
   public void setSubRates(final java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates){
      this.subRates = subRates;
   }

}