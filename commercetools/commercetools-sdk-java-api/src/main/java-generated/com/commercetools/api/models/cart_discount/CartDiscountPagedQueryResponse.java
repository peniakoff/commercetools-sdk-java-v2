package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.cart_discount.CartDiscountPagedQueryResponseImpl;

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
@JsonDeserialize(as = CartDiscountPagedQueryResponseImpl.class)
public interface CartDiscountPagedQueryResponse  {

    
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();
    
    @NotNull
    @JsonProperty("count")
    public Long getCount();
    
    
    @JsonProperty("total")
    public Long getTotal();
    
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();
    
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<CartDiscount> getResults();

    public void setLimit(final Long limit);
    
    public void setCount(final Long count);
    
    public void setTotal(final Long total);
    
    public void setOffset(final Long offset);
    
    @JsonIgnore
    public void setResults(final CartDiscount ...results);
    public void setResults(final List<CartDiscount> results);

    public static CartDiscountPagedQueryResponseImpl of(){
        return new CartDiscountPagedQueryResponseImpl();
    }
    

    public static CartDiscountPagedQueryResponseImpl of(final CartDiscountPagedQueryResponse template) {
        CartDiscountPagedQueryResponseImpl instance = new CartDiscountPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    default <T> T withCartDiscountPagedQueryResponse(Function<CartDiscountPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}