package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.IronMqDestinationImpl;

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
@JsonDeserialize(as = IronMqDestinationImpl.class)
public interface IronMqDestination extends Destination {

    
    @NotNull
    @JsonProperty("uri")
    public String getUri();

    public void setUri(final String uri);

    public static IronMqDestinationImpl of(){
        return new IronMqDestinationImpl();
    }
    

    public static IronMqDestinationImpl of(final IronMqDestination template) {
        IronMqDestinationImpl instance = new IronMqDestinationImpl();
        instance.setUri(template.getUri());
        return instance;
    }

    default <T> T withIronMqDestination(Function<IronMqDestination, T> helper) {
        return helper.apply(this);
    }
}