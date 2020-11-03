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
public final class MyCustomerSetLocaleActionImpl implements MyCustomerSetLocaleAction {

    private String action;
    
    private String locale;

    @JsonCreator
    MyCustomerSetLocaleActionImpl(@JsonProperty("locale") final String locale) {
        this.locale = locale;
        this.action = "setLocale";
    }
    public MyCustomerSetLocaleActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getLocale(){
        return this.locale;
    }

    public void setLocale(final String locale){
        this.locale = locale;
    }

}
