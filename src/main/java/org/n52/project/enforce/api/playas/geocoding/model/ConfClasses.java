package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ConfClasses
 */

@JsonTypeName("confClasses")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class ConfClasses implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<String> conformsTo = new ArrayList<>();

  public ConfClasses() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConfClasses(List<String> conformsTo) {
    this.conformsTo = conformsTo;
  }

  public ConfClasses conformsTo(List<String> conformsTo) {
    this.conformsTo = conformsTo;
    return this;
  }

  public ConfClasses addConformsToItem(String conformsToItem) {
    if (this.conformsTo == null) {
      this.conformsTo = new ArrayList<>();
    }
    this.conformsTo.add(conformsToItem);
    return this;
  }

  /**
   * Get conformsTo
   * @return conformsTo
   */
  @NotNull 
  @Schema(name = "conformsTo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("conformsTo")
  public List<String> getConformsTo() {
    return conformsTo;
  }

  @JsonProperty("conformsTo")
  public void setConformsTo(List<String> conformsTo) {
    this.conformsTo = conformsTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfClasses confClasses = (ConfClasses) o;
    return Objects.equals(this.conformsTo, confClasses.conformsTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conformsTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfClasses {\n");
    sb.append("    conformsTo: ").append(toIndentedString(conformsTo)).append("\n");
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

