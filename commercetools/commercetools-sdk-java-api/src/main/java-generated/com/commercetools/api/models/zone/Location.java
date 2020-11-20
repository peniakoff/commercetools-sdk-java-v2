package com.commercetools.api.models.zone;


import com.commercetools.api.models.zone.LocationImpl;

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
@JsonDeserialize(as = LocationImpl.class)
public interface Location  {

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    @NotNull
    @JsonProperty("country")
    public String getCountry();
    
    
    @JsonProperty("state")
    public String getState();

    public void setCountry(final String country);
    
    public void setState(final String state);

    public static LocationImpl of(){
        return new LocationImpl();
    }
    

    public static LocationImpl of(final Location template) {
        LocationImpl instance = new LocationImpl();
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        return instance;
    }

    default <T> T withLocation(Function<Location, T> helper) {
        return helper.apply(this);
    }
}