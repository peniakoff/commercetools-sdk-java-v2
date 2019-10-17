package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.CartSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetLocaleActionBuilder {
   
   @Nullable
   private String locale;
   
   public CartSetLocaleActionBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }

   public CartSetLocaleAction build() {
       return new CartSetLocaleActionImpl(locale);
   }
   
   public static CartSetLocaleActionBuilder of() {
      return new CartSetLocaleActionBuilder();
   }
   
   public static CartSetLocaleActionBuilder of(final CartSetLocaleAction template) {
      CartSetLocaleActionBuilder builder = new CartSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}