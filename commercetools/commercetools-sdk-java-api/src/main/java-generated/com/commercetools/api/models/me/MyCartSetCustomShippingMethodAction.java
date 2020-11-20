package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.me.MyCartSetCustomShippingMethodActionImpl;

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
@JsonDeserialize(as = MyCartSetCustomShippingMethodActionImpl.class)
public interface MyCartSetCustomShippingMethodAction extends MyCartUpdateAction {

    
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();
    
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();
    
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();
    
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setShippingMethodName(final String shippingMethodName);
    
    public void setShippingRate(final ShippingRateDraft shippingRate);
    
    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
    
    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static MyCartSetCustomShippingMethodActionImpl of(){
        return new MyCartSetCustomShippingMethodActionImpl();
    }
    

    public static MyCartSetCustomShippingMethodActionImpl of(final MyCartSetCustomShippingMethodAction template) {
        MyCartSetCustomShippingMethodActionImpl instance = new MyCartSetCustomShippingMethodActionImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    default <T> T withMyCartSetCustomShippingMethodAction(Function<MyCartSetCustomShippingMethodAction, T> helper) {
        return helper.apply(this);
    }
}