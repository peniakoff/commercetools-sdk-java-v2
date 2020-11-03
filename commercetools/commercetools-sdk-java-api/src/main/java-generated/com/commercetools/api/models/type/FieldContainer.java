package com.commercetools.api.models.type;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.type.FieldContainerImpl;

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
@JsonDeserialize(as = FieldContainerImpl.class)
public interface FieldContainer  {

    
    @NotNull
    @JsonAnyGetter
    public Map<String, JsonNode> values();

    @JsonAnySetter
    public void setValue(String key, JsonNode value);

    public static FieldContainerImpl of(){
        return new FieldContainerImpl();
    }
    

    public static FieldContainerImpl of(final FieldContainer template) {
        FieldContainerImpl instance = new FieldContainerImpl();
        return instance;
    }

    default <T> T withFieldContainer(Function<FieldContainer, T> helper) {
        return helper.apply(this);
    }
}
