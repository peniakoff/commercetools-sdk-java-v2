package com.commercetools.api.generated.models.order;


import com.commercetools.api.generated.models.order.TrackingDataImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TrackingDataImpl.class)
public interface TrackingData  {

   /**
   	<p>The ID to track one parcel.</p>
   */
   
   @JsonProperty("trackingId")
   public String getTrackingId();
   /**
   	<p>The carrier that delivers the parcel.</p>
   */
   
   @JsonProperty("carrier")
   public String getCarrier();
   /**
   	
   */
   
   @JsonProperty("provider")
   public String getProvider();
   /**
   	
   */
   
   @JsonProperty("providerTransaction")
   public String getProviderTransaction();
   /**
   	<p>Flag to distinguish if the parcel is on the way to the customer (false) or on the way back (true).</p>
   */
   
   @JsonProperty("isReturn")
   public Boolean getIsReturn();

   public void setTrackingId(final String trackingId);
   
   public void setCarrier(final String carrier);
   
   public void setProvider(final String provider);
   
   public void setProviderTransaction(final String providerTransaction);
   
   public void setIsReturn(final Boolean isReturn);
   
   public static TrackingDataImpl of(){
      return new TrackingDataImpl();
   }
   

   public static TrackingDataImpl of(final TrackingData template) {
      TrackingDataImpl instance = new TrackingDataImpl();
      instance.setIsReturn(template.getIsReturn());
      instance.setCarrier(template.getCarrier());
      instance.setProviderTransaction(template.getProviderTransaction());
      instance.setProvider(template.getProvider());
      instance.setTrackingId(template.getTrackingId());
      return instance;
   }

}