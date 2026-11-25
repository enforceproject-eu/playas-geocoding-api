package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
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
 * SchemaPropertiesValue
 */

@JsonTypeName("schema_properties_value")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class SchemaPropertiesValue implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String title;

  private @Nullable String description;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ARRAY("array"),
    
    BOOLEAN("boolean"),
    
    INTEGER("integer"),
    
    NULL("null"),
    
    NUMBER("number"),
    
    OBJECT("object"),
    
    STRING("string");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TypeEnum type;

  private Set<Object> _enum = new LinkedHashSet<>();

  private @Nullable String format;

  private @Nullable String contentMediaType;

  private @Nullable BigDecimal maximum;

  private @Nullable BigDecimal exclusiveMaximum;

  private @Nullable BigDecimal minimum;

  private @Nullable BigDecimal exclusiveMinimum;

  private @Nullable String pattern;

  private @Nullable Integer maxItems;

  private Integer minItems = 0;

  private @Nullable URI xOgcDefinition;

  private @Nullable String xOgcUnit;

  private @Nullable String xOgcUnitLang;

  public SchemaPropertiesValue title(@Nullable String title) {
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

  public SchemaPropertiesValue description(@Nullable String description) {
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

  public SchemaPropertiesValue type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public SchemaPropertiesValue _enum(Set<Object> _enum) {
    this._enum = _enum;
    return this;
  }

  public SchemaPropertiesValue addEnumItem(Object _enumItem) {
    if (this._enum == null) {
      this._enum = new LinkedHashSet<>();
    }
    this._enum.add(_enumItem);
    return this;
  }

  /**
   * Get _enum
   * @return _enum
   */
  @Size(min = 1) 
  @Schema(name = "enum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enum")
  public Set<Object> getEnum() {
    return _enum;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty("enum")
  public void setEnum(Set<Object> _enum) {
    this._enum = _enum;
  }

  public SchemaPropertiesValue format(@Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  
  @Schema(name = "format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public @Nullable String getFormat() {
    return format;
  }

  @JsonProperty("format")
  public void setFormat(@Nullable String format) {
    this.format = format;
  }

  public SchemaPropertiesValue contentMediaType(@Nullable String contentMediaType) {
    this.contentMediaType = contentMediaType;
    return this;
  }

  /**
   * Get contentMediaType
   * @return contentMediaType
   */
  
  @Schema(name = "contentMediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentMediaType")
  public @Nullable String getContentMediaType() {
    return contentMediaType;
  }

  @JsonProperty("contentMediaType")
  public void setContentMediaType(@Nullable String contentMediaType) {
    this.contentMediaType = contentMediaType;
  }

  public SchemaPropertiesValue maximum(@Nullable BigDecimal maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Get maximum
   * @return maximum
   */
  @Valid 
  @Schema(name = "maximum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximum")
  public @Nullable BigDecimal getMaximum() {
    return maximum;
  }

  @JsonProperty("maximum")
  public void setMaximum(@Nullable BigDecimal maximum) {
    this.maximum = maximum;
  }

  public SchemaPropertiesValue exclusiveMaximum(@Nullable BigDecimal exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return this;
  }

  /**
   * Get exclusiveMaximum
   * @return exclusiveMaximum
   */
  @Valid 
  @Schema(name = "exclusiveMaximum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclusiveMaximum")
  public @Nullable BigDecimal getExclusiveMaximum() {
    return exclusiveMaximum;
  }

  @JsonProperty("exclusiveMaximum")
  public void setExclusiveMaximum(@Nullable BigDecimal exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }

  public SchemaPropertiesValue minimum(@Nullable BigDecimal minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Get minimum
   * @return minimum
   */
  @Valid 
  @Schema(name = "minimum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimum")
  public @Nullable BigDecimal getMinimum() {
    return minimum;
  }

  @JsonProperty("minimum")
  public void setMinimum(@Nullable BigDecimal minimum) {
    this.minimum = minimum;
  }

  public SchemaPropertiesValue exclusiveMinimum(@Nullable BigDecimal exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return this;
  }

  /**
   * Get exclusiveMinimum
   * @return exclusiveMinimum
   */
  @Valid 
  @Schema(name = "exclusiveMinimum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclusiveMinimum")
  public @Nullable BigDecimal getExclusiveMinimum() {
    return exclusiveMinimum;
  }

  @JsonProperty("exclusiveMinimum")
  public void setExclusiveMinimum(@Nullable BigDecimal exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }

  public SchemaPropertiesValue pattern(@Nullable String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Get pattern
   * @return pattern
   */
  
  @Schema(name = "pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern")
  public @Nullable String getPattern() {
    return pattern;
  }

  @JsonProperty("pattern")
  public void setPattern(@Nullable String pattern) {
    this.pattern = pattern;
  }

  public SchemaPropertiesValue maxItems(@Nullable Integer maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  /**
   * Get maxItems
   * minimum: 0
   * @return maxItems
   */
  @Min(value = 0) 
  @Schema(name = "maxItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxItems")
  public @Nullable Integer getMaxItems() {
    return maxItems;
  }

  @JsonProperty("maxItems")
  public void setMaxItems(@Nullable Integer maxItems) {
    this.maxItems = maxItems;
  }

  public SchemaPropertiesValue minItems(Integer minItems) {
    this.minItems = minItems;
    return this;
  }

  /**
   * Get minItems
   * minimum: 0
   * @return minItems
   */
  @Min(value = 0) 
  @Schema(name = "minItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minItems")
  public Integer getMinItems() {
    return minItems;
  }

  @JsonProperty("minItems")
  public void setMinItems(Integer minItems) {
    this.minItems = minItems;
  }

  public SchemaPropertiesValue xOgcDefinition(@Nullable URI xOgcDefinition) {
    this.xOgcDefinition = xOgcDefinition;
    return this;
  }

  /**
   * Get xOgcDefinition
   * @return xOgcDefinition
   */
  @Valid 
  @Schema(name = "x-ogc-definition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-ogc-definition")
  public @Nullable URI getxOgcDefinition() {
    return xOgcDefinition;
  }

  @JsonProperty("x-ogc-definition")
  public void setxOgcDefinition(@Nullable URI xOgcDefinition) {
    this.xOgcDefinition = xOgcDefinition;
  }

  public SchemaPropertiesValue xOgcUnit(@Nullable String xOgcUnit) {
    this.xOgcUnit = xOgcUnit;
    return this;
  }

  /**
   * Get xOgcUnit
   * @return xOgcUnit
   */
  
  @Schema(name = "x-ogc-unit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-ogc-unit")
  public @Nullable String getxOgcUnit() {
    return xOgcUnit;
  }

  @JsonProperty("x-ogc-unit")
  public void setxOgcUnit(@Nullable String xOgcUnit) {
    this.xOgcUnit = xOgcUnit;
  }

  public SchemaPropertiesValue xOgcUnitLang(@Nullable String xOgcUnitLang) {
    this.xOgcUnitLang = xOgcUnitLang;
    return this;
  }

  /**
   * Get xOgcUnitLang
   * @return xOgcUnitLang
   */
  
  @Schema(name = "x-ogc-unitLang", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("x-ogc-unitLang")
  public @Nullable String getxOgcUnitLang() {
    return xOgcUnitLang;
  }

  @JsonProperty("x-ogc-unitLang")
  public void setxOgcUnitLang(@Nullable String xOgcUnitLang) {
    this.xOgcUnitLang = xOgcUnitLang;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaPropertiesValue schemaPropertiesValue = (SchemaPropertiesValue) o;
    return Objects.equals(this.title, schemaPropertiesValue.title) &&
        Objects.equals(this.description, schemaPropertiesValue.description) &&
        Objects.equals(this.type, schemaPropertiesValue.type) &&
        Objects.equals(this._enum, schemaPropertiesValue._enum) &&
        Objects.equals(this.format, schemaPropertiesValue.format) &&
        Objects.equals(this.contentMediaType, schemaPropertiesValue.contentMediaType) &&
        Objects.equals(this.maximum, schemaPropertiesValue.maximum) &&
        Objects.equals(this.exclusiveMaximum, schemaPropertiesValue.exclusiveMaximum) &&
        Objects.equals(this.minimum, schemaPropertiesValue.minimum) &&
        Objects.equals(this.exclusiveMinimum, schemaPropertiesValue.exclusiveMinimum) &&
        Objects.equals(this.pattern, schemaPropertiesValue.pattern) &&
        Objects.equals(this.maxItems, schemaPropertiesValue.maxItems) &&
        Objects.equals(this.minItems, schemaPropertiesValue.minItems) &&
        Objects.equals(this.xOgcDefinition, schemaPropertiesValue.xOgcDefinition) &&
        Objects.equals(this.xOgcUnit, schemaPropertiesValue.xOgcUnit) &&
        Objects.equals(this.xOgcUnitLang, schemaPropertiesValue.xOgcUnitLang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, type, _enum, format, contentMediaType, maximum, exclusiveMaximum, minimum, exclusiveMinimum, pattern, maxItems, minItems, xOgcDefinition, xOgcUnit, xOgcUnitLang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaPropertiesValue {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    contentMediaType: ").append(toIndentedString(contentMediaType)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    exclusiveMaximum: ").append(toIndentedString(exclusiveMaximum)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    exclusiveMinimum: ").append(toIndentedString(exclusiveMinimum)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
    sb.append("    xOgcDefinition: ").append(toIndentedString(xOgcDefinition)).append("\n");
    sb.append("    xOgcUnit: ").append(toIndentedString(xOgcUnit)).append("\n");
    sb.append("    xOgcUnitLang: ").append(toIndentedString(xOgcUnitLang)).append("\n");
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

