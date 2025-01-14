
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DeliveryImpl implements Delivery {

    private String id;

    private String createdAt;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    private java.util.List<com.commercetools.history.models.common.Parcel> parcels;

    private com.commercetools.history.models.common.Address address;

    @JsonCreator
    DeliveryImpl(@JsonProperty("id") final String id, @JsonProperty("createdAt") final String createdAt,
            @JsonProperty("items") final java.util.List<com.commercetools.history.models.common.DeliveryItem> items,
            @JsonProperty("parcels") final java.util.List<com.commercetools.history.models.common.Parcel> parcels,
            @JsonProperty("address") final com.commercetools.history.models.common.Address address) {
        this.id = id;
        this.createdAt = createdAt;
        this.items = items;
        this.parcels = parcels;
        this.address = address;
    }

    public DeliveryImpl() {
    }

    public String getId() {
        return this.id;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    public java.util.List<com.commercetools.history.models.common.Parcel> getParcels() {
        return this.parcels;
    }

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    public void setItems(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
    }

    public void setParcels(final com.commercetools.history.models.common.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
    }

    public void setParcels(final java.util.List<com.commercetools.history.models.common.Parcel> parcels) {
        this.parcels = parcels;
    }

    public void setAddress(final com.commercetools.history.models.common.Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryImpl that = (DeliveryImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(createdAt, that.createdAt)
                .append(items, that.items)
                .append(parcels, that.parcels)
                .append(address, that.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(createdAt)
                .append(items)
                .append(parcels)
                .append(address)
                .toHashCode();
    }

}
