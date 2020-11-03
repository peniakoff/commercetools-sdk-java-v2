package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.AttributeConstraintEnum;
import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.TextInputHint;
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
public final class AttributeDefinitionImpl implements AttributeDefinition {

    private com.commercetools.api.models.product_type.AttributeType type;
    
    private String name;
    
    private com.commercetools.api.models.common.LocalizedString label;
    
    private Boolean isRequired;
    
    private com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint;
    
    private com.commercetools.api.models.common.LocalizedString inputTip;
    
    private com.commercetools.api.models.product_type.TextInputHint inputHint;
    
    private Boolean isSearchable;

    @JsonCreator
    AttributeDefinitionImpl(@JsonProperty("type") final com.commercetools.api.models.product_type.AttributeType type, @JsonProperty("name") final String name, @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label, @JsonProperty("isRequired") final Boolean isRequired, @JsonProperty("attributeConstraint") final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint, @JsonProperty("inputTip") final com.commercetools.api.models.common.LocalizedString inputTip, @JsonProperty("inputHint") final com.commercetools.api.models.product_type.TextInputHint inputHint, @JsonProperty("isSearchable") final Boolean isSearchable) {
        this.type = type;
        this.name = name;
        this.label = label;
        this.isRequired = isRequired;
        this.attributeConstraint = attributeConstraint;
        this.inputTip = inputTip;
        this.inputHint = inputHint;
        this.isSearchable = isSearchable;
    }
    public AttributeDefinitionImpl() {
       
    }

    /**
    *  <p>Describes the type of the attribute.</p>
    */
    public com.commercetools.api.models.product_type.AttributeType getType(){
        return this.type;
    }
    
    /**
    *  <p>The unique name of the attribute used in the API.
    *  The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>).
    *  When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types, otherwise an AttributeDefinitionAlreadyExists error code will be returned.
    *  An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
    */
    public String getName(){
        return this.name;
    }
    
    /**
    *  <p>A human-readable label for the attribute.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getLabel(){
        return this.label;
    }
    
    /**
    *  <p>Whether the attribute is required to have a value.</p>
    */
    public Boolean getIsRequired(){
        return this.isRequired;
    }
    
    /**
    *  <p>Describes how an attribute or a set of attributes should be validated across all variants of a product.</p>
    */
    public com.commercetools.api.models.product_type.AttributeConstraintEnum getAttributeConstraint(){
        return this.attributeConstraint;
    }
    
    /**
    *  <p>Additional information about the attribute that aids content managers when setting product details.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getInputTip(){
        return this.inputTip;
    }
    
    /**
    *  <p>Provides a visual representation type for this attribute.
    *  only relevant for text-based attribute types
    *  like TextType and LocalizableTextType.</p>
    */
    public com.commercetools.api.models.product_type.TextInputHint getInputHint(){
        return this.inputHint;
    }
    
    /**
    *  <p>Whether the attribute's values should generally be enabled in product search.
    *  This determines whether the value is stored in products for matching terms in the context of full-text search queries  and can be used in facets &amp; filters as part of product search queries.
    *  The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there.
    *  The max size of a searchable field is <strong>restricted to 10922 characters</strong>.
    *  This constraint is enforced at both product creation and product update.
    *  If the length of the input exceeds the maximum size an InvalidField error is returned.</p>
    */
    public Boolean getIsSearchable(){
        return this.isSearchable;
    }

    public void setType(final com.commercetools.api.models.product_type.AttributeType type){
        this.type = type;
    }
    
    public void setName(final String name){
        this.name = name;
    }
    
    public void setLabel(final com.commercetools.api.models.common.LocalizedString label){
        this.label = label;
    }
    
    public void setIsRequired(final Boolean isRequired){
        this.isRequired = isRequired;
    }
    
    public void setAttributeConstraint(final com.commercetools.api.models.product_type.AttributeConstraintEnum attributeConstraint){
        this.attributeConstraint = attributeConstraint;
    }
    
    public void setInputTip(final com.commercetools.api.models.common.LocalizedString inputTip){
        this.inputTip = inputTip;
    }
    
    public void setInputHint(final com.commercetools.api.models.product_type.TextInputHint inputHint){
        this.inputHint = inputHint;
    }
    
    public void setIsSearchable(final Boolean isSearchable){
        this.isSearchable = isSearchable;
    }

}
