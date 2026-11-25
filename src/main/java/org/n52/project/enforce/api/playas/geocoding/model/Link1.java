package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.n52.project.enforce.api.playas.geocoding.model.DataClassesDataClassesInner;
import org.n52.project.enforce.api.playas.geocoding.model.LinkBaseExtendedProfile;
import org.springframework.lang.Nullable;
import java.math.BigDecimal;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Link1
 */

@JsonTypeName("link_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class Link1 implements Serializable, InlineOrRefValue {

  private static final long serialVersionUID = 1L;

  private String rel;

  private @Nullable String type;

  private @Nullable String hreflang;

  private @Nullable String title;

  private @Nullable Integer length;

  /**
   * Gets or Sets method
   */
  public enum MethodEnum {
    POST("POST"),
    
    GET("GET"),
    
    DELETE("DELETE"),
    
    PATCH("PATCH");

    private final String value;

    MethodEnum(String value) {
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
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable MethodEnum method;

  private @Nullable Object body;

  private Map<String, String> headers = new HashMap<>();

  private @Nullable LinkBaseExtendedProfile profile;

  private List<DataClassesDataClassesInner> dataClasses = new ArrayList<>();

  private String href;

  public Link1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Link1(String rel, String href) {
    this.rel = rel;
    this.href = href;
  }

  public Link1 rel(String rel) {
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

  public Link1 type(@Nullable String type) {
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

  public Link1 hreflang(@Nullable String hreflang) {
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

  public Link1 title(@Nullable String title) {
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

  public Link1 length(@Nullable Integer length) {
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

  public Link1 method(@Nullable MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
   */
  
  @Schema(name = "method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("method")
  public @Nullable MethodEnum getMethod() {
    return method;
  }

  @JsonProperty("method")
  public void setMethod(@Nullable MethodEnum method) {
    this.method = method;
  }

  public Link1 body(@Nullable Object body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   */
  
  @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public @Nullable Object getBody() {
    return body;
  }

  @JsonProperty("body")
  public void setBody(@Nullable Object body) {
    this.body = body;
  }

  public Link1 headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public Link1 putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Get headers
   * @return headers
   */
  
  @Schema(name = "headers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }

  @JsonProperty("headers")
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public Link1 profile(@Nullable LinkBaseExtendedProfile profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
   */
  @Valid 
  @Schema(name = "profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile")
  public @Nullable LinkBaseExtendedProfile getProfile() {
    return profile;
  }

  @JsonProperty("profile")
  public void setProfile(@Nullable LinkBaseExtendedProfile profile) {
    this.profile = profile;
  }

  public Link1 dataClasses(List<DataClassesDataClassesInner> dataClasses) {
    this.dataClasses = dataClasses;
    return this;
  }

  public Link1 addDataClassesItem(DataClassesDataClassesInner dataClassesItem) {
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

  public Link1 href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
   */
  @NotNull 
  @Schema(name = "href", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  @JsonProperty("href")
  public void setHref(String href) {
    this.href = href;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link1 link1 = (Link1) o;
    return Objects.equals(this.rel, link1.rel) &&
        Objects.equals(this.type, link1.type) &&
        Objects.equals(this.hreflang, link1.hreflang) &&
        Objects.equals(this.title, link1.title) &&
        Objects.equals(this.length, link1.length) &&
        Objects.equals(this.method, link1.method) &&
        Objects.equals(this.body, link1.body) &&
        Objects.equals(this.headers, link1.headers) &&
        Objects.equals(this.profile, link1.profile) &&
        Objects.equals(this.dataClasses, link1.dataClasses) &&
        Objects.equals(this.href, link1.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, type, hreflang, title, length, method, body, headers, profile, dataClasses, href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link1 {\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hreflang: ").append(toIndentedString(hreflang)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    dataClasses: ").append(toIndentedString(dataClasses)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

