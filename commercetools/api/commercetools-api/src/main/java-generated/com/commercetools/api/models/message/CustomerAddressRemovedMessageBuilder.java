package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.CustomerAddressRemovedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerAddressRemovedMessageBuilder {

    
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
    
    
    private com.commercetools.api.models.common.Address address;

    public CustomerAddressRemovedMessageBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    public CustomerAddressRemovedMessageBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    public CustomerAddressRemovedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    public CustomerAddressRemovedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    public CustomerAddressRemovedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    public CustomerAddressRemovedMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    public CustomerAddressRemovedMessageBuilder sequenceNumber( final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    
    public CustomerAddressRemovedMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }
    
    public CustomerAddressRemovedMessageBuilder resourceVersion( final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    
    public CustomerAddressRemovedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }
    
    public CustomerAddressRemovedMessageBuilder address( final com.commercetools.api.models.common.Address address) {
        this.address = address;
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
    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    public CustomerAddressRemovedMessage build() {
        return new CustomerAddressRemovedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, address);
    }

    public static CustomerAddressRemovedMessageBuilder of() {
        return new CustomerAddressRemovedMessageBuilder();
    }

    public static CustomerAddressRemovedMessageBuilder of(final CustomerAddressRemovedMessage template) {
        CustomerAddressRemovedMessageBuilder builder = new CustomerAddressRemovedMessageBuilder();
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
        builder.address = template.getAddress();
        return builder;
    }

}