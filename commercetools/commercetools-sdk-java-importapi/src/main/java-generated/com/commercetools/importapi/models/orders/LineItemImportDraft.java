package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.orders.ItemShippingDetailsDraft;
import com.commercetools.importapi.models.orders.ItemState;
import com.commercetools.importapi.models.orders.LineItemPrice;
import com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft;
import com.commercetools.importapi.models.prices.TaxRate;
import com.commercetools.importapi.models.orders.LineItemImportDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>Represents an individual line item in an Order. A line item is a snapshot of a product at the time it was added to the order.</p>
*  <p>You cannot create an order which includes line operations that do not exist in the project or have been deleted.
*  Products and variants referenced by a line item must already exist in the commercetools project.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LineItemImportDraftImpl.class)
public interface LineItemImportDraft  {

    /**
    *  <p>Maps to <code>LineItem.productId</code>.</p>
    */
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();
    /**
    *  <p>Maps to <code>LineItem.name</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    /**
    *  <p>Maps to <code>ProductVariantImportDraft</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public LineItemProductVariantImportDraft getVariant();
    /**
    *  <p>Maps to <code>LineItem.price</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("price")
    public LineItemPrice getPrice();
    /**
    *  <p>Maps to <code>LineItem.quantity</code>.</p>
    */
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();
    
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();
    /**
    *  <p>References a supply channel. Maps to <code>LineItem.supplyChannel</code>.</p>
    *  <p>The supply channel referenced must already exist
    *  in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelKeyReference getSupplyChannel();
    /**
    *  <p>References a distribution channel. Maps to <code>LineItem.distributionChannel</code>.</p>
    *  <p>The distribution channel referenced must already exist
    *  in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelKeyReference getDistributionChannel();
    /**
    *  <p>Maps to <code>LineItem.taxRate</code>.</p>
    */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();
    /**
    *  <p>Maps to LineItem.shippingDetails.</p>
    */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setProduct(final ProductKeyReference product);
    
    public void setName(final LocalizedString name);
    
    public void setVariant(final LineItemProductVariantImportDraft variant);
    
    public void setPrice(final LineItemPrice price);
    
    public void setQuantity(final Double quantity);
    
    public void setState(final List<ItemState> state);
    
    public void setSupplyChannel(final ChannelKeyReference supplyChannel);
    
    public void setDistributionChannel(final ChannelKeyReference distributionChannel);
    
    public void setTaxRate(final TaxRate taxRate);
    
    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static LineItemImportDraftImpl of(){
        return new LineItemImportDraftImpl();
    }
    

    public static LineItemImportDraftImpl of(final LineItemImportDraft template) {
        LineItemImportDraftImpl instance = new LineItemImportDraftImpl();
        instance.setProduct(template.getProduct());
        instance.setName(template.getName());
        instance.setVariant(template.getVariant());
        instance.setPrice(template.getPrice());
        instance.setQuantity(template.getQuantity());
        instance.setState(template.getState());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setTaxRate(template.getTaxRate());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

}