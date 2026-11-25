package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.Apis;
import org.n52.project.enforce.api.playas.geocoding.model.DataClassesDataClassesInner;
import org.n52.project.enforce.api.playas.geocoding.model.ExecutionUnitRequirementsExecutionUnitRequirements;
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
 * InputDescription
 */

@JsonTypeName("inputDescription")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class InputDescription implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String title;

  private @Nullable String description;

  private List<String> keywords = new ArrayList<>();

  private List<Metadata> metadata = new ArrayList<>();

  private List<DataClassesDataClassesInner> dataClasses = new ArrayList<>();

  private List<Apis> dataAccessAPIs = new ArrayList<>();

  private @Nullable ExecutionUnitRequirementsExecutionUnitRequirements executionUnitRequirements;

  private Schema schema;

  private Integer minOccurs = 1;

  private @Nullable SchemaAndOccurrencesMaxOccurs maxOccurs;

  /**
   * Gets or Sets valuePassing
   */
  public enum ValuePassingEnum {
    BY_VALUE("byValue"),
    
    BY_REFERENCE("byReference");

    private final String value;

    ValuePassingEnum(String value) {
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
    public static ValuePassingEnum fromValue(String value) {
      for (ValuePassingEnum b : ValuePassingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private List<ValuePassingEnum> valuePassing = new ArrayList<>(Arrays.asList(ValuePassingEnum.BY_VALUE, ValuePassingEnum.BY_REFERENCE));

  public InputDescription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InputDescription(Schema schema) {
    this.schema = schema;
  }

  public InputDescription title(@Nullable String title) {
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

  public InputDescription description(@Nullable String description) {
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

  public InputDescription keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public InputDescription addKeywordsItem(String keywordsItem) {
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

  public InputDescription metadata(List<Metadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public InputDescription addMetadataItem(Metadata metadataItem) {
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

  public InputDescription dataClasses(List<DataClassesDataClassesInner> dataClasses) {
    this.dataClasses = dataClasses;
    return this;
  }

  public InputDescription addDataClassesItem(DataClassesDataClassesInner dataClassesItem) {
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

  public InputDescription dataAccessAPIs(List<Apis> dataAccessAPIs) {
    this.dataAccessAPIs = dataAccessAPIs;
    return this;
  }

  public InputDescription addDataAccessAPIsItem(Apis dataAccessAPIsItem) {
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

  public InputDescription executionUnitRequirements(@Nullable ExecutionUnitRequirementsExecutionUnitRequirements executionUnitRequirements) {
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

  public InputDescription schema(Schema schema) {
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

  public InputDescription minOccurs(Integer minOccurs) {
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

  public InputDescription maxOccurs(@Nullable SchemaAndOccurrencesMaxOccurs maxOccurs) {
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

  public InputDescription valuePassing(List<ValuePassingEnum> valuePassing) {
    this.valuePassing = valuePassing;
    return this;
  }

  public InputDescription addValuePassingItem(ValuePassingEnum valuePassingItem) {
    if (this.valuePassing == null) {
      this.valuePassing = new ArrayList<>(Arrays.asList(ValuePassingEnum.BY_VALUE, ValuePassingEnum.BY_REFERENCE));
    }
    this.valuePassing.add(valuePassingItem);
    return this;
  }

  /**
   * Get valuePassing
   * @return valuePassing
   */
  
  @Schema(name = "valuePassing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valuePassing")
  public List<ValuePassingEnum> getValuePassing() {
    return valuePassing;
  }

  @JsonProperty("valuePassing")
  public void setValuePassing(List<ValuePassingEnum> valuePassing) {
    this.valuePassing = valuePassing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputDescription inputDescription = (InputDescription) o;
    return Objects.equals(this.title, inputDescription.title) &&
        Objects.equals(this.description, inputDescription.description) &&
        Objects.equals(this.keywords, inputDescription.keywords) &&
        Objects.equals(this.metadata, inputDescription.metadata) &&
        Objects.equals(this.dataClasses, inputDescription.dataClasses) &&
        Objects.equals(this.dataAccessAPIs, inputDescription.dataAccessAPIs) &&
        Objects.equals(this.executionUnitRequirements, inputDescription.executionUnitRequirements) &&
        Objects.equals(this.schema, inputDescription.schema) &&
        Objects.equals(this.minOccurs, inputDescription.minOccurs) &&
        Objects.equals(this.maxOccurs, inputDescription.maxOccurs) &&
        Objects.equals(this.valuePassing, inputDescription.valuePassing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, keywords, metadata, dataClasses, dataAccessAPIs, executionUnitRequirements, schema, minOccurs, maxOccurs, valuePassing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputDescription {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dataClasses: ").append(toIndentedString(dataClasses)).append("\n");
    sb.append("    dataAccessAPIs: ").append(toIndentedString(dataAccessAPIs)).append("\n");
    sb.append("    executionUnitRequirements: ").append(toIndentedString(executionUnitRequirements)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    minOccurs: ").append(toIndentedString(minOccurs)).append("\n");
    sb.append("    maxOccurs: ").append(toIndentedString(maxOccurs)).append("\n");
    sb.append("    valuePassing: ").append(toIndentedString(valuePassing)).append("\n");
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

