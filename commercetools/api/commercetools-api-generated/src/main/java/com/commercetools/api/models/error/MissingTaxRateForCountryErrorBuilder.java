package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.MissingTaxRateForCountryError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingTaxRateForCountryErrorBuilder {


   private String message;

   @Nullable
   private String country;

   @Nullable
   private String state;


   private String taxCategoryId;

   public MissingTaxRateForCountryErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }

   public MissingTaxRateForCountryErrorBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }

   public MissingTaxRateForCountryErrorBuilder state(@Nullable final String state) {
      this.state = state;
      return this;
   }

   public MissingTaxRateForCountryErrorBuilder taxCategoryId( final String taxCategoryId) {
      this.taxCategoryId = taxCategoryId;
      return this;
   }


   public String getMessage(){
      return this.message;
   }

   @Nullable
   public String getCountry(){
      return this.country;
   }

   @Nullable
   public String getState(){
      return this.state;
   }


   public String getTaxCategoryId(){
      return this.taxCategoryId;
   }

   public MissingTaxRateForCountryError build() {
       return new MissingTaxRateForCountryErrorImpl(message, country, state, taxCategoryId);
   }

   public static MissingTaxRateForCountryErrorBuilder of() {
      return new MissingTaxRateForCountryErrorBuilder();
   }

   public static MissingTaxRateForCountryErrorBuilder of(final MissingTaxRateForCountryError template) {
      MissingTaxRateForCountryErrorBuilder builder = new MissingTaxRateForCountryErrorBuilder();
      builder.message = template.getMessage();
      builder.country = template.getCountry();
      builder.state = template.getState();
      builder.taxCategoryId = template.getTaxCategoryId();
      return builder;
   }

}