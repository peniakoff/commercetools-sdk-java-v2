package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditUpdateBuilder {
   
   @Nullable
   private Boolean dryRun;
   
   
   private java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions;
   
   
   private Long version;
   
   public OrderEditUpdateBuilder dryRun(@Nullable final Boolean dryRun) {
      this.dryRun = dryRun;
      return this;
   }
   
   public OrderEditUpdateBuilder actions( final java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public OrderEditUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   @Nullable
   public Boolean getDryRun(){
      return this.dryRun;
   }
   
   
   public java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public OrderEditUpdate build() {
       return new OrderEditUpdateImpl(dryRun, actions, version);
   }
   
   public static OrderEditUpdateBuilder of() {
      return new OrderEditUpdateBuilder();
   }
   
   public static OrderEditUpdateBuilder of(final OrderEditUpdate template) {
      OrderEditUpdateBuilder builder = new OrderEditUpdateBuilder();
      builder.dryRun = template.getDryRun();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}