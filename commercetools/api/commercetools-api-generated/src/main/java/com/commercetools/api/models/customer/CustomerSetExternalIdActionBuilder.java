package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetExternalIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetExternalIdActionBuilder {

   @Nullable
   private String externalId;

   public CustomerSetExternalIdActionBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }

   @Nullable
   public String getExternalId(){
      return this.externalId;
   }

   public CustomerSetExternalIdAction build() {
       return new CustomerSetExternalIdActionImpl(externalId);
   }

   public static CustomerSetExternalIdActionBuilder of() {
      return new CustomerSetExternalIdActionBuilder();
   }

   public static CustomerSetExternalIdActionBuilder of(final CustomerSetExternalIdAction template) {
      CustomerSetExternalIdActionBuilder builder = new CustomerSetExternalIdActionBuilder();
      builder.externalId = template.getExternalId();
      return builder;
   }

}