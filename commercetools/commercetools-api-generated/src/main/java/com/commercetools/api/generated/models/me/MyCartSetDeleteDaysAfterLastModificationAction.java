package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartSetDeleteDaysAfterLastModificationActionImpl;

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
@JsonDeserialize(as = MyCartSetDeleteDaysAfterLastModificationActionImpl.class)
public interface MyCartSetDeleteDaysAfterLastModificationAction extends MyCartUpdateAction {

   
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Integer getDeleteDaysAfterLastModification();

   public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);
   
   public static MyCartSetDeleteDaysAfterLastModificationActionImpl of(){
      return new MyCartSetDeleteDaysAfterLastModificationActionImpl();
   }
   

   public static MyCartSetDeleteDaysAfterLastModificationActionImpl of(final MyCartSetDeleteDaysAfterLastModificationAction template) {
      MyCartSetDeleteDaysAfterLastModificationActionImpl instance = new MyCartSetDeleteDaysAfterLastModificationActionImpl();
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      return instance;
   }

}