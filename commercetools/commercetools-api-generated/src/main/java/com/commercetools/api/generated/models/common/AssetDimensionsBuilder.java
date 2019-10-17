package com.commercetools.api.generated.models.common;


import com.commercetools.api.generated.models.common.AssetDimensions;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AssetDimensionsBuilder {
   
   
   private Integer w;
   
   
   private Integer h;
   
   public AssetDimensionsBuilder w( final Integer w) {
      this.w = w;
      return this;
   }
   
   public AssetDimensionsBuilder h( final Integer h) {
      this.h = h;
      return this;
   }
   
   
   public Integer getW(){
      return this.w;
   }
   
   
   public Integer getH(){
      return this.h;
   }

   public AssetDimensions build() {
       return new AssetDimensionsImpl(w, h);
   }
   
   public static AssetDimensionsBuilder of() {
      return new AssetDimensionsBuilder();
   }
   
   public static AssetDimensionsBuilder of(final AssetDimensions template) {
      AssetDimensionsBuilder builder = new AssetDimensionsBuilder();
      builder.w = template.getW();
      builder.h = template.getH();
      return builder;
   }
   
}