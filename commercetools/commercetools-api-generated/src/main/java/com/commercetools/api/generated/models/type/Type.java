package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.type.FieldDefinition;
import com.commercetools.api.generated.models.type.ResourceTypeId;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.type.TypeImpl;

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
@JsonDeserialize(as = TypeImpl.class)
public interface Type extends LoggedResource {

   /**
   	<p>The unique ID of the type.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   	<p>The current version of the type.</p>
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
   /**
   	<p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   	<p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   /**
   	<p>Identifier for the type (max.
   	256 characters).</p>
   */
   @NotNull
   @JsonProperty("key")
   public String getKey();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   	
   */
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   /**
   	<p>Defines for which resource(s) the type is valid.</p>
   */
   @NotNull
   @JsonProperty("resourceTypeIds")
   public List<ResourceTypeId> getResourceTypeIds();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("fieldDefinitions")
   public List<FieldDefinition> getFieldDefinitions();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
   public void setKey(final String key);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setResourceTypeIds(final List<ResourceTypeId> resourceTypeIds);
   
   public void setFieldDefinitions(final List<FieldDefinition> fieldDefinitions);
   
   public static TypeImpl of(){
      return new TypeImpl();
   }
   

   public static TypeImpl of(final Type template) {
      TypeImpl instance = new TypeImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setName(template.getName());
      instance.setFieldDefinitions(template.getFieldDefinitions());
      instance.setDescription(template.getDescription());
      instance.setKey(template.getKey());
      instance.setResourceTypeIds(template.getResourceTypeIds());
      return instance;
   }

}