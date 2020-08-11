package com.commercetools.api.models.message;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.message.Message;
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
public final class ProductRemovedFromCategoryMessageImpl implements ProductRemovedFromCategoryMessage {

   private java.time.ZonedDateTime createdAt;

   private java.time.ZonedDateTime lastModifiedAt;

   private String id;

   private Long version;

   private com.commercetools.api.models.common.CreatedBy createdBy;

   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

   private Long sequenceNumber;

   private com.commercetools.api.models.common.Reference resource;

   private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

   private Long resourceVersion;

   private String type;

   private Boolean staged;

   private com.commercetools.api.models.category.CategoryReference category;

   @JsonCreator
   ProductRemovedFromCategoryMessageImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("sequenceNumber") final Long sequenceNumber, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("resourceVersion") final Long resourceVersion, @JsonProperty("staged") final Boolean staged, @JsonProperty("category") final com.commercetools.api.models.category.CategoryReference category) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.sequenceNumber = sequenceNumber;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.resourceVersion = resourceVersion;
      this.staged = staged;
      this.category = category;
      this.type = "ProductRemovedFromCategory";
   }
   public ProductRemovedFromCategoryMessageImpl() {

   }


   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }


   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }


   public String getId(){
      return this.id;
   }


   public Long getVersion(){
      return this.version;
   }


   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }


   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }


   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }


   public com.commercetools.api.models.common.Reference getResource(){
      return this.resource;
   }


   public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }


   public Long getResourceVersion(){
      return this.resourceVersion;
   }


   public String getType(){
      return this.type;
   }


   public Boolean getStaged(){
      return this.staged;
   }


   public com.commercetools.api.models.category.CategoryReference getCategory(){
      return this.category;
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

   public void setSequenceNumber(final Long sequenceNumber){
      this.sequenceNumber = sequenceNumber;
   }

   public void setResource(final com.commercetools.api.models.common.Reference resource){
      this.resource = resource;
   }

   public void setResourceUserProvidedIdentifiers(final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }

   public void setResourceVersion(final Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }

   public void setCategory(final com.commercetools.api.models.category.CategoryReference category){
      this.category = category;
   }

}
