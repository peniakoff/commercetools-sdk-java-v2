package com.commercetools.api.models.order;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.OrderUpdateAction;
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
public final class OrderSetParcelItemsActionImpl implements OrderSetParcelItemsAction {

    private String action;
    
    private String parcelId;
    
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    @JsonCreator
    OrderSetParcelItemsActionImpl(@JsonProperty("parcelId") final String parcelId, @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.parcelId = parcelId;
        this.items = items;
        this.action = "setParcelItems";
    }
    public OrderSetParcelItemsActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getParcelId(){
        return this.parcelId;
    }
    
    
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
        return this.items;
    }

    public void setParcelId(final String parcelId){
        this.parcelId = parcelId;
    }
    
    public void setItems(final com.commercetools.api.models.order.DeliveryItem ...items){
       this.items = new ArrayList<>(Arrays.asList(items));
    }
    
    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items){
       this.items = items;
    }

}
