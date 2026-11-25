package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.n52.project.enforce.api.playas.geocoding.model.CollectionValueAllOfAliasesOneOfExpression;
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
 * CollectionValueAllOfAliasesOneOf
 */

@JsonTypeName("collectionValue_allOf_aliases_oneOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class CollectionValueAllOfAliasesOneOf implements Serializable, CollectionValueAllOfAliases {

  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets expressionLang
   */
  public enum ExpressionLangEnum {
    CQL2_TEXT("cql2-text"),
    
    CQL2_JSON("cql2-json");

    private final String value;

    ExpressionLangEnum(String value) {
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
    public static ExpressionLangEnum fromValue(String value) {
      for (ExpressionLangEnum b : ExpressionLangEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ExpressionLangEnum expressionLang;

  private @Nullable CollectionValueAllOfAliasesOneOfExpression expression;

  public CollectionValueAllOfAliasesOneOf expressionLang(@Nullable ExpressionLangEnum expressionLang) {
    this.expressionLang = expressionLang;
    return this;
  }

  /**
   * Get expressionLang
   * @return expressionLang
   */
  
  @Schema(name = "expressionLang", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expressionLang")
  public @Nullable ExpressionLangEnum getExpressionLang() {
    return expressionLang;
  }

  @JsonProperty("expressionLang")
  public void setExpressionLang(@Nullable ExpressionLangEnum expressionLang) {
    this.expressionLang = expressionLang;
  }

  public CollectionValueAllOfAliasesOneOf expression(@Nullable CollectionValueAllOfAliasesOneOfExpression expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression
   * @return expression
   */
  @Valid 
  @Schema(name = "expression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expression")
  public @Nullable CollectionValueAllOfAliasesOneOfExpression getExpression() {
    return expression;
  }

  @JsonProperty("expression")
  public void setExpression(@Nullable CollectionValueAllOfAliasesOneOfExpression expression) {
    this.expression = expression;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionValueAllOfAliasesOneOf collectionValueAllOfAliasesOneOf = (CollectionValueAllOfAliasesOneOf) o;
    return Objects.equals(this.expressionLang, collectionValueAllOfAliasesOneOf.expressionLang) &&
        Objects.equals(this.expression, collectionValueAllOfAliasesOneOf.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressionLang, expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionValueAllOfAliasesOneOf {\n");
    sb.append("    expressionLang: ").append(toIndentedString(expressionLang)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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

