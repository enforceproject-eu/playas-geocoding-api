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
 * Vertical Coordinate Reference System (e.g. as defined in EDR for &#39;vertical&#39;). This should be a URI to a registered VRS if one is available, or a full description of the VRS otherwise using e.g., a WKT2CRS string, or a PROJJSON, or CRS JSON object.
 */

@Schema(name = "Vertical_Coordinate_Reference_System", description = "Vertical Coordinate Reference System (e.g. as defined in EDR for 'vertical'). This should be a URI to a registered VRS if one is available, or a full description of the VRS otherwise using e.g., a WKT2CRS string, or a PROJJSON, or CRS JSON object.")
@JsonTypeName("Vertical_Coordinate_Reference_System")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class VerticalCoordinateReferenceSystem implements Serializable {

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
    sb.append("class VerticalCoordinateReferenceSystem {\n");
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

