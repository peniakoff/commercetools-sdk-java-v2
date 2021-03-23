
package com.commercetools.history.models;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemovePaymentChangeImpl implements RemovePaymentChange {

    private String type;

    private String change;

    private com.commercetools.history.models.PaymentInfo nextValue;

    private com.commercetools.history.models.PaymentInfo previousValue;

    @JsonCreator
    RemovePaymentChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.PaymentInfo nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.PaymentInfo previousValue) {
        this.change = change;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = REMOVE_PAYMENT_CHANGE;
    }

    public RemovePaymentChangeImpl() {
        this.type = REMOVE_PAYMENT_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>addPayment</code> &amp; <code>removePayment</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.PaymentInfo getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.PaymentInfo getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.PaymentInfo nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.PaymentInfo previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemovePaymentChangeImpl that = (RemovePaymentChangeImpl) o;

        return new EqualsBuilder().append(type, that.type).append(change, that.change).append(nextValue,
            that.nextValue).append(previousValue, that.previousValue).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(nextValue).append(
            previousValue).toHashCode();
    }

}