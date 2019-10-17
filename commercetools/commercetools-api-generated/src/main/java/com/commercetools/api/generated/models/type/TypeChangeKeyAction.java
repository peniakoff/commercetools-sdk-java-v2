package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.TypeUpdateAction;
import com.commercetools.api.generated.models.type.TypeChangeKeyActionImpl;

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
@JsonDeserialize(as = TypeChangeKeyActionImpl.class)
public interface TypeChangeKeyAction extends TypeUpdateAction {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static TypeChangeKeyActionImpl of(){
      return new TypeChangeKeyActionImpl();
   }
   

   public static TypeChangeKeyActionImpl of(final TypeChangeKeyAction template) {
      TypeChangeKeyActionImpl instance = new TypeChangeKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}