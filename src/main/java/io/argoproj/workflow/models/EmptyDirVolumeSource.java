/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.")

public class EmptyDirVolumeSource {
  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private String medium;

  public static final String SERIALIZED_NAME_SIZE_LIMIT = "sizeLimit";
  @SerializedName(SERIALIZED_NAME_SIZE_LIMIT)
  private Quantity sizeLimit;


  public EmptyDirVolumeSource medium(String medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMedium() {
    return medium;
  }


  public void setMedium(String medium) {
    this.medium = medium;
  }


  public EmptyDirVolumeSource sizeLimit(Quantity sizeLimit) {
    
    this.sizeLimit = sizeLimit;
    return this;
  }

   /**
   * Get sizeLimit
   * @return sizeLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Quantity getSizeLimit() {
    return sizeLimit;
  }


  public void setSizeLimit(Quantity sizeLimit) {
    this.sizeLimit = sizeLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmptyDirVolumeSource emptyDirVolumeSource = (EmptyDirVolumeSource) o;
    return Objects.equals(this.medium, emptyDirVolumeSource.medium) &&
        Objects.equals(this.sizeLimit, emptyDirVolumeSource.sizeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(medium, sizeLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmptyDirVolumeSource {\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    sizeLimit: ").append(toIndentedString(sizeLimit)).append("\n");
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

}
