package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetCustomShippingMethodActionImpl.class)
public interface StagedOrderSetCustomShippingMethodAction extends StagedOrderUpdateAction {


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

   public static StagedOrderSetCustomShippingMethodActionImpl of(){
      return new StagedOrderSetCustomShippingMethodActionImpl();
   }


   public static StagedOrderSetCustomShippingMethodActionImpl of(final StagedOrderSetCustomShippingMethodAction template) {
      StagedOrderSetCustomShippingMethodActionImpl instance = new StagedOrderSetCustomShippingMethodActionImpl();
      instance.setShippingRate(template.getShippingRate());
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setShippingMethodName(template.getShippingMethodName());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}