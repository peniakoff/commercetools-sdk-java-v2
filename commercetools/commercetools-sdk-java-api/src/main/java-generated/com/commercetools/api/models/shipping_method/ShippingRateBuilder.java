package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.models.shipping_method.ShippingRate;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingRateBuilder {

    
    private com.commercetools.api.models.common.TypedMoney price;
    
    @Nullable
    private com.commercetools.api.models.common.TypedMoney freeAbove;
    
    @Nullable
    private Boolean isMatching;
    
    
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers;

    public ShippingRateBuilder price( final com.commercetools.api.models.common.TypedMoney price) {
        this.price = price;
        return this;
    }
    
    public ShippingRateBuilder freeAbove(@Nullable final com.commercetools.api.models.common.TypedMoney freeAbove) {
        this.freeAbove = freeAbove;
        return this;
    }
    
    public ShippingRateBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }
    
    public ShippingRateBuilder tiers( final com.commercetools.api.models.shipping_method.ShippingRatePriceTier ...tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }
    
    public ShippingRateBuilder tiers( final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    
    public com.commercetools.api.models.common.TypedMoney getPrice(){
        return this.price;
    }
    
    @Nullable
    public com.commercetools.api.models.common.TypedMoney getFreeAbove(){
        return this.freeAbove;
    }
    
    @Nullable
    public Boolean getIsMatching(){
        return this.isMatching;
    }
    
    
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> getTiers(){
        return this.tiers;
    }

    public ShippingRate build() {
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }

    public static ShippingRateBuilder of() {
        return new ShippingRateBuilder();
    }

    public static ShippingRateBuilder of(final ShippingRate template) {
        ShippingRateBuilder builder = new ShippingRateBuilder();
        builder.price = template.getPrice();
        builder.freeAbove = template.getFreeAbove();
        builder.isMatching = template.getIsMatching();
        builder.tiers = template.getTiers();
        return builder;
    }

}
