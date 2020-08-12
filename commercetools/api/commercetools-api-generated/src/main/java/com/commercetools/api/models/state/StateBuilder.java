package com.commercetools.api.models.state;

import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateTypeEnum;
import java.time.ZonedDateTime;
import com.commercetools.api.models.state.State;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateBuilder {


   private java.time.ZonedDateTime createdAt;


   private java.time.ZonedDateTime lastModifiedAt;


   private String id;


   private Long version;

   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;

   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;


   private Boolean initial;

   @Nullable
   private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;


   private Boolean builtIn;

   @Nullable
   private com.commercetools.api.models.common.LocalizedString description;

   @Nullable
   private java.util.List<com.commercetools.api.models.state.StateReference> transitions;


   private com.commercetools.api.models.state.StateTypeEnum type;

   @Nullable
   private com.commercetools.api.models.common.LocalizedString name;


   private String key;

   public StateBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public StateBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public StateBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public StateBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public StateBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public StateBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public StateBuilder initial( final Boolean initial) {
      this.initial = initial;
      return this;
   }

   public StateBuilder roles(@Nullable final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
      this.roles = roles;
      return this;
   }

   public StateBuilder builtIn( final Boolean builtIn) {
      this.builtIn = builtIn;
      return this;
   }

   public StateBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }

   public StateBuilder transitions(@Nullable final java.util.List<com.commercetools.api.models.state.StateReference> transitions) {
      this.transitions = transitions;
      return this;
   }

   public StateBuilder type( final com.commercetools.api.models.state.StateTypeEnum type) {
      this.type = type;
      return this;
   }

   public StateBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }

   public StateBuilder key( final String key) {
      this.key = key;
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


   public Boolean getInitial(){
      return this.initial;
   }

   @Nullable
   public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles(){
      return this.roles;
   }


   public Boolean getBuiltIn(){
      return this.builtIn;
   }

   @Nullable
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }

   @Nullable
   public java.util.List<com.commercetools.api.models.state.StateReference> getTransitions(){
      return this.transitions;
   }


   public com.commercetools.api.models.state.StateTypeEnum getType(){
      return this.type;
   }

   @Nullable
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }


   public String getKey(){
      return this.key;
   }

   public State build() {
       return new StateImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, initial, roles, builtIn, description, transitions, type, name, key);
   }

   public static StateBuilder of() {
      return new StateBuilder();
   }

   public static StateBuilder of(final State template) {
      StateBuilder builder = new StateBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.initial = template.getInitial();
      builder.roles = template.getRoles();
      builder.builtIn = template.getBuiltIn();
      builder.description = template.getDescription();
      builder.transitions = template.getTransitions();
      builder.type = template.getType();
      builder.name = template.getName();
      builder.key = template.getKey();
      return builder;
   }

}