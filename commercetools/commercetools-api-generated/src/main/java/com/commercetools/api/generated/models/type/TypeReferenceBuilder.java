package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.type.Type;
import com.commercetools.api.generated.models.type.TypeReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.type.Type obj;
   
   public TypeReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public TypeReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.type.Type obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.Type getObj(){
      return this.obj;
   }

   public TypeReference build() {
       return new TypeReferenceImpl(id, obj);
   }
   
   public static TypeReferenceBuilder of() {
      return new TypeReferenceBuilder();
   }
   
   public static TypeReferenceBuilder of(final TypeReference template) {
      TypeReferenceBuilder builder = new TypeReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}