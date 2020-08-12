package com.commercetools.api.models.product;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductPublishActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ProductPublishActionImpl.class)
public interface ProductPublishAction extends ProductUpdateAction {



   @JsonProperty("scope")
   public ProductPublishScope getScope();

   public void setScope(final ProductPublishScope scope);

   public static ProductPublishActionImpl of(){
      return new ProductPublishActionImpl();
   }


   public static ProductPublishActionImpl of(final ProductPublishAction template) {
      ProductPublishActionImpl instance = new ProductPublishActionImpl();
      instance.setScope(template.getScope());
      return instance;
   }

}