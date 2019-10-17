package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.state.StateUpdateAction;
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
public final class StateChangeInitialActionImpl implements StateChangeInitialAction {

   private String action;
   
   private Boolean initial;

   @JsonCreator
   StateChangeInitialActionImpl(@JsonProperty("initial") final Boolean initial) {
      this.initial = initial;
      this.action = "changeInitial";
   }
   public StateChangeInitialActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Boolean getInitial(){
      return this.initial;
   }

   public void setInitial(final Boolean initial){
      this.initial = initial;
   }

}