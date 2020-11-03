package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategorySetAssetTagsActionImpl;

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
@JsonDeserialize(as = CategorySetAssetTagsActionImpl.class)
public interface CategorySetAssetTagsAction extends CategoryUpdateAction {

    
    
    @JsonProperty("assetId")
    public String getAssetId();
    
    
    @JsonProperty("assetKey")
    public String getAssetKey();
    
    
    @JsonProperty("tags")
    public List<String> getTags();

    public void setAssetId(final String assetId);
    
    public void setAssetKey(final String assetKey);
    
    @JsonIgnore
    public void setTags(final String ...tags);
    public void setTags(final List<String> tags);

    public static CategorySetAssetTagsActionImpl of(){
        return new CategorySetAssetTagsActionImpl();
    }
    

    public static CategorySetAssetTagsActionImpl of(final CategorySetAssetTagsAction template) {
        CategorySetAssetTagsActionImpl instance = new CategorySetAssetTagsActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(template.getTags());
        return instance;
    }

    default <T> T withCategorySetAssetTagsAction(Function<CategorySetAssetTagsAction, T> helper) {
        return helper.apply(this);
    }
}
