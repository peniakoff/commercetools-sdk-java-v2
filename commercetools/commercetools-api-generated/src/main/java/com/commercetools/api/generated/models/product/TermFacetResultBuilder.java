package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.FacetResult;
import com.commercetools.api.generated.models.product.FacetResultTerm;
import com.commercetools.api.generated.models.product.FacetTypes;
import com.commercetools.api.generated.models.product.TermFacetResultType;
import com.commercetools.api.generated.models.product.TermFacetResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TermFacetResultBuilder {
   
   
   private Long other;
   
   
   private Long total;
   
   
   private java.util.List<com.commercetools.api.generated.models.product.FacetResultTerm> terms;
   
   
   private com.commercetools.api.generated.models.product.TermFacetResultType dataType;
   
   
   private Long missing;
   
   public TermFacetResultBuilder other( final Long other) {
      this.other = other;
      return this;
   }
   
   public TermFacetResultBuilder total( final Long total) {
      this.total = total;
      return this;
   }
   
   public TermFacetResultBuilder terms( final java.util.List<com.commercetools.api.generated.models.product.FacetResultTerm> terms) {
      this.terms = terms;
      return this;
   }
   
   public TermFacetResultBuilder dataType( final com.commercetools.api.generated.models.product.TermFacetResultType dataType) {
      this.dataType = dataType;
      return this;
   }
   
   public TermFacetResultBuilder missing( final Long missing) {
      this.missing = missing;
      return this;
   }
   
   
   public Long getOther(){
      return this.other;
   }
   
   
   public Long getTotal(){
      return this.total;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product.FacetResultTerm> getTerms(){
      return this.terms;
   }
   
   
   public com.commercetools.api.generated.models.product.TermFacetResultType getDataType(){
      return this.dataType;
   }
   
   
   public Long getMissing(){
      return this.missing;
   }

   public TermFacetResult build() {
       return new TermFacetResultImpl(other, total, terms, dataType, missing);
   }
   
   public static TermFacetResultBuilder of() {
      return new TermFacetResultBuilder();
   }
   
   public static TermFacetResultBuilder of(final TermFacetResult template) {
      TermFacetResultBuilder builder = new TermFacetResultBuilder();
      builder.other = template.getOther();
      builder.total = template.getTotal();
      builder.terms = template.getTerms();
      builder.dataType = template.getDataType();
      builder.missing = template.getMissing();
      return builder;
   }
   
}