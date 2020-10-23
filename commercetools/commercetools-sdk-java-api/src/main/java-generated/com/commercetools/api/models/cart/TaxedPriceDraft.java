package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.TypedMoneyDraft;
import com.commercetools.api.models.cart.TaxedPriceDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxedPriceDraftImpl.class)
public interface TaxedPriceDraft  {

    
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public TypedMoneyDraft getTotalNet();
    
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public TypedMoneyDraft getTotalGross();
    
    @NotNull
    @Valid
    @JsonProperty("taxPortions")
    public List<TaxPortionDraft> getTaxPortions();

    public void setTotalNet(final TypedMoneyDraft totalNet);
    
    public void setTotalGross(final TypedMoneyDraft totalGross);
    
    public void setTaxPortions(final List<TaxPortionDraft> taxPortions);

    public static TaxedPriceDraftImpl of(){
        return new TaxedPriceDraftImpl();
    }
    

    public static TaxedPriceDraftImpl of(final TaxedPriceDraft template) {
        TaxedPriceDraftImpl instance = new TaxedPriceDraftImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxPortions(template.getTaxPortions());
        return instance;
    }

    default <T> T withTaxedPriceDraft(Function<TaxedPriceDraft, T> helper) {
        return helper.apply(this);
    }
}
