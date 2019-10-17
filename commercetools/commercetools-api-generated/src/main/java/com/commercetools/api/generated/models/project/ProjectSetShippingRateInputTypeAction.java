package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import com.commercetools.api.generated.models.project.ShippingRateInputType;
import com.commercetools.api.generated.models.project.ProjectSetShippingRateInputTypeActionImpl;

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
@JsonDeserialize(as = ProjectSetShippingRateInputTypeActionImpl.class)
public interface ProjectSetShippingRateInputTypeAction extends ProjectUpdateAction {

   
   @Valid
   @JsonProperty("shippingRateInputType")
   public ShippingRateInputType getShippingRateInputType();

   public void setShippingRateInputType(final ShippingRateInputType shippingRateInputType);
   
   public static ProjectSetShippingRateInputTypeActionImpl of(){
      return new ProjectSetShippingRateInputTypeActionImpl();
   }
   

   public static ProjectSetShippingRateInputTypeActionImpl of(final ProjectSetShippingRateInputTypeAction template) {
      ProjectSetShippingRateInputTypeActionImpl instance = new ProjectSetShippingRateInputTypeActionImpl();
      instance.setShippingRateInputType(template.getShippingRateInputType());
      return instance;
   }

}