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
 * mmr_estimate
 */
@ApiModel(description = "mmr_estimate")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse2001MmrEstimate {
  @SerializedName("estimate")
  private BigDecimal estimate = null;

  @SerializedName("stdDev")
  private BigDecimal stdDev = null;

  @SerializedName("n")
  private Integer n = null;

  public InlineResponse2001MmrEstimate estimate(BigDecimal estimate) {
    this.estimate = estimate;
    return this;
  }

   /**
   * estimate
   * @return estimate
  **/
  @ApiModelProperty(value = "estimate")
  public BigDecimal getEstimate() {
    return estimate;
  }

  public void setEstimate(BigDecimal estimate) {
    this.estimate = estimate;
  }

  public InlineResponse2001MmrEstimate stdDev(BigDecimal stdDev) {
    this.stdDev = stdDev;
    return this;
  }

   /**
   * stdDev
   * @return stdDev
  **/
  @ApiModelProperty(value = "stdDev")
  public BigDecimal getStdDev() {
    return stdDev;
  }

  public void setStdDev(BigDecimal stdDev) {
    this.stdDev = stdDev;
  }

  public InlineResponse2001MmrEstimate n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * n
   * @return n
  **/
  @ApiModelProperty(value = "n")
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001MmrEstimate inlineResponse2001MmrEstimate = (InlineResponse2001MmrEstimate) o;
    return Objects.equals(this.estimate, inlineResponse2001MmrEstimate.estimate) &&
        Objects.equals(this.stdDev, inlineResponse2001MmrEstimate.stdDev) &&
        Objects.equals(this.n, inlineResponse2001MmrEstimate.n);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimate, stdDev, n);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001MmrEstimate {\n");
    
    sb.append("    estimate: ").append(toIndentedString(estimate)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
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
