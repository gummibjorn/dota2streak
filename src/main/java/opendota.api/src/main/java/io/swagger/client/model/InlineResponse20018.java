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
 * InlineResponse20018
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse20018 {
  @SerializedName("account_id")
  private Integer accountId = null;

  @SerializedName("avatarfull")
  private String avatarfull = null;

  @SerializedName("personaname")
  private String personaname = null;

  @SerializedName("last_match_time")
  private String lastMatchTime = null;

  @SerializedName("similarity")
  private BigDecimal similarity = null;

  public InlineResponse20018 accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * account_id
   * @return accountId
  **/
  @ApiModelProperty(value = "account_id")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public InlineResponse20018 avatarfull(String avatarfull) {
    this.avatarfull = avatarfull;
    return this;
  }

   /**
   * avatarfull
   * @return avatarfull
  **/
  @ApiModelProperty(value = "avatarfull")
  public String getAvatarfull() {
    return avatarfull;
  }

  public void setAvatarfull(String avatarfull) {
    this.avatarfull = avatarfull;
  }

  public InlineResponse20018 personaname(String personaname) {
    this.personaname = personaname;
    return this;
  }

   /**
   * personaname
   * @return personaname
  **/
  @ApiModelProperty(value = "personaname")
  public String getPersonaname() {
    return personaname;
  }

  public void setPersonaname(String personaname) {
    this.personaname = personaname;
  }

  public InlineResponse20018 lastMatchTime(String lastMatchTime) {
    this.lastMatchTime = lastMatchTime;
    return this;
  }

   /**
   * last_match_time. May not be present or null.
   * @return lastMatchTime
  **/
  @ApiModelProperty(value = "last_match_time. May not be present or null.")
  public String getLastMatchTime() {
    return lastMatchTime;
  }

  public void setLastMatchTime(String lastMatchTime) {
    this.lastMatchTime = lastMatchTime;
  }

  public InlineResponse20018 similarity(BigDecimal similarity) {
    this.similarity = similarity;
    return this;
  }

   /**
   * similarity
   * @return similarity
  **/
  @ApiModelProperty(value = "similarity")
  public BigDecimal getSimilarity() {
    return similarity;
  }

  public void setSimilarity(BigDecimal similarity) {
    this.similarity = similarity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018 inlineResponse20018 = (InlineResponse20018) o;
    return Objects.equals(this.accountId, inlineResponse20018.accountId) &&
        Objects.equals(this.avatarfull, inlineResponse20018.avatarfull) &&
        Objects.equals(this.personaname, inlineResponse20018.personaname) &&
        Objects.equals(this.lastMatchTime, inlineResponse20018.lastMatchTime) &&
        Objects.equals(this.similarity, inlineResponse20018.similarity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, avatarfull, personaname, lastMatchTime, similarity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    avatarfull: ").append(toIndentedString(avatarfull)).append("\n");
    sb.append("    personaname: ").append(toIndentedString(personaname)).append("\n");
    sb.append("    lastMatchTime: ").append(toIndentedString(lastMatchTime)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
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
