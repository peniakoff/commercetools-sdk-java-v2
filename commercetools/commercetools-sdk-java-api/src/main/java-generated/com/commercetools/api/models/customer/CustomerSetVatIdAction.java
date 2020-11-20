package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetVatIdActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetVatIdActionImpl.class)
public interface CustomerSetVatIdAction extends CustomerUpdateAction {

    /**
    *  <p>If not defined, the vat Id is unset.</p>
    */
    
    @JsonProperty("vatId")
    public String getVatId();

    public void setVatId(final String vatId);

    public static CustomerSetVatIdActionImpl of(){
        return new CustomerSetVatIdActionImpl();
    }
    

    public static CustomerSetVatIdActionImpl of(final CustomerSetVatIdAction template) {
        CustomerSetVatIdActionImpl instance = new CustomerSetVatIdActionImpl();
        instance.setVatId(template.getVatId());
        return instance;
    }

    default <T> T withCustomerSetVatIdAction(Function<CustomerSetVatIdAction, T> helper) {
        return helper.apply(this);
    }
}