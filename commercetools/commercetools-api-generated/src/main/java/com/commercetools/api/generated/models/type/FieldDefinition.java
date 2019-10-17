package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.TypeTextInputHint;
import com.commercetools.api.generated.models.type.FieldDefinitionImpl;

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
@JsonDeserialize(as = FieldDefinitionImpl.class)
public interface FieldDefinition  {

   
   @NotNull
   @Valid
   @JsonProperty("type")
   public FieldType getType();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   @NotNull
   @Valid
   @JsonProperty("label")
   public LocalizedString getLabel();
   
   @NotNull
   @JsonProperty("required")
   public Boolean getRequired();
   
   
   @JsonProperty("inputHint")
   public TypeTextInputHint getInputHint();

   public void setType(final FieldType type);
   
   public void setName(final String name);
   
   public void setLabel(final LocalizedString label);
   
   public void setRequired(final Boolean required);
   
   public void setInputHint(final TypeTextInputHint inputHint);
   
   public static FieldDefinitionImpl of(){
      return new FieldDefinitionImpl();
   }
   

   public static FieldDefinitionImpl of(final FieldDefinition template) {
      FieldDefinitionImpl instance = new FieldDefinitionImpl();
      instance.setName(template.getName());
      instance.setInputHint(template.getInputHint());
      instance.setLabel(template.getLabel());
      instance.setType(template.getType());
      instance.setRequired(template.getRequired());
      return instance;
   }

}