package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ShippingRateInput;
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
public final class ScoreShippingRateInputImpl implements ScoreShippingRateInput {

    private String type;
    
    private Double score;

    @JsonCreator
    ScoreShippingRateInputImpl(@JsonProperty("score") final Double score) {
        this.score = score;
        this.type = "Score";
    }
    public ScoreShippingRateInputImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public Double getScore(){
        return this.score;
    }

    public void setScore(final Double score){
        this.score = score;
    }

}