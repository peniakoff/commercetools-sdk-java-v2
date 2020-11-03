package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeKeyActionImpl;

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
@JsonDeserialize(as = TypeChangeKeyActionImpl.class)
public interface TypeChangeKeyAction extends TypeUpdateAction {

    
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static TypeChangeKeyActionImpl of(){
        return new TypeChangeKeyActionImpl();
    }
    

    public static TypeChangeKeyActionImpl of(final TypeChangeKeyAction template) {
        TypeChangeKeyActionImpl instance = new TypeChangeKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withTypeChangeKeyAction(Function<TypeChangeKeyAction, T> helper) {
        return helper.apply(this);
    }
}
