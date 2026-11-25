package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
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
 * CrsOneOfOneOf
 */

@JsonTypeName("crs_oneOf_oneOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class CrsOneOfOneOf implements Serializable, CrsOneOf {

  private static final long serialVersionUID = 1L;

  private URI uri;

  public CrsOneOfOneOf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CrsOneOfOneOf(URI uri) {
    this.uri = uri;
  }

  public CrsOneOfOneOf uri(URI uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Reference to one coordinate reference system (CRS)
   * @return uri
   */
  @NotNull @Valid 
  @Schema(name = "uri", description = "Reference to one coordinate reference system (CRS)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uri")
  public URI getUri() {
    return uri;
  }

  @JsonProperty("uri")
  public void setUri(URI uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrsOneOfOneOf crsOneOfOneOf = (CrsOneOfOneOf) o;
    return Objects.equals(this.uri, crsOneOfOneOf.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrsOneOfOneOf {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

