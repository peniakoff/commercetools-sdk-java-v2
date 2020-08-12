package com.commercetools.api.models.state;

import com.commercetools.api.models.state.State;
import com.commercetools.api.models.state.StatePagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StatePagedQueryResponseBuilder {

   @Nullable
   private Long total;


   private Long offset;


   private Long count;


   private Long limit;


   private java.util.List<com.commercetools.api.models.state.State> results;

   public StatePagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }

   public StatePagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }

   public StatePagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }

   public StatePagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }

   public StatePagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.state.State> results) {
      this.results = results;
      return this;
   }

   @Nullable
   public Long getTotal(){
      return this.total;
   }


   public Long getOffset(){
      return this.offset;
   }


   public Long getCount(){
      return this.count;
   }


   public Long getLimit(){
      return this.limit;
   }


   public java.util.List<com.commercetools.api.models.state.State> getResults(){
      return this.results;
   }

   public StatePagedQueryResponse build() {
       return new StatePagedQueryResponseImpl(total, offset, count, limit, results);
   }

   public static StatePagedQueryResponseBuilder of() {
      return new StatePagedQueryResponseBuilder();
   }

   public static StatePagedQueryResponseBuilder of(final StatePagedQueryResponse template) {
      StatePagedQueryResponseBuilder builder = new StatePagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }

}