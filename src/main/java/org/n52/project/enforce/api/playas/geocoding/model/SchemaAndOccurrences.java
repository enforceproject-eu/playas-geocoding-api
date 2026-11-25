package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.n52.project.enforce.api.playas.geocoding.model.SchemaAndOccurrencesMaxOccurs;
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
 * SchemaAndOccurrences
 */

@JsonTypeName("schemaAndOccurrences")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class SchemaAndOccurrences implements Serializable {

  private static final long serialVersionUID = 1L;

  private Schema schema;

  private Integer minOccurs = 1;

  private @Nullable SchemaAndOccurrencesMaxOccurs maxOccurs;

  public SchemaAndOccurrences() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SchemaAndOccurrences(Schema schema) {
    this.schema = schema;
  }

  public SchemaAndOccurrences schema(Schema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
   */
  @NotNull @Valid 
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schema")
  public Schema getSchema() {
    return schema;
  }

  @JsonProperty("schema")
  public void setSchema(Schema schema) {
    this.schema = schema;
  }

  public SchemaAndOccurrences minOccurs(Integer minOccurs) {
    this.minOccurs = minOccurs;
    return this;
  }

  /**
   * Get minOccurs
   * @return minOccurs
   */
  
  @Schema(name = "minOccurs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minOccurs")
  public Integer getMinOccurs() {
    return minOccurs;
  }

  @JsonProperty("minOccurs")
  public void setMinOccurs(Integer minOccurs) {
    this.minOccurs = minOccurs;
  }

  public SchemaAndOccurrences maxOccurs(@Nullable SchemaAndOccurrencesMaxOccurs maxOccurs) {
    this.maxOccurs = maxOccurs;
    return this;
  }

  /**
   * Get maxOccurs
   * @return maxOccurs
   */
  @Valid 
  @Schema(name = "maxOccurs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxOccurs")
  public @Nullable SchemaAndOccurrencesMaxOccurs getMaxOccurs() {
    return maxOccurs;
  }

  @JsonProperty("maxOccurs")
  public void setMaxOccurs(@Nullable SchemaAndOccurrencesMaxOccurs maxOccurs) {
    this.maxOccurs = maxOccurs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaAndOccurrences schemaAndOccurrences = (SchemaAndOccurrences) o;
    return Objects.equals(this.schema, schemaAndOccurrences.schema) &&
        Objects.equals(this.minOccurs, schemaAndOccurrences.minOccurs) &&
        Objects.equals(this.maxOccurs, schemaAndOccurrences.maxOccurs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, minOccurs, maxOccurs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaAndOccurrences {\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    minOccurs: ").append(toIndentedString(minOccurs)).append("\n");
    sb.append("    maxOccurs: ").append(toIndentedString(maxOccurs)).append("\n");
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

