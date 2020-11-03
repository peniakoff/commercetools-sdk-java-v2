package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeReferenceImpl;

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
@JsonDeserialize(as = ProductTypeReferenceImpl.class)
public interface ProductTypeReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public ProductType getObj();

    public void setObj(final ProductType obj);

    public static ProductTypeReferenceImpl of(){
        return new ProductTypeReferenceImpl();
    }
    

    public static ProductTypeReferenceImpl of(final ProductTypeReference template) {
        ProductTypeReferenceImpl instance = new ProductTypeReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    default <T> T withProductTypeReference(Function<ProductTypeReference, T> helper) {
        return helper.apply(this);
    }
}
