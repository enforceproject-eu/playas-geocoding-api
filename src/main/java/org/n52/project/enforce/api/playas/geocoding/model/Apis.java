package org.n52.project.enforce.api.playas.geocoding.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A non-exhaustive list of OGC and other data access APIs.  This list can be extended as required.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-16T16:43:56.290977300+01:00[Europe/Berlin]", comments = "Generator version: 7.25.0")
public enum Apis implements Serializable {
  
  OGC_API_FEATURES("ogc-api-features"),
  
  OGC_API_COVERAGES("ogc-api-coverages"),
  
  OGC_API_EDR("ogc-api-edr"),
  
  OGC_API_TILES("ogc-api-tiles"),
  
  OGC_API_MOVING_FEATURES("ogc-api-moving-features"),
  
  OGC_API_SENSOR_THINGS("ogc-api-sensor-things"),
  
  OGC_API_RECORDS("ogc-api-records"),
  
  OGC_API_DGGS("ogc-api-dggs"),
  
  STAC_API("stac-api");

  private final String value;

  Apis(String value) {
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
  public static Apis fromValue(String value) {
    for (Apis b : Apis.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

