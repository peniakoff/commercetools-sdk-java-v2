package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListRemoveTextLineItemActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = MyShoppingListRemoveTextLineItemActionImpl.class)
public interface MyShoppingListRemoveTextLineItemAction extends MyShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("textLineItemId")
   public String getTextLineItemId();
   
   
   @JsonProperty("quantity")
   public Long getQuantity();

   public void setTextLineItemId(final String textLineItemId);
   
   public void setQuantity(final Long quantity);
   
   public static MyShoppingListRemoveTextLineItemActionImpl of(){
      return new MyShoppingListRemoveTextLineItemActionImpl();
   }
   

   public static MyShoppingListRemoveTextLineItemActionImpl of(final MyShoppingListRemoveTextLineItemAction template) {
      MyShoppingListRemoveTextLineItemActionImpl instance = new MyShoppingListRemoveTextLineItemActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setTextLineItemId(template.getTextLineItemId());
      return instance;
   }

}