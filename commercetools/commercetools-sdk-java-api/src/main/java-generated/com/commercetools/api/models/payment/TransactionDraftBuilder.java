package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.TransactionState;
import com.commercetools.api.models.payment.TransactionType;
import java.time.ZonedDateTime;
import com.commercetools.api.models.payment.TransactionDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TransactionDraftBuilder {

    @Nullable
    private java.time.ZonedDateTime timestamp;
    
    
    private com.commercetools.api.models.payment.TransactionType type;
    
    
    private com.commercetools.api.models.common.Money amount;
    
    @Nullable
    private String interactionId;
    
    @Nullable
    private com.commercetools.api.models.payment.TransactionState state;

    public TransactionDraftBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    public TransactionDraftBuilder type( final com.commercetools.api.models.payment.TransactionType type) {
        this.type = type;
        return this;
    }
    
    public TransactionDraftBuilder amount( final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }
    
    public TransactionDraftBuilder interactionId(@Nullable final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }
    
    public TransactionDraftBuilder state(@Nullable final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getTimestamp(){
        return this.timestamp;
    }
    
    
    public com.commercetools.api.models.payment.TransactionType getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.common.Money getAmount(){
        return this.amount;
    }
    
    @Nullable
    public String getInteractionId(){
        return this.interactionId;
    }
    
    @Nullable
    public com.commercetools.api.models.payment.TransactionState getState(){
        return this.state;
    }

    public TransactionDraft build() {
        return new TransactionDraftImpl(timestamp, type, amount, interactionId, state);
    }

    public static TransactionDraftBuilder of() {
        return new TransactionDraftBuilder();
    }

    public static TransactionDraftBuilder of(final TransactionDraft template) {
        TransactionDraftBuilder builder = new TransactionDraftBuilder();
        builder.timestamp = template.getTimestamp();
        builder.type = template.getType();
        builder.amount = template.getAmount();
        builder.interactionId = template.getInteractionId();
        builder.state = template.getState();
        return builder;
    }

}
