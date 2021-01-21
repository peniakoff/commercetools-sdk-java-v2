
package com.commercetools.api.models.message;

import java.time.*;
import java.time.LocalDate;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerDateOfBirthSetMessagePayloadImpl implements CustomerDateOfBirthSetMessagePayload {

    private String type;

    private java.time.LocalDate dateOfBirth;

    @JsonCreator
    CustomerDateOfBirthSetMessagePayloadImpl(@JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.type = CUSTOMER_DATE_OF_BIRTH_SET;
    }

    public CustomerDateOfBirthSetMessagePayloadImpl() {
        this.type = CUSTOMER_DATE_OF_BIRTH_SET;
    }

    public String getType() {
        return this.type;
    }

    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerDateOfBirthSetMessagePayloadImpl that = (CustomerDateOfBirthSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(dateOfBirth, that.dateOfBirth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(dateOfBirth).toHashCode();
    }

}
