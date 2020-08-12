package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditResult;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order_edit.OrderEditImpl;

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
@JsonDeserialize(as = OrderEditImpl.class)
public interface OrderEdit extends LoggedResource {

   /**
   *  <p>The unique ID of the OrderEdit.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   *  <p>The current version of the OrderEdit.</p>
   */
   @NotNull
   @JsonProperty("version")
   public Long getVersion();

   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();

   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   /**
   *  <p>Unique identifier for this edit.</p>
   */

   @JsonProperty("key")
   public String getKey();
   /**
   *  <p>The order to be updated with this edit.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("resource")
   public OrderReference getResource();
   /**
   *  <p>The actions to apply to the Order.
   *  Cannot be updated after the edit has been applied.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("stagedActions")
   public List<StagedOrderUpdateAction> getStagedActions();

   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   /**
   *  <p>Contains a preview of the changes in case of unapplied edit.
   *  For applied edits, it contains the summary of the changes.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("result")
   public OrderEditResult getResult();
   /**
   *  <p>This field can be used to add textual information regarding the edit.</p>
   */

   @JsonProperty("comment")
   public String getComment();

   public void setId(final String id);

   public void setVersion(final Long version);

   public void setCreatedAt(final ZonedDateTime createdAt);

   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

   public void setCreatedBy(final CreatedBy createdBy);

   public void setKey(final String key);

   public void setResource(final OrderReference resource);

   public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);

   public void setCustom(final CustomFields custom);

   public void setResult(final OrderEditResult result);

   public void setComment(final String comment);

   public static OrderEditImpl of(){
      return new OrderEditImpl();
   }


   public static OrderEditImpl of(final OrderEdit template) {
      OrderEditImpl instance = new OrderEditImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setResult(template.getResult());
      instance.setResource(template.getResource());
      instance.setCustom(template.getCustom());
      instance.setComment(template.getComment());
      instance.setStagedActions(template.getStagedActions());
      instance.setKey(template.getKey());
      return instance;
   }

}