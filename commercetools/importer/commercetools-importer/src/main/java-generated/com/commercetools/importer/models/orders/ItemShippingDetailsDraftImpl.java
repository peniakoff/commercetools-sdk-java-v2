package com.commercetools.importer.models.orders;

import com.commercetools.importer.models.orders.ItemShippingTarget;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ItemShippingDetailsDraftImpl implements ItemShippingDetailsDraft {

    private java.util.List<com.commercetools.importer.models.orders.ItemShippingTarget> targets;

    @JsonCreator
    ItemShippingDetailsDraftImpl(@JsonProperty("targets") final java.util.List<com.commercetools.importer.models.orders.ItemShippingTarget> targets) {
        this.targets = targets;
    }
    public ItemShippingDetailsDraftImpl() {
       
    }

    /**
    *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
    */
    public java.util.List<com.commercetools.importer.models.orders.ItemShippingTarget> getTargets(){
        return this.targets;
    }

    public void setTargets(final java.util.List<com.commercetools.importer.models.orders.ItemShippingTarget> targets){
        this.targets = targets;
    }

}