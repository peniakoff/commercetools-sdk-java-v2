package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.OrderCustomerEmailSetMessageImpl;

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
@JsonDeserialize(as = OrderCustomerEmailSetMessageImpl.class)
public interface OrderCustomerEmailSetMessage extends Message {

    
    
    @JsonProperty("email")
    public String getEmail();
    
    
    @JsonProperty("oldEmail")
    public String getOldEmail();

    public void setEmail(final String email);
    
    public void setOldEmail(final String oldEmail);

    public static OrderCustomerEmailSetMessageImpl of(){
        return new OrderCustomerEmailSetMessageImpl();
    }
    

    public static OrderCustomerEmailSetMessageImpl of(final OrderCustomerEmailSetMessage template) {
        OrderCustomerEmailSetMessageImpl instance = new OrderCustomerEmailSetMessageImpl();
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
        instance.setEmail(template.getEmail());
        instance.setOldEmail(template.getOldEmail());
        return instance;
    }

    default <T> T withOrderCustomerEmailSetMessage(Function<OrderCustomerEmailSetMessage, T> helper) {
        return helper.apply(this);
    }
}