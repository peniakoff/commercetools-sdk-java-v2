package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.Cart;
import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.cart.CartReferenceImpl;

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
@JsonDeserialize(as = CartReferenceImpl.class)
public interface CartReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public Cart getObj();

   public void setObj(final Cart obj);
   
   public static CartReferenceImpl of(){
      return new CartReferenceImpl();
   }
   

   public static CartReferenceImpl of(final CartReference template) {
      CartReferenceImpl instance = new CartReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}