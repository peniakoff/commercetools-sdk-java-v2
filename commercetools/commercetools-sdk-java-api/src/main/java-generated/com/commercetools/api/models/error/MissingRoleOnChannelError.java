package com.commercetools.api.models.error;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.MissingRoleOnChannelErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MissingRoleOnChannelErrorImpl.class)
public interface MissingRoleOnChannelError extends ErrorObject {

    
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();
    
    @NotNull
    @JsonProperty("missingRole")
    public ChannelRoleEnum getMissingRole();

    public void setChannel(final ChannelResourceIdentifier channel);
    
    public void setMissingRole(final ChannelRoleEnum missingRole);

    public static MissingRoleOnChannelErrorImpl of(){
        return new MissingRoleOnChannelErrorImpl();
    }
    

    public static MissingRoleOnChannelErrorImpl of(final MissingRoleOnChannelError template) {
        MissingRoleOnChannelErrorImpl instance = new MissingRoleOnChannelErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setChannel(template.getChannel());
        instance.setMissingRole(template.getMissingRole());
        return instance;
    }

    default <T> T withMissingRoleOnChannelError(Function<MissingRoleOnChannelError, T> helper) {
        return helper.apply(this);
    }
}