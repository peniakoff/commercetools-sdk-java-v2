package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.message.ParcelItemsUpdatedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelItemsUpdatedMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   
   private Long sequenceNumber;
   
   
   private com.commercetools.api.generated.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private Long resourceVersion;
   
   @Nullable
   private String deliveryId;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> oldItems;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   
   private String parcelId;
   
   public ParcelItemsUpdatedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder resource( final com.commercetools.api.generated.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder deliveryId(@Nullable final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder oldItems( final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> oldItems) {
      this.oldItems = oldItems;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder items( final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
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
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   @Nullable
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getOldItems(){
      return this.oldItems;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public ParcelItemsUpdatedMessage build() {
       return new ParcelItemsUpdatedMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, deliveryId, oldItems, items, parcelId);
   }
   
   public static ParcelItemsUpdatedMessageBuilder of() {
      return new ParcelItemsUpdatedMessageBuilder();
   }
   
   public static ParcelItemsUpdatedMessageBuilder of(final ParcelItemsUpdatedMessage template) {
      ParcelItemsUpdatedMessageBuilder builder = new ParcelItemsUpdatedMessageBuilder();
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
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}