package com.commercetools.api.models.zone;

import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.zone.Location;
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
public final class ZoneImpl implements Zone {

   private java.time.ZonedDateTime createdAt;

   private java.time.ZonedDateTime lastModifiedAt;

   private String id;

   private Long version;

   private com.commercetools.api.models.common.CreatedBy createdBy;

   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

   private String name;

   private String description;

   private java.util.List<com.commercetools.api.models.zone.Location> locations;

   private String key;

   @JsonCreator
   ZoneImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("name") final String name, @JsonProperty("description") final String description, @JsonProperty("locations") final java.util.List<com.commercetools.api.models.zone.Location> locations, @JsonProperty("key") final String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.name = name;
      this.description = description;
      this.locations = locations;
      this.key = key;
   }
   public ZoneImpl() {

   }


   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }


   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }

   /**
   *  <p>The unique ID of the zone.</p>
   */
   public String getId(){
      return this.id;
   }

   /**
   *  <p>The current version of the zone.</p>
   */
   public Long getVersion(){
      return this.version;
   }


   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }


   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }


   public String getName(){
      return this.name;
   }


   public String getDescription(){
      return this.description;
   }


   public java.util.List<com.commercetools.api.models.zone.Location> getLocations(){
      return this.locations;
   }

   /**
   *  <p>User-specific unique identifier for a zone.
   *  Must be unique across a project.
   *  The field can be reset using the Set Key UpdateAction.</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }

   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }

   public void setId(final String id){
      this.id = id;
   }

   public void setVersion(final Long version){
      this.version = version;
   }

   public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }

   public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }

   public void setName(final String name){
      this.name = name;
   }

   public void setDescription(final String description){
      this.description = description;
   }

   public void setLocations(final java.util.List<com.commercetools.api.models.zone.Location> locations){
      this.locations = locations;
   }

   public void setKey(final String key){
      this.key = key;
   }

}