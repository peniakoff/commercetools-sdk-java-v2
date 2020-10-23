package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.Transaction;
import com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentTransactionAddedMessagePayloadImpl.class)
public interface PaymentTransactionAddedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public Transaction getTransaction();

    public void setTransaction(final Transaction transaction);

    public static PaymentTransactionAddedMessagePayloadImpl of(){
        return new PaymentTransactionAddedMessagePayloadImpl();
    }
    

    public static PaymentTransactionAddedMessagePayloadImpl of(final PaymentTransactionAddedMessagePayload template) {
        PaymentTransactionAddedMessagePayloadImpl instance = new PaymentTransactionAddedMessagePayloadImpl();
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    default <T> T withPaymentTransactionAddedMessagePayload(Function<PaymentTransactionAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
