package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * LinkBase
 */

@JsonTypeName("linkBase")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class LinkBase implements Serializable {

  private static final long serialVersionUID = 1L;

  private String rel;

  private @Nullable String type;

  private @Nullable String hreflang;

  private @Nullable String title;

  private @Nullable Integer length;

  public LinkBase() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LinkBase(String rel) {
    this.rel = rel;
  }

  public LinkBase rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Get rel
   * @return rel
   */
  @NotNull 
  @Schema(name = "rel", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rel")
  public String getRel() {
    return rel;
  }

  @JsonProperty("rel")
  public void setRel(String rel) {
    this.rel = rel;
  }

  public LinkBase type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable String type) {
    this.type = type;
  }

  public LinkBase hreflang(@Nullable String hreflang) {
    this.hreflang = hreflang;
    return this;
  }

  /**
   * Get hreflang
   * @return hreflang
   */
  
  @Schema(name = "hreflang", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hreflang")
  public @Nullable String getHreflang() {
    return hreflang;
  }

  @JsonProperty("hreflang")
  public void setHreflang(@Nullable String hreflang) {
    this.hreflang = hreflang;
  }

  public LinkBase title(@Nullable String title) {
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

  public LinkBase length(@Nullable Integer length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
   */
  
  @Schema(name = "length", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("length")
  public @Nullable Integer getLength() {
    return length;
  }

  @JsonProperty("length")
  public void setLength(@Nullable Integer length) {
    this.length = length;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkBase linkBase = (LinkBase) o;
    return Objects.equals(this.rel, linkBase.rel) &&
        Objects.equals(this.type, linkBase.type) &&
        Objects.equals(this.hreflang, linkBase.hreflang) &&
        Objects.equals(this.title, linkBase.title) &&
        Objects.equals(this.length, linkBase.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, type, hreflang, title, length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkBase {\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hreflang: ").append(toIndentedString(hreflang)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

