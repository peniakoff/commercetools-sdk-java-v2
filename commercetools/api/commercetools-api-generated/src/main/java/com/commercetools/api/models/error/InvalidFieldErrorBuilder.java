package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.error.InvalidFieldError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidFieldErrorBuilder {


   private String message;

   @Nullable
   private java.util.List<com.fasterxml.jackson.databind.JsonNode> allowedValues;


   private String field;


   private com.fasterxml.jackson.databind.JsonNode invalidValue;

   public InvalidFieldErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }

   public InvalidFieldErrorBuilder allowedValues(@Nullable final java.util.List<com.fasterxml.jackson.databind.JsonNode> allowedValues) {
      this.allowedValues = allowedValues;
      return this;
   }

   public InvalidFieldErrorBuilder field( final String field) {
      this.field = field;
      return this;
   }

   public InvalidFieldErrorBuilder invalidValue( final com.fasterxml.jackson.databind.JsonNode invalidValue) {
      this.invalidValue = invalidValue;
      return this;
   }


   public String getMessage(){
      return this.message;
   }

   @Nullable
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getAllowedValues(){
      return this.allowedValues;
   }


   public String getField(){
      return this.field;
   }


   public com.fasterxml.jackson.databind.JsonNode getInvalidValue(){
      return this.invalidValue;
   }

   public InvalidFieldError build() {
       return new InvalidFieldErrorImpl(message, allowedValues, field, invalidValue);
   }

   public static InvalidFieldErrorBuilder of() {
      return new InvalidFieldErrorBuilder();
   }

   public static InvalidFieldErrorBuilder of(final InvalidFieldError template) {
      InvalidFieldErrorBuilder builder = new InvalidFieldErrorBuilder();
      builder.message = template.getMessage();
      builder.allowedValues = template.getAllowedValues();
      builder.field = template.getField();
      builder.invalidValue = template.getInvalidValue();
      return builder;
   }

}