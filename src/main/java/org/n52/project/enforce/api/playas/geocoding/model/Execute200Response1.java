package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.GeoJSONFeature;
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
 * Execute200Response1
 */

@JsonTypeName("execute_200_response_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class Execute200Response1 implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FEATURE_COLLECTION("FeatureCollection");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private List<@Valid GeoJSONFeature> features = new ArrayList<>();

  private List<BigDecimal> bbox = new ArrayList<>();

  public Execute200Response1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Execute200Response1(TypeEnum type, List<@Valid GeoJSONFeature> features) {
    this.type = type;
    this.features = features;
  }

  public Execute200Response1 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Execute200Response1 features(List<@Valid GeoJSONFeature> features) {
    this.features = features;
    return this;
  }

  public Execute200Response1 addFeaturesItem(GeoJSONFeature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
   */
  @NotNull @Valid 
  @Schema(name = "features", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("features")
  public List<@Valid GeoJSONFeature> getFeatures() {
    return features;
  }

  @JsonProperty("features")
  public void setFeatures(List<@Valid GeoJSONFeature> features) {
    this.features = features;
  }

  public Execute200Response1 bbox(List<BigDecimal> bbox) {
    this.bbox = bbox;
    return this;
  }

  public Execute200Response1 addBboxItem(BigDecimal bboxItem) {
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
  @Valid @Size(min = 4) 
  @Schema(name = "bbox", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Execute200Response1 execute200Response1 = (Execute200Response1) o;
    return Objects.equals(this.type, execute200Response1.type) &&
        Objects.equals(this.features, execute200Response1.features) &&
        Objects.equals(this.bbox, execute200Response1.bbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, features, bbox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execute200Response1 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

