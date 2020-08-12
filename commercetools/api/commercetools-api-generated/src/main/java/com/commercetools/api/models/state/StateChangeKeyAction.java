package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateChangeKeyActionImpl;

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
@JsonDeserialize(as = StateChangeKeyActionImpl.class)
public interface StateChangeKeyAction extends StateUpdateAction {


   @NotNull
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);

   public static StateChangeKeyActionImpl of(){
      return new StateChangeKeyActionImpl();
   }


   public static StateChangeKeyActionImpl of(final StateChangeKeyAction template) {
      StateChangeKeyActionImpl instance = new StateChangeKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}