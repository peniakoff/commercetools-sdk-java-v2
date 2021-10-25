
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountedPriceDraftBuilder implements Builder<DiscountedPriceDraft> {

    private com.commercetools.api.models.common.Money value;

    private com.commercetools.api.models.product_discount.ProductDiscountReference discount;

    public DiscountedPriceDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public DiscountedPriceDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    public DiscountedPriceDraftBuilder discount(
            Function<com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder, com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder> builder) {
        this.discount = builder
                .apply(com.commercetools.api.models.product_discount.ProductDiscountReferenceBuilder.of())
                .build();
        return this;
    }

    public DiscountedPriceDraftBuilder discount(
            final com.commercetools.api.models.product_discount.ProductDiscountReference discount) {
        this.discount = discount;
        return this;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public com.commercetools.api.models.product_discount.ProductDiscountReference getDiscount() {
        return this.discount;
    }

    public DiscountedPriceDraft build() {
        Objects.requireNonNull(value, DiscountedPriceDraft.class + ": value is missing");
        Objects.requireNonNull(discount, DiscountedPriceDraft.class + ": discount is missing");
        return new DiscountedPriceDraftImpl(value, discount);
    }

    /**
     * builds DiscountedPriceDraft without checking for non null required values
     */
    public DiscountedPriceDraft buildUnchecked() {
        return new DiscountedPriceDraftImpl(value, discount);
    }

    public static DiscountedPriceDraftBuilder of() {
        return new DiscountedPriceDraftBuilder();
    }

    public static DiscountedPriceDraftBuilder of(final DiscountedPriceDraft template) {
        DiscountedPriceDraftBuilder builder = new DiscountedPriceDraftBuilder();
        builder.value = template.getValue();
        builder.discount = template.getDiscount();
        return builder;
    }

}