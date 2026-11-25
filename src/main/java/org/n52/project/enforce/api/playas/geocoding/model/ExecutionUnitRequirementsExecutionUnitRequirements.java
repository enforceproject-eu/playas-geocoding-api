package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * ExecutionUnitRequirementsExecutionUnitRequirements
 */

@JsonTypeName("executionUnitRequirements_executionUnitRequirements")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class ExecutionUnitRequirementsExecutionUnitRequirements implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable Boolean remoteAccess;

  /**
   * Gets or Sets staging
   */
  public enum StagingEnum {
    LOCAL_FILE("local-file"),
    
    REMOTE_ACCESS("remote-access");

    private final String value;

    StagingEnum(String value) {
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
    public static StagingEnum fromValue(String value) {
      for (StagingEnum b : StagingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable StagingEnum staging;

  public ExecutionUnitRequirementsExecutionUnitRequirements remoteAccess(@Nullable Boolean remoteAccess) {
    this.remoteAccess = remoteAccess;
    return this;
  }

  /**
   * Get remoteAccess
   * @return remoteAccess
   */
  
  @Schema(name = "remote-access", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remote-access")
  public @Nullable Boolean getRemoteAccess() {
    return remoteAccess;
  }

  @JsonProperty("remote-access")
  public void setRemoteAccess(@Nullable Boolean remoteAccess) {
    this.remoteAccess = remoteAccess;
  }

  public ExecutionUnitRequirementsExecutionUnitRequirements staging(@Nullable StagingEnum staging) {
    this.staging = staging;
    return this;
  }

  /**
   * Get staging
   * @return staging
   */
  
  @Schema(name = "staging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("staging")
  public @Nullable StagingEnum getStaging() {
    return staging;
  }

  @JsonProperty("staging")
  public void setStaging(@Nullable StagingEnum staging) {
    this.staging = staging;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionUnitRequirementsExecutionUnitRequirements executionUnitRequirementsExecutionUnitRequirements = (ExecutionUnitRequirementsExecutionUnitRequirements) o;
    return Objects.equals(this.remoteAccess, executionUnitRequirementsExecutionUnitRequirements.remoteAccess) &&
        Objects.equals(this.staging, executionUnitRequirementsExecutionUnitRequirements.staging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteAccess, staging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionUnitRequirementsExecutionUnitRequirements {\n");
    sb.append("    remoteAccess: ").append(toIndentedString(remoteAccess)).append("\n");
    sb.append("    staging: ").append(toIndentedString(staging)).append("\n");
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

