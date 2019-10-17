package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.FacetResult;
import com.commercetools.api.generated.models.product.FacetTypes;
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
public final class FilteredFacetResultImpl implements FilteredFacetResult {

   private com.commercetools.api.generated.models.product.FacetTypes type;
   
   private Long count;
   
   private Long productCount;

   @JsonCreator
   FilteredFacetResultImpl(@JsonProperty("count") final Long count, @JsonProperty("productCount") final Long productCount) {
      this.count = count;
      this.productCount = productCount;
      this.type = FacetTypes.findEnumViaJsonName("filter").get();
   }
   public FilteredFacetResultImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.product.FacetTypes getType(){
      return this.type;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getProductCount(){
      return this.productCount;
   }

   public void setCount(final Long count){
      this.count = count;
   }
   
   public void setProductCount(final Long productCount){
      this.productCount = productCount;
   }

}