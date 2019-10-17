package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.category.CategorySetMetaTitleActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategorySetMetaTitleActionImpl.class)
public interface CategorySetMetaTitleAction extends CategoryUpdateAction {

   
   @Valid
   @JsonProperty("metaTitle")
   public LocalizedString getMetaTitle();

   public void setMetaTitle(final LocalizedString metaTitle);
   
   public static CategorySetMetaTitleActionImpl of(){
      return new CategorySetMetaTitleActionImpl();
   }
   

   public static CategorySetMetaTitleActionImpl of(final CategorySetMetaTitleAction template) {
      CategorySetMetaTitleActionImpl instance = new CategorySetMetaTitleActionImpl();
      instance.setMetaTitle(template.getMetaTitle());
      return instance;
   }

}