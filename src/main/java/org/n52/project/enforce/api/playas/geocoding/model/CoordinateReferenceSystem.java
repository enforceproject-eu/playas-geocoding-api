package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
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
 * Coordinate reference system of the coordinates of the &#x60;bbox&#x60; property. The default reference system is WGS 84 longitude/latitude. WGS 84 longitude/latitude/ellipsoidal height for coordinates with height. For data not referenced to Earth, another CRS may be specified. This should be a URI to a registered CRS if one is available, or a full description of the CRS otherwise using e.g., a WKT2CRS string, or a PROJJSON, or CRS JSON object.
 */

@Schema(name = "Coordinate_reference_system", description = "Coordinate reference system of the coordinates of the `bbox` property. The default reference system is WGS 84 longitude/latitude. WGS 84 longitude/latitude/ellipsoidal height for coordinates with height. For data not referenced to Earth, another CRS may be specified. This should be a URI to a registered CRS if one is available, or a full description of the CRS otherwise using e.g., a WKT2CRS string, or a PROJJSON, or CRS JSON object.")
@JsonTypeName("Coordinate_reference_system")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class CoordinateReferenceSystem implements Serializable {

  private static final long serialVersionUID = 1L;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoordinateReferenceSystem {\n");
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

