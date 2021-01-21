
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetCustomFieldActionImpl implements CategorySetCustomFieldAction {

    private String action;

    private String name;

    private com.fasterxml.jackson.databind.JsonNode value;

    @JsonCreator
    CategorySetCustomFieldActionImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
        this.name = name;
        this.value = value;
        this.action = SET_CUSTOM_FIELD;
    }

    public CategorySetCustomFieldActionImpl() {
        this.action = SET_CUSTOM_FIELD;
    }

    public String getAction() {
        return this.action;
    }

    public String getName() {
        return this.name;
    }

    public com.fasterxml.jackson.databind.JsonNode getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetCustomFieldActionImpl that = (CategorySetCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(name, that.name).append(value,
            that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).append(value).toHashCode();
    }

}
