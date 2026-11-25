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
import org.n52.project.enforce.api.playas.geocoding.model.FieldsModifiersFilter;
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
 * FieldsModifiers
 */

@JsonTypeName("fieldsModifiers")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class FieldsModifiers implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable FieldsModifiersFilter filter;

  private @Nullable String filterLang;

  private @Nullable String filterCrs;

  private Map<String, String> aliases = new HashMap<>();

  private List<String> properties = new ArrayList<>();

  private List<String> sortBy = new ArrayList<>();

  public FieldsModifiers filter(@Nullable FieldsModifiersFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @Valid 
  @Schema(name = "filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter")
  public @Nullable FieldsModifiersFilter getFilter() {
    return filter;
  }

  @JsonProperty("filter")
  public void setFilter(@Nullable FieldsModifiersFilter filter) {
    this.filter = filter;
  }

  public FieldsModifiers filterLang(@Nullable String filterLang) {
    this.filterLang = filterLang;
    return this;
  }

  /**
   * Get filterLang
   * @return filterLang
   */
  
  @Schema(name = "filter-lang", example = "cql2-text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter-lang")
  public @Nullable String getFilterLang() {
    return filterLang;
  }

  @JsonProperty("filter-lang")
  public void setFilterLang(@Nullable String filterLang) {
    this.filterLang = filterLang;
  }

  public FieldsModifiers filterCrs(@Nullable String filterCrs) {
    this.filterCrs = filterCrs;
    return this;
  }

  /**
   * Get filterCrs
   * @return filterCrs
   */
  
  @Schema(name = "filter-crs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter-crs")
  public @Nullable String getFilterCrs() {
    return filterCrs;
  }

  @JsonProperty("filter-crs")
  public void setFilterCrs(@Nullable String filterCrs) {
    this.filterCrs = filterCrs;
  }

  public FieldsModifiers aliases(Map<String, String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public FieldsModifiers putAliasesItem(String key, String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new HashMap<>();
    }
    this.aliases.put(key, aliasesItem);
    return this;
  }

  /**
   * Get aliases
   * @return aliases
   */
  
  @Schema(name = "aliases", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aliases")
  public Map<String, String> getAliases() {
    return aliases;
  }

  @JsonProperty("aliases")
  public void setAliases(Map<String, String> aliases) {
    this.aliases = aliases;
  }

  public FieldsModifiers properties(List<String> properties) {
    this.properties = properties;
    return this;
  }

  public FieldsModifiers addPropertiesItem(String propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public List<String> getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(List<String> properties) {
    this.properties = properties;
  }

  public FieldsModifiers sortBy(List<String> sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public FieldsModifiers addSortByItem(String sortByItem) {
    if (this.sortBy == null) {
      this.sortBy = new ArrayList<>();
    }
    this.sortBy.add(sortByItem);
    return this;
  }

  /**
   * Get sortBy
   * @return sortBy
   */
  
  @Schema(name = "sortBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortBy")
  public List<String> getSortBy() {
    return sortBy;
  }

  @JsonProperty("sortBy")
  public void setSortBy(List<String> sortBy) {
    this.sortBy = sortBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldsModifiers fieldsModifiers = (FieldsModifiers) o;
    return Objects.equals(this.filter, fieldsModifiers.filter) &&
        Objects.equals(this.filterLang, fieldsModifiers.filterLang) &&
        Objects.equals(this.filterCrs, fieldsModifiers.filterCrs) &&
        Objects.equals(this.aliases, fieldsModifiers.aliases) &&
        Objects.equals(this.properties, fieldsModifiers.properties) &&
        Objects.equals(this.sortBy, fieldsModifiers.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, filterLang, filterCrs, aliases, properties, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsModifiers {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    filterLang: ").append(toIndentedString(filterLang)).append("\n");
    sb.append("    filterCrs: ").append(toIndentedString(filterCrs)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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

