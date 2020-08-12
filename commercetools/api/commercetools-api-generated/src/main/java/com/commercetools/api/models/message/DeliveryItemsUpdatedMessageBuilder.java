package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.message.DeliveryItemsUpdatedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryItemsUpdatedMessageBuilder {


   private java.time.ZonedDateTime createdAt;


   private java.time.ZonedDateTime lastModifiedAt;


   private String id;


   private Long version;

   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;

   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;


   private Long sequenceNumber;


   private com.commercetools.api.models.common.Reference resource;

   @Nullable
   private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;


   private Long resourceVersion;


   private String deliveryId;


   private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;


   private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

   public DeliveryItemsUpdatedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder oldItems( final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
      this.oldItems = oldItems;
      return this;
   }

   public DeliveryItemsUpdatedMessageBuilder items( final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
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

   @Nullable
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }

   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }


   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }


   public com.commercetools.api.models.common.Reference getResource(){
      return this.resource;
   }

   @Nullable
   public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }


   public Long getResourceVersion(){
      return this.resourceVersion;
   }


   public String getDeliveryId(){
      return this.deliveryId;
   }


   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems(){
      return this.oldItems;
   }


   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
      return this.items;
   }

   public DeliveryItemsUpdatedMessage build() {
       return new DeliveryItemsUpdatedMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, deliveryId, oldItems, items);
   }

   public static DeliveryItemsUpdatedMessageBuilder of() {
      return new DeliveryItemsUpdatedMessageBuilder();
   }

   public static DeliveryItemsUpdatedMessageBuilder of(final DeliveryItemsUpdatedMessage template) {
      DeliveryItemsUpdatedMessageBuilder builder = new DeliveryItemsUpdatedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.deliveryId = template.getDeliveryId();
      builder.oldItems = template.getOldItems();
      builder.items = template.getItems();
      return builder;
   }

}