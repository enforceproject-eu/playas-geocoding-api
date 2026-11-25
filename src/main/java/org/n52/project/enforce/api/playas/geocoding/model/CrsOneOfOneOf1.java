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
 * CrsOneOfOneOf1
 */

@JsonTypeName("crs_oneOf_oneOf_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class CrsOneOfOneOf1 implements Serializable, CrsOneOf {

  private static final long serialVersionUID = 1L;

  private Object wkt;

  public CrsOneOfOneOf1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CrsOneOfOneOf1(Object wkt) {
    this.wkt = wkt;
  }

  public CrsOneOfOneOf1 wkt(Object wkt) {
    this.wkt = wkt;
    return this;
  }

  /**
   * Get wkt
   * @return wkt
   */
  @NotNull 
  @Schema(name = "wkt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("wkt")
  public Object getWkt() {
    return wkt;
  }

  @JsonProperty("wkt")
  public void setWkt(Object wkt) {
    this.wkt = wkt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrsOneOfOneOf1 crsOneOfOneOf1 = (CrsOneOfOneOf1) o;
    return Objects.equals(this.wkt, crsOneOfOneOf1.wkt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wkt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrsOneOfOneOf1 {\n");
    sb.append("    wkt: ").append(toIndentedString(wkt)).append("\n");
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

