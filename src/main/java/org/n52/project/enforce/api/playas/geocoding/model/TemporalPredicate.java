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
import org.n52.project.enforce.api.playas.geocoding.model.TemporalOperandsInner;
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
 * TemporalPredicate
 */

@JsonTypeName("temporalPredicate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class TemporalPredicate implements Serializable, Cql2 {

  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets op
   */
  public enum OpEnum {
    T_AFTER("t_after"),
    
    T_BEFORE("t_before"),
    
    T_CONTAINS("t_contains"),
    
    T_DISJOINT("t_disjoint"),
    
    T_DURING("t_during"),
    
    T_EQUALS("t_equals"),
    
    T_FINISHED_BY("t_finishedBy"),
    
    T_FINISHES("t_finishes"),
    
    T_INTERSECTS("t_intersects"),
    
    T_MEETS("t_meets"),
    
    T_MET_BY("t_metBy"),
    
    T_OVERLAPPED_BY("t_overlappedBy"),
    
    T_OVERLAPS("t_overlaps"),
    
    T_STARTED_BY("t_startedBy"),
    
    T_STARTS("t_starts");

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

  private List<TemporalOperandsInner> args = new ArrayList<>();

  public TemporalPredicate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TemporalPredicate(OpEnum op, List<TemporalOperandsInner> args) {
    this.op = op;
    this.args = args;
  }

  public TemporalPredicate op(OpEnum op) {
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

  public TemporalPredicate args(List<TemporalOperandsInner> args) {
    this.args = args;
    return this;
  }

  public TemporalPredicate addArgsItem(TemporalOperandsInner argsItem) {
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
  @NotNull @Valid @Size(min = 2, max = 2) 
  @Schema(name = "args", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("args")
  public List<TemporalOperandsInner> getArgs() {
    return args;
  }

  @JsonProperty("args")
  public void setArgs(List<TemporalOperandsInner> args) {
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
    TemporalPredicate temporalPredicate = (TemporalPredicate) o;
    return Objects.equals(this.op, temporalPredicate.op) &&
        Objects.equals(this.args, temporalPredicate.args);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, args);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemporalPredicate {\n");
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

