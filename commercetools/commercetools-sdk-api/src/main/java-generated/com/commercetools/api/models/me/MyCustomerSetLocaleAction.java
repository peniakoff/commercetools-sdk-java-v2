package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetLocaleActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerSetLocaleActionImpl.class)
public interface MyCustomerSetLocaleAction extends MyCustomerUpdateAction {

    
    
    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static MyCustomerSetLocaleActionImpl of(){
        return new MyCustomerSetLocaleActionImpl();
    }
    

    public static MyCustomerSetLocaleActionImpl of(final MyCustomerSetLocaleAction template) {
        MyCustomerSetLocaleActionImpl instance = new MyCustomerSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

}