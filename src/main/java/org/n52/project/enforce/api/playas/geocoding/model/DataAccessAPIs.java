package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.Apis;
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
 * DataAccessAPIs
 */

@JsonTypeName("dataAccessAPIs")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class DataAccessAPIs implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<Apis> dataAccessAPIs = new ArrayList<>();

  public DataAccessAPIs dataAccessAPIs(List<Apis> dataAccessAPIs) {
    this.dataAccessAPIs = dataAccessAPIs;
    return this;
  }

  public DataAccessAPIs addDataAccessAPIsItem(Apis dataAccessAPIsItem) {
    if (this.dataAccessAPIs == null) {
      this.dataAccessAPIs = new ArrayList<>();
    }
    this.dataAccessAPIs.add(dataAccessAPIsItem);
    return this;
  }

  /**
   * Get dataAccessAPIs
   * @return dataAccessAPIs
   */
  @Valid 
  @Schema(name = "dataAccessAPIs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataAccessAPIs")
  public List<Apis> getDataAccessAPIs() {
    return dataAccessAPIs;
  }

  @JsonProperty("dataAccessAPIs")
  public void setDataAccessAPIs(List<Apis> dataAccessAPIs) {
    this.dataAccessAPIs = dataAccessAPIs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataAccessAPIs dataAccessAPIs = (DataAccessAPIs) o;
    return Objects.equals(this.dataAccessAPIs, dataAccessAPIs.dataAccessAPIs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAccessAPIs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataAccessAPIs {\n");
    sb.append("    dataAccessAPIs: ").append(toIndentedString(dataAccessAPIs)).append("\n");
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

