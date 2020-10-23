package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionTrigger;
import com.commercetools.api.models.extension.ExtensionUpdateAction;
import com.commercetools.api.models.extension.ExtensionChangeTriggersActionImpl;

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
@JsonDeserialize(as = ExtensionChangeTriggersActionImpl.class)
public interface ExtensionChangeTriggersAction extends ExtensionUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("triggers")
    public List<ExtensionTrigger> getTriggers();

    public void setTriggers(final List<ExtensionTrigger> triggers);

    public static ExtensionChangeTriggersActionImpl of(){
        return new ExtensionChangeTriggersActionImpl();
    }
    

    public static ExtensionChangeTriggersActionImpl of(final ExtensionChangeTriggersAction template) {
        ExtensionChangeTriggersActionImpl instance = new ExtensionChangeTriggersActionImpl();
        instance.setTriggers(template.getTriggers());
        return instance;
    }

    default <T> T withExtensionChangeTriggersAction(Function<ExtensionChangeTriggersAction, T> helper) {
        return helper.apply(this);
    }
}
