package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditUpdateBuilder {

    
    private Long version;
    
    
    private java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions;
    
    @Nullable
    private Boolean dryRun;

    public OrderEditUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    public OrderEditUpdateBuilder actions( final com.commercetools.api.models.order_edit.OrderEditUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    public OrderEditUpdateBuilder actions( final java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions) {
        this.actions = actions;
        return this;
    }
    
    public OrderEditUpdateBuilder dryRun(@Nullable final Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> getActions(){
        return this.actions;
    }
    
    @Nullable
    public Boolean getDryRun(){
        return this.dryRun;
    }

    public OrderEditUpdate build() {
        return new OrderEditUpdateImpl(version, actions, dryRun);
    }

    public static OrderEditUpdateBuilder of() {
        return new OrderEditUpdateBuilder();
    }

    public static OrderEditUpdateBuilder of(final OrderEditUpdate template) {
        OrderEditUpdateBuilder builder = new OrderEditUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        builder.dryRun = template.getDryRun();
        return builder;
    }

}
