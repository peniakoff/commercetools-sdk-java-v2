package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetCustomShippingMethodActionBuilder {
   
   
   private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;
   
   @Nullable
   private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private String shippingMethodName;
   
   @Nullable
   private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public StagedOrderSetCustomShippingMethodActionBuilder shippingRate( final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public StagedOrderSetCustomShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderSetCustomShippingMethodActionBuilder shippingMethodName( final String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }
   
   public StagedOrderSetCustomShippingMethodActionBuilder taxCategory(@Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   @Nullable
   public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public StagedOrderSetCustomShippingMethodAction build() {
       return new StagedOrderSetCustomShippingMethodActionImpl(shippingRate, externalTaxRate, shippingMethodName, taxCategory);
   }
   
   public static StagedOrderSetCustomShippingMethodActionBuilder of() {
      return new StagedOrderSetCustomShippingMethodActionBuilder();
   }
   
   public static StagedOrderSetCustomShippingMethodActionBuilder of(final StagedOrderSetCustomShippingMethodAction template) {
      StagedOrderSetCustomShippingMethodActionBuilder builder = new StagedOrderSetCustomShippingMethodActionBuilder();
      builder.shippingRate = template.getShippingRate();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.shippingMethodName = template.getShippingMethodName();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}