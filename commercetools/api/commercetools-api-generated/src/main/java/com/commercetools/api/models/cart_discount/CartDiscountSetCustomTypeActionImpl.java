package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountSetCustomTypeActionImpl implements CartDiscountSetCustomTypeAction {

   private String action;

   private com.fasterxml.jackson.databind.JsonNode fields;

   private com.commercetools.api.models.type.TypeResourceIdentifier type;

   @JsonCreator
   CartDiscountSetCustomTypeActionImpl(@JsonProperty("fields") final com.fasterxml.jackson.databind.JsonNode fields, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.fields = fields;
      this.type = type;
      this.action = "setCustomType";
   }
   public CartDiscountSetCustomTypeActionImpl() {

   }


   public String getAction(){
      return this.action;
   }

   /**
   *  <p>A valid JSON object, based on the FieldDefinitions of the Type.
   *  Sets the custom fields to this value.</p>
   */
   public com.fasterxml.jackson.databind.JsonNode getFields(){
      return this.fields;
   }

   /**
   *  <p>If absent, the custom type and any existing CustomFields are removed.</p>
   */
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public void setFields(final com.fasterxml.jackson.databind.JsonNode fields){
      this.fields = fields;
   }

   public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
      this.type = type;
   }

}