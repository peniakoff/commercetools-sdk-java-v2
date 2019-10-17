package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionTrigger;
import com.commercetools.api.generated.models.extension.ExtensionUpdateAction;
import com.commercetools.api.generated.models.extension.ExtensionChangeTriggersAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionChangeTriggersActionBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers;
   
   public ExtensionChangeTriggersActionBuilder triggers( final java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers) {
      this.triggers = triggers;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }

   public ExtensionChangeTriggersAction build() {
       return new ExtensionChangeTriggersActionImpl(triggers);
   }
   
   public static ExtensionChangeTriggersActionBuilder of() {
      return new ExtensionChangeTriggersActionBuilder();
   }
   
   public static ExtensionChangeTriggersActionBuilder of(final ExtensionChangeTriggersAction template) {
      ExtensionChangeTriggersActionBuilder builder = new ExtensionChangeTriggersActionBuilder();
      builder.triggers = template.getTriggers();
      return builder;
   }
   
}