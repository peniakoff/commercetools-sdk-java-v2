package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryItemsUpdatedMessagePayloadBuilder {


   private String deliveryId;


   private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;


   private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

   public DeliveryItemsUpdatedMessagePayloadBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }

   public DeliveryItemsUpdatedMessagePayloadBuilder oldItems( final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
      this.oldItems = oldItems;
      return this;
   }

   public DeliveryItemsUpdatedMessagePayloadBuilder items( final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }


   public String getDeliveryId(){
      return this.deliveryId;
   }


   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems(){
      return this.oldItems;
   }


   public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
      return this.items;
   }

   public DeliveryItemsUpdatedMessagePayload build() {
       return new DeliveryItemsUpdatedMessagePayloadImpl(deliveryId, oldItems, items);
   }

   public static DeliveryItemsUpdatedMessagePayloadBuilder of() {
      return new DeliveryItemsUpdatedMessagePayloadBuilder();
   }

   public static DeliveryItemsUpdatedMessagePayloadBuilder of(final DeliveryItemsUpdatedMessagePayload template) {
      DeliveryItemsUpdatedMessagePayloadBuilder builder = new DeliveryItemsUpdatedMessagePayloadBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.oldItems = template.getOldItems();
      builder.items = template.getItems();
      return builder;
   }

}