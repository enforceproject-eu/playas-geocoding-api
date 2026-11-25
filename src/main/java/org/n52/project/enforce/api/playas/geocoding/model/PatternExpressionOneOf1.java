package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.PatternExpression;
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
 * PatternExpressionOneOf1
 */

@JsonTypeName("patternExpression_oneOf_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class PatternExpressionOneOf1 implements Serializable, PatternExpression {

  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets op
   */
  public enum OpEnum {
    ACCENTI("accenti");

    private final String value;

    OpEnum(String value) {
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
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OpEnum op;

  private List<PatternExpression> args = new ArrayList<>();

  public PatternExpressionOneOf1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PatternExpressionOneOf1(OpEnum op, List<PatternExpression> args) {
    this.op = op;
    this.args = args;
  }

  public PatternExpressionOneOf1 op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * Get op
   * @return op
   */
  @NotNull 
  @Schema(name = "op", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("op")
  public OpEnum getOp() {
    return op;
  }

  @JsonProperty("op")
  public void setOp(OpEnum op) {
    this.op = op;
  }

  public PatternExpressionOneOf1 args(List<PatternExpression> args) {
    this.args = args;
    return this;
  }

  public PatternExpressionOneOf1 addArgsItem(PatternExpression argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Get args
   * @return args
   */
  @NotNull @Valid @Size(min = 1, max = 1) 
  @Schema(name = "args", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("args")
  public List<PatternExpression> getArgs() {
    return args;
  }

  @JsonProperty("args")
  public void setArgs(List<PatternExpression> args) {
    this.args = args;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatternExpressionOneOf1 patternExpressionOneOf1 = (PatternExpressionOneOf1) o;
    return Objects.equals(this.op, patternExpressionOneOf1.op) &&
        Objects.equals(this.args, patternExpressionOneOf1.args);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, args);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatternExpressionOneOf1 {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
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

