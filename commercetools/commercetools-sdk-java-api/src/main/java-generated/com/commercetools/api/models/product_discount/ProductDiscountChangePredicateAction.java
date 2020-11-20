package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangePredicateActionImpl;

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
@JsonDeserialize(as = ProductDiscountChangePredicateActionImpl.class)
public interface ProductDiscountChangePredicateAction extends ProductDiscountUpdateAction {

    /**
    *  <p>A valid ProductDiscount Predicate.</p>
    */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    public void setPredicate(final String predicate);

    public static ProductDiscountChangePredicateActionImpl of(){
        return new ProductDiscountChangePredicateActionImpl();
    }
    

    public static ProductDiscountChangePredicateActionImpl of(final ProductDiscountChangePredicateAction template) {
        ProductDiscountChangePredicateActionImpl instance = new ProductDiscountChangePredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    default <T> T withProductDiscountChangePredicateAction(Function<ProductDiscountChangePredicateAction, T> helper) {
        return helper.apply(this);
    }
}