
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCustomerIdActionImpl implements StagedOrderSetCustomerIdAction {

    private String action;

    private String customerId;

    @JsonCreator
    StagedOrderSetCustomerIdActionImpl(@JsonProperty("customerId") final String customerId) {
        this.customerId = customerId;
        this.action = SET_CUSTOMER_ID;
    }

    public StagedOrderSetCustomerIdActionImpl() {
        this.action = SET_CUSTOMER_ID;
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetCustomerIdActionImpl that = (StagedOrderSetCustomerIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customerId, that.customerId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customerId).toHashCode();
    }

}
