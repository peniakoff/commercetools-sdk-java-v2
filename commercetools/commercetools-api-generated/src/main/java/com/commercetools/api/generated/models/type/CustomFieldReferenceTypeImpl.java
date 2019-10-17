package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.type.FieldType;
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
public final class CustomFieldReferenceTypeImpl implements CustomFieldReferenceType {

   private String name;
   
   private com.commercetools.api.generated.models.common.ReferenceTypeId referenceTypeId;

   @JsonCreator
   CustomFieldReferenceTypeImpl(@JsonProperty("referenceTypeId") final com.commercetools.api.generated.models.common.ReferenceTypeId referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      this.name = "Reference";
   }
   public CustomFieldReferenceTypeImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.common.ReferenceTypeId getReferenceTypeId(){
      return this.referenceTypeId;
   }

   public void setReferenceTypeId(final com.commercetools.api.generated.models.common.ReferenceTypeId referenceTypeId){
      this.referenceTypeId = referenceTypeId;
   }

}