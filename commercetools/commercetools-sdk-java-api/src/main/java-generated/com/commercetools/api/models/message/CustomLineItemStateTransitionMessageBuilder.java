package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.state.StateReference;
import java.time.ZonedDateTime;
import com.commercetools.api.models.message.CustomLineItemStateTransitionMessage;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemStateTransitionMessageBuilder {

    
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
    
    
    private String customLineItemId;
    
    
    private java.time.ZonedDateTime transitionDate;
    
    
    private Long quantity;
    
    
    private com.commercetools.api.models.state.StateReference fromState;
    
    
    private com.commercetools.api.models.state.StateReference toState;

    public CustomLineItemStateTransitionMessageBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder sequenceNumber( final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder resourceVersion( final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder transitionDate( final java.time.ZonedDateTime transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder quantity( final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder fromState( final com.commercetools.api.models.state.StateReference fromState) {
        this.fromState = fromState;
        return this;
    }
    
    public CustomLineItemStateTransitionMessageBuilder toState( final com.commercetools.api.models.state.StateReference toState) {
        this.toState = toState;
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
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    
    public java.time.ZonedDateTime getTransitionDate(){
        return this.transitionDate;
    }
    
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    
    public com.commercetools.api.models.state.StateReference getFromState(){
        return this.fromState;
    }
    
    
    public com.commercetools.api.models.state.StateReference getToState(){
        return this.toState;
    }

    public CustomLineItemStateTransitionMessage build() {
        return new CustomLineItemStateTransitionMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customLineItemId, transitionDate, quantity, fromState, toState);
    }

    public static CustomLineItemStateTransitionMessageBuilder of() {
        return new CustomLineItemStateTransitionMessageBuilder();
    }

    public static CustomLineItemStateTransitionMessageBuilder of(final CustomLineItemStateTransitionMessage template) {
        CustomLineItemStateTransitionMessageBuilder builder = new CustomLineItemStateTransitionMessageBuilder();
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
        builder.customLineItemId = template.getCustomLineItemId();
        builder.transitionDate = template.getTransitionDate();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        return builder;
    }

}
