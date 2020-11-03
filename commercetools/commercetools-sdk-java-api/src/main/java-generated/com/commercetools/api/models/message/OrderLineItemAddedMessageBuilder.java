package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.OrderLineItemAddedMessage;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderLineItemAddedMessageBuilder {

    
    private String id;
    
    
    private Long version;
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    private Long sequenceNumber;
    
    
    private com.commercetools.api.models.common.Reference resource;
    
    
    private Long resourceVersion;
    
    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    
    private com.commercetools.api.models.cart.LineItem lineItem;
    
    
    private Long addedQuantity;

    public OrderLineItemAddedMessageBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder sequenceNumber( final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder resourceVersion( final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder lineItem( final com.commercetools.api.models.cart.LineItem lineItem) {
        this.lineItem = lineItem;
        return this;
    }
    
    public OrderLineItemAddedMessageBuilder addedQuantity( final Long addedQuantity) {
        this.addedQuantity = addedQuantity;
        return this;
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }
    
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    
    public Long getResourceVersion(){
        return this.resourceVersion;
    }
    
    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }
    
    
    public com.commercetools.api.models.cart.LineItem getLineItem(){
        return this.lineItem;
    }
    
    
    public Long getAddedQuantity(){
        return this.addedQuantity;
    }

    public OrderLineItemAddedMessage build() {
        return new OrderLineItemAddedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItem, addedQuantity);
    }

    public static OrderLineItemAddedMessageBuilder of() {
        return new OrderLineItemAddedMessageBuilder();
    }

    public static OrderLineItemAddedMessageBuilder of(final OrderLineItemAddedMessage template) {
        OrderLineItemAddedMessageBuilder builder = new OrderLineItemAddedMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.lineItem = template.getLineItem();
        builder.addedQuantity = template.getAddedQuantity();
        return builder;
    }

}
