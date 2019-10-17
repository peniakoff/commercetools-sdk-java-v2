package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
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
public final class CustomerEmailChangedMessagePayloadImpl implements CustomerEmailChangedMessagePayload {

   private String type;
   
   private String email;

   @JsonCreator
   CustomerEmailChangedMessagePayloadImpl(@JsonProperty("email") final String email) {
      this.email = email;
      this.type = "CustomerEmailChanged";
   }
   public CustomerEmailChangedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public void setEmail(final String email){
      this.email = email;
   }

}