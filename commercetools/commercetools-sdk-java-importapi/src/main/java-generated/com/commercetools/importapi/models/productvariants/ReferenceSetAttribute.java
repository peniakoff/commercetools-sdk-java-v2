package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.ReferenceSetAttributeImpl;

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
*  <p>This type represents an attribute which value is a set of references.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReferenceSetAttributeImpl.class)
public interface ReferenceSetAttribute extends Attribute {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<KeyReference> getValue();

    @JsonIgnore
    public void setValue(final KeyReference ...value);
    public void setValue(final List<KeyReference> value);

    public static ReferenceSetAttributeImpl of(){
        return new ReferenceSetAttributeImpl();
    }
    

    public static ReferenceSetAttributeImpl of(final ReferenceSetAttribute template) {
        ReferenceSetAttributeImpl instance = new ReferenceSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withReferenceSetAttribute(Function<ReferenceSetAttribute, T> helper) {
        return helper.apply(this);
    }
}