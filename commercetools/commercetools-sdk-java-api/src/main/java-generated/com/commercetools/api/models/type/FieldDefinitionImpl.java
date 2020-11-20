package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.TypeTextInputHint;
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
public final class FieldDefinitionImpl implements FieldDefinition {

    private com.commercetools.api.models.type.FieldType type;
    
    private String name;
    
    private com.commercetools.api.models.common.LocalizedString label;
    
    private Boolean required;
    
    private com.commercetools.api.models.type.TypeTextInputHint inputHint;

    @JsonCreator
    FieldDefinitionImpl(@JsonProperty("type") final com.commercetools.api.models.type.FieldType type, @JsonProperty("name") final String name, @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label, @JsonProperty("required") final Boolean required, @JsonProperty("inputHint") final com.commercetools.api.models.type.TypeTextInputHint inputHint) {
        this.type = type;
        this.name = name;
        this.label = label;
        this.required = required;
        this.inputHint = inputHint;
    }
    public FieldDefinitionImpl() {
       
    }

    /**
    *  <p>Describes the type of the field.</p>
    */
    public com.commercetools.api.models.type.FieldType getType(){
        return this.type;
    }
    
    /**
    *  <p>The name of the field.
    *  The name must be between two and 36 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>).
    *  The name must be unique for a given resource type ID.
    *  In case there is a field with the same name in another type it has to have the same FieldType also.</p>
    */
    public String getName(){
        return this.name;
    }
    
    /**
    *  <p>A human-readable label for the field.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getLabel(){
        return this.label;
    }
    
    /**
    *  <p>Whether the field is required to have a value.</p>
    */
    public Boolean getRequired(){
        return this.required;
    }
    
    /**
    *  <p>Provides a visual representation type for this field.
    *  It is only relevant for string-based field types like StringType and LocalizedStringType.</p>
    */
    public com.commercetools.api.models.type.TypeTextInputHint getInputHint(){
        return this.inputHint;
    }

    public void setType(final com.commercetools.api.models.type.FieldType type){
        this.type = type;
    }
    
    public void setName(final String name){
        this.name = name;
    }
    
    public void setLabel(final com.commercetools.api.models.common.LocalizedString label){
        this.label = label;
    }
    
    public void setRequired(final Boolean required){
        this.required = required;
    }
    
    public void setInputHint(final com.commercetools.api.models.type.TypeTextInputHint inputHint){
        this.inputHint = inputHint;
    }

}