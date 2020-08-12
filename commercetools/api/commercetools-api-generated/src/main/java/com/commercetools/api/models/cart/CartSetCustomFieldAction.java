package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.cart.CartSetCustomFieldActionImpl;

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
@JsonDeserialize(as = CartSetCustomFieldActionImpl.class)
public interface CartSetCustomFieldAction extends CartUpdateAction {


   @NotNull
   @JsonProperty("name")
   public String getName();


   @JsonProperty("value")
   public JsonNode getValue();

   public void setName(final String name);

   public void setValue(final JsonNode value);

   public static CartSetCustomFieldActionImpl of(){
      return new CartSetCustomFieldActionImpl();
   }


   public static CartSetCustomFieldActionImpl of(final CartSetCustomFieldAction template) {
      CartSetCustomFieldActionImpl instance = new CartSetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}