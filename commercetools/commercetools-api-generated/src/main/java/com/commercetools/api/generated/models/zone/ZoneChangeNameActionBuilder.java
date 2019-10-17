package com.commercetools.api.generated.models.zone;

import com.commercetools.api.generated.models.zone.ZoneUpdateAction;
import com.commercetools.api.generated.models.zone.ZoneChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ZoneChangeNameActionBuilder {
   
   
   private String name;
   
   public ZoneChangeNameActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }

   public ZoneChangeNameAction build() {
       return new ZoneChangeNameActionImpl(name);
   }
   
   public static ZoneChangeNameActionBuilder of() {
      return new ZoneChangeNameActionBuilder();
   }
   
   public static ZoneChangeNameActionBuilder of(final ZoneChangeNameAction template) {
      ZoneChangeNameActionBuilder builder = new ZoneChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}