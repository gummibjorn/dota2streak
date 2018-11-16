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
 * InlineResponse20025
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse20025 {
  @SerializedName("leagueid")
  private Integer leagueid = null;

  @SerializedName("ticket")
  private String ticket = null;

  @SerializedName("banner")
  private String banner = null;

  @SerializedName("tier")
  private String tier = null;

  @SerializedName("name")
  private String name = null;

  public InlineResponse20025 leagueid(Integer leagueid) {
    this.leagueid = leagueid;
    return this;
  }

   /**
   * leagueid
   * @return leagueid
  **/
  @ApiModelProperty(value = "leagueid")
  public Integer getLeagueid() {
    return leagueid;
  }

  public void setLeagueid(Integer leagueid) {
    this.leagueid = leagueid;
  }

  public InlineResponse20025 ticket(String ticket) {
    this.ticket = ticket;
    return this;
  }

   /**
   * ticket
   * @return ticket
  **/
  @ApiModelProperty(value = "ticket")
  public String getTicket() {
    return ticket;
  }

  public void setTicket(String ticket) {
    this.ticket = ticket;
  }

  public InlineResponse20025 banner(String banner) {
    this.banner = banner;
    return this;
  }

   /**
   * banner
   * @return banner
  **/
  @ApiModelProperty(value = "banner")
  public String getBanner() {
    return banner;
  }

  public void setBanner(String banner) {
    this.banner = banner;
  }

  public InlineResponse20025 tier(String tier) {
    this.tier = tier;
    return this;
  }

   /**
   * tier
   * @return tier
  **/
  @ApiModelProperty(value = "tier")
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }

  public InlineResponse20025 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @ApiModelProperty(value = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20025 inlineResponse20025 = (InlineResponse20025) o;
    return Objects.equals(this.leagueid, inlineResponse20025.leagueid) &&
        Objects.equals(this.ticket, inlineResponse20025.ticket) &&
        Objects.equals(this.banner, inlineResponse20025.banner) &&
        Objects.equals(this.tier, inlineResponse20025.tier) &&
        Objects.equals(this.name, inlineResponse20025.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leagueid, ticket, banner, tier, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20025 {\n");
    
    sb.append("    leagueid: ").append(toIndentedString(leagueid)).append("\n");
    sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

