package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TextLineItemDraftImpl implements TextLineItemDraft {

   private java.time.ZonedDateTime addedAt;

   private Integer quantity;

   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   private com.commercetools.api.models.common.LocalizedString name;

   private com.commercetools.api.models.common.LocalizedString description;

   @JsonCreator
   TextLineItemDraftImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("quantity") final Integer quantity, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
      this.addedAt = addedAt;
      this.quantity = quantity;
      this.custom = custom;
      this.name = name;
      this.description = description;
   }
   public TextLineItemDraftImpl() {

   }

   /**
   *  <p>Defaults to the current date and time.</p>
   */
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }

   /**
   *  <p>Defaults to <code>1</code>.</p>
   */
   public Integer getQuantity(){
      return this.quantity;
   }

   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }


   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }


   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public void setAddedAt(final java.time.ZonedDateTime addedAt){
      this.addedAt = addedAt;
   }

   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }

   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }

   public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
      this.description = description;
   }

}