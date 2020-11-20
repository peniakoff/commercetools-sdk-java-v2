package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.CustomerCompanyNameSetMessageImpl;

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
@JsonDeserialize(as = CustomerCompanyNameSetMessageImpl.class)
public interface CustomerCompanyNameSetMessage extends Message {

    
    @NotNull
    @JsonProperty("companyName")
    public String getCompanyName();

    public void setCompanyName(final String companyName);

    public static CustomerCompanyNameSetMessageImpl of(){
        return new CustomerCompanyNameSetMessageImpl();
    }
    

    public static CustomerCompanyNameSetMessageImpl of(final CustomerCompanyNameSetMessage template) {
        CustomerCompanyNameSetMessageImpl instance = new CustomerCompanyNameSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    default <T> T withCustomerCompanyNameSetMessage(Function<CustomerCompanyNameSetMessage, T> helper) {
        return helper.apply(this);
    }
}