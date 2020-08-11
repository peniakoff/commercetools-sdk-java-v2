package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.OrderCustomerGroupSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderCustomerGroupSetMessageBuilder {


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

   @Nullable
   private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

   @Nullable
   private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

   public OrderCustomerGroupSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder oldCustomerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
      this.oldCustomerGroup = oldCustomerGroup;
      return this;
   }

   public OrderCustomerGroupSetMessageBuilder customerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
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

   @Nullable
   public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
      return this.oldCustomerGroup;
   }

   @Nullable
   public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }

   public OrderCustomerGroupSetMessage build() {
       return new OrderCustomerGroupSetMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, oldCustomerGroup, customerGroup);
   }

   public static OrderCustomerGroupSetMessageBuilder of() {
      return new OrderCustomerGroupSetMessageBuilder();
   }

   public static OrderCustomerGroupSetMessageBuilder of(final OrderCustomerGroupSetMessage template) {
      OrderCustomerGroupSetMessageBuilder builder = new OrderCustomerGroupSetMessageBuilder();
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
      builder.oldCustomerGroup = template.getOldCustomerGroup();
      builder.customerGroup = template.getCustomerGroup();
      return builder;
   }

}
