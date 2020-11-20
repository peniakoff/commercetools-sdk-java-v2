package com.commercetools.api.models.common;

import com.commercetools.api.models.common.CentPrecisionMoneyDraft;
import com.commercetools.api.models.common.HighPrecisionMoneyDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.MoneyType;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypedMoneyDraftImpl implements TypedMoneyDraft {

    private Long centAmount;
    
    private String currencyCode;
    
    private com.commercetools.api.models.common.MoneyType type;
    
    private Integer fractionDigits;

    @JsonCreator
    TypedMoneyDraftImpl(@JsonProperty("centAmount") final Long centAmount, @JsonProperty("currencyCode") final String currencyCode, @JsonProperty("type") final com.commercetools.api.models.common.MoneyType type, @JsonProperty("fractionDigits") final Integer fractionDigits) {
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
        this.type = type;
        this.fractionDigits = fractionDigits;
    }
    public TypedMoneyDraftImpl() {
       
    }

    
    public Long getCentAmount(){
        return this.centAmount;
    }
    
    /**
    *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    public String getCurrencyCode(){
        return this.currencyCode;
    }
    
    
    public com.commercetools.api.models.common.MoneyType getType(){
        return this.type;
    }
    
    
    public Integer getFractionDigits(){
        return this.fractionDigits;
    }

    public void setCentAmount(final Long centAmount){
        this.centAmount = centAmount;
    }
    
    public void setCurrencyCode(final String currencyCode){
        this.currencyCode = currencyCode;
    }
    
    public void setFractionDigits(final Integer fractionDigits){
        this.fractionDigits = fractionDigits;
    }

}