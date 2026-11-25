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
import org.n52.project.enforce.api.playas.geocoding.model.FirstCoordinate;
import org.n52.project.enforce.api.playas.geocoding.model.Resolution;
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
 * Provides information about the limited availability of data within the collection organized as a grid (regular or irregular) along the dimension.
 */

@Schema(name = "grid", description = "Provides information about the limited availability of data within the collection organized as a grid (regular or irregular) along the dimension.")
@JsonTypeName("grid")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class Grid implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer cellsCount;

  private Resolution resolution;

  private List<AvailableResolutionsInner> availableResolutions = new ArrayList<>();

  private FirstCoordinate firstCoordinate;

  private List<AvailableResolutionsInner> relativeBounds = new ArrayList<>();

  private List<CoordinatesOfTheIrregularCellsInner> coordinates = new ArrayList<>();

  private List<List<AvailableResolutionsInner>> boundsCoordinates = new ArrayList<>();

  public Grid() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Grid(Integer cellsCount, Resolution resolution, FirstCoordinate firstCoordinate, List<CoordinatesOfTheIrregularCellsInner> coordinates) {
    this.cellsCount = cellsCount;
    this.resolution = resolution;
    this.firstCoordinate = firstCoordinate;
    this.coordinates = coordinates;
  }

  public Grid cellsCount(Integer cellsCount) {
    this.cellsCount = cellsCount;
    return this;
  }

  /**
   * Number of samples available along the dimension for data organized as a regular or irregular grid.
   * @return cellsCount
   */
  @NotNull 
  @Schema(name = "cellsCount", example = "50", description = "Number of samples available along the dimension for data organized as a regular or irregular grid.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cellsCount")
  public Integer getCellsCount() {
    return cellsCount;
  }

  @JsonProperty("cellsCount")
  public void setCellsCount(Integer cellsCount) {
    this.cellsCount = cellsCount;
  }

  public Grid resolution(Resolution resolution) {
    this.resolution = resolution;
    return this;
  }

  /**
   * Get resolution
   * @return resolution
   */
  @NotNull @Valid 
  @Schema(name = "resolution", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resolution")
  public Resolution getResolution() {
    return resolution;
  }

  @JsonProperty("resolution")
  public void setResolution(Resolution resolution) {
    this.resolution = resolution;
  }

  public Grid availableResolutions(List<AvailableResolutionsInner> availableResolutions) {
    this.availableResolutions = availableResolutions;
    return this;
  }

  public Grid addAvailableResolutionsItem(AvailableResolutionsInner availableResolutionsItem) {
    if (this.availableResolutions == null) {
      this.availableResolutions = new ArrayList<>();
    }
    this.availableResolutions.add(availableResolutionsItem);
    return this;
  }

  /**
   * List of resolutions made available by the API. If not specified, there are no limit other than the limits indicated in `minCellSize` and `maxCellSize` of the collection description (though the API might still allow requesting data beyond these).
   * @return availableResolutions
   */
  @Valid 
  @Schema(name = "availableResolutions", example = "[P1H, P1D, P1M]", description = "List of resolutions made available by the API. If not specified, there are no limit other than the limits indicated in `minCellSize` and `maxCellSize` of the collection description (though the API might still allow requesting data beyond these).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableResolutions")
  public List<AvailableResolutionsInner> getAvailableResolutions() {
    return availableResolutions;
  }

  @JsonProperty("availableResolutions")
  public void setAvailableResolutions(List<AvailableResolutionsInner> availableResolutions) {
    this.availableResolutions = availableResolutions;
  }

  public Grid firstCoordinate(FirstCoordinate firstCoordinate) {
    this.firstCoordinate = firstCoordinate;
    return this;
  }

  /**
   * Get firstCoordinate
   * @return firstCoordinate
   */
  @NotNull @Valid 
  @Schema(name = "firstCoordinate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstCoordinate")
  public FirstCoordinate getFirstCoordinate() {
    return firstCoordinate;
  }

  @JsonProperty("firstCoordinate")
  public void setFirstCoordinate(FirstCoordinate firstCoordinate) {
    this.firstCoordinate = firstCoordinate;
  }

  public Grid relativeBounds(List<AvailableResolutionsInner> relativeBounds) {
    this.relativeBounds = relativeBounds;
    return this;
  }

  public Grid addRelativeBoundsItem(AvailableResolutionsInner relativeBoundsItem) {
    if (this.relativeBounds == null) {
      this.relativeBounds = new ArrayList<>();
    }
    this.relativeBounds.add(relativeBoundsItem);
    return this;
  }

  /**
   * Distance in units from coordinate to the lower and upper bounds of each cell for regular grids, describing the geometry of the cells.
   * @return relativeBounds
   */
  @Valid @Size(min = 2, max = 2) 
  @Schema(name = "relativeBounds", example = "[-0.5, 0.5]", description = "Distance in units from coordinate to the lower and upper bounds of each cell for regular grids, describing the geometry of the cells.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relativeBounds")
  public List<AvailableResolutionsInner> getRelativeBounds() {
    return relativeBounds;
  }

  @JsonProperty("relativeBounds")
  public void setRelativeBounds(List<AvailableResolutionsInner> relativeBounds) {
    this.relativeBounds = relativeBounds;
  }

  public Grid coordinates(List<CoordinatesOfTheIrregularCellsInner> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public Grid addCoordinatesItem(CoordinatesOfTheIrregularCellsInner coordinatesItem) {
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

  public Grid boundsCoordinates(List<List<AvailableResolutionsInner>> boundsCoordinates) {
    this.boundsCoordinates = boundsCoordinates;
    return this;
  }

  public Grid addBoundsCoordinatesItem(List<AvailableResolutionsInner> boundsCoordinatesItem) {
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
    Grid grid = (Grid) o;
    return Objects.equals(this.cellsCount, grid.cellsCount) &&
        Objects.equals(this.resolution, grid.resolution) &&
        Objects.equals(this.availableResolutions, grid.availableResolutions) &&
        Objects.equals(this.firstCoordinate, grid.firstCoordinate) &&
        Objects.equals(this.relativeBounds, grid.relativeBounds) &&
        Objects.equals(this.coordinates, grid.coordinates) &&
        Objects.equals(this.boundsCoordinates, grid.boundsCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellsCount, resolution, availableResolutions, firstCoordinate, relativeBounds, coordinates, boundsCoordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grid {\n");
    sb.append("    cellsCount: ").append(toIndentedString(cellsCount)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    availableResolutions: ").append(toIndentedString(availableResolutions)).append("\n");
    sb.append("    firstCoordinate: ").append(toIndentedString(firstCoordinate)).append("\n");
    sb.append("    relativeBounds: ").append(toIndentedString(relativeBounds)).append("\n");
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

