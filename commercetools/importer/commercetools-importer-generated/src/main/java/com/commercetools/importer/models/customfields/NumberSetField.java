package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.NumberSetFieldImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>A field with a number value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = NumberSetFieldImpl.class)
public interface NumberSetField extends CustomField {

   
   @NotNull
   @JsonProperty("value")
   public List<Integer> getValue();

   public void setValue(final List<Integer> value);
   
   public static NumberSetFieldImpl of(){
      return new NumberSetFieldImpl();
   }
   

   public static NumberSetFieldImpl of(final NumberSetField template) {
      NumberSetFieldImpl instance = new NumberSetFieldImpl();
      instance.setValue(template.getValue());
      return instance;
   }

}