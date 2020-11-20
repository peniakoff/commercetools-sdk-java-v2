package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupUpdateImpl;

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
@JsonDeserialize(as = CustomerGroupUpdateImpl.class)
public interface CustomerGroupUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CustomerGroupUpdateAction> getActions();

    public void setVersion(final Long version);
    
    @JsonIgnore
    public void setActions(final CustomerGroupUpdateAction ...actions);
    public void setActions(final List<CustomerGroupUpdateAction> actions);

    public static CustomerGroupUpdateImpl of(){
        return new CustomerGroupUpdateImpl();
    }
    

    public static CustomerGroupUpdateImpl of(final CustomerGroupUpdate template) {
        CustomerGroupUpdateImpl instance = new CustomerGroupUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withCustomerGroupUpdate(Function<CustomerGroupUpdate, T> helper) {
        return helper.apply(this);
    }
}