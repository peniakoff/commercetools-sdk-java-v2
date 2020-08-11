package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
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
public final class StagedOrderSetCustomTypeActionImpl implements StagedOrderSetCustomTypeAction {

   private String action;

   private com.commercetools.api.models.type.FieldContainer fields;

   private com.commercetools.api.models.type.TypeResourceIdentifier type;

   @JsonCreator
   StagedOrderSetCustomTypeActionImpl(@JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.fields = fields;
      this.type = type;
      this.action = "setCustomType";
   }
   public StagedOrderSetCustomTypeActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.type.FieldContainer getFields(){
      return this.fields;
   }


   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public void setFields(final com.commercetools.api.models.type.FieldContainer fields){
      this.fields = fields;
   }

   public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
      this.type = type;
   }

}
