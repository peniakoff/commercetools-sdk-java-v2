
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetCustomTypeActionImpl implements OrderEditSetCustomTypeAction {

    private String action;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.fasterxml.jackson.databind.JsonNode fields;

    @JsonCreator
    OrderEditSetCustomTypeActionImpl(
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.fasterxml.jackson.databind.JsonNode fields) {
        this.type = type;
        this.fields = fields;
        this.action = SET_CUSTOM_TYPE;
    }

    public OrderEditSetCustomTypeActionImpl() {
        this.action = SET_CUSTOM_TYPE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If set, the custom type is set to this new value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
    *  <p>If set, the custom fields are set to this new value.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getFields() {
        return this.fields;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final com.fasterxml.jackson.databind.JsonNode fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderEditSetCustomTypeActionImpl that = (OrderEditSetCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(type, that.type).append(fields,
            that.fields).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(type).append(fields).toHashCode();
    }

}
