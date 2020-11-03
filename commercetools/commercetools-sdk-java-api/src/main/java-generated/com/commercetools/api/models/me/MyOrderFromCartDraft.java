package com.commercetools.api.models.me;


import com.commercetools.api.models.me.MyOrderFromCartDraftImpl;

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
@JsonDeserialize(as = MyOrderFromCartDraftImpl.class)
public interface MyOrderFromCartDraft  {

    /**
    *  <p>The unique ID of the cart from which an order is created.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    public void setId(final String id);
    
    public void setVersion(final Long version);

    public static MyOrderFromCartDraftImpl of(){
        return new MyOrderFromCartDraftImpl();
    }
    

    public static MyOrderFromCartDraftImpl of(final MyOrderFromCartDraft template) {
        MyOrderFromCartDraftImpl instance = new MyOrderFromCartDraftImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        return instance;
    }

    default <T> T withMyOrderFromCartDraft(Function<MyOrderFromCartDraft, T> helper) {
        return helper.apply(this);
    }
}
