package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CrsOneOfOneOf2
 */

@JsonTypeName("crs_oneOf_oneOf_2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class CrsOneOfOneOf2 implements Serializable, CrsOneOf {

  private static final long serialVersionUID = 1L;

  private Object referenceSystem;

  public CrsOneOfOneOf2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CrsOneOfOneOf2(Object referenceSystem) {
    this.referenceSystem = referenceSystem;
  }

  public CrsOneOfOneOf2 referenceSystem(Object referenceSystem) {
    this.referenceSystem = referenceSystem;
    return this;
  }

  /**
   * A reference system data structure as defined in the MD_ReferenceSystem of the ISO 19115
   * @return referenceSystem
   */
  @NotNull 
  @Schema(name = "referenceSystem", description = "A reference system data structure as defined in the MD_ReferenceSystem of the ISO 19115", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("referenceSystem")
  public Object getReferenceSystem() {
    return referenceSystem;
  }

  @JsonProperty("referenceSystem")
  public void setReferenceSystem(Object referenceSystem) {
    this.referenceSystem = referenceSystem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrsOneOfOneOf2 crsOneOfOneOf2 = (CrsOneOfOneOf2) o;
    return Objects.equals(this.referenceSystem, crsOneOfOneOf2.referenceSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrsOneOfOneOf2 {\n");
    sb.append("    referenceSystem: ").append(toIndentedString(referenceSystem)).append("\n");
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

