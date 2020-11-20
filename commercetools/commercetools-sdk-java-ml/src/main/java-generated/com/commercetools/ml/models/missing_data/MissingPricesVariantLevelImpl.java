package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingPricesProductCount;
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
public final class MissingPricesVariantLevelImpl implements MissingPricesVariantLevel {

    private Long total;
    
    private Long missingPrices;

    @JsonCreator
    MissingPricesVariantLevelImpl(@JsonProperty("total") final Long total, @JsonProperty("missingPrices") final Long missingPrices) {
        this.total = total;
        this.missingPrices = missingPrices;
    }
    public MissingPricesVariantLevelImpl() {
       
    }

    /**
    *  <p>Number of product variants scanned.</p>
    */
    public Long getTotal(){
        return this.total;
    }
    
    /**
    *  <p>Number of product variants missing prices.</p>
    */
    public Long getMissingPrices(){
        return this.missingPrices;
    }

    public void setTotal(final Long total){
        this.total = total;
    }
    
    public void setMissingPrices(final Long missingPrices){
        this.missingPrices = missingPrices;
    }

}