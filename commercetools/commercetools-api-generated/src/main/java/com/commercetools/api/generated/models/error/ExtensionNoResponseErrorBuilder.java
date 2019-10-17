package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.error.ErrorByExtension;
import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.ExtensionNoResponseError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionNoResponseErrorBuilder {
   
   
   private String message;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString localizedMessage;
   
   @Nullable
   private Object extensionExtraInfo;
   
   
   private com.commercetools.api.generated.models.error.ErrorByExtension errorByExtension;
   
   public ExtensionNoResponseErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public ExtensionNoResponseErrorBuilder localizedMessage(@Nullable final com.commercetools.api.generated.models.common.LocalizedString localizedMessage) {
      this.localizedMessage = localizedMessage;
      return this;
   }
   
   public ExtensionNoResponseErrorBuilder extensionExtraInfo(@Nullable final Object extensionExtraInfo) {
      this.extensionExtraInfo = extensionExtraInfo;
      return this;
   }
   
   public ExtensionNoResponseErrorBuilder errorByExtension( final com.commercetools.api.generated.models.error.ErrorByExtension errorByExtension) {
      this.errorByExtension = errorByExtension;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getLocalizedMessage(){
      return this.localizedMessage;
   }
   
   @Nullable
   public Object getExtensionExtraInfo(){
      return this.extensionExtraInfo;
   }
   
   
   public com.commercetools.api.generated.models.error.ErrorByExtension getErrorByExtension(){
      return this.errorByExtension;
   }

   public ExtensionNoResponseError build() {
       return new ExtensionNoResponseErrorImpl(message, localizedMessage, extensionExtraInfo, errorByExtension);
   }
   
   public static ExtensionNoResponseErrorBuilder of() {
      return new ExtensionNoResponseErrorBuilder();
   }
   
   public static ExtensionNoResponseErrorBuilder of(final ExtensionNoResponseError template) {
      ExtensionNoResponseErrorBuilder builder = new ExtensionNoResponseErrorBuilder();
      builder.message = template.getMessage();
      builder.localizedMessage = template.getLocalizedMessage();
      builder.extensionExtraInfo = template.getExtensionExtraInfo();
      builder.errorByExtension = template.getErrorByExtension();
      return builder;
   }
   
}