package com.commercetools.api.models.order;

import com.commercetools.api.models.channel.ChannelReference;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SyncInfoImpl implements SyncInfo {

    private com.commercetools.api.models.channel.ChannelReference channel;
    
    private String externalId;
    
    private java.time.ZonedDateTime syncedAt;

    @JsonCreator
    SyncInfoImpl(@JsonProperty("channel") final com.commercetools.api.models.channel.ChannelReference channel, @JsonProperty("externalId") final String externalId, @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
        this.channel = channel;
        this.externalId = externalId;
        this.syncedAt = syncedAt;
    }
    public SyncInfoImpl() {
       
    }

    /**
    *  <p>Connection to a particular synchronization destination.</p>
    */
    public com.commercetools.api.models.channel.ChannelReference getChannel(){
        return this.channel;
    }
    
    /**
    *  <p>Can be used to reference an external order instance, file etc.</p>
    */
    public String getExternalId(){
        return this.externalId;
    }
    
    
    public java.time.ZonedDateTime getSyncedAt(){
        return this.syncedAt;
    }

    public void setChannel(final com.commercetools.api.models.channel.ChannelReference channel){
        this.channel = channel;
    }
    
    public void setExternalId(final String externalId){
        this.externalId = externalId;
    }
    
    public void setSyncedAt(final java.time.ZonedDateTime syncedAt){
        this.syncedAt = syncedAt;
    }

}
