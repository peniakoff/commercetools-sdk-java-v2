package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
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
public final class OrderEditSetCommentActionImpl implements OrderEditSetCommentAction {

    private String action;
    
    private String comment;

    @JsonCreator
    OrderEditSetCommentActionImpl(@JsonProperty("comment") final String comment) {
        this.comment = comment;
        this.action = "setComment";
    }
    public OrderEditSetCommentActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getComment(){
        return this.comment;
    }

    public void setComment(final String comment){
        this.comment = comment;
    }

}
