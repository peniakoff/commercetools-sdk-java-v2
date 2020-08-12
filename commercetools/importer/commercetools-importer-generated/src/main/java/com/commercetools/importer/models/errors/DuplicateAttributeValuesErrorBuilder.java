package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.errors.DuplicateAttributeValuesError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateAttributeValuesErrorBuilder {
   
   
   private String message;
   
   
   private java.util.List<com.commercetools.importer.models.productvariants.Attribute> attributes;
   
   public DuplicateAttributeValuesErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateAttributeValuesErrorBuilder attributes( final java.util.List<com.commercetools.importer.models.productvariants.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<com.commercetools.importer.models.productvariants.Attribute> getAttributes(){
      return this.attributes;
   }

   public DuplicateAttributeValuesError build() {
       return new DuplicateAttributeValuesErrorImpl(message, attributes);
   }
   
   public static DuplicateAttributeValuesErrorBuilder of() {
      return new DuplicateAttributeValuesErrorBuilder();
   }
   
   public static DuplicateAttributeValuesErrorBuilder of(final DuplicateAttributeValuesError template) {
      DuplicateAttributeValuesErrorBuilder builder = new DuplicateAttributeValuesErrorBuilder();
      builder.message = template.getMessage();
      builder.attributes = template.getAttributes();
      return builder;
   }
   
}