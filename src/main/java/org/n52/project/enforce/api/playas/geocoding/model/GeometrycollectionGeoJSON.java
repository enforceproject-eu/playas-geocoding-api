package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.GeometryGeoJSON;
import org.springframework.lang.Nullable;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GeometrycollectionGeoJSON
 */

@JsonTypeName("geometrycollectionGeoJSON")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class GeometrycollectionGeoJSON implements Serializable, GeometryGeoJSON {

  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    GEOMETRY_COLLECTION("GeometryCollection");

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

  private List<GeometryGeoJSON> geometries = new ArrayList<>();

  public GeometrycollectionGeoJSON() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeometrycollectionGeoJSON(TypeEnum type, List<GeometryGeoJSON> geometries) {
    this.type = type;
    this.geometries = geometries;
  }

  public GeometrycollectionGeoJSON type(TypeEnum type) {
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

  public GeometrycollectionGeoJSON geometries(List<GeometryGeoJSON> geometries) {
    this.geometries = geometries;
    return this;
  }

  public GeometrycollectionGeoJSON addGeometriesItem(GeometryGeoJSON geometriesItem) {
    if (this.geometries == null) {
      this.geometries = new ArrayList<>();
    }
    this.geometries.add(geometriesItem);
    return this;
  }

  /**
   * Get geometries
   * @return geometries
   */
  @NotNull @Valid 
  @Schema(name = "geometries", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("geometries")
  public List<GeometryGeoJSON> getGeometries() {
    return geometries;
  }

  @JsonProperty("geometries")
  public void setGeometries(List<GeometryGeoJSON> geometries) {
    this.geometries = geometries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeometrycollectionGeoJSON geometrycollectionGeoJSON = (GeometrycollectionGeoJSON) o;
    return Objects.equals(this.type, geometrycollectionGeoJSON.type) &&
        Objects.equals(this.geometries, geometrycollectionGeoJSON.geometries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, geometries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeometrycollectionGeoJSON {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    geometries: ").append(toIndentedString(geometries)).append("\n");
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

