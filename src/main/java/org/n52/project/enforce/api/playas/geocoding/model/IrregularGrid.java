package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.AvailableResolutionsInner;
import org.n52.project.enforce.api.playas.geocoding.model.CoordinatesOfTheIrregularCellsInner;
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
 * Irregular grid with samples spaced at different intervals.
 */

@Schema(name = "irregularGrid", description = "Irregular grid with samples spaced at different intervals.")
@JsonTypeName("irregularGrid")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class IrregularGrid implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<CoordinatesOfTheIrregularCellsInner> coordinates = new ArrayList<>();

  private List<List<AvailableResolutionsInner>> boundsCoordinates = new ArrayList<>();

  public IrregularGrid() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IrregularGrid(List<CoordinatesOfTheIrregularCellsInner> coordinates) {
    this.coordinates = coordinates;
  }

  public IrregularGrid coordinates(List<CoordinatesOfTheIrregularCellsInner> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public IrregularGrid addCoordinatesItem(CoordinatesOfTheIrregularCellsInner coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

  /**
   * List of coordinates along the dimension for which data organized as an irregular grid in the collection is available. (e.g., 2, 10, 80, 100).
   * @return coordinates
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "coordinates", example = "[2, 10, 80, 100]", description = "List of coordinates along the dimension for which data organized as an irregular grid in the collection is available. (e.g., 2, 10, 80, 100).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("coordinates")
  public List<CoordinatesOfTheIrregularCellsInner> getCoordinates() {
    return coordinates;
  }

  @JsonProperty("coordinates")
  public void setCoordinates(List<CoordinatesOfTheIrregularCellsInner> coordinates) {
    this.coordinates = coordinates;
  }

  public IrregularGrid boundsCoordinates(List<List<AvailableResolutionsInner>> boundsCoordinates) {
    this.boundsCoordinates = boundsCoordinates;
    return this;
  }

  public IrregularGrid addBoundsCoordinatesItem(List<AvailableResolutionsInner> boundsCoordinatesItem) {
    if (this.boundsCoordinates == null) {
      this.boundsCoordinates = new ArrayList<>();
    }
    this.boundsCoordinates.add(boundsCoordinatesItem);
    return this;
  }

  /**
   * For irregular grids, an ordered list of the coordinates in absolute units of the lower and upper bounds of the dimension for each cell.
   * @return boundsCoordinates
   */
  @Valid @Size(min = 1) 
  @Schema(name = "boundsCoordinates", example = "[[-180, -179], [-179, -178]]", description = "For irregular grids, an ordered list of the coordinates in absolute units of the lower and upper bounds of the dimension for each cell.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boundsCoordinates")
  public List<List<AvailableResolutionsInner>> getBoundsCoordinates() {
    return boundsCoordinates;
  }

  @JsonProperty("boundsCoordinates")
  public void setBoundsCoordinates(List<List<AvailableResolutionsInner>> boundsCoordinates) {
    this.boundsCoordinates = boundsCoordinates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IrregularGrid irregularGrid = (IrregularGrid) o;
    return Objects.equals(this.coordinates, irregularGrid.coordinates) &&
        Objects.equals(this.boundsCoordinates, irregularGrid.boundsCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, boundsCoordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IrregularGrid {\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    boundsCoordinates: ").append(toIndentedString(boundsCoordinates)).append("\n");
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

