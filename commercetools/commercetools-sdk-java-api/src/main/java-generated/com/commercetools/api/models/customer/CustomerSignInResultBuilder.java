package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.Customer;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.customer.CustomerSignInResult;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSignInResultBuilder {

    
    private com.commercetools.api.models.customer.Customer customer;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode cart;

    public CustomerSignInResultBuilder customer( final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
        return this;
    }
    
    public CustomerSignInResultBuilder cart(@Nullable final com.fasterxml.jackson.databind.JsonNode cart) {
        this.cart = cart;
        return this;
    }

    
    public com.commercetools.api.models.customer.Customer getCustomer(){
        return this.customer;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getCart(){
        return this.cart;
    }

    public CustomerSignInResult build() {
        return new CustomerSignInResultImpl(customer, cart);
    }

    public static CustomerSignInResultBuilder of() {
        return new CustomerSignInResultBuilder();
    }

    public static CustomerSignInResultBuilder of(final CustomerSignInResult template) {
        CustomerSignInResultBuilder builder = new CustomerSignInResultBuilder();
        builder.customer = template.getCustomer();
        builder.cart = template.getCart();
        return builder;
    }

}
