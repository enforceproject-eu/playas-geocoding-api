package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
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
 * BboxLiteral
 */

@JsonTypeName("bboxLiteral")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class BboxLiteral implements Serializable, SpatialInstance {

  private static final long serialVersionUID = 1L;

  private List<BigDecimal> bbox = new ArrayList<>();

  public BboxLiteral() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BboxLiteral(List<BigDecimal> bbox) {
    this.bbox = bbox;
  }

  public BboxLiteral bbox(List<BigDecimal> bbox) {
    this.bbox = bbox;
    return this;
  }

  public BboxLiteral addBboxItem(BigDecimal bboxItem) {
    if (this.bbox == null) {
      this.bbox = new ArrayList<>();
    }
    this.bbox.add(bboxItem);
    return this;
  }

  /**
   * Get bbox
   * @return bbox
   */
  @NotNull @Valid 
  @Schema(name = "bbox", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bbox")
  public List<BigDecimal> getBbox() {
    return bbox;
  }

  @JsonProperty("bbox")
  public void setBbox(List<BigDecimal> bbox) {
    this.bbox = bbox;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BboxLiteral bboxLiteral = (BboxLiteral) o;
    return Objects.equals(this.bbox, bboxLiteral.bbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bbox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BboxLiteral {\n");
    sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
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

