package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.discount_code.DiscountCode;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   
   private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> cartDiscounts;
   
   
   private String code;
   
   
   private java.util.List<com.commercetools.api.models.common.Reference> references;
   
   @Nullable
   private String cartPredicate;
   
   @Nullable
   private com.commercetools.api.models.type.CustomFields custom;
   
   
   private java.util.List<String> groups;
   
   @Nullable
   private com.commercetools.api.models.common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private Boolean isActive;
   
   @Nullable
   private Long maxApplications;
   
   @Nullable
   private com.commercetools.api.models.common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private Long maxApplicationsPerCustomer;
   
   public DiscountCodeBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public DiscountCodeBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public DiscountCodeBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public DiscountCodeBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public DiscountCodeBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public DiscountCodeBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public DiscountCodeBuilder cartDiscounts( final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> cartDiscounts) {
      this.cartDiscounts = cartDiscounts;
      return this;
   }
   
   public DiscountCodeBuilder code( final String code) {
      this.code = code;
      return this;
   }
   
   public DiscountCodeBuilder references( final java.util.List<com.commercetools.api.models.common.Reference> references) {
      this.references = references;
      return this;
   }
   
   public DiscountCodeBuilder cartPredicate(@Nullable final String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }
   
   public DiscountCodeBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public DiscountCodeBuilder groups( final java.util.List<String> groups) {
      this.groups = groups;
      return this;
   }
   
   public DiscountCodeBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public DiscountCodeBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public DiscountCodeBuilder isActive( final Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public DiscountCodeBuilder maxApplications(@Nullable final Long maxApplications) {
      this.maxApplications = maxApplications;
      return this;
   }
   
   public DiscountCodeBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public DiscountCodeBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public DiscountCodeBuilder maxApplicationsPerCustomer(@Nullable final Long maxApplicationsPerCustomer) {
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getCartDiscounts(){
      return this.cartDiscounts;
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public java.util.List<com.commercetools.api.models.common.Reference> getReferences(){
      return this.references;
   }
   
   @Nullable
   public String getCartPredicate(){
      return this.cartPredicate;
   }
   
   @Nullable
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<String> getGroups(){
      return this.groups;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   @Nullable
   public Long getMaxApplications(){
      return this.maxApplications;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public Long getMaxApplicationsPerCustomer(){
      return this.maxApplicationsPerCustomer;
   }

   public DiscountCode build() {
       return new DiscountCodeImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, cartDiscounts, code, references, cartPredicate, custom, groups, description, validFrom, isActive, maxApplications, name, validUntil, maxApplicationsPerCustomer);
   }
   
   public static DiscountCodeBuilder of() {
      return new DiscountCodeBuilder();
   }
   
   public static DiscountCodeBuilder of(final DiscountCode template) {
      DiscountCodeBuilder builder = new DiscountCodeBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.cartDiscounts = template.getCartDiscounts();
      builder.code = template.getCode();
      builder.references = template.getReferences();
      builder.cartPredicate = template.getCartPredicate();
      builder.custom = template.getCustom();
      builder.groups = template.getGroups();
      builder.description = template.getDescription();
      builder.validFrom = template.getValidFrom();
      builder.isActive = template.getIsActive();
      builder.maxApplications = template.getMaxApplications();
      builder.name = template.getName();
      builder.validUntil = template.getValidUntil();
      builder.maxApplicationsPerCustomer = template.getMaxApplicationsPerCustomer();
      return builder;
   }
   
}