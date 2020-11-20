package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesErrorImpl;

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
@JsonDeserialize(as = ProjectNotConfiguredForLanguagesErrorImpl.class)
public interface ProjectNotConfiguredForLanguagesError extends ErrorObject {

    
    
    @JsonProperty("languages")
    public List<String> getLanguages();

    @JsonIgnore
    public void setLanguages(final String ...languages);
    public void setLanguages(final List<String> languages);

    public static ProjectNotConfiguredForLanguagesErrorImpl of(){
        return new ProjectNotConfiguredForLanguagesErrorImpl();
    }
    

    public static ProjectNotConfiguredForLanguagesErrorImpl of(final ProjectNotConfiguredForLanguagesError template) {
        ProjectNotConfiguredForLanguagesErrorImpl instance = new ProjectNotConfiguredForLanguagesErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLanguages(template.getLanguages());
        return instance;
    }

    default <T> T withProjectNotConfiguredForLanguagesError(Function<ProjectNotConfiguredForLanguagesError, T> helper) {
        return helper.apply(this);
    }
}