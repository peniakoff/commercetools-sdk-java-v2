package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeDefinition;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeAttributeOrderActionImpl.class)
public interface ProductTypeChangeAttributeOrderAction extends ProductTypeUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<AttributeDefinition> getAttributes();

    @JsonIgnore
    public void setAttributes(final AttributeDefinition ...attributes);
    public void setAttributes(final List<AttributeDefinition> attributes);

    public static ProductTypeChangeAttributeOrderActionImpl of(){
        return new ProductTypeChangeAttributeOrderActionImpl();
    }
    

    public static ProductTypeChangeAttributeOrderActionImpl of(final ProductTypeChangeAttributeOrderAction template) {
        ProductTypeChangeAttributeOrderActionImpl instance = new ProductTypeChangeAttributeOrderActionImpl();
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    default <T> T withProductTypeChangeAttributeOrderAction(Function<ProductTypeChangeAttributeOrderAction, T> helper) {
        return helper.apply(this);
    }
}