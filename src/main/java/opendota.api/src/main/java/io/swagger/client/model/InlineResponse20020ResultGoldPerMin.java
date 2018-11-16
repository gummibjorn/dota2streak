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
import java.math.BigDecimal;

/**
 * InlineResponse20020ResultGoldPerMin
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse20020ResultGoldPerMin {
  @SerializedName("percentile")
  private BigDecimal percentile = null;

  @SerializedName("value")
  private Integer value = null;

  public InlineResponse20020ResultGoldPerMin percentile(BigDecimal percentile) {
    this.percentile = percentile;
    return this;
  }

   /**
   * percentile
   * @return percentile
  **/
  @ApiModelProperty(value = "percentile")
  public BigDecimal getPercentile() {
    return percentile;
  }

  public void setPercentile(BigDecimal percentile) {
    this.percentile = percentile;
  }

  public InlineResponse20020ResultGoldPerMin value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * value
   * @return value
  **/
  @ApiModelProperty(value = "value")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20020ResultGoldPerMin inlineResponse20020ResultGoldPerMin = (InlineResponse20020ResultGoldPerMin) o;
    return Objects.equals(this.percentile, inlineResponse20020ResultGoldPerMin.percentile) &&
        Objects.equals(this.value, inlineResponse20020ResultGoldPerMin.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentile, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20020ResultGoldPerMin {\n");
    
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
