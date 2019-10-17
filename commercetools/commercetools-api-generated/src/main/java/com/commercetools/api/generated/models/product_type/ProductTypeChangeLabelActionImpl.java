package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeLabelActionImpl implements ProductTypeChangeLabelAction {

   private String action;
   
   private String attributeName;
   
   private com.commercetools.api.generated.models.common.LocalizedString label;

   @JsonCreator
   ProductTypeChangeLabelActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("label") final com.commercetools.api.generated.models.common.LocalizedString label) {
      this.attributeName = attributeName;
      this.label = label;
      this.action = "changeLabel";
   }
   public ProductTypeChangeLabelActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getLabel(){
      return this.label;
   }

   public void setAttributeName(final String attributeName){
      this.attributeName = attributeName;
   }
   
   public void setLabel(final com.commercetools.api.generated.models.common.LocalizedString label){
      this.label = label;
   }

}