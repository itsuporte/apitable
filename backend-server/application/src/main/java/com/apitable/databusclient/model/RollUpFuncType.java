/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets RollUpFuncType
 */
@JsonAdapter(RollUpFuncType.Adapter.class)
public enum RollUpFuncType {
  
  VALUES("VALUES"),
  
  AVERAGE("AVERAGE"),
  
  COUNT("COUNT"),
  
  COUNTA("COUNTA"),
  
  COUNTALL("COUNTALL"),
  
  SUM("SUM"),
  
  MIN("MIN"),
  
  MAX("MAX"),
  
  AND("AND"),
  
  OR("OR"),
  
  XOR("XOR"),
  
  CONCATENATE("CONCATENATE"),
  
  ARRAYJOIN("ARRAYJOIN"),
  
  ARRAYUNIQUE("ARRAYUNIQUE"),
  
  ARRAYCOMPACT("ARRAYCOMPACT");

  private String value;

  RollUpFuncType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RollUpFuncType fromValue(String value) {
    for (RollUpFuncType b : RollUpFuncType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RollUpFuncType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RollUpFuncType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RollUpFuncType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RollUpFuncType.fromValue(value);
    }
  }
}

