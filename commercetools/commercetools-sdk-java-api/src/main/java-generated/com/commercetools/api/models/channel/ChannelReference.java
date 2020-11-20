package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.channel.ChannelReferenceImpl;

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
@JsonDeserialize(as = ChannelReferenceImpl.class)
public interface ChannelReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public Channel getObj();

    public void setObj(final Channel obj);

    public static ChannelReferenceImpl of(){
        return new ChannelReferenceImpl();
    }
    

    public static ChannelReferenceImpl of(final ChannelReference template) {
        ChannelReferenceImpl instance = new ChannelReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    default <T> T withChannelReference(Function<ChannelReference, T> helper) {
        return helper.apply(this);
    }
}