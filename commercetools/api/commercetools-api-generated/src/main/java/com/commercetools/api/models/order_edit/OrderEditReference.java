package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.order_edit.OrderEditReferenceImpl;

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
@JsonDeserialize(as = OrderEditReferenceImpl.class)
public interface OrderEditReference extends Reference {


   @Valid
   @JsonProperty("obj")
   public OrderEdit getObj();

   public void setObj(final OrderEdit obj);

   public static OrderEditReferenceImpl of(){
      return new OrderEditReferenceImpl();
   }


   public static OrderEditReferenceImpl of(final OrderEditReference template) {
      OrderEditReferenceImpl instance = new OrderEditReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}