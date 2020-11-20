package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.productvariants.ProductVariantPatch;
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


/**
*  <p>An import request for multiple product variant patch resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantPatchRequestImpl implements ProductVariantPatchRequest {

    private com.commercetools.importapi.models.common.ImportResourceType type;
    
    private java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches;

    @JsonCreator
    ProductVariantPatchRequestImpl(@JsonProperty("patches") final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches) {
        this.patches = patches;
        this.type = ImportResourceType.findEnum("product-variant-patch");
    }
    public ProductVariantPatchRequestImpl() {
       
    }

    /**
    *  <p>The type of the import resource.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getType(){
        return this.type;
    }
    
    /**
    *  <p>The product variant patches of this request.</p>
    */
    public java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> getPatches(){
        return this.patches;
    }

    public void setPatches(final com.commercetools.importapi.models.productvariants.ProductVariantPatch ...patches){
       this.patches = new ArrayList<>(Arrays.asList(patches));
    }
    
    public void setPatches(final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches){
       this.patches = patches;
    }

}