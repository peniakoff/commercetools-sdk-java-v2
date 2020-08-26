package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.cart.TaxedItemPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxedItemPriceBuilder {

    
    private com.commercetools.api.models.common.TypedMoney totalNet;
    
    
    private com.commercetools.api.models.common.TypedMoney totalGross;

    public TaxedItemPriceBuilder totalNet( final com.commercetools.api.models.common.TypedMoney totalNet) {
        this.totalNet = totalNet;
        return this;
    }
    
    public TaxedItemPriceBuilder totalGross( final com.commercetools.api.models.common.TypedMoney totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    
    public com.commercetools.api.models.common.TypedMoney getTotalNet(){
        return this.totalNet;
    }
    
    
    public com.commercetools.api.models.common.TypedMoney getTotalGross(){
        return this.totalGross;
    }

    public TaxedItemPrice build() {
        return new TaxedItemPriceImpl(totalNet, totalGross);
    }

    public static TaxedItemPriceBuilder of() {
        return new TaxedItemPriceBuilder();
    }

    public static TaxedItemPriceBuilder of(final TaxedItemPrice template) {
        TaxedItemPriceBuilder builder = new TaxedItemPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        return builder;
    }

}