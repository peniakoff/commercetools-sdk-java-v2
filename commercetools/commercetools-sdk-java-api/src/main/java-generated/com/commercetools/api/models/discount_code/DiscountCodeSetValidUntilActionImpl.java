
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetValidUntilActionImpl implements DiscountCodeSetValidUntilAction {

    private String action;

    private java.time.ZonedDateTime validUntil;

    @JsonCreator
    DiscountCodeSetValidUntilActionImpl(@JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        this.action = SET_VALID_UNTIL;
    }

    public DiscountCodeSetValidUntilActionImpl() {
        this.action = SET_VALID_UNTIL;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeSetValidUntilActionImpl that = (DiscountCodeSetValidUntilActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(validUntil, that.validUntil).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(validUntil).toHashCode();
    }

}
