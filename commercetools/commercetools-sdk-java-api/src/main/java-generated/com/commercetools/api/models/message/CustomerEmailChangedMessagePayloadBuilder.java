package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerEmailChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerEmailChangedMessagePayloadBuilder {

    
    private String email;

    public CustomerEmailChangedMessagePayloadBuilder email( final String email) {
        this.email = email;
        return this;
    }

    
    public String getEmail(){
        return this.email;
    }

    public CustomerEmailChangedMessagePayload build() {
        return new CustomerEmailChangedMessagePayloadImpl(email);
    }

    public static CustomerEmailChangedMessagePayloadBuilder of() {
        return new CustomerEmailChangedMessagePayloadBuilder();
    }

    public static CustomerEmailChangedMessagePayloadBuilder of(final CustomerEmailChangedMessagePayload template) {
        CustomerEmailChangedMessagePayloadBuilder builder = new CustomerEmailChangedMessagePayloadBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
