package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.CustomerAddressRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerAddressRemovedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.common.Address address;
   
   public CustomerAddressRemovedMessagePayloadBuilder address( final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public CustomerAddressRemovedMessagePayload build() {
       return new CustomerAddressRemovedMessagePayloadImpl(address);
   }
   
   public static CustomerAddressRemovedMessagePayloadBuilder of() {
      return new CustomerAddressRemovedMessagePayloadBuilder();
   }
   
   public static CustomerAddressRemovedMessagePayloadBuilder of(final CustomerAddressRemovedMessagePayload template) {
      CustomerAddressRemovedMessagePayloadBuilder builder = new CustomerAddressRemovedMessagePayloadBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}