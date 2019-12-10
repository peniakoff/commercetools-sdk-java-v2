package com.commercetools.api.generated.models.cart;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartRecalculateActionImpl.class)
public interface CartRecalculateAction extends CartUpdateAction {

   /**
   *  <p>If set to <code>true</code>, the line item product data (<code>name</code>, <code>variant</code> and <code>productType</code>) will also be updated.
   *  If set to <code>false</code>,
   *  only the prices and tax rates of the line item will be updated.
   *  The updated price of a line item may not correspond to a price in <code>variant.prices</code> anymore.</p>
   */
   
   @JsonProperty("updateProductData")
   public Boolean getUpdateProductData();

   public void setUpdateProductData(final Boolean updateProductData);
   
   public static CartRecalculateActionImpl of(){
      return new CartRecalculateActionImpl();
   }
   

   public static CartRecalculateActionImpl of(final CartRecalculateAction template) {
      CartRecalculateActionImpl instance = new CartRecalculateActionImpl();
      instance.setUpdateProductData(template.getUpdateProductData());
      return instance;
   }

}