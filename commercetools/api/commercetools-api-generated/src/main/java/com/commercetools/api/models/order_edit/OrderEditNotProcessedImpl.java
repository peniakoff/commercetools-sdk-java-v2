package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditResult;
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
public final class OrderEditNotProcessedImpl implements OrderEditNotProcessed {

   private String type;

   @JsonCreator
   OrderEditNotProcessedImpl() {
      this.type = "NotProcessed";
   }



   public String getType(){
      return this.type;
   }


}