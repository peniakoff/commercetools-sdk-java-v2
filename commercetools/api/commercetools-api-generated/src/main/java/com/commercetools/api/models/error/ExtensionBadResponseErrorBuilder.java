package com.commercetools.api.models.error;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.error.ErrorByExtension;
import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.error.ExtensionBadResponseError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionBadResponseErrorBuilder {


   private String message;

   @Nullable
   private com.commercetools.api.models.common.LocalizedString localizedMessage;

   @Nullable
   private com.fasterxml.jackson.databind.JsonNode extensionExtraInfo;


   private com.commercetools.api.models.error.ErrorByExtension errorByExtension;

   public ExtensionBadResponseErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }

   public ExtensionBadResponseErrorBuilder localizedMessage(@Nullable final com.commercetools.api.models.common.LocalizedString localizedMessage) {
      this.localizedMessage = localizedMessage;
      return this;
   }

   public ExtensionBadResponseErrorBuilder extensionExtraInfo(@Nullable final com.fasterxml.jackson.databind.JsonNode extensionExtraInfo) {
      this.extensionExtraInfo = extensionExtraInfo;
      return this;
   }

   public ExtensionBadResponseErrorBuilder errorByExtension( final com.commercetools.api.models.error.ErrorByExtension errorByExtension) {
      this.errorByExtension = errorByExtension;
      return this;
   }


   public String getMessage(){
      return this.message;
   }

   @Nullable
   public com.commercetools.api.models.common.LocalizedString getLocalizedMessage(){
      return this.localizedMessage;
   }

   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getExtensionExtraInfo(){
      return this.extensionExtraInfo;
   }


   public com.commercetools.api.models.error.ErrorByExtension getErrorByExtension(){
      return this.errorByExtension;
   }

   public ExtensionBadResponseError build() {
       return new ExtensionBadResponseErrorImpl(message, localizedMessage, extensionExtraInfo, errorByExtension);
   }

   public static ExtensionBadResponseErrorBuilder of() {
      return new ExtensionBadResponseErrorBuilder();
   }

   public static ExtensionBadResponseErrorBuilder of(final ExtensionBadResponseError template) {
      ExtensionBadResponseErrorBuilder builder = new ExtensionBadResponseErrorBuilder();
      builder.message = template.getMessage();
      builder.localizedMessage = template.getLocalizedMessage();
      builder.extensionExtraInfo = template.getExtensionExtraInfo();
      builder.errorByExtension = template.getErrorByExtension();
      return builder;
   }

}