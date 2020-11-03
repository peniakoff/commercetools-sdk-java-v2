package com.commercetools.api.models.message;

import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.message.MessagePayload;
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
public final class ProductPriceExternalDiscountSetMessagePayloadImpl implements ProductPriceExternalDiscountSetMessagePayload {

    private String type;
    
    private Integer variantId;
    
    private String variantKey;
    
    private String sku;
    
    private String priceId;
    
    private com.commercetools.api.models.common.DiscountedPrice discounted;
    
    private Boolean staged;

    @JsonCreator
    ProductPriceExternalDiscountSetMessagePayloadImpl(@JsonProperty("variantId") final Integer variantId, @JsonProperty("variantKey") final String variantKey, @JsonProperty("sku") final String sku, @JsonProperty("priceId") final String priceId, @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.variantKey = variantKey;
        this.sku = sku;
        this.priceId = priceId;
        this.discounted = discounted;
        this.staged = staged;
        this.type = "ProductPriceExternalDiscountSet";
    }
    public ProductPriceExternalDiscountSetMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public Integer getVariantId(){
        return this.variantId;
    }
    
    
    public String getVariantKey(){
        return this.variantKey;
    }
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    public String getPriceId(){
        return this.priceId;
    }
    
    
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted(){
        return this.discounted;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setVariantId(final Integer variantId){
        this.variantId = variantId;
    }
    
    public void setVariantKey(final String variantKey){
        this.variantKey = variantKey;
    }
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setPriceId(final String priceId){
        this.priceId = priceId;
    }
    
    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted){
        this.discounted = discounted;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}
