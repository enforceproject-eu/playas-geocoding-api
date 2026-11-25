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
import org.n52.project.enforce.api.playas.geocoding.model.FormatAllOfSchema;
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
 * Format
 */

@JsonTypeName("format")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class Format implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<DataClassesDataClassesInner> dataClasses = new ArrayList<>();

  private @Nullable String mediaType;

  private @Nullable String encoding;

  private @Nullable FormatAllOfSchema schema;

  public Format dataClasses(List<DataClassesDataClassesInner> dataClasses) {
    this.dataClasses = dataClasses;
    return this;
  }

  public Format addDataClassesItem(DataClassesDataClassesInner dataClassesItem) {
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

  public Format mediaType(@Nullable String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  
  @Schema(name = "mediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaType")
  public @Nullable String getMediaType() {
    return mediaType;
  }

  @JsonProperty("mediaType")
  public void setMediaType(@Nullable String mediaType) {
    this.mediaType = mediaType;
  }

  public Format encoding(@Nullable String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Get encoding
   * @return encoding
   */
  
  @Schema(name = "encoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encoding")
  public @Nullable String getEncoding() {
    return encoding;
  }

  @JsonProperty("encoding")
  public void setEncoding(@Nullable String encoding) {
    this.encoding = encoding;
  }

  public Format schema(@Nullable FormatAllOfSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
   */
  @Valid 
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public @Nullable FormatAllOfSchema getSchema() {
    return schema;
  }

  @JsonProperty("schema")
  public void setSchema(@Nullable FormatAllOfSchema schema) {
    this.schema = schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Format format = (Format) o;
    return Objects.equals(this.dataClasses, format.dataClasses) &&
        Objects.equals(this.mediaType, format.mediaType) &&
        Objects.equals(this.encoding, format.encoding) &&
        Objects.equals(this.schema, format.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataClasses, mediaType, encoding, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Format {\n");
    sb.append("    dataClasses: ").append(toIndentedString(dataClasses)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

