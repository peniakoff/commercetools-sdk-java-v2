package com.commercetools.api.generated.models.product;


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
public final class SearchKeywordImpl implements SearchKeyword {

   private Object suggestTokenizer;
   
   private String text;

   @JsonCreator
   SearchKeywordImpl(@JsonProperty("suggestTokenizer") final Object suggestTokenizer, @JsonProperty("text") final String text) {
      this.suggestTokenizer = suggestTokenizer;
      this.text = text;
   }
   public SearchKeywordImpl() {
      
   }
   
   
   public Object getSuggestTokenizer(){
      return this.suggestTokenizer;
   }
   
   
   public String getText(){
      return this.text;
   }

   public void setSuggestTokenizer(final Object suggestTokenizer){
      this.suggestTokenizer = suggestTokenizer;
   }
   
   public void setText(final String text){
      this.text = text;
   }

}