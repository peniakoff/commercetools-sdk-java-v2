package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.products.SearchKeyword;
import com.commercetools.importapi.models.products.SearchKeywordsImpl;

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
@JsonDeserialize(as = SearchKeywordsImpl.class)
public interface SearchKeywords  {

    
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, List<SearchKeyword>> values();

    @JsonAnySetter
    public void setValue(String key, List<SearchKeyword> value);

    public static SearchKeywordsImpl of(){
        return new SearchKeywordsImpl();
    }
    

    public static SearchKeywordsImpl of(final SearchKeywords template) {
        SearchKeywordsImpl instance = new SearchKeywordsImpl();
        return instance;
    }

    default <T> T withSearchKeywords(Function<SearchKeywords, T> helper) {
        return helper.apply(this);
    }
}