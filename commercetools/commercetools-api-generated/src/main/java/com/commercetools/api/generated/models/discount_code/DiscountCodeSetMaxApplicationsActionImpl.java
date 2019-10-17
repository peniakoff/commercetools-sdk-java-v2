package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
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
public final class DiscountCodeSetMaxApplicationsActionImpl implements DiscountCodeSetMaxApplicationsAction {

   private String action;
   
   private Long maxApplications;

   @JsonCreator
   DiscountCodeSetMaxApplicationsActionImpl(@JsonProperty("maxApplications") final Long maxApplications) {
      this.maxApplications = maxApplications;
      this.action = "setMaxApplications";
   }
   public DiscountCodeSetMaxApplicationsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Long getMaxApplications(){
      return this.maxApplications;
   }

   public void setMaxApplications(final Long maxApplications){
      this.maxApplications = maxApplications;
   }

}