package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order.TrackingData;
import com.commercetools.api.models.order_edit.StagedOrderSetParcelTrackingDataAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetParcelTrackingDataActionBuilder {

   @Nullable
   private com.commercetools.api.models.order.TrackingData trackingData;


   private String parcelId;

   public StagedOrderSetParcelTrackingDataActionBuilder trackingData(@Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }

   public StagedOrderSetParcelTrackingDataActionBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }


   public String getParcelId(){
      return this.parcelId;
   }

   public StagedOrderSetParcelTrackingDataAction build() {
       return new StagedOrderSetParcelTrackingDataActionImpl(trackingData, parcelId);
   }

   public static StagedOrderSetParcelTrackingDataActionBuilder of() {
      return new StagedOrderSetParcelTrackingDataActionBuilder();
   }

   public static StagedOrderSetParcelTrackingDataActionBuilder of(final StagedOrderSetParcelTrackingDataAction template) {
      StagedOrderSetParcelTrackingDataActionBuilder builder = new StagedOrderSetParcelTrackingDataActionBuilder();
      builder.trackingData = template.getTrackingData();
      builder.parcelId = template.getParcelId();
      return builder;
   }

}