package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CategorySlugChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySlugChangedMessagePayloadBuilder {

    
    private com.commercetools.api.models.common.LocalizedString slug;

    public CategorySlugChangedMessagePayloadBuilder slug( final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }

    public CategorySlugChangedMessagePayload build() {
        return new CategorySlugChangedMessagePayloadImpl(slug);
    }

    public static CategorySlugChangedMessagePayloadBuilder of() {
        return new CategorySlugChangedMessagePayloadBuilder();
    }

    public static CategorySlugChangedMessagePayloadBuilder of(final CategorySlugChangedMessagePayload template) {
        CategorySlugChangedMessagePayloadBuilder builder = new CategorySlugChangedMessagePayloadBuilder();
        builder.slug = template.getSlug();
        return builder;
    }

}