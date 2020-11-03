package com.commercetools.api.models.common;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.PriceTier;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.common.PriceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PriceImpl.class)
public interface Price  {

    
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();
    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    
    @JsonProperty("country")
    public String getCountry();
    
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();
    
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();
    
    
    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();
    
    
    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();
    
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();
    
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();
    
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    public void setId(final String id);
    
    public void setValue(final TypedMoney value);
    
    public void setCountry(final String country);
    
    public void setCustomerGroup(final CustomerGroupReference customerGroup);
    
    public void setChannel(final ChannelReference channel);
    
    public void setValidFrom(final ZonedDateTime validFrom);
    
    public void setValidUntil(final ZonedDateTime validUntil);
    
    public void setDiscounted(final DiscountedPrice discounted);
    
    public void setCustom(final CustomFields custom);
    
    @JsonIgnore
    public void setTiers(final PriceTier ...tiers);
    public void setTiers(final List<PriceTier> tiers);

    public static PriceImpl of(){
        return new PriceImpl();
    }
    

    public static PriceImpl of(final Price template) {
        PriceImpl instance = new PriceImpl();
        instance.setId(template.getId());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setDiscounted(template.getDiscounted());
        instance.setCustom(template.getCustom());
        instance.setTiers(template.getTiers());
        return instance;
    }

    default <T> T withPrice(Function<Price, T> helper) {
        return helper.apply(this);
    }
}
