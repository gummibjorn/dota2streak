/*
 * OpenDota API
 * # Introduction The OpenDota API provides Dota 2 related data including advanced match data extracted from match replays.  **Beginning 2018-04-22, the OpenDota API is limited to 50,000 free calls per month and 60 requests/minute** We offer a Premium Tier with unlimited API calls and higher rate limits. Check out the [API page](https://www.opendota.com/api-keys) to learn more. 
 *
 * OpenAPI spec version: 17.6.1
 * 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse20010
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse20010 {
  @SerializedName("obs")
  private Object obs = null;

  @SerializedName("sen")
  private Object sen = null;

  public InlineResponse20010 obs(Object obs) {
    this.obs = obs;
    return this;
  }

   /**
   * obs
   * @return obs
  **/
  @ApiModelProperty(value = "obs")
  public Object getObs() {
    return obs;
  }

  public void setObs(Object obs) {
    this.obs = obs;
  }

  public InlineResponse20010 sen(Object sen) {
    this.sen = sen;
    return this;
  }

   /**
   * sen
   * @return sen
  **/
  @ApiModelProperty(value = "sen")
  public Object getSen() {
    return sen;
  }

  public void setSen(Object sen) {
    this.sen = sen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(this.obs, inlineResponse20010.obs) &&
        Objects.equals(this.sen, inlineResponse20010.sen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(obs, sen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
    sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
    sb.append("    sen: ").append(toIndentedString(sen)).append("\n");
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
