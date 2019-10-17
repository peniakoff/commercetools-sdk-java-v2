package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.InvalidInputError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidInputErrorBuilder {
   
   
   private String message;
   
   public InvalidInputErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }

   public InvalidInputError build() {
       return new InvalidInputErrorImpl(message);
   }
   
   public static InvalidInputErrorBuilder of() {
      return new InvalidInputErrorBuilder();
   }
   
   public static InvalidInputErrorBuilder of(final InvalidInputError template) {
      InvalidInputErrorBuilder builder = new InvalidInputErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}