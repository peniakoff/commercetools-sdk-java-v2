package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class ProjectChangeCountriesActionImpl implements ProjectChangeCountriesAction {

   private String action;
   
   private java.util.List<String> countries;

   @JsonCreator
   ProjectChangeCountriesActionImpl(@JsonProperty("countries") final java.util.List<String> countries) {
      this.countries = countries;
      this.action = "changeCountries";
   }
   public ProjectChangeCountriesActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<String> getCountries(){
      return this.countries;
   }

   public void setCountries(final java.util.List<String> countries){
      this.countries = countries;
   }

}