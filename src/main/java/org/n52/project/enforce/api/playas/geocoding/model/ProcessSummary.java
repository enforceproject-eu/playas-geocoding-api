package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.JobControlOptions;
import org.n52.project.enforce.api.playas.geocoding.model.Link1;
import org.n52.project.enforce.api.playas.geocoding.model.Metadata;
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
 * ProcessSummary
 */

@JsonTypeName("processSummary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class ProcessSummary implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String title;

  private @Nullable String description;

  private List<String> keywords = new ArrayList<>();

  private List<Metadata> metadata = new ArrayList<>();

  private String id;

  private String version;

  private List<JobControlOptions> jobControlOptions = new ArrayList<>();

  private List<Link1> links = new ArrayList<>();

  public ProcessSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProcessSummary(String id, String version) {
    this.id = id;
    this.version = version;
  }

  public ProcessSummary title(@Nullable String title) {
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

  public ProcessSummary description(@Nullable String description) {
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

  public ProcessSummary keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public ProcessSummary addKeywordsItem(String keywordsItem) {
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

  public ProcessSummary metadata(List<Metadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ProcessSummary addMetadataItem(Metadata metadataItem) {
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

  public ProcessSummary id(String id) {
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

  public ProcessSummary version(String version) {
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

  public ProcessSummary jobControlOptions(List<JobControlOptions> jobControlOptions) {
    this.jobControlOptions = jobControlOptions;
    return this;
  }

  public ProcessSummary addJobControlOptionsItem(JobControlOptions jobControlOptionsItem) {
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

  public ProcessSummary links(List<Link1> links) {
    this.links = links;
    return this;
  }

  public ProcessSummary addLinksItem(Link1 linksItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessSummary processSummary = (ProcessSummary) o;
    return Objects.equals(this.title, processSummary.title) &&
        Objects.equals(this.description, processSummary.description) &&
        Objects.equals(this.keywords, processSummary.keywords) &&
        Objects.equals(this.metadata, processSummary.metadata) &&
        Objects.equals(this.id, processSummary.id) &&
        Objects.equals(this.version, processSummary.version) &&
        Objects.equals(this.jobControlOptions, processSummary.jobControlOptions) &&
        Objects.equals(this.links, processSummary.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, keywords, metadata, id, version, jobControlOptions, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessSummary {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    jobControlOptions: ").append(toIndentedString(jobControlOptions)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

