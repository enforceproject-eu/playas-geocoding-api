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
import org.n52.project.enforce.api.playas.geocoding.model.GeoJSONFeatureGeometry;
import org.n52.project.enforce.api.playas.geocoding.model.GeoJSONFeatureId;
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
 * GeoJSONFeature
 */

@JsonTypeName("GeoJSON_Feature")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class GeoJSONFeature implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FEATURE("Feature");

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

  private @Nullable GeoJSONFeatureId id;

  private JsonNullable<Object> properties = JsonNullable.<Object>undefined();

  private GeoJSONFeatureGeometry geometry;

  private List<BigDecimal> bbox = new ArrayList<>();

  public GeoJSONFeature() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeoJSONFeature(TypeEnum type, Object properties, GeoJSONFeatureGeometry geometry) {
    this.type = type;
    this.properties = JsonNullable.of(properties);
    this.geometry = geometry;
  }

  public GeoJSONFeature type(TypeEnum type) {
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

  public GeoJSONFeature id(@Nullable GeoJSONFeatureId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable GeoJSONFeatureId getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable GeoJSONFeatureId id) {
    this.id = id;
  }

  public GeoJSONFeature properties(Object properties) {
    this.properties = JsonNullable.of(properties);
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  /* @Present */ 
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("properties")
  public JsonNullable<Object> getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(JsonNullable<Object> properties) {
    this.properties = properties;
  }

  public GeoJSONFeature geometry(GeoJSONFeatureGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * Get geometry
   * @return geometry
   */
  @NotNull @Valid 
  @Schema(name = "geometry", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("geometry")
  public GeoJSONFeatureGeometry getGeometry() {
    return geometry;
  }

  @JsonProperty("geometry")
  public void setGeometry(GeoJSONFeatureGeometry geometry) {
    this.geometry = geometry;
  }

  public GeoJSONFeature bbox(List<BigDecimal> bbox) {
    this.bbox = bbox;
    return this;
  }

  public GeoJSONFeature addBboxItem(BigDecimal bboxItem) {
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
    GeoJSONFeature geoJSONFeature = (GeoJSONFeature) o;
    return Objects.equals(this.type, geoJSONFeature.type) &&
        Objects.equals(this.id, geoJSONFeature.id) &&
        Objects.equals(this.properties, geoJSONFeature.properties) &&
        Objects.equals(this.geometry, geoJSONFeature.geometry) &&
        Objects.equals(this.bbox, geoJSONFeature.bbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, properties, geometry, bbox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJSONFeature {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

