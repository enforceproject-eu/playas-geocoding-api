package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
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
 * Optional URIs for callbacks for this job.  Support for this parameter is not required and the parameter may be removed from the API definition, if conformance class **&#39;callback&#39;** is not listed in the conformance declaration under &#x60;/conformance&#x60;.
 */

@Schema(name = "subscriber", description = "Optional URIs for callbacks for this job.  Support for this parameter is not required and the parameter may be removed from the API definition, if conformance class **'callback'** is not listed in the conformance declaration under `/conformance`.")
@JsonTypeName("subscriber")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public class Subscriber implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable URI successUri;

  private @Nullable URI inProgressUri;

  private @Nullable URI failedUri;

  public Subscriber successUri(@Nullable URI successUri) {
    this.successUri = successUri;
    return this;
  }

  /**
   * Get successUri
   * @return successUri
   */
  @Valid 
  @Schema(name = "successUri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successUri")
  public @Nullable URI getSuccessUri() {
    return successUri;
  }

  @JsonProperty("successUri")
  public void setSuccessUri(@Nullable URI successUri) {
    this.successUri = successUri;
  }

  public Subscriber inProgressUri(@Nullable URI inProgressUri) {
    this.inProgressUri = inProgressUri;
    return this;
  }

  /**
   * Get inProgressUri
   * @return inProgressUri
   */
  @Valid 
  @Schema(name = "inProgressUri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inProgressUri")
  public @Nullable URI getInProgressUri() {
    return inProgressUri;
  }

  @JsonProperty("inProgressUri")
  public void setInProgressUri(@Nullable URI inProgressUri) {
    this.inProgressUri = inProgressUri;
  }

  public Subscriber failedUri(@Nullable URI failedUri) {
    this.failedUri = failedUri;
    return this;
  }

  /**
   * Get failedUri
   * @return failedUri
   */
  @Valid 
  @Schema(name = "failedUri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedUri")
  public @Nullable URI getFailedUri() {
    return failedUri;
  }

  @JsonProperty("failedUri")
  public void setFailedUri(@Nullable URI failedUri) {
    this.failedUri = failedUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscriber subscriber = (Subscriber) o;
    return Objects.equals(this.successUri, subscriber.successUri) &&
        Objects.equals(this.inProgressUri, subscriber.inProgressUri) &&
        Objects.equals(this.failedUri, subscriber.failedUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successUri, inProgressUri, failedUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscriber {\n");
    sb.append("    successUri: ").append(toIndentedString(successUri)).append("\n");
    sb.append("    inProgressUri: ").append(toIndentedString(inProgressUri)).append("\n");
    sb.append("    failedUri: ").append(toIndentedString(failedUri)).append("\n");
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

