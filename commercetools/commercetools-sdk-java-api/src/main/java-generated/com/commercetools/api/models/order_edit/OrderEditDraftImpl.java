package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
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
public final class OrderEditDraftImpl implements OrderEditDraft {

    private String key;
    
    private com.commercetools.api.models.order.OrderReference resource;
    
    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    private String comment;
    
    private Boolean dryRun;

    @JsonCreator
    OrderEditDraftImpl(@JsonProperty("key") final String key, @JsonProperty("resource") final com.commercetools.api.models.order.OrderReference resource, @JsonProperty("stagedActions") final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("comment") final String comment, @JsonProperty("dryRun") final Boolean dryRun) {
        this.key = key;
        this.resource = resource;
        this.stagedActions = stagedActions;
        this.custom = custom;
        this.comment = comment;
        this.dryRun = dryRun;
    }
    public OrderEditDraftImpl() {
       
    }

    /**
    *  <p>Unique identifier for this edit.</p>
    */
    public String getKey(){
        return this.key;
    }
    
    /**
    *  <p>The order to be updated with this edit.</p>
    */
    public com.commercetools.api.models.order.OrderReference getResource(){
        return this.resource;
    }
    
    /**
    *  <p>The actions to apply to <code>resource</code>.</p>
    */
    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions(){
        return this.stagedActions;
    }
    
    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    /**
    *  <p>This field can be used to add additional textual information regarding the edit.</p>
    */
    public String getComment(){
        return this.comment;
    }
    
    /**
    *  <p>When set to <code>true</code> the edit is applied on the Order without persisting it.</p>
    */
    public Boolean getDryRun(){
        return this.dryRun;
    }

    public void setKey(final String key){
        this.key = key;
    }
    
    public void setResource(final com.commercetools.api.models.order.OrderReference resource){
        this.resource = resource;
    }
    
    public void setStagedActions(final com.commercetools.api.models.order.StagedOrderUpdateAction ...stagedActions){
       this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
    }
    
    public void setStagedActions(final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions){
       this.stagedActions = stagedActions;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    public void setComment(final String comment){
        this.comment = comment;
    }
    
    public void setDryRun(final Boolean dryRun){
        this.dryRun = dryRun;
    }

}
