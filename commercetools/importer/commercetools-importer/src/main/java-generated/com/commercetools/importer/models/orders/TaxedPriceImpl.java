package com.commercetools.importer.models.orders;

import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.orders.TaxPortion;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxedPriceImpl implements TaxedPrice {

    private com.commercetools.importer.models.common.Money totalNet;
    
    private com.commercetools.importer.models.common.Money totalGross;
    
    private java.util.List<com.commercetools.importer.models.orders.TaxPortion> taxPortions;

    @JsonCreator
    TaxedPriceImpl(@JsonProperty("totalNet") final com.commercetools.importer.models.common.Money totalNet, @JsonProperty("totalGross") final com.commercetools.importer.models.common.Money totalGross, @JsonProperty("taxPortions") final java.util.List<com.commercetools.importer.models.orders.TaxPortion> taxPortions) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
        this.taxPortions = taxPortions;
    }
    public TaxedPriceImpl() {
       
    }

    
    public com.commercetools.importer.models.common.Money getTotalNet(){
        return this.totalNet;
    }
    
    
    public com.commercetools.importer.models.common.Money getTotalGross(){
        return this.totalGross;
    }
    
    
    public java.util.List<com.commercetools.importer.models.orders.TaxPortion> getTaxPortions(){
        return this.taxPortions;
    }

    public void setTotalNet(final com.commercetools.importer.models.common.Money totalNet){
        this.totalNet = totalNet;
    }
    
    public void setTotalGross(final com.commercetools.importer.models.common.Money totalGross){
        this.totalGross = totalGross;
    }
    
    public void setTaxPortions(final java.util.List<com.commercetools.importer.models.orders.TaxPortion> taxPortions){
        this.taxPortions = taxPortions;
    }

}