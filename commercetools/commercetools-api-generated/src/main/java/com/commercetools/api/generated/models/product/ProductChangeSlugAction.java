package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductChangeSlugActionImpl;

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
@JsonDeserialize(as = ProductChangeSlugActionImpl.class)
public interface ProductChangeSlugAction extends ProductUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setSlug(final LocalizedString slug);
   
   public void setStaged(final Boolean staged);
   
   public static ProductChangeSlugActionImpl of(){
      return new ProductChangeSlugActionImpl();
   }
   

   public static ProductChangeSlugActionImpl of(final ProductChangeSlugAction template) {
      ProductChangeSlugActionImpl instance = new ProductChangeSlugActionImpl();
      instance.setStaged(template.getStaged());
      instance.setSlug(template.getSlug());
      return instance;
   }

}