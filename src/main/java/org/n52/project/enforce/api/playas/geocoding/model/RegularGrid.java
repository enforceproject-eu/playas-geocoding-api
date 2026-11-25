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
 * Regular grid with samples spaced at equal intervals.
 */

@Schema(name = "regularGrid", description = "Regular grid with samples spaced at equal intervals.")
@JsonTypeName("regularGrid")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class RegularGrid implements Serializable {

  private static final long serialVersionUID = 1L;

  private Resolution resolution;

  private List<AvailableResolutionsInner> availableResolutions = new ArrayList<>();

  private FirstCoordinate firstCoordinate;

  private List<AvailableResolutionsInner> relativeBounds = new ArrayList<>();

  public RegularGrid() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegularGrid(Resolution resolution, FirstCoordinate firstCoordinate) {
    this.resolution = resolution;
    this.firstCoordinate = firstCoordinate;
  }

  public RegularGrid resolution(Resolution resolution) {
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

  public RegularGrid availableResolutions(List<AvailableResolutionsInner> availableResolutions) {
    this.availableResolutions = availableResolutions;
    return this;
  }

  public RegularGrid addAvailableResolutionsItem(AvailableResolutionsInner availableResolutionsItem) {
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

  public RegularGrid firstCoordinate(FirstCoordinate firstCoordinate) {
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

  public RegularGrid relativeBounds(List<AvailableResolutionsInner> relativeBounds) {
    this.relativeBounds = relativeBounds;
    return this;
  }

  public RegularGrid addRelativeBoundsItem(AvailableResolutionsInner relativeBoundsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegularGrid regularGrid = (RegularGrid) o;
    return Objects.equals(this.resolution, regularGrid.resolution) &&
        Objects.equals(this.availableResolutions, regularGrid.availableResolutions) &&
        Objects.equals(this.firstCoordinate, regularGrid.firstCoordinate) &&
        Objects.equals(this.relativeBounds, regularGrid.relativeBounds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolution, availableResolutions, firstCoordinate, relativeBounds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegularGrid {\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    availableResolutions: ").append(toIndentedString(availableResolutions)).append("\n");
    sb.append("    firstCoordinate: ").append(toIndentedString(firstCoordinate)).append("\n");
    sb.append("    relativeBounds: ").append(toIndentedString(relativeBounds)).append("\n");
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

