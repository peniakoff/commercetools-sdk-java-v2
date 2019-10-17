package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.ParcelMeasurements;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelMeasurementsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetParcelMeasurementsActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.order.ParcelMeasurements measurements;
   
   
   private String parcelId;
   
   public StagedOrderSetParcelMeasurementsActionBuilder measurements(@Nullable final com.commercetools.api.generated.models.order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }
   
   public StagedOrderSetParcelMeasurementsActionBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public StagedOrderSetParcelMeasurementsAction build() {
       return new StagedOrderSetParcelMeasurementsActionImpl(measurements, parcelId);
   }
   
   public static StagedOrderSetParcelMeasurementsActionBuilder of() {
      return new StagedOrderSetParcelMeasurementsActionBuilder();
   }
   
   public static StagedOrderSetParcelMeasurementsActionBuilder of(final StagedOrderSetParcelMeasurementsAction template) {
      StagedOrderSetParcelMeasurementsActionBuilder builder = new StagedOrderSetParcelMeasurementsActionBuilder();
      builder.measurements = template.getMeasurements();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}