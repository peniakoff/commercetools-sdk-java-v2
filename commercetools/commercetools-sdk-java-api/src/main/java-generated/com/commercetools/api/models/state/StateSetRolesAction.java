package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateSetRolesActionImpl;

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
@JsonDeserialize(as = StateSetRolesActionImpl.class)
public interface StateSetRolesAction extends StateUpdateAction {

    
    @NotNull
    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    public void setRoles(final List<StateRoleEnum> roles);

    public static StateSetRolesActionImpl of(){
        return new StateSetRolesActionImpl();
    }
    

    public static StateSetRolesActionImpl of(final StateSetRolesAction template) {
        StateSetRolesActionImpl instance = new StateSetRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    default <T> T withStateSetRolesAction(Function<StateSetRolesAction, T> helper) {
        return helper.apply(this);
    }
}
