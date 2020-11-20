package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
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
public final class CustomerAddStoreActionImpl implements CustomerAddStoreAction {

    private String action;
    
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @JsonCreator
    CustomerAddStoreActionImpl(@JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        this.action = "addStore";
    }
    public CustomerAddStoreActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore(){
        return this.store;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store){
        this.store = store;
    }

}