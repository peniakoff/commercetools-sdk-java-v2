package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.customer_group.CustomerGroup;
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
public final class CustomerGroupReferenceImpl implements CustomerGroupReference {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    private String id;
    
    private com.commercetools.api.models.customer_group.CustomerGroup obj;

    @JsonCreator
    CustomerGroupReferenceImpl(@JsonProperty("id") final String id, @JsonProperty("obj") final com.commercetools.api.models.customer_group.CustomerGroup obj) {
        this.id = id;
        this.obj = obj;
        this.typeId = ReferenceTypeId.findEnumViaJsonName("customer-group").get();
    }
    public CustomerGroupReferenceImpl() {
       
    }

    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    
    public String getId(){
        return this.id;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroup getObj(){
        return this.obj;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setObj(final com.commercetools.api.models.customer_group.CustomerGroup obj){
        this.obj = obj;
    }

}
