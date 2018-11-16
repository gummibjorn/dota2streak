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
 * InlineResponse20015
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse20015 {
  @SerializedName("match_id")
  private Integer matchId = null;

  @SerializedName("match_seq_num")
  private Integer matchSeqNum = null;

  @SerializedName("radiant_win")
  private Boolean radiantWin = null;

  @SerializedName("start_time")
  private Integer startTime = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("radiant_team")
  private String radiantTeam = null;

  @SerializedName("dire_team")
  private String direTeam = null;

  public InlineResponse20015 matchId(Integer matchId) {
    this.matchId = matchId;
    return this;
  }

   /**
   * match_id
   * @return matchId
  **/
  @ApiModelProperty(value = "match_id")
  public Integer getMatchId() {
    return matchId;
  }

  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  public InlineResponse20015 matchSeqNum(Integer matchSeqNum) {
    this.matchSeqNum = matchSeqNum;
    return this;
  }

   /**
   * match_seq_num
   * @return matchSeqNum
  **/
  @ApiModelProperty(value = "match_seq_num")
  public Integer getMatchSeqNum() {
    return matchSeqNum;
  }

  public void setMatchSeqNum(Integer matchSeqNum) {
    this.matchSeqNum = matchSeqNum;
  }

  public InlineResponse20015 radiantWin(Boolean radiantWin) {
    this.radiantWin = radiantWin;
    return this;
  }

   /**
   * Boolean indicating whether Radiant won the match
   * @return radiantWin
  **/
  @ApiModelProperty(value = "Boolean indicating whether Radiant won the match")
  public Boolean isRadiantWin() {
    return radiantWin;
  }

  public void setRadiantWin(Boolean radiantWin) {
    this.radiantWin = radiantWin;
  }

  public InlineResponse20015 startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * start_time
   * @return startTime
  **/
  @ApiModelProperty(value = "start_time")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public InlineResponse20015 duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the game in seconds
   * @return duration
  **/
  @ApiModelProperty(value = "Duration of the game in seconds")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public InlineResponse20015 radiantTeam(String radiantTeam) {
    this.radiantTeam = radiantTeam;
    return this;
  }

   /**
   * radiant_team
   * @return radiantTeam
  **/
  @ApiModelProperty(value = "radiant_team")
  public String getRadiantTeam() {
    return radiantTeam;
  }

  public void setRadiantTeam(String radiantTeam) {
    this.radiantTeam = radiantTeam;
  }

  public InlineResponse20015 direTeam(String direTeam) {
    this.direTeam = direTeam;
    return this;
  }

   /**
   * dire_team
   * @return direTeam
  **/
  @ApiModelProperty(value = "dire_team")
  public String getDireTeam() {
    return direTeam;
  }

  public void setDireTeam(String direTeam) {
    this.direTeam = direTeam;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015 inlineResponse20015 = (InlineResponse20015) o;
    return Objects.equals(this.matchId, inlineResponse20015.matchId) &&
        Objects.equals(this.matchSeqNum, inlineResponse20015.matchSeqNum) &&
        Objects.equals(this.radiantWin, inlineResponse20015.radiantWin) &&
        Objects.equals(this.startTime, inlineResponse20015.startTime) &&
        Objects.equals(this.duration, inlineResponse20015.duration) &&
        Objects.equals(this.radiantTeam, inlineResponse20015.radiantTeam) &&
        Objects.equals(this.direTeam, inlineResponse20015.direTeam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchId, matchSeqNum, radiantWin, startTime, duration, radiantTeam, direTeam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015 {\n");
    
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    matchSeqNum: ").append(toIndentedString(matchSeqNum)).append("\n");
    sb.append("    radiantWin: ").append(toIndentedString(radiantWin)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    radiantTeam: ").append(toIndentedString(radiantTeam)).append("\n");
    sb.append("    direTeam: ").append(toIndentedString(direTeam)).append("\n");
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
