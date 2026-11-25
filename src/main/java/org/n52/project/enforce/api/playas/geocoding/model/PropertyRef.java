package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PropertyRef
 */

@JsonTypeName("propertyRef")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class PropertyRef implements Serializable, ArithmeticOperandsInner, ArrayOperandsInner, CaseiArgsInner, FunctionRefArgsInner, IntervalArrayInner, IsBetweenOperandsInner, IsLikeOperandsInner, IsNullOperandInner, ScalarExpression, SpatialOperandsInner, TemporalOperandsInner {

  private static final long serialVersionUID = 1L;

  private String property;

  public PropertyRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PropertyRef(String property) {
    this.property = property;
  }

  public PropertyRef property(String property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
   */
  @NotNull 
  @Schema(name = "property", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }

  @JsonProperty("property")
  public void setProperty(String property) {
    this.property = property;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyRef propertyRef = (PropertyRef) o;
    return Objects.equals(this.property, propertyRef.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyRef {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

