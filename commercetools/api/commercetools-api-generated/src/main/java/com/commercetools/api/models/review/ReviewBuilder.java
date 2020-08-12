package com.commercetools.api.models.review;

import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.databind.JsonNode;
import java.time.ZonedDateTime;
import com.commercetools.api.models.review.Review;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewBuilder {


   private java.time.ZonedDateTime createdAt;


   private java.time.ZonedDateTime lastModifiedAt;


   private String id;


   private Long version;

   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;

   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

   @Nullable
   private String uniquenessValue;

   @Nullable
   private com.commercetools.api.models.type.CustomFields custom;

   @Nullable
   private Integer rating;

   @Nullable
   private String title;

   @Nullable
   private String locale;

   @Nullable
   private com.fasterxml.jackson.databind.JsonNode target;


   private Boolean includedInStatistics;

   @Nullable
   private String authorName;

   @Nullable
   private com.commercetools.api.models.state.StateReference state;

   @Nullable
   private String text;

   @Nullable
   private String key;

   @Nullable
   private com.commercetools.api.models.customer.CustomerReference customer;

   public ReviewBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public ReviewBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public ReviewBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public ReviewBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public ReviewBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public ReviewBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public ReviewBuilder uniquenessValue(@Nullable final String uniquenessValue) {
      this.uniquenessValue = uniquenessValue;
      return this;
   }

   public ReviewBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }

   public ReviewBuilder rating(@Nullable final Integer rating) {
      this.rating = rating;
      return this;
   }

   public ReviewBuilder title(@Nullable final String title) {
      this.title = title;
      return this;
   }

   public ReviewBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }

   public ReviewBuilder target(@Nullable final com.fasterxml.jackson.databind.JsonNode target) {
      this.target = target;
      return this;
   }

   public ReviewBuilder includedInStatistics( final Boolean includedInStatistics) {
      this.includedInStatistics = includedInStatistics;
      return this;
   }

   public ReviewBuilder authorName(@Nullable final String authorName) {
      this.authorName = authorName;
      return this;
   }

   public ReviewBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
      this.state = state;
      return this;
   }

   public ReviewBuilder text(@Nullable final String text) {
      this.text = text;
      return this;
   }

   public ReviewBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }

   public ReviewBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
      this.customer = customer;
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

   @Nullable
   public String getUniquenessValue(){
      return this.uniquenessValue;
   }

   @Nullable
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }

   @Nullable
   public Integer getRating(){
      return this.rating;
   }

   @Nullable
   public String getTitle(){
      return this.title;
   }

   @Nullable
   public String getLocale(){
      return this.locale;
   }

   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getTarget(){
      return this.target;
   }


   public Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }

   @Nullable
   public String getAuthorName(){
      return this.authorName;
   }

   @Nullable
   public com.commercetools.api.models.state.StateReference getState(){
      return this.state;
   }

   @Nullable
   public String getText(){
      return this.text;
   }

   @Nullable
   public String getKey(){
      return this.key;
   }

   @Nullable
   public com.commercetools.api.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public Review build() {
       return new ReviewImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, uniquenessValue, custom, rating, title, locale, target, includedInStatistics, authorName, state, text, key, customer);
   }

   public static ReviewBuilder of() {
      return new ReviewBuilder();
   }

   public static ReviewBuilder of(final Review template) {
      ReviewBuilder builder = new ReviewBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.uniquenessValue = template.getUniquenessValue();
      builder.custom = template.getCustom();
      builder.rating = template.getRating();
      builder.title = template.getTitle();
      builder.locale = template.getLocale();
      builder.target = template.getTarget();
      builder.includedInStatistics = template.getIncludedInStatistics();
      builder.authorName = template.getAuthorName();
      builder.state = template.getState();
      builder.text = template.getText();
      builder.key = template.getKey();
      builder.customer = template.getCustomer();
      return builder;
   }

}