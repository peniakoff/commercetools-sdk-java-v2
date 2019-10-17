package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.payment.PaymentSetAuthorizationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetAuthorizationActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.Money amount;
   
   @Nullable
   private java.time.ZonedDateTime until;
   
   public PaymentSetAuthorizationActionBuilder amount(@Nullable final com.commercetools.api.generated.models.common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   public PaymentSetAuthorizationActionBuilder until(@Nullable final java.time.ZonedDateTime until) {
      this.until = until;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Money getAmount(){
      return this.amount;
   }
   
   @Nullable
   public java.time.ZonedDateTime getUntil(){
      return this.until;
   }

   public PaymentSetAuthorizationAction build() {
       return new PaymentSetAuthorizationActionImpl(amount, until);
   }
   
   public static PaymentSetAuthorizationActionBuilder of() {
      return new PaymentSetAuthorizationActionBuilder();
   }
   
   public static PaymentSetAuthorizationActionBuilder of(final PaymentSetAuthorizationAction template) {
      PaymentSetAuthorizationActionBuilder builder = new PaymentSetAuthorizationActionBuilder();
      builder.amount = template.getAmount();
      builder.until = template.getUntil();
      return builder;
   }
   
}