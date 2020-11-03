package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
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
public final class GoogleCloudPubSubDestinationImpl implements GoogleCloudPubSubDestination {

    private String type;
    
    private String projectId;
    
    private String topic;

    @JsonCreator
    GoogleCloudPubSubDestinationImpl(@JsonProperty("projectId") final String projectId, @JsonProperty("topic") final String topic) {
        this.projectId = projectId;
        this.topic = topic;
        this.type = "GoogleCloudPubSub";
    }
    public GoogleCloudPubSubDestinationImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getProjectId(){
        return this.projectId;
    }
    
    
    public String getTopic(){
        return this.topic;
    }

    public void setProjectId(final String projectId){
        this.projectId = projectId;
    }
    
    public void setTopic(final String topic){
        this.topic = topic;
    }

}
