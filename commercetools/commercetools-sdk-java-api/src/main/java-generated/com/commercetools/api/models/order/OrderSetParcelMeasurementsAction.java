package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.OrderSetParcelMeasurementsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderSetParcelMeasurementsActionImpl.class)
public interface OrderSetParcelMeasurementsAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();
    
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    public void setParcelId(final String parcelId);
    
    public void setMeasurements(final ParcelMeasurements measurements);

    public static OrderSetParcelMeasurementsActionImpl of(){
        return new OrderSetParcelMeasurementsActionImpl();
    }
    

    public static OrderSetParcelMeasurementsActionImpl of(final OrderSetParcelMeasurementsAction template) {
        OrderSetParcelMeasurementsActionImpl instance = new OrderSetParcelMeasurementsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    default <T> T withOrderSetParcelMeasurementsAction(Function<OrderSetParcelMeasurementsAction, T> helper) {
        return helper.apply(this);
    }
}
