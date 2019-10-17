package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.generated.models.me.MyCartAddPaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartAddPaymentActionBuilder {
   
   
   private com.commercetools.api.generated.models.payment.PaymentResourceIdentifier payment;
   
   public MyCartAddPaymentActionBuilder payment( final com.commercetools.api.generated.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public MyCartAddPaymentAction build() {
       return new MyCartAddPaymentActionImpl(payment);
   }
   
   public static MyCartAddPaymentActionBuilder of() {
      return new MyCartAddPaymentActionBuilder();
   }
   
   public static MyCartAddPaymentActionBuilder of(final MyCartAddPaymentAction template) {
      MyCartAddPaymentActionBuilder builder = new MyCartAddPaymentActionBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}