package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
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
public final class CategorySetAssetTagsActionImpl implements CategorySetAssetTagsAction {

    private String action;
    
    private String assetId;
    
    private String assetKey;
    
    private java.util.List<String> tags;

    @JsonCreator
    CategorySetAssetTagsActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey, @JsonProperty("tags") final java.util.List<String> tags) {
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.tags = tags;
        this.action = "setAssetTags";
    }
    public CategorySetAssetTagsActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAssetId(){
        return this.assetId;
    }
    
    
    public String getAssetKey(){
        return this.assetKey;
    }
    
    
    public java.util.List<String> getTags(){
        return this.tags;
    }

    public void setAssetId(final String assetId){
        this.assetId = assetId;
    }
    
    public void setAssetKey(final String assetKey){
        this.assetKey = assetKey;
    }
    
    public void setTags(final String ...tags){
       this.tags = new ArrayList<>(Arrays.asList(tags));
    }
    
    public void setTags(final java.util.List<String> tags){
       this.tags = tags;
    }

}
