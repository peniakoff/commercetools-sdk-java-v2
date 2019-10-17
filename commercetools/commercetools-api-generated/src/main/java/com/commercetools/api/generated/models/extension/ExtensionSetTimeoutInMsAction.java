package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionUpdateAction;
import com.commercetools.api.generated.models.extension.ExtensionSetTimeoutInMsActionImpl;

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
@JsonDeserialize(as = ExtensionSetTimeoutInMsActionImpl.class)
public interface ExtensionSetTimeoutInMsAction extends ExtensionUpdateAction {

   
   
   @JsonProperty("timeoutInMs")
   public Integer getTimeoutInMs();

   public void setTimeoutInMs(final Integer timeoutInMs);
   
   public static ExtensionSetTimeoutInMsActionImpl of(){
      return new ExtensionSetTimeoutInMsActionImpl();
   }
   

   public static ExtensionSetTimeoutInMsActionImpl of(final ExtensionSetTimeoutInMsAction template) {
      ExtensionSetTimeoutInMsActionImpl instance = new ExtensionSetTimeoutInMsActionImpl();
      instance.setTimeoutInMs(template.getTimeoutInMs());
      return instance;
   }

}