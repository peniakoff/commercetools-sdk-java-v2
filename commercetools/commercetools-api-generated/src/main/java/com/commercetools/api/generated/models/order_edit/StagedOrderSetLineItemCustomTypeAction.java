package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemCustomTypeActionImpl;

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
@JsonDeserialize(as = StagedOrderSetLineItemCustomTypeActionImpl.class)
public interface StagedOrderSetLineItemCustomTypeAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setLineItemId(final String lineItemId);
   
   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static StagedOrderSetLineItemCustomTypeActionImpl of(){
      return new StagedOrderSetLineItemCustomTypeActionImpl();
   }
   

   public static StagedOrderSetLineItemCustomTypeActionImpl of(final StagedOrderSetLineItemCustomTypeAction template) {
      StagedOrderSetLineItemCustomTypeActionImpl instance = new StagedOrderSetLineItemCustomTypeActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}