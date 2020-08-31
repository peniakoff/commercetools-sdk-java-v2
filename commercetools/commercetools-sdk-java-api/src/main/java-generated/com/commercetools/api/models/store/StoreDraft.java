package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store.StoreDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StoreDraftImpl.class)
public interface StoreDraft  {

    /**
    *  <p>User-specific unique identifier for the store.
    *  The <code>key</code> is mandatory and immutable.
    *  It is used to reference the store.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();
    /**
    *  <p>The name of the store</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    
    
    @JsonProperty("languages")
    public List<String> getLanguages();
    /**
    *  <p>Set of ResourceIdentifiers to a Channel with <code>ProductDistribution</code> role</p>
    */
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelResourceIdentifier> getDistributionChannels();
    /**
    *  <p>Set of ResourceIdentifiers of Channels with <code>InventorySupply</code> role</p>
    */
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelResourceIdentifier> getSupplyChannels();

    public void setKey(final String key);
    
    public void setName(final LocalizedString name);
    
    public void setLanguages(final List<String> languages);
    
    public void setDistributionChannels(final List<ChannelResourceIdentifier> distributionChannels);
    
    public void setSupplyChannels(final List<ChannelResourceIdentifier> supplyChannels);

    public static StoreDraftImpl of(){
        return new StoreDraftImpl();
    }
    

    public static StoreDraftImpl of(final StoreDraft template) {
        StoreDraftImpl instance = new StoreDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setLanguages(template.getLanguages());
        instance.setDistributionChannels(template.getDistributionChannels());
        instance.setSupplyChannels(template.getSupplyChannels());
        return instance;
    }

}