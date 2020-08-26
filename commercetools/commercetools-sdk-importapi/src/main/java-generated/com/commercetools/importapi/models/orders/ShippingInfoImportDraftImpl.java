package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.ShippingMethodKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.orders.Delivery;
import com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft;
import com.commercetools.importapi.models.orders.ShippingMethodState;
import com.commercetools.importapi.models.orders.ShippingRateDraft;
import com.commercetools.importapi.models.prices.TaxRate;
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


/**
*  <p>Maps to an order's <code>shippingInfo</code> property. This field is usually populated by the cart assosciated with
*  the order, but when importing orders you must provide a draft representation as a part of the OrderImport.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingInfoImportDraftImpl implements ShippingInfoImportDraft {

    private String shippingMethodName;

    private com.commercetools.importapi.models.common.TypedMoney price;

    private com.commercetools.importapi.models.orders.ShippingRateDraft shippingRate;

    private com.commercetools.importapi.models.prices.TaxRate taxRate;

    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    private com.commercetools.importapi.models.common.ShippingMethodKeyReference shippingMethod;

    private java.util.List<com.commercetools.importapi.models.orders.Delivery> deliveries;

    private com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft discountedPrice;

    private com.commercetools.importapi.models.orders.ShippingMethodState shippingMethodState;

    @JsonCreator
    ShippingInfoImportDraftImpl(@JsonProperty("shippingMethodName") final String shippingMethodName, @JsonProperty("price") final com.commercetools.importapi.models.common.TypedMoney price, @JsonProperty("shippingRate") final com.commercetools.importapi.models.orders.ShippingRateDraft shippingRate, @JsonProperty("taxRate") final com.commercetools.importapi.models.prices.TaxRate taxRate, @JsonProperty("taxCategory") final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory, @JsonProperty("shippingMethod") final com.commercetools.importapi.models.common.ShippingMethodKeyReference shippingMethod, @JsonProperty("deliveries") final java.util.List<com.commercetools.importapi.models.orders.Delivery> deliveries, @JsonProperty("discountedPrice") final com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft discountedPrice, @JsonProperty("shippingMethodState") final com.commercetools.importapi.models.orders.ShippingMethodState shippingMethodState) {
        this.shippingMethodName = shippingMethodName;
        this.price = price;
        this.shippingRate = shippingRate;
        this.taxRate = taxRate;
        this.taxCategory = taxCategory;
        this.shippingMethod = shippingMethod;
        this.deliveries = deliveries;
        this.discountedPrice = discountedPrice;
        this.shippingMethodState = shippingMethodState;
    }
    public ShippingInfoImportDraftImpl() {

    }


    public String getShippingMethodName(){
        return this.shippingMethodName;
    }


    public com.commercetools.importapi.models.common.TypedMoney getPrice(){
        return this.price;
    }


    public com.commercetools.importapi.models.orders.ShippingRateDraft getShippingRate(){
        return this.shippingRate;
    }


    public com.commercetools.importapi.models.prices.TaxRate getTaxRate(){
        return this.taxRate;
    }

    /**
    *  <p>References a tax category by its key.</p>
    */
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory(){
        return this.taxCategory;
    }

    /**
    *  <p>References a shipping method by its key.</p>
    */
    public com.commercetools.importapi.models.common.ShippingMethodKeyReference getShippingMethod(){
        return this.shippingMethod;
    }


    public java.util.List<com.commercetools.importapi.models.orders.Delivery> getDeliveries(){
        return this.deliveries;
    }


    public com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft getDiscountedPrice(){
        return this.discountedPrice;
    }


    public com.commercetools.importapi.models.orders.ShippingMethodState getShippingMethodState(){
        return this.shippingMethodState;
    }

    public void setShippingMethodName(final String shippingMethodName){
        this.shippingMethodName = shippingMethodName;
    }

    public void setPrice(final com.commercetools.importapi.models.common.TypedMoney price){
        this.price = price;
    }

    public void setShippingRate(final com.commercetools.importapi.models.orders.ShippingRateDraft shippingRate){
        this.shippingRate = shippingRate;
    }

    public void setTaxRate(final com.commercetools.importapi.models.prices.TaxRate taxRate){
        this.taxRate = taxRate;
    }

    public void setTaxCategory(final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory){
        this.taxCategory = taxCategory;
    }

    public void setShippingMethod(final com.commercetools.importapi.models.common.ShippingMethodKeyReference shippingMethod){
        this.shippingMethod = shippingMethod;
    }

    public void setDeliveries(final java.util.List<com.commercetools.importapi.models.orders.Delivery> deliveries){
        this.deliveries = deliveries;
    }

    public void setDiscountedPrice(final com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft discountedPrice){
        this.discountedPrice = discountedPrice;
    }

    public void setShippingMethodState(final com.commercetools.importapi.models.orders.ShippingMethodState shippingMethodState){
        this.shippingMethodState = shippingMethodState;
    }

}