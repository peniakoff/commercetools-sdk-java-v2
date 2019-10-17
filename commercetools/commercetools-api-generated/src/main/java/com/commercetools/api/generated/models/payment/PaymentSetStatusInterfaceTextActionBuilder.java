package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentSetStatusInterfaceTextAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetStatusInterfaceTextActionBuilder {
   
   
   private String interfaceText;
   
   public PaymentSetStatusInterfaceTextActionBuilder interfaceText( final String interfaceText) {
      this.interfaceText = interfaceText;
      return this;
   }
   
   
   public String getInterfaceText(){
      return this.interfaceText;
   }

   public PaymentSetStatusInterfaceTextAction build() {
       return new PaymentSetStatusInterfaceTextActionImpl(interfaceText);
   }
   
   public static PaymentSetStatusInterfaceTextActionBuilder of() {
      return new PaymentSetStatusInterfaceTextActionBuilder();
   }
   
   public static PaymentSetStatusInterfaceTextActionBuilder of(final PaymentSetStatusInterfaceTextAction template) {
      PaymentSetStatusInterfaceTextActionBuilder builder = new PaymentSetStatusInterfaceTextActionBuilder();
      builder.interfaceText = template.getInterfaceText();
      return builder;
   }
   
}