
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateTypeEnum;
import com.commercetools.api.models.state.StateUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateChangeTypeActionImpl implements StateChangeTypeAction {

    private String action;

    private com.commercetools.api.models.state.StateTypeEnum type;

    @JsonCreator
    StateChangeTypeActionImpl(@JsonProperty("type") final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
        this.action = CHANGE_TYPE;
    }

    public StateChangeTypeActionImpl() {
        this.action = CHANGE_TYPE;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.state.StateTypeEnum getType() {
        return this.type;
    }

    public void setType(final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StateChangeTypeActionImpl that = (StateChangeTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(type).toHashCode();
    }

}
