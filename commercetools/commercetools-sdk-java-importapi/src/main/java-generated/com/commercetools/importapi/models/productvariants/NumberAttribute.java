package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.NumberAttributeImpl;

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

/**
*  <p>This type represents an attribute which value is a number.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = NumberAttributeImpl.class)
public interface NumberAttribute extends Attribute {

    
    @NotNull
    @JsonProperty("value")
    public Double getValue();

    public void setValue(final Double value);

    public static NumberAttributeImpl of(){
        return new NumberAttributeImpl();
    }
    

    public static NumberAttributeImpl of(final NumberAttribute template) {
        NumberAttributeImpl instance = new NumberAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withNumberAttribute(Function<NumberAttribute, T> helper) {
        return helper.apply(this);
    }
}