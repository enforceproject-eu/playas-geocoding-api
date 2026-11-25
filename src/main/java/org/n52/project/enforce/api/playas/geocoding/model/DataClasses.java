package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.DataClassesDataClassesInner;
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
 * Profiling requirements that the specified value, link, collection reference, selected output, or input/output definition must meet or adapt to, depending on context, in order to make it adequate for the process execution. These requirements are represented as URIs or safe CURIEs providing resolvable profiles applicable to the context. They directly corresponds to link references that can be employed for *Content Negotiation by Profile*.
 */

@Schema(name = "dataClasses", description = "Profiling requirements that the specified value, link, collection reference, selected output, or input/output definition must meet or adapt to, depending on context, in order to make it adequate for the process execution. These requirements are represented as URIs or safe CURIEs providing resolvable profiles applicable to the context. They directly corresponds to link references that can be employed for *Content Negotiation by Profile*.")
@JsonTypeName("dataClasses")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class DataClasses implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<DataClassesDataClassesInner> dataClasses = new ArrayList<>();

  public DataClasses dataClasses(List<DataClassesDataClassesInner> dataClasses) {
    this.dataClasses = dataClasses;
    return this;
  }

  public DataClasses addDataClassesItem(DataClassesDataClassesInner dataClassesItem) {
    if (this.dataClasses == null) {
      this.dataClasses = new ArrayList<>();
    }
    this.dataClasses.add(dataClassesItem);
    return this;
  }

  /**
   * Get dataClasses
   * @return dataClasses
   */
  @Valid 
  @Schema(name = "dataClasses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataClasses")
  public List<DataClassesDataClassesInner> getDataClasses() {
    return dataClasses;
  }

  @JsonProperty("dataClasses")
  public void setDataClasses(List<DataClassesDataClassesInner> dataClasses) {
    this.dataClasses = dataClasses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataClasses dataClasses = (DataClasses) o;
    return Objects.equals(this.dataClasses, dataClasses.dataClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataClasses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataClasses {\n");
    sb.append("    dataClasses: ").append(toIndentedString(dataClasses)).append("\n");
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

