package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.product.ProductSetTaxCategoryActionImpl;

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
@JsonDeserialize(as = ProductSetTaxCategoryActionImpl.class)
public interface ProductSetTaxCategoryAction extends ProductUpdateAction {

    /**
    *  <p>If left blank or set to <code>null</code>, the tax category is unset/removed.</p>
    */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public static ProductSetTaxCategoryActionImpl of(){
        return new ProductSetTaxCategoryActionImpl();
    }
    

    public static ProductSetTaxCategoryActionImpl of(final ProductSetTaxCategoryAction template) {
        ProductSetTaxCategoryActionImpl instance = new ProductSetTaxCategoryActionImpl();
        instance.setTaxCategory(template.getTaxCategory());
        return instance;
    }

    default <T> T withProductSetTaxCategoryAction(Function<ProductSetTaxCategoryAction, T> helper) {
        return helper.apply(this);
    }
}
