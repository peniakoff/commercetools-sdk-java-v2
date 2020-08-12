package com.commercetools.importer.models.categories;

import com.commercetools.importer.models.common.Asset;
import com.commercetools.importer.models.common.CategoryKeyReference;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.customfields.Custom;
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


/**
*  <p>Import representation for a category.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryImportImpl implements CategoryImport {

   private String key;
   
   private com.commercetools.importer.models.common.LocalizedString name;
   
   private com.commercetools.importer.models.common.LocalizedString slug;
   
   private com.commercetools.importer.models.common.LocalizedString description;
   
   private com.commercetools.importer.models.common.CategoryKeyReference parent;
   
   private String orderHint;
   
   private String externalId;
   
   private com.commercetools.importer.models.common.LocalizedString metaTitle;
   
   private com.commercetools.importer.models.common.LocalizedString metaDescription;
   
   private com.commercetools.importer.models.common.LocalizedString metaKeywords;
   
   private java.util.List<com.commercetools.importer.models.common.Asset> assets;
   
   private com.commercetools.importer.models.customfields.Custom custom;

   @JsonCreator
   CategoryImportImpl(@JsonProperty("key") final String key, @JsonProperty("name") final com.commercetools.importer.models.common.LocalizedString name, @JsonProperty("slug") final com.commercetools.importer.models.common.LocalizedString slug, @JsonProperty("description") final com.commercetools.importer.models.common.LocalizedString description, @JsonProperty("parent") final com.commercetools.importer.models.common.CategoryKeyReference parent, @JsonProperty("orderHint") final String orderHint, @JsonProperty("externalId") final String externalId, @JsonProperty("metaTitle") final com.commercetools.importer.models.common.LocalizedString metaTitle, @JsonProperty("metaDescription") final com.commercetools.importer.models.common.LocalizedString metaDescription, @JsonProperty("metaKeywords") final com.commercetools.importer.models.common.LocalizedString metaKeywords, @JsonProperty("assets") final java.util.List<com.commercetools.importer.models.common.Asset> assets, @JsonProperty("custom") final com.commercetools.importer.models.customfields.Custom custom) {
      this.key = key;
      this.name = name;
      this.slug = slug;
      this.description = description;
      this.parent = parent;
      this.orderHint = orderHint;
      this.externalId = externalId;
      this.metaTitle = metaTitle;
      this.metaDescription = metaDescription;
      this.metaKeywords = metaKeywords;
      this.assets = assets;
      this.custom = custom;
   }
   public CategoryImportImpl() {
      
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>Maps to <code>Category.name</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>Maps to <code>Category.slug</code>.
   *  Must match the pattern <code>[-a-zA-Z0-9_]{2,256}</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getSlug(){
      return this.slug;
   }
   
   /**
   *  <p>Maps to <code>Category.description</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   *  <p>Maps to <code>Category.parent</code>.
   *  The parent category referenced must already exist
   *  in the commercetools project, or the import operation
   *  will have an <code>Unresolved</code> state.</p>
   */
   public com.commercetools.importer.models.common.CategoryKeyReference getParent(){
      return this.parent;
   }
   
   /**
   *  <p>Maps to <code>Category.orderHint</code>.</p>
   */
   public String getOrderHint(){
      return this.orderHint;
   }
   
   /**
   *  <p>Maps to <code>Category.externalId</code>.</p>
   */
   public String getExternalId(){
      return this.externalId;
   }
   
   /**
   *  <p>Maps to <code>Category.metaTitle</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   /**
   *  <p>Maps to <code>Category.metaDescription</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   /**
   *  <p>Maps to <code>Category.metaKeywords</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public java.util.List<com.commercetools.importer.models.common.Asset> getAssets(){
      return this.assets;
   }
   
   /**
   *  <p>The custom fields for this category.</p>
   */
   public com.commercetools.importer.models.customfields.Custom getCustom(){
      return this.custom;
   }

   public void setKey(final String key){
      this.key = key;
   }
   
   public void setName(final com.commercetools.importer.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setSlug(final com.commercetools.importer.models.common.LocalizedString slug){
      this.slug = slug;
   }
   
   public void setDescription(final com.commercetools.importer.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setParent(final com.commercetools.importer.models.common.CategoryKeyReference parent){
      this.parent = parent;
   }
   
   public void setOrderHint(final String orderHint){
      this.orderHint = orderHint;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setMetaTitle(final com.commercetools.importer.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setMetaDescription(final com.commercetools.importer.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setMetaKeywords(final com.commercetools.importer.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setAssets(final java.util.List<com.commercetools.importer.models.common.Asset> assets){
      this.assets = assets;
   }
   
   public void setCustom(final com.commercetools.importer.models.customfields.Custom custom){
      this.custom = custom;
   }

}