package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentSetMethodInfoMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetMethodInfoMethodActionBuilder {
   
   @Nullable
   private String method;
   
   public PaymentSetMethodInfoMethodActionBuilder method(@Nullable final String method) {
      this.method = method;
      return this;
   }
   
   @Nullable
   public String getMethod(){
      return this.method;
   }

   public PaymentSetMethodInfoMethodAction build() {
       return new PaymentSetMethodInfoMethodActionImpl(method);
   }
   
   public static PaymentSetMethodInfoMethodActionBuilder of() {
      return new PaymentSetMethodInfoMethodActionBuilder();
   }
   
   public static PaymentSetMethodInfoMethodActionBuilder of(final PaymentSetMethodInfoMethodAction template) {
      PaymentSetMethodInfoMethodActionBuilder builder = new PaymentSetMethodInfoMethodActionBuilder();
      builder.method = template.getMethod();
      return builder;
   }
   
}