package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SubscriptionUpdateImpl.class)
public interface SubscriptionUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<SubscriptionUpdateAction> getActions();

    public void setVersion(final Long version);
    
    public void setActions(final List<SubscriptionUpdateAction> actions);

    public static SubscriptionUpdateImpl of(){
        return new SubscriptionUpdateImpl();
    }
    

    public static SubscriptionUpdateImpl of(final SubscriptionUpdate template) {
        SubscriptionUpdateImpl instance = new SubscriptionUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withSubscriptionUpdate(Function<SubscriptionUpdate, T> helper) {
        return helper.apply(this);
    }
}
