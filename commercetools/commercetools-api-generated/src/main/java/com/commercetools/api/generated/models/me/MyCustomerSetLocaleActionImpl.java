package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
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
public final class MyCustomerSetLocaleActionImpl implements MyCustomerSetLocaleAction {

   private String action;
   
   private String locale;

   @JsonCreator
   MyCustomerSetLocaleActionImpl(@JsonProperty("locale") final String locale) {
      this.locale = locale;
      this.action = "setLocale";
   }
   public MyCustomerSetLocaleActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLocale(){
      return this.locale;
   }

   public void setLocale(final String locale){
      this.locale = locale;
   }

}