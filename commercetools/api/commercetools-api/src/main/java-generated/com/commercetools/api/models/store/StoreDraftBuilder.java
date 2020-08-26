package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store.StoreDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreDraftBuilder {

    
    private String key;
    
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    @Nullable
    private java.util.List<String> languages;
    
    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;
    
    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    public StoreDraftBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    public StoreDraftBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    public StoreDraftBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }
    
    public StoreDraftBuilder distributionChannels(@Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }
    
    public StoreDraftBuilder supplyChannels(@Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    @Nullable
    public java.util.List<String> getLanguages(){
        return this.languages;
    }
    
    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels(){
        return this.distributionChannels;
    }
    
    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels(){
        return this.supplyChannels;
    }

    public StoreDraft build() {
        return new StoreDraftImpl(key, name, languages, distributionChannels, supplyChannels);
    }

    public static StoreDraftBuilder of() {
        return new StoreDraftBuilder();
    }

    public static StoreDraftBuilder of(final StoreDraft template) {
        StoreDraftBuilder builder = new StoreDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.languages = template.getLanguages();
        builder.distributionChannels = template.getDistributionChannels();
        builder.supplyChannels = template.getSupplyChannels();
        return builder;
    }

}