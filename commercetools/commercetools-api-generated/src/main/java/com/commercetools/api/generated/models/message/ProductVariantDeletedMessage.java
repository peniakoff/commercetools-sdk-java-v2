package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.product.ProductVariant;
import com.commercetools.api.generated.models.message.ProductVariantDeletedMessageImpl;

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
@JsonDeserialize(as = ProductVariantDeletedMessageImpl.class)
public interface ProductVariantDeletedMessage extends Message {

   
   @NotNull
   @JsonProperty("removedImageUrls")
   public List<Object> getRemovedImageUrls();
   
   @NotNull
   @Valid
   @JsonProperty("variant")
   public ProductVariant getVariant();

   public void setRemovedImageUrls(final List<Object> removedImageUrls);
   
   public void setVariant(final ProductVariant variant);
   
   public static ProductVariantDeletedMessageImpl of(){
      return new ProductVariantDeletedMessageImpl();
   }
   

   public static ProductVariantDeletedMessageImpl of(final ProductVariantDeletedMessage template) {
      ProductVariantDeletedMessageImpl instance = new ProductVariantDeletedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setRemovedImageUrls(template.getRemovedImageUrls());
      instance.setVariant(template.getVariant());
      return instance;
   }

}