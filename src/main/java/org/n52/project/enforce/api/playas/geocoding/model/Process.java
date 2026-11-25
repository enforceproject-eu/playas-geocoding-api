package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.n52.project.enforce.api.playas.geocoding.model.InputDescription;
import org.n52.project.enforce.api.playas.geocoding.model.JobControlOptions;
import org.n52.project.enforce.api.playas.geocoding.model.Link1;
import org.n52.project.enforce.api.playas.geocoding.model.Metadata;
import org.n52.project.enforce.api.playas.geocoding.model.OutputDescription;
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
 * Process
 */

@JsonTypeName("process")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class Process implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String title;

  private @Nullable String description;

  private List<String> keywords = new ArrayList<>();

  private List<Metadata> metadata = new ArrayList<>();

  private String id;

  private String version;

  private List<JobControlOptions> jobControlOptions = new ArrayList<>();

  private List<Link1> links = new ArrayList<>();

  private Map<String, InputDescription> inputs = new HashMap<>();

  private Map<String, OutputDescription> outputs = new HashMap<>();

  public Process() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Process(String id, String version) {
    this.id = id;
    this.version = version;
  }

  public Process title(@Nullable String title) {
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

  public Process description(@Nullable String description) {
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

  public Process keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public Process addKeywordsItem(String keywordsItem) {
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

  public Process metadata(List<Metadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Process addMetadataItem(Metadata metadataItem) {
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

  public Process id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public Process version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @NotNull 
  @Schema(name = "version", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(String version) {
    this.version = version;
  }

  public Process jobControlOptions(List<JobControlOptions> jobControlOptions) {
    this.jobControlOptions = jobControlOptions;
    return this;
  }

  public Process addJobControlOptionsItem(JobControlOptions jobControlOptionsItem) {
    if (this.jobControlOptions == null) {
      this.jobControlOptions = new ArrayList<>();
    }
    this.jobControlOptions.add(jobControlOptionsItem);
    return this;
  }

  /**
   * Get jobControlOptions
   * @return jobControlOptions
   */
  @Valid 
  @Schema(name = "jobControlOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobControlOptions")
  public List<JobControlOptions> getJobControlOptions() {
    return jobControlOptions;
  }

  @JsonProperty("jobControlOptions")
  public void setJobControlOptions(List<JobControlOptions> jobControlOptions) {
    this.jobControlOptions = jobControlOptions;
  }

  public Process links(List<Link1> links) {
    this.links = links;
    return this;
  }

  public Process addLinksItem(Link1 linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public List<Link1> getLinks() {
    return links;
  }

  @JsonProperty("links")
  public void setLinks(List<Link1> links) {
    this.links = links;
  }

  public Process inputs(Map<String, InputDescription> inputs) {
    this.inputs = inputs;
    return this;
  }

  public Process putInputsItem(String key, InputDescription inputsItem) {
    if (this.inputs == null) {
      this.inputs = new HashMap<>();
    }
    this.inputs.put(key, inputsItem);
    return this;
  }

  /**
   * Get inputs
   * @return inputs
   */
  @Valid 
  @Schema(name = "inputs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputs")
  public Map<String, InputDescription> getInputs() {
    return inputs;
  }

  @JsonProperty("inputs")
  public void setInputs(Map<String, InputDescription> inputs) {
    this.inputs = inputs;
  }

  public Process outputs(Map<String, OutputDescription> outputs) {
    this.outputs = outputs;
    return this;
  }

  public Process putOutputsItem(String key, OutputDescription outputsItem) {
    if (this.outputs == null) {
      this.outputs = new HashMap<>();
    }
    this.outputs.put(key, outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  @Valid 
  @Schema(name = "outputs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputs")
  public Map<String, OutputDescription> getOutputs() {
    return outputs;
  }

  @JsonProperty("outputs")
  public void setOutputs(Map<String, OutputDescription> outputs) {
    this.outputs = outputs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Process process = (Process) o;
    return Objects.equals(this.title, process.title) &&
        Objects.equals(this.description, process.description) &&
        Objects.equals(this.keywords, process.keywords) &&
        Objects.equals(this.metadata, process.metadata) &&
        Objects.equals(this.id, process.id) &&
        Objects.equals(this.version, process.version) &&
        Objects.equals(this.jobControlOptions, process.jobControlOptions) &&
        Objects.equals(this.links, process.links) &&
        Objects.equals(this.inputs, process.inputs) &&
        Objects.equals(this.outputs, process.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, keywords, metadata, id, version, jobControlOptions, links, inputs, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Process {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    jobControlOptions: ").append(toIndentedString(jobControlOptions)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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

