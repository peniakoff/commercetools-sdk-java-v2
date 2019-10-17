package com.commercetools.api.generated.models.customer;


import com.commercetools.api.generated.models.customer.CustomerCreatePasswordResetToken;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerCreatePasswordResetTokenBuilder {
   
   @Nullable
   private Long ttlMinutes;
   
   
   private String email;
   
   public CustomerCreatePasswordResetTokenBuilder ttlMinutes(@Nullable final Long ttlMinutes) {
      this.ttlMinutes = ttlMinutes;
      return this;
   }
   
   public CustomerCreatePasswordResetTokenBuilder email( final String email) {
      this.email = email;
      return this;
   }
   
   @Nullable
   public Long getTtlMinutes(){
      return this.ttlMinutes;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public CustomerCreatePasswordResetToken build() {
       return new CustomerCreatePasswordResetTokenImpl(ttlMinutes, email);
   }
   
   public static CustomerCreatePasswordResetTokenBuilder of() {
      return new CustomerCreatePasswordResetTokenBuilder();
   }
   
   public static CustomerCreatePasswordResetTokenBuilder of(final CustomerCreatePasswordResetToken template) {
      CustomerCreatePasswordResetTokenBuilder builder = new CustomerCreatePasswordResetTokenBuilder();
      builder.ttlMinutes = template.getTtlMinutes();
      builder.email = template.getEmail();
      return builder;
   }
   
}