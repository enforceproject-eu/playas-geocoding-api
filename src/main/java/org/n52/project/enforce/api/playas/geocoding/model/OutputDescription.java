package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.Apis;
import org.n52.project.enforce.api.playas.geocoding.model.DataClassesDataClassesInner;
import org.n52.project.enforce.api.playas.geocoding.model.Metadata;
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
 * OutputDescription
 */

@JsonTypeName("outputDescription")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class OutputDescription implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String title;

  private @Nullable String description;

  private List<String> keywords = new ArrayList<>();

  private List<Metadata> metadata = new ArrayList<>();

  private List<DataClassesDataClassesInner> dataClasses = new ArrayList<>();

  private List<Apis> dataAccessAPIs = new ArrayList<>();

  private Schema schema;

  private Integer minOccurs = 1;

  private @Nullable SchemaAndOccurrencesMaxOccurs maxOccurs;

  public OutputDescription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OutputDescription(Schema schema) {
    this.schema = schema;
  }

  public OutputDescription title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public OutputDescription description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public OutputDescription keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public OutputDescription addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * Get keywords
   * @return keywords
   */
  
  @Schema(name = "keywords", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywords")
  public List<String> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public OutputDescription metadata(List<Metadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OutputDescription addMetadataItem(Metadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public List<Metadata> getMetadata() {
    return metadata;
  }

  @JsonProperty("metadata")
  public void setMetadata(List<Metadata> metadata) {
    this.metadata = metadata;
  }

  public OutputDescription dataClasses(List<DataClassesDataClassesInner> dataClasses) {
    this.dataClasses = dataClasses;
    return this;
  }

  public OutputDescription addDataClassesItem(DataClassesDataClassesInner dataClassesItem) {
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

  public OutputDescription dataAccessAPIs(List<Apis> dataAccessAPIs) {
    this.dataAccessAPIs = dataAccessAPIs;
    return this;
  }

  public OutputDescription addDataAccessAPIsItem(Apis dataAccessAPIsItem) {
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

  public OutputDescription schema(Schema schema) {
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

  public OutputDescription minOccurs(Integer minOccurs) {
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

  public OutputDescription maxOccurs(@Nullable SchemaAndOccurrencesMaxOccurs maxOccurs) {
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
    OutputDescription outputDescription = (OutputDescription) o;
    return Objects.equals(this.title, outputDescription.title) &&
        Objects.equals(this.description, outputDescription.description) &&
        Objects.equals(this.keywords, outputDescription.keywords) &&
        Objects.equals(this.metadata, outputDescription.metadata) &&
        Objects.equals(this.dataClasses, outputDescription.dataClasses) &&
        Objects.equals(this.dataAccessAPIs, outputDescription.dataAccessAPIs) &&
        Objects.equals(this.schema, outputDescription.schema) &&
        Objects.equals(this.minOccurs, outputDescription.minOccurs) &&
        Objects.equals(this.maxOccurs, outputDescription.maxOccurs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, keywords, metadata, dataClasses, dataAccessAPIs, schema, minOccurs, maxOccurs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputDescription {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dataClasses: ").append(toIndentedString(dataClasses)).append("\n");
    sb.append("    dataAccessAPIs: ").append(toIndentedString(dataAccessAPIs)).append("\n");
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

