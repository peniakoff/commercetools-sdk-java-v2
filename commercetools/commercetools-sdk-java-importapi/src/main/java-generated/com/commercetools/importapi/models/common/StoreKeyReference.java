package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.StoreKeyReferenceImpl;

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
*  <p>References a store by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StoreKeyReferenceImpl.class)
public interface StoreKeyReference extends KeyReference {



    public static StoreKeyReferenceImpl of(){
        return new StoreKeyReferenceImpl();
    }
    

    public static StoreKeyReferenceImpl of(final StoreKeyReference template) {
        StoreKeyReferenceImpl instance = new StoreKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withStoreKeyReference(Function<StoreKeyReference, T> helper) {
        return helper.apply(this);
    }
}