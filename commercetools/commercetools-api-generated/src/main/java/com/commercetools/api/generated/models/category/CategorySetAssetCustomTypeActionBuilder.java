package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.category.CategorySetAssetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetAssetCustomTypeActionBuilder {
   
   @Nullable
   private String assetId;
   
   @Nullable
   private Object fields;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   @Nullable
   private String assetKey;
   
   public CategorySetAssetCustomTypeActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetCustomTypeActionBuilder fields(@Nullable final Object fields) {
      this.fields = fields;
      return this;
   }
   
   public CategorySetAssetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public CategorySetAssetCustomTypeActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public Object getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   @Nullable
   public String getAssetKey(){
      return this.assetKey;
   }

   public CategorySetAssetCustomTypeAction build() {
       return new CategorySetAssetCustomTypeActionImpl(assetId, fields, type, assetKey);
   }
   
   public static CategorySetAssetCustomTypeActionBuilder of() {
      return new CategorySetAssetCustomTypeActionBuilder();
   }
   
   public static CategorySetAssetCustomTypeActionBuilder of(final CategorySetAssetCustomTypeAction template) {
      CategorySetAssetCustomTypeActionBuilder builder = new CategorySetAssetCustomTypeActionBuilder();
      builder.assetId = template.getAssetId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}