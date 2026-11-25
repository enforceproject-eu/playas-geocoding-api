package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.Link;
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
 * LandingPage
 */

@JsonTypeName("landingPage")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class LandingPage implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable String attribution;

  private List<@Valid Link> links = new ArrayList<>();

  public LandingPage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LandingPage(List<@Valid Link> links) {
    this.links = links;
  }

  public LandingPage title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", example = "Example processing server", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public LandingPage description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", example = "Example server implementing the OGC API - Processes 1.0 Standard", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public LandingPage attribution(@Nullable String attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * The `attribution` should be short and intended for presentation to a user, for example, in a corner of a map. Parts of the text can be links to other resources if additional information is needed. The string can include HTML markup.
   * @return attribution
   */
  
  @Schema(name = "attribution", description = "The `attribution` should be short and intended for presentation to a user, for example, in a corner of a map. Parts of the text can be links to other resources if additional information is needed. The string can include HTML markup.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution")
  public @Nullable String getAttribution() {
    return attribution;
  }

  @JsonProperty("attribution")
  public void setAttribution(@Nullable String attribution) {
    this.attribution = attribution;
  }

  public LandingPage links(List<@Valid Link> links) {
    this.links = links;
    return this;
  }

  public LandingPage addLinksItem(Link linksItem) {
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
  public List<@Valid Link> getLinks() {
    return links;
  }

  @JsonProperty("links")
  public void setLinks(List<@Valid Link> links) {
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
    LandingPage landingPage = (LandingPage) o;
    return Objects.equals(this.title, landingPage.title) &&
        Objects.equals(this.description, landingPage.description) &&
        Objects.equals(this.attribution, landingPage.attribution) &&
        Objects.equals(this.links, landingPage.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, attribution, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandingPage {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
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

