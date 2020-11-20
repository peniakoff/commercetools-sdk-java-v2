package com.commercetools.api.models.error;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceErrorImpl;

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
@JsonDeserialize(as = DuplicateFieldWithConflictingResourceErrorImpl.class)
public interface DuplicateFieldWithConflictingResourceError extends ErrorObject {

    
    @NotNull
    @JsonProperty("field")
    public String getField();
    
    @NotNull
    @JsonProperty("duplicateValue")
    public JsonNode getDuplicateValue();
    
    @NotNull
    @Valid
    @JsonProperty("conflictingResource")
    public Reference getConflictingResource();

    public void setField(final String field);
    
    public void setDuplicateValue(final JsonNode duplicateValue);
    
    public void setConflictingResource(final Reference conflictingResource);

    public static DuplicateFieldWithConflictingResourceErrorImpl of(){
        return new DuplicateFieldWithConflictingResourceErrorImpl();
    }
    

    public static DuplicateFieldWithConflictingResourceErrorImpl of(final DuplicateFieldWithConflictingResourceError template) {
        DuplicateFieldWithConflictingResourceErrorImpl instance = new DuplicateFieldWithConflictingResourceErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        instance.setConflictingResource(template.getConflictingResource());
        return instance;
    }

    default <T> T withDuplicateFieldWithConflictingResourceError(Function<DuplicateFieldWithConflictingResourceError, T> helper) {
        return helper.apply(this);
    }
}