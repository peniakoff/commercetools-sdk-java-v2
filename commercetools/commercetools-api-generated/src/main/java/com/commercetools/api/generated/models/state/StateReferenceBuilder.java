package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.state.State;
import com.commercetools.api.generated.models.state.StateReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.state.State obj;
   
   public StateReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public StateReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.state.State obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.state.State getObj(){
      return this.obj;
   }

   public StateReference build() {
       return new StateReferenceImpl(id, obj);
   }
   
   public static StateReferenceBuilder of() {
      return new StateReferenceBuilder();
   }
   
   public static StateReferenceBuilder of(final StateReference template) {
      StateReferenceBuilder builder = new StateReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}