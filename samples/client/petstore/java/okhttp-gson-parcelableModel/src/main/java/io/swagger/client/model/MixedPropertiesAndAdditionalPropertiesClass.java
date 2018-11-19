/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Animal;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * MixedPropertiesAndAdditionalPropertiesClass
 */

public class MixedPropertiesAndAdditionalPropertiesClass {

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("dateTime")
  private OffsetDateTime dateTime = null;

  @SerializedName("map")
  private Map<String, Animal> map = null;
  public MixedPropertiesAndAdditionalPropertiesClass uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  

  /**
  * Get uuid
  * @return uuid
  **/
  @Schema(description = "")
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }
  public MixedPropertiesAndAdditionalPropertiesClass dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  

  /**
  * Get dateTime
  * @return dateTime
  **/
  @Schema(description = "")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }
  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }
  public MixedPropertiesAndAdditionalPropertiesClass map(Map<String, Animal> map) {
    this.map = map;
    return this;
  }

  
  public MixedPropertiesAndAdditionalPropertiesClass putMapItem(String key, Animal mapItem) {
    if (this.map == null) {
      this.map = new HashMap<String, Animal>();
    }
    this.map.put(key, mapItem);
    return this;
  }
  /**
  * Get map
  * @return map
  **/
  @Schema(description = "")
  public Map<String, Animal> getMap() {
    return map;
  }
  public void setMap(Map<String, Animal> map) {
    this.map = map;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MixedPropertiesAndAdditionalPropertiesClass mixedPropertiesAndAdditionalPropertiesClass = (MixedPropertiesAndAdditionalPropertiesClass) o;
    return Objects.equals(this.uuid, mixedPropertiesAndAdditionalPropertiesClass.uuid) &&
        Objects.equals(this.dateTime, mixedPropertiesAndAdditionalPropertiesClass.dateTime) &&
        Objects.equals(this.map, mixedPropertiesAndAdditionalPropertiesClass.map);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(uuid, dateTime, map);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public void writeToParcel(Parcel out, int flags) {
    
    out.writeValue(uuid);
    out.writeValue(dateTime);
    out.writeValue(map);
  }

  public MixedPropertiesAndAdditionalPropertiesClass() {
    super();
  }

  MixedPropertiesAndAdditionalPropertiesClass(Parcel in) {
    
    
    uuid = (UUID)in.readValue(UUID.class.getClassLoader());
    
    dateTime = (OffsetDateTime)in.readValue(OffsetDateTime.class.getClassLoader());
    
    map = (Map<String, Animal>)in.readValue(Animal.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<MixedPropertiesAndAdditionalPropertiesClass> CREATOR = new Parcelable.Creator<MixedPropertiesAndAdditionalPropertiesClass>() {
    public MixedPropertiesAndAdditionalPropertiesClass createFromParcel(Parcel in) {
      return new MixedPropertiesAndAdditionalPropertiesClass(in);
    }
    public MixedPropertiesAndAdditionalPropertiesClass[] newArray(int size) {
      return new MixedPropertiesAndAdditionalPropertiesClass[size];
    }
  };
}
