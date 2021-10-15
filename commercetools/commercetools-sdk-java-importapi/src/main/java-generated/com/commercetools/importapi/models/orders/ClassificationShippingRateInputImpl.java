
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ClassificationShippingRateInputImpl implements ClassificationShippingRateInput {

    private com.commercetools.importapi.models.orders.ShippingRateInputType type;

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString label;

    @JsonCreator
    ClassificationShippingRateInputImpl(@JsonProperty("key") final String key,
            @JsonProperty("label") final com.commercetools.importapi.models.common.LocalizedString label) {
        this.key = key;
        this.label = label;
        this.type = ShippingRateInputType.findEnum("Classification");
    }

    public ClassificationShippingRateInputImpl() {
        this.type = ShippingRateInputType.findEnum("Classification");
    }

    public com.commercetools.importapi.models.orders.ShippingRateInputType getType() {
        return this.type;
    }

    public String getKey() {
        return this.key;
    }

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    public com.commercetools.importapi.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setLabel(final com.commercetools.importapi.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ClassificationShippingRateInputImpl that = (ClassificationShippingRateInputImpl) o;

        return new EqualsBuilder().append(type, that.type).append(key, that.key).append(label, that.label).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(label).toHashCode();
    }

}
