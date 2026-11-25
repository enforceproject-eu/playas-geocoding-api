package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.n52.project.enforce.api.playas.geocoding.model.FunctionRefArgsInner;
import org.springframework.lang.Nullable;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FunctionRef
 */

@JsonTypeName("functionRef")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class FunctionRef implements Serializable, ArithmeticOperandsInner, ArrayOperandsInner, CaseiArgsInner, Cql2, IntervalArrayInner, IsBetweenOperandsInner, IsLikeOperandsInner, ScalarExpression, SpatialOperandsInner, TemporalOperandsInner {

  private static final long serialVersionUID = 1L;

  private String op;

  private List<FunctionRefArgsInner> args = new ArrayList<>();

  public FunctionRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FunctionRef(String op, List<FunctionRefArgsInner> args) {
    this.op = op;
    this.args = args;
  }

  public FunctionRef op(String op) {
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
  public String getOp() {
    return op;
  }

  @JsonProperty("op")
  public void setOp(String op) {
    this.op = op;
  }

  public FunctionRef args(List<FunctionRefArgsInner> args) {
    this.args = args;
    return this;
  }

  public FunctionRef addArgsItem(FunctionRefArgsInner argsItem) {
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
  @NotNull @Valid 
  @Schema(name = "args", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("args")
  public List<FunctionRefArgsInner> getArgs() {
    return args;
  }

  @JsonProperty("args")
  public void setArgs(List<FunctionRefArgsInner> args) {
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
    FunctionRef functionRef = (FunctionRef) o;
    return Objects.equals(this.op, functionRef.op) &&
        Objects.equals(this.args, functionRef.args);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, args);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionRef {\n");
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

