package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.n52.project.enforce.api.playas.geocoding.model.ExecutionUnitRequirementsExecutionUnitRequirements;
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
 * ExecutionUnitRequirements
 */

@JsonTypeName("executionUnitRequirements")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class ExecutionUnitRequirements implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable ExecutionUnitRequirementsExecutionUnitRequirements executionUnitRequirements;

  public ExecutionUnitRequirements executionUnitRequirements(@Nullable ExecutionUnitRequirementsExecutionUnitRequirements executionUnitRequirements) {
    this.executionUnitRequirements = executionUnitRequirements;
    return this;
  }

  /**
   * Get executionUnitRequirements
   * @return executionUnitRequirements
   */
  @Valid 
  @Schema(name = "executionUnitRequirements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionUnitRequirements")
  public @Nullable ExecutionUnitRequirementsExecutionUnitRequirements getExecutionUnitRequirements() {
    return executionUnitRequirements;
  }

  @JsonProperty("executionUnitRequirements")
  public void setExecutionUnitRequirements(@Nullable ExecutionUnitRequirementsExecutionUnitRequirements executionUnitRequirements) {
    this.executionUnitRequirements = executionUnitRequirements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionUnitRequirements executionUnitRequirements = (ExecutionUnitRequirements) o;
    return Objects.equals(this.executionUnitRequirements, executionUnitRequirements.executionUnitRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionUnitRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionUnitRequirements {\n");
    sb.append("    executionUnitRequirements: ").append(toIndentedString(executionUnitRequirements)).append("\n");
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

