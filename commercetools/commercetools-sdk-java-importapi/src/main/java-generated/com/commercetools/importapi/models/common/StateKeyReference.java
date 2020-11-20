package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.StateKeyReferenceImpl;

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
*  <p>References a state by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StateKeyReferenceImpl.class)
public interface StateKeyReference extends KeyReference {



    public static StateKeyReferenceImpl of(){
        return new StateKeyReferenceImpl();
    }
    

    public static StateKeyReferenceImpl of(final StateKeyReference template) {
        StateKeyReferenceImpl instance = new StateKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withStateKeyReference(Function<StateKeyReference, T> helper) {
        return helper.apply(this);
    }
}