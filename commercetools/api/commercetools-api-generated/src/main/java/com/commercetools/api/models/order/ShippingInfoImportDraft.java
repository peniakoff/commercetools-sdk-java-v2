package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.ShippingMethodState;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.DiscountedLineItemPriceDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.order.ShippingInfoImportDraftImpl;

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
@JsonDeserialize(as = ShippingInfoImportDraftImpl.class)
public interface ShippingInfoImportDraft  {


   @NotNull
   @JsonProperty("shippingMethodName")
   public String getShippingMethodName();

   @NotNull
   @Valid
   @JsonProperty("price")
   public Money getPrice();
   /**
   *  <p>The shipping rate used to determine the price.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("shippingRate")
   public ShippingRateDraft getShippingRate();

   @Valid
   @JsonProperty("taxRate")
   public TaxRate getTaxRate();

   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryResourceIdentifier getTaxCategory();
   /**
   *  <p>Not set if custom shipping method is used.</p>
   */
   @Valid
   @JsonProperty("shippingMethod")
   public ShippingMethodResourceIdentifier getShippingMethod();
   /**
   *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
   */
   @Valid
   @JsonProperty("deliveries")
   public List<Delivery> getDeliveries();

   @Valid
   @JsonProperty("discountedPrice")
   public DiscountedLineItemPriceDraft getDiscountedPrice();
   /**
   *  <p>Indicates whether the ShippingMethod referenced is allowed for the cart or not.</p>
   */

   @JsonProperty("shippingMethodState")
   public ShippingMethodState getShippingMethodState();

   public void setShippingMethodName(final String shippingMethodName);

   public void setPrice(final Money price);

   public void setShippingRate(final ShippingRateDraft shippingRate);

   public void setTaxRate(final TaxRate taxRate);

   public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

   public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

   public void setDeliveries(final List<Delivery> deliveries);

   public void setDiscountedPrice(final DiscountedLineItemPriceDraft discountedPrice);

   public void setShippingMethodState(final ShippingMethodState shippingMethodState);

   public static ShippingInfoImportDraftImpl of(){
      return new ShippingInfoImportDraftImpl();
   }


   public static ShippingInfoImportDraftImpl of(final ShippingInfoImportDraft template) {
      ShippingInfoImportDraftImpl instance = new ShippingInfoImportDraftImpl();
      instance.setTaxRate(template.getTaxRate());
      instance.setShippingRate(template.getShippingRate());
      instance.setDiscountedPrice(template.getDiscountedPrice());
      instance.setShippingMethodState(template.getShippingMethodState());
      instance.setPrice(template.getPrice());
      instance.setShippingMethod(template.getShippingMethod());
      instance.setShippingMethodName(template.getShippingMethodName());
      instance.setDeliveries(template.getDeliveries());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}