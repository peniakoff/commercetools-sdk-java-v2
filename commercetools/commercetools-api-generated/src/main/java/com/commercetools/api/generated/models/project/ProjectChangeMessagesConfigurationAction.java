package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.message.MessageConfigurationDraft;
import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import com.commercetools.api.generated.models.project.ProjectChangeMessagesConfigurationActionImpl;

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
@JsonDeserialize(as = ProjectChangeMessagesConfigurationActionImpl.class)
public interface ProjectChangeMessagesConfigurationAction extends ProjectUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("messagesConfiguration")
   public MessageConfigurationDraft getMessagesConfiguration();

   public void setMessagesConfiguration(final MessageConfigurationDraft messagesConfiguration);
   
   public static ProjectChangeMessagesConfigurationActionImpl of(){
      return new ProjectChangeMessagesConfigurationActionImpl();
   }
   

   public static ProjectChangeMessagesConfigurationActionImpl of(final ProjectChangeMessagesConfigurationAction template) {
      ProjectChangeMessagesConfigurationActionImpl instance = new ProjectChangeMessagesConfigurationActionImpl();
      instance.setMessagesConfiguration(template.getMessagesConfiguration());
      return instance;
   }

}