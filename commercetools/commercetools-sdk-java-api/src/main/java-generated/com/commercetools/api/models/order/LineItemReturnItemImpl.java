package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnItem;
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
public final class LineItemReturnItemImpl implements LineItemReturnItem {

    private String id;
    
    private Long quantity;
    
    private String type;
    
    private String comment;
    
    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;
    
    private com.commercetools.api.models.order.ReturnPaymentState paymentState;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private java.time.ZonedDateTime createdAt;
    
    private String lineItemId;

    @JsonCreator
    LineItemReturnItemImpl(@JsonProperty("id") final String id, @JsonProperty("quantity") final Long quantity, @JsonProperty("comment") final String comment, @JsonProperty("shipmentState") final com.commercetools.api.models.order.ReturnShipmentState shipmentState, @JsonProperty("paymentState") final com.commercetools.api.models.order.ReturnPaymentState paymentState, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lineItemId") final String lineItemId) {
        this.id = id;
        this.quantity = quantity;
        this.comment = comment;
        this.shipmentState = shipmentState;
        this.paymentState = paymentState;
        this.lastModifiedAt = lastModifiedAt;
        this.createdAt = createdAt;
        this.lineItemId = lineItemId;
        this.type = "LineItemReturnItem";
    }
    public LineItemReturnItemImpl() {
       
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    
    public String getType(){
        return this.type;
    }
    
    
    public String getComment(){
        return this.comment;
    }
    
    
    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState(){
        return this.shipmentState;
    }
    
    
    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState(){
        return this.paymentState;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }
    
    public void setComment(final String comment){
        this.comment = comment;
    }
    
    public void setShipmentState(final com.commercetools.api.models.order.ReturnShipmentState shipmentState){
        this.shipmentState = shipmentState;
    }
    
    public void setPaymentState(final com.commercetools.api.models.order.ReturnPaymentState paymentState){
        this.paymentState = paymentState;
    }
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }

}