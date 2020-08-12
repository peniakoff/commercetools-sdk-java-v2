package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidJsonInputErrorImpl;

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
@JsonDeserialize(as = InvalidJsonInputErrorImpl.class)
public interface InvalidJsonInputError extends ErrorObject {


   
   public static InvalidJsonInputErrorImpl of(){
      return new InvalidJsonInputErrorImpl();
   }
   

   public static InvalidJsonInputErrorImpl of(final InvalidJsonInputError template) {
      InvalidJsonInputErrorImpl instance = new InvalidJsonInputErrorImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}