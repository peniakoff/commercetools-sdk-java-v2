package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.AttributeDateType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeDateTypeBuilder {
   
   
   

   public AttributeDateType build() {
       return new AttributeDateTypeImpl();
   }
   
   public static AttributeDateTypeBuilder of() {
      return new AttributeDateTypeBuilder();
   }
   
   public static AttributeDateTypeBuilder of(final AttributeDateType template) {
      AttributeDateTypeBuilder builder = new AttributeDateTypeBuilder();
      return builder;
   }
   
}