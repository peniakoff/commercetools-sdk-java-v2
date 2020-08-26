package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice;
import com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft;
import com.commercetools.importapi.models.orders.ExternalTaxRateDraft;
import com.commercetools.importapi.models.orders.ItemShippingDetailsDraft;
import com.commercetools.importapi.models.orders.ItemState;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemDraftImpl implements CustomLineItemDraft {

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.TypedMoney money;

    private com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice taxedPrice;

    private com.commercetools.importapi.models.common.TypedMoney totalPrice;

    private String slug;

    private Double quantity;

    private java.util.List<com.commercetools.importapi.models.orders.ItemState> state;

    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    private com.commercetools.importapi.models.prices.TaxRate taxRate;

    private com.commercetools.importapi.models.orders.ExternalTaxRateDraft externalTaxRate;

    private java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> discountedPricePerQuantity;

    private com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails;

    @JsonCreator
    CustomLineItemDraftImpl(@JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name, @JsonProperty("money") final com.commercetools.importapi.models.common.TypedMoney money, @JsonProperty("taxedPrice") final com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice taxedPrice, @JsonProperty("totalPrice") final com.commercetools.importapi.models.common.TypedMoney totalPrice, @JsonProperty("slug") final String slug, @JsonProperty("quantity") final Double quantity, @JsonProperty("state") final java.util.List<com.commercetools.importapi.models.orders.ItemState> state, @JsonProperty("taxCategory") final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory, @JsonProperty("taxRate") final com.commercetools.importapi.models.prices.TaxRate taxRate, @JsonProperty("externalTaxRate") final com.commercetools.importapi.models.orders.ExternalTaxRateDraft externalTaxRate, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> discountedPricePerQuantity, @JsonProperty("shippingDetails") final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails) {
        this.name = name;
        this.money = money;
        this.taxedPrice = taxedPrice;
        this.totalPrice = totalPrice;
        this.slug = slug;
        this.quantity = quantity;
        this.state = state;
        this.taxCategory = taxCategory;
        this.taxRate = taxRate;
        this.externalTaxRate = externalTaxRate;
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        this.shippingDetails = shippingDetails;
    }
    public CustomLineItemDraftImpl() {

    }


    public com.commercetools.importapi.models.common.LocalizedString getName(){
        return this.name;
    }


    public com.commercetools.importapi.models.common.TypedMoney getMoney(){
        return this.money;
    }


    public com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice getTaxedPrice(){
        return this.taxedPrice;
    }


    public com.commercetools.importapi.models.common.TypedMoney getTotalPrice(){
        return this.totalPrice;
    }


    public String getSlug(){
        return this.slug;
    }


    public Double getQuantity(){
        return this.quantity;
    }


    public java.util.List<com.commercetools.importapi.models.orders.ItemState> getState(){
        return this.state;
    }

    /**
    *  <p>References a tax category by its key.</p>
    */
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory(){
        return this.taxCategory;
    }


    public com.commercetools.importapi.models.prices.TaxRate getTaxRate(){
        return this.taxRate;
    }


    public com.commercetools.importapi.models.orders.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }


    public java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> getDiscountedPricePerQuantity(){
        return this.discountedPricePerQuantity;
    }


    public com.commercetools.importapi.models.orders.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }

    public void setName(final com.commercetools.importapi.models.common.LocalizedString name){
        this.name = name;
    }

    public void setMoney(final com.commercetools.importapi.models.common.TypedMoney money){
        this.money = money;
    }

    public void setTaxedPrice(final com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice taxedPrice){
        this.taxedPrice = taxedPrice;
    }

    public void setTotalPrice(final com.commercetools.importapi.models.common.TypedMoney totalPrice){
        this.totalPrice = totalPrice;
    }

    public void setSlug(final String slug){
        this.slug = slug;
    }

    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }

    public void setState(final java.util.List<com.commercetools.importapi.models.orders.ItemState> state){
        this.state = state;
    }

    public void setTaxCategory(final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory){
        this.taxCategory = taxCategory;
    }

    public void setTaxRate(final com.commercetools.importapi.models.prices.TaxRate taxRate){
        this.taxRate = taxRate;
    }

    public void setExternalTaxRate(final com.commercetools.importapi.models.orders.ExternalTaxRateDraft externalTaxRate){
        this.externalTaxRate = externalTaxRate;
    }

    public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> discountedPricePerQuantity){
        this.discountedPricePerQuantity = discountedPricePerQuantity;
    }

    public void setShippingDetails(final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails){
        this.shippingDetails = shippingDetails;
    }

}