package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.MessagePayload;
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
public final class OrderCustomerSetMessagePayloadImpl implements OrderCustomerSetMessagePayload {

   private String type;

   private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

   private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

   private com.commercetools.api.models.customer.CustomerReference oldCustomer;

   private com.commercetools.api.models.customer.CustomerReference customer;

   @JsonCreator
   OrderCustomerSetMessagePayloadImpl(@JsonProperty("oldCustomerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("oldCustomer") final com.commercetools.api.models.customer.CustomerReference oldCustomer, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer) {
      this.oldCustomerGroup = oldCustomerGroup;
      this.customerGroup = customerGroup;
      this.oldCustomer = oldCustomer;
      this.customer = customer;
      this.type = "OrderCustomerSet";
   }
   public OrderCustomerSetMessagePayloadImpl() {

   }


   public String getType(){
      return this.type;
   }


   public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
      return this.oldCustomerGroup;
   }


   public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }


   public com.commercetools.api.models.customer.CustomerReference getOldCustomer(){
      return this.oldCustomer;
   }


   public com.commercetools.api.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public void setOldCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup){
      this.oldCustomerGroup = oldCustomerGroup;
   }

   public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }

   public void setOldCustomer(final com.commercetools.api.models.customer.CustomerReference oldCustomer){
      this.oldCustomer = oldCustomer;
   }

   public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer){
      this.customer = customer;
   }

}