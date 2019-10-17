package com.commercetools.api.generated.models.store;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.store.Store;
import com.commercetools.api.generated.models.store.StoreReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.store.Store obj;
   
   public StoreReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public StoreReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.store.Store obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.store.Store getObj(){
      return this.obj;
   }

   public StoreReference build() {
       return new StoreReferenceImpl(id, obj);
   }
   
   public static StoreReferenceBuilder of() {
      return new StoreReferenceBuilder();
   }
   
   public static StoreReferenceBuilder of(final StoreReference template) {
      StoreReferenceBuilder builder = new StoreReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}