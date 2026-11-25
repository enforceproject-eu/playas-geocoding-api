package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.Link1;
import org.n52.project.enforce.api.playas.geocoding.model.ProcessSummary;
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
 * ProcessList
 */

@JsonTypeName("processList")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class ProcessList implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<ProcessSummary> processes = new ArrayList<>();

  private List<Link1> links = new ArrayList<>();

  public ProcessList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProcessList(List<ProcessSummary> processes, List<Link1> links) {
    this.processes = processes;
    this.links = links;
  }

  public ProcessList processes(List<ProcessSummary> processes) {
    this.processes = processes;
    return this;
  }

  public ProcessList addProcessesItem(ProcessSummary processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<>();
    }
    this.processes.add(processesItem);
    return this;
  }

  /**
   * Get processes
   * @return processes
   */
  @NotNull @Valid 
  @Schema(name = "processes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("processes")
  public List<ProcessSummary> getProcesses() {
    return processes;
  }

  @JsonProperty("processes")
  public void setProcesses(List<ProcessSummary> processes) {
    this.processes = processes;
  }

  public ProcessList links(List<Link1> links) {
    this.links = links;
    return this;
  }

  public ProcessList addLinksItem(Link1 linksItem) {
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
  @NotNull @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ProcessList processList = (ProcessList) o;
    return Objects.equals(this.processes, processList.processes) &&
        Objects.equals(this.links, processList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processes, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessList {\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
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

