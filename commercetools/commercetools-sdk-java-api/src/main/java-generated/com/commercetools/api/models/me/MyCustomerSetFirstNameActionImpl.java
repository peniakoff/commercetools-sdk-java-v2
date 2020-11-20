package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
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
public final class MyCustomerSetFirstNameActionImpl implements MyCustomerSetFirstNameAction {

    private String action;
    
    private String firstName;

    @JsonCreator
    MyCustomerSetFirstNameActionImpl(@JsonProperty("firstName") final String firstName) {
        this.firstName = firstName;
        this.action = "setFirstName";
    }
    public MyCustomerSetFirstNameActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(final String firstName){
        this.firstName = firstName;
    }

}