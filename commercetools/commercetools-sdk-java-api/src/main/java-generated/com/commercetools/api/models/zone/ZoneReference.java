package com.commercetools.api.models.zone;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.zone.Zone;
import com.commercetools.api.models.zone.ZoneReferenceImpl;

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
@JsonDeserialize(as = ZoneReferenceImpl.class)
public interface ZoneReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public Zone getObj();

    public void setObj(final Zone obj);

    public static ZoneReferenceImpl of(){
        return new ZoneReferenceImpl();
    }
    

    public static ZoneReferenceImpl of(final ZoneReference template) {
        ZoneReferenceImpl instance = new ZoneReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    default <T> T withZoneReference(Function<ZoneReference, T> helper) {
        return helper.apply(this);
    }
}
