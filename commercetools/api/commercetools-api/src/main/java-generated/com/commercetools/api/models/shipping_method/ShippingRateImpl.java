package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.shipping_method.ShippingRatePriceTier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingRateImpl implements ShippingRate {

    private com.commercetools.api.models.common.TypedMoney price;
    
    private com.commercetools.api.models.common.TypedMoney freeAbove;
    
    private Boolean isMatching;
    
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers;

    @JsonCreator
    ShippingRateImpl(@JsonProperty("price") final com.commercetools.api.models.common.TypedMoney price, @JsonProperty("freeAbove") final com.commercetools.api.models.common.TypedMoney freeAbove, @JsonProperty("isMatching") final Boolean isMatching, @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.price = price;
        this.freeAbove = freeAbove;
        this.isMatching = isMatching;
        this.tiers = tiers;
    }
    public ShippingRateImpl() {
       
    }

    
    public com.commercetools.api.models.common.TypedMoney getPrice(){
        return this.price;
    }
    
    /**
    *  <p>The shipping is free if the order total (the sum of line item prices) exceeds the <code>freeAbove</code> value.
    *  Note: <code>freeAbove</code> applies before any Cart or Product discounts, and can cause discounts to apply in invalid scenarios.
    *  Use a Cart Discount to set the shipping price to 0 to avoid providing free shipping in invalid discount scenarios.</p>
    */
    public com.commercetools.api.models.common.TypedMoney getFreeAbove(){
        return this.freeAbove;
    }
    
    /**
    *  <p>Only appears in response to requests for shipping methods by cart or location to mark this shipping rate as one that matches the cart or location.</p>
    */
    public Boolean getIsMatching(){
        return this.isMatching;
    }
    
    /**
    *  <p>A list of shipping rate price tiers.</p>
    */
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> getTiers(){
        return this.tiers;
    }

    public void setPrice(final com.commercetools.api.models.common.TypedMoney price){
        this.price = price;
    }
    
    public void setFreeAbove(final com.commercetools.api.models.common.TypedMoney freeAbove){
        this.freeAbove = freeAbove;
    }
    
    public void setIsMatching(final Boolean isMatching){
        this.isMatching = isMatching;
    }
    
    public void setTiers(final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers){
        this.tiers = tiers;
    }

}