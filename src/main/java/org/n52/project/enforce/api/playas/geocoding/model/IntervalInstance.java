package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.IntervalArrayInner;
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
 * IntervalInstance
 */

@JsonTypeName("intervalInstance")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class IntervalInstance implements Serializable, TemporalInstance {

  private static final long serialVersionUID = 1L;

  private List<IntervalArrayInner> interval = new ArrayList<>();

  public IntervalInstance() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IntervalInstance(List<IntervalArrayInner> interval) {
    this.interval = interval;
  }

  public IntervalInstance interval(List<IntervalArrayInner> interval) {
    this.interval = interval;
    return this;
  }

  public IntervalInstance addIntervalItem(IntervalArrayInner intervalItem) {
    if (this.interval == null) {
      this.interval = new ArrayList<>();
    }
    this.interval.add(intervalItem);
    return this;
  }

  /**
   * Get interval
   * @return interval
   */
  @NotNull @Valid @Size(min = 2, max = 2) 
  @Schema(name = "interval", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("interval")
  public List<IntervalArrayInner> getInterval() {
    return interval;
  }

  @JsonProperty("interval")
  public void setInterval(List<IntervalArrayInner> interval) {
    this.interval = interval;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntervalInstance intervalInstance = (IntervalInstance) o;
    return Objects.equals(this.interval, intervalInstance.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntervalInstance {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

