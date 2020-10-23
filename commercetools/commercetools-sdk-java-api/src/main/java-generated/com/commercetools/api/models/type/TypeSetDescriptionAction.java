package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeSetDescriptionActionImpl;

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
@JsonDeserialize(as = TypeSetDescriptionActionImpl.class)
public interface TypeSetDescriptionAction extends TypeUpdateAction {

    
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static TypeSetDescriptionActionImpl of(){
        return new TypeSetDescriptionActionImpl();
    }
    

    public static TypeSetDescriptionActionImpl of(final TypeSetDescriptionAction template) {
        TypeSetDescriptionActionImpl instance = new TypeSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    default <T> T withTypeSetDescriptionAction(Function<TypeSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
