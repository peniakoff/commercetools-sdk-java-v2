package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.shipping_method.ZoneRate;
import com.commercetools.api.generated.models.tax_category.TaxCategoryReference;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodImpl.class)
public interface ShippingMethod extends LoggedResource {

   /**
   	<p>The unique ID of the shipping method.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   	<p>The current version of the shipping method.</p>
   */
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   /**
   	
   */
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   /**
   	
   */
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   /**
   	<p>User-specific unique identifier for the shipping method.</p>
   */
   
   @JsonProperty("key")
   public String getKey();
   /**
   	
   */
   @NotNull
   @JsonProperty("name")
   public String getName();
   /**
   	
   */
   
   @JsonProperty("description")
   public String getDescription();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryReference getTaxCategory();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("zoneRates")
   public List<ZoneRate> getZoneRates();
   /**
   	<p>One shipping method in a project can be default.</p>
   */
   @NotNull
   @JsonProperty("isDefault")
   public Boolean getIsDefault();
   /**
   	<p>A Cart predicate which can be used to more precisely select a shipping method for a cart.</p>
   */
   
   @JsonProperty("predicate")
   public String getPredicate();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
   public void setKey(final String key);
   
   public void setName(final String name);
   
   public void setDescription(final String description);
   
   public void setTaxCategory(final TaxCategoryReference taxCategory);
   
   public void setZoneRates(final List<ZoneRate> zoneRates);
   
   public void setIsDefault(final Boolean isDefault);
   
   public void setPredicate(final String predicate);
   
   public static ShippingMethodImpl of(){
      return new ShippingMethodImpl();
   }
   

   public static ShippingMethodImpl of(final ShippingMethod template) {
      ShippingMethodImpl instance = new ShippingMethodImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setZoneRates(template.getZoneRates());
      instance.setPredicate(template.getPredicate());
      instance.setIsDefault(template.getIsDefault());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setKey(template.getKey());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}