package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.CartSetAnonymousIdActionImpl;

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
@JsonDeserialize(as = CartSetAnonymousIdActionImpl.class)
public interface CartSetAnonymousIdAction extends CartUpdateAction {

   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();

   public void setAnonymousId(final String anonymousId);
   
   public static CartSetAnonymousIdActionImpl of(){
      return new CartSetAnonymousIdActionImpl();
   }
   

   public static CartSetAnonymousIdActionImpl of(final CartSetAnonymousIdAction template) {
      CartSetAnonymousIdActionImpl instance = new CartSetAnonymousIdActionImpl();
      instance.setAnonymousId(template.getAnonymousId());
      return instance;
   }

}