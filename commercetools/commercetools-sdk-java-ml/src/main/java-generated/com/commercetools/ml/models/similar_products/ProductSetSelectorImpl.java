package com.commercetools.ml.models.similar_products;


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
*  <p>A set of ProductData for comparison. If no optional attributes are specified, all <code>current</code> ProductData are selected for comparison.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetSelectorImpl implements ProductSetSelector {

    private String projectKey;
    
    private java.util.List<String> productIds;
    
    private java.util.List<String> productTypeIds;
    
    private Boolean staged;
    
    private Boolean includeVariants;
    
    private Long productSetLimit;

    @JsonCreator
    ProductSetSelectorImpl(@JsonProperty("projectKey") final String projectKey, @JsonProperty("productIds") final java.util.List<String> productIds, @JsonProperty("productTypeIds") final java.util.List<String> productTypeIds, @JsonProperty("staged") final Boolean staged, @JsonProperty("includeVariants") final Boolean includeVariants, @JsonProperty("productSetLimit") final Long productSetLimit) {
        this.projectKey = projectKey;
        this.productIds = productIds;
        this.productTypeIds = productTypeIds;
        this.staged = staged;
        this.includeVariants = includeVariants;
        this.productSetLimit = productSetLimit;
    }
    public ProductSetSelectorImpl() {
       
    }

    /**
    *  <p>The project containing the project set.</p>
    */
    public String getProjectKey(){
        return this.projectKey;
    }
    
    /**
    *  <p>An array of Product IDs to compare. If unspecified, no Product ID filter is applied.</p>
    */
    public java.util.List<String> getProductIds(){
        return this.productIds;
    }
    
    /**
    *  <p>An array of product type IDs. Only products with product types in this array are compared. If unspecified, no product type filter is applied.</p>
    */
    public java.util.List<String> getProductTypeIds(){
        return this.productTypeIds;
    }
    
    /**
    *  <p>Specifies use of staged or current product data.</p>
    */
    public Boolean getStaged(){
        return this.staged;
    }
    
    /**
    *  <p>Specifies use of product variants. If set to <code>true</code>, all product variants are compared, not just the master variant.</p>
    */
    public Boolean getIncludeVariants(){
        return this.includeVariants;
    }
    
    /**
    *  <p>Maximum number of products to check (if unspecified, all products are considered). Note that the maximum number of product comparisons between two productSets is 20,000,000. This limit cannot be exceeded. If you need a higher limit, contact https://support.commercetools.com</p>
    */
    public Long getProductSetLimit(){
        return this.productSetLimit;
    }

    public void setProjectKey(final String projectKey){
        this.projectKey = projectKey;
    }
    
    public void setProductIds(final String ...productIds){
       this.productIds = new ArrayList<>(Arrays.asList(productIds));
    }
    
    public void setProductIds(final java.util.List<String> productIds){
       this.productIds = productIds;
    }
    
    public void setProductTypeIds(final String ...productTypeIds){
       this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
    }
    
    public void setProductTypeIds(final java.util.List<String> productTypeIds){
       this.productTypeIds = productTypeIds;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }
    
    public void setIncludeVariants(final Boolean includeVariants){
        this.includeVariants = includeVariants;
    }
    
    public void setProductSetLimit(final Long productSetLimit){
        this.productSetLimit = productSetLimit;
    }

}