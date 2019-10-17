package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionAction;
import com.commercetools.api.generated.models.extension.ExtensionResourceTypeId;
import com.commercetools.api.generated.models.extension.ExtensionTrigger;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionTriggerBuilder {
   
   
   private com.commercetools.api.generated.models.extension.ExtensionResourceTypeId resourceTypeId;
   
   
   private java.util.List<com.commercetools.api.generated.models.extension.ExtensionAction> actions;
   
   public ExtensionTriggerBuilder resourceTypeId( final com.commercetools.api.generated.models.extension.ExtensionResourceTypeId resourceTypeId) {
      this.resourceTypeId = resourceTypeId;
      return this;
   }
   
   public ExtensionTriggerBuilder actions( final java.util.List<com.commercetools.api.generated.models.extension.ExtensionAction> actions) {
      this.actions = actions;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.extension.ExtensionResourceTypeId getResourceTypeId(){
      return this.resourceTypeId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.extension.ExtensionAction> getActions(){
      return this.actions;
   }

   public ExtensionTrigger build() {
       return new ExtensionTriggerImpl(resourceTypeId, actions);
   }
   
   public static ExtensionTriggerBuilder of() {
      return new ExtensionTriggerBuilder();
   }
   
   public static ExtensionTriggerBuilder of(final ExtensionTrigger template) {
      ExtensionTriggerBuilder builder = new ExtensionTriggerBuilder();
      builder.resourceTypeId = template.getResourceTypeId();
      builder.actions = template.getActions();
      return builder;
   }
   
}