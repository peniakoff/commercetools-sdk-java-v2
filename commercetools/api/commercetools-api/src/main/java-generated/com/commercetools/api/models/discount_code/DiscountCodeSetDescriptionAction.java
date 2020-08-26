package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetDescriptionActionImpl.class)
public interface DiscountCodeSetDescriptionAction extends DiscountCodeUpdateAction {

    /**
    *  <p>If the <code>description</code> parameter is not included, the field will be emptied.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static DiscountCodeSetDescriptionActionImpl of(){
        return new DiscountCodeSetDescriptionActionImpl();
    }
    

    public static DiscountCodeSetDescriptionActionImpl of(final DiscountCodeSetDescriptionAction template) {
        DiscountCodeSetDescriptionActionImpl instance = new DiscountCodeSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

}