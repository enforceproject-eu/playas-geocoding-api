package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Reference
 */

@JsonTypeName("reference")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class Reference implements Serializable {

  private static final long serialVersionUID = 1L;

  private String $ref;

  public Reference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Reference(String $ref) {
    this.$ref = $ref;
  }

  public Reference $ref(String $ref) {
    this.$ref = $ref;
    return this;
  }

  /**
   * Get $ref
   * @return $ref
   */
  @NotNull 
  @Schema(name = "$ref", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("$ref")
  public String get$Ref() {
    return $ref;
  }

  @JsonProperty("$ref")
  public void set$Ref(String $ref) {
    this.$ref = $ref;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.$ref, reference.$ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash($ref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    sb.append("    $ref: ").append(toIndentedString($ref)).append("\n");
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

