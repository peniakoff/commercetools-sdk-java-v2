package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeReferenceType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeReferenceTypeBuilder {


   private com.commercetools.api.models.common.ReferenceTypeId referenceTypeId;

   public AttributeReferenceTypeBuilder referenceTypeId( final com.commercetools.api.models.common.ReferenceTypeId referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      return this;
   }


   public com.commercetools.api.models.common.ReferenceTypeId getReferenceTypeId(){
      return this.referenceTypeId;
   }

   public AttributeReferenceType build() {
       return new AttributeReferenceTypeImpl(referenceTypeId);
   }

   public static AttributeReferenceTypeBuilder of() {
      return new AttributeReferenceTypeBuilder();
   }

   public static AttributeReferenceTypeBuilder of(final AttributeReferenceType template) {
      AttributeReferenceTypeBuilder builder = new AttributeReferenceTypeBuilder();
      builder.referenceTypeId = template.getReferenceTypeId();
      return builder;
   }

}
