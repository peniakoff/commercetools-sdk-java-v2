package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetLineItemShippingDetailsActionBuilder {

   @Nullable
   private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;


   private String lineItemId;

   public MyCartSetLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }

   public MyCartSetLineItemShippingDetailsActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }


   public String getLineItemId(){
      return this.lineItemId;
   }

   public MyCartSetLineItemShippingDetailsAction build() {
       return new MyCartSetLineItemShippingDetailsActionImpl(shippingDetails, lineItemId);
   }

   public static MyCartSetLineItemShippingDetailsActionBuilder of() {
      return new MyCartSetLineItemShippingDetailsActionBuilder();
   }

   public static MyCartSetLineItemShippingDetailsActionBuilder of(final MyCartSetLineItemShippingDetailsAction template) {
      MyCartSetLineItemShippingDetailsActionBuilder builder = new MyCartSetLineItemShippingDetailsActionBuilder();
      builder.shippingDetails = template.getShippingDetails();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }

}