package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFields;
import java.time.LocalDate;
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
public final class MyCustomerDraftImpl implements MyCustomerDraft {

    private String email;
    
    private String password;
    
    private String firstName;
    
    private String lastName;
    
    private String middleName;
    
    private String title;
    
    private java.time.LocalDate dateOfBirth;
    
    private String companyName;
    
    private String vatId;
    
    private java.util.List<com.commercetools.api.models.common.Address> addresses;
    
    private Long defaultShippingAddress;
    
    private Long defaultBillingAddress;
    
    private com.commercetools.api.models.type.CustomFields custom;
    
    private String locale;
    
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    @JsonCreator
    MyCustomerDraftImpl(@JsonProperty("email") final String email, @JsonProperty("password") final String password, @JsonProperty("firstName") final String firstName, @JsonProperty("lastName") final String lastName, @JsonProperty("middleName") final String middleName, @JsonProperty("title") final String title, @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth, @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId, @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.Address> addresses, @JsonProperty("defaultShippingAddress") final Long defaultShippingAddress, @JsonProperty("defaultBillingAddress") final Long defaultBillingAddress, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom, @JsonProperty("locale") final String locale, @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.companyName = companyName;
        this.vatId = vatId;
        this.addresses = addresses;
        this.defaultShippingAddress = defaultShippingAddress;
        this.defaultBillingAddress = defaultBillingAddress;
        this.custom = custom;
        this.locale = locale;
        this.stores = stores;
    }
    public MyCustomerDraftImpl() {
       
    }

    
    public String getEmail(){
        return this.email;
    }
    
    
    public String getPassword(){
        return this.password;
    }
    
    
    public String getFirstName(){
        return this.firstName;
    }
    
    
    public String getLastName(){
        return this.lastName;
    }
    
    
    public String getMiddleName(){
        return this.middleName;
    }
    
    
    public String getTitle(){
        return this.title;
    }
    
    
    public java.time.LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    
    
    public String getCompanyName(){
        return this.companyName;
    }
    
    
    public String getVatId(){
        return this.vatId;
    }
    
    /**
    *  <p>Sets the ID of each address to be unique in the addresses list.</p>
    */
    public java.util.List<com.commercetools.api.models.common.Address> getAddresses(){
        return this.addresses;
    }
    
    /**
    *  <p>The index of the address in the addresses array.
    *  The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
    */
    public Long getDefaultShippingAddress(){
        return this.defaultShippingAddress;
    }
    
    /**
    *  <p>The index of the address in the addresses array.
    *  The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
    */
    public Long getDefaultBillingAddress(){
        return this.defaultBillingAddress;
    }
    
    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }
    
    
    public String getLocale(){
        return this.locale;
    }
    
    
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores(){
        return this.stores;
    }

    public void setEmail(final String email){
        this.email = email;
    }
    
    public void setPassword(final String password){
        this.password = password;
    }
    
    public void setFirstName(final String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(final String lastName){
        this.lastName = lastName;
    }
    
    public void setMiddleName(final String middleName){
        this.middleName = middleName;
    }
    
    public void setTitle(final String title){
        this.title = title;
    }
    
    public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setCompanyName(final String companyName){
        this.companyName = companyName;
    }
    
    public void setVatId(final String vatId){
        this.vatId = vatId;
    }
    
    public void setAddresses(final java.util.List<com.commercetools.api.models.common.Address> addresses){
        this.addresses = addresses;
    }
    
    public void setDefaultShippingAddress(final Long defaultShippingAddress){
        this.defaultShippingAddress = defaultShippingAddress;
    }
    
    public void setDefaultBillingAddress(final Long defaultBillingAddress){
        this.defaultBillingAddress = defaultBillingAddress;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
        this.custom = custom;
    }
    
    public void setLocale(final String locale){
        this.locale = locale;
    }
    
    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores){
        this.stores = stores;
    }

}