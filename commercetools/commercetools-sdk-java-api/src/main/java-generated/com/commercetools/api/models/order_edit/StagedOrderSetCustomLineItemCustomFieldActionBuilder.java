package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetCustomLineItemCustomFieldActionBuilder {

    
    private String customLineItemId;
    
    
    private String name;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public StagedOrderSetCustomLineItemCustomFieldActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    public StagedOrderSetCustomLineItemCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    public StagedOrderSetCustomLineItemCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public StagedOrderSetCustomLineItemCustomFieldAction build() {
        return new StagedOrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder of() {
        return new StagedOrderSetCustomLineItemCustomFieldActionBuilder();
    }

    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder of(final StagedOrderSetCustomLineItemCustomFieldAction template) {
        StagedOrderSetCustomLineItemCustomFieldActionBuilder builder = new StagedOrderSetCustomLineItemCustomFieldActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
