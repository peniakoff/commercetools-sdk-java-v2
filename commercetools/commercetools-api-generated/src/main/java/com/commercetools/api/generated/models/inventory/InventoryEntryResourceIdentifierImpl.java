package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
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
public final class InventoryEntryResourceIdentifierImpl implements InventoryEntryResourceIdentifier {

   private com.commercetools.api.generated.models.common.ReferenceTypeId typeId;
   
   private String id;
   
   private String key;

   @JsonCreator
   InventoryEntryResourceIdentifierImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key) {
      this.id = id;
      this.key = key;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("inventory-entry").get();
   }
   public InventoryEntryResourceIdentifierImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}