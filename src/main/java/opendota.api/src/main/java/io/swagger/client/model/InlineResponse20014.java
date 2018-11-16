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
 * InlineResponse20014
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse20014 {
  @SerializedName("match_id")
  private Integer matchId = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("start_time")
  private Integer startTime = null;

  @SerializedName("radiant_team_id")
  private Integer radiantTeamId = null;

  @SerializedName("radiant_name")
  private String radiantName = null;

  @SerializedName("dire_team_id")
  private Integer direTeamId = null;

  @SerializedName("dire_name")
  private String direName = null;

  @SerializedName("leagueid")
  private Integer leagueid = null;

  @SerializedName("league_name")
  private String leagueName = null;

  @SerializedName("series_id")
  private Integer seriesId = null;

  @SerializedName("series_type")
  private Integer seriesType = null;

  @SerializedName("radiant_score")
  private Integer radiantScore = null;

  @SerializedName("dire_score")
  private Integer direScore = null;

  @SerializedName("radiant_win")
  private Boolean radiantWin = null;

  @SerializedName("radiant")
  private Boolean radiant = null;

  public InlineResponse20014 matchId(Integer matchId) {
    this.matchId = matchId;
    return this;
  }

   /**
   * Used to identify individual matches, e.g. 3703866531
   * @return matchId
  **/
  @ApiModelProperty(value = "Used to identify individual matches, e.g. 3703866531")
  public Integer getMatchId() {
    return matchId;
  }

  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  public InlineResponse20014 duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Length of the match
   * @return duration
  **/
  @ApiModelProperty(value = "Length of the match")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public InlineResponse20014 startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Unix timestamp of when the match began
   * @return startTime
  **/
  @ApiModelProperty(value = "Unix timestamp of when the match began")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public InlineResponse20014 radiantTeamId(Integer radiantTeamId) {
    this.radiantTeamId = radiantTeamId;
    return this;
  }

   /**
   * The Radiant&#39;s team_id
   * @return radiantTeamId
  **/
  @ApiModelProperty(value = "The Radiant's team_id")
  public Integer getRadiantTeamId() {
    return radiantTeamId;
  }

  public void setRadiantTeamId(Integer radiantTeamId) {
    this.radiantTeamId = radiantTeamId;
  }

  public InlineResponse20014 radiantName(String radiantName) {
    this.radiantName = radiantName;
    return this;
  }

   /**
   * The Radiant&#39;s team name
   * @return radiantName
  **/
  @ApiModelProperty(value = "The Radiant's team name")
  public String getRadiantName() {
    return radiantName;
  }

  public void setRadiantName(String radiantName) {
    this.radiantName = radiantName;
  }

  public InlineResponse20014 direTeamId(Integer direTeamId) {
    this.direTeamId = direTeamId;
    return this;
  }

   /**
   * The Dire&#39;s team_id
   * @return direTeamId
  **/
  @ApiModelProperty(value = "The Dire's team_id")
  public Integer getDireTeamId() {
    return direTeamId;
  }

  public void setDireTeamId(Integer direTeamId) {
    this.direTeamId = direTeamId;
  }

  public InlineResponse20014 direName(String direName) {
    this.direName = direName;
    return this;
  }

   /**
   * The Dire&#39;s team name
   * @return direName
  **/
  @ApiModelProperty(value = "The Dire's team name")
  public String getDireName() {
    return direName;
  }

  public void setDireName(String direName) {
    this.direName = direName;
  }

  public InlineResponse20014 leagueid(Integer leagueid) {
    this.leagueid = leagueid;
    return this;
  }

   /**
   * Identifier for the league the match took place in
   * @return leagueid
  **/
  @ApiModelProperty(value = "Identifier for the league the match took place in")
  public Integer getLeagueid() {
    return leagueid;
  }

  public void setLeagueid(Integer leagueid) {
    this.leagueid = leagueid;
  }

  public InlineResponse20014 leagueName(String leagueName) {
    this.leagueName = leagueName;
    return this;
  }

   /**
   * Name of league the match took place in
   * @return leagueName
  **/
  @ApiModelProperty(value = "Name of league the match took place in")
  public String getLeagueName() {
    return leagueName;
  }

  public void setLeagueName(String leagueName) {
    this.leagueName = leagueName;
  }

  public InlineResponse20014 seriesId(Integer seriesId) {
    this.seriesId = seriesId;
    return this;
  }

   /**
   * Identifier for the series of the match
   * @return seriesId
  **/
  @ApiModelProperty(value = "Identifier for the series of the match")
  public Integer getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(Integer seriesId) {
    this.seriesId = seriesId;
  }

  public InlineResponse20014 seriesType(Integer seriesType) {
    this.seriesType = seriesType;
    return this;
  }

   /**
   * Type of series the match was
   * @return seriesType
  **/
  @ApiModelProperty(value = "Type of series the match was")
  public Integer getSeriesType() {
    return seriesType;
  }

  public void setSeriesType(Integer seriesType) {
    this.seriesType = seriesType;
  }

  public InlineResponse20014 radiantScore(Integer radiantScore) {
    this.radiantScore = radiantScore;
    return this;
  }

   /**
   * Number of kills the Radiant team had when the match ended
   * @return radiantScore
  **/
  @ApiModelProperty(value = "Number of kills the Radiant team had when the match ended")
  public Integer getRadiantScore() {
    return radiantScore;
  }

  public void setRadiantScore(Integer radiantScore) {
    this.radiantScore = radiantScore;
  }

  public InlineResponse20014 direScore(Integer direScore) {
    this.direScore = direScore;
    return this;
  }

   /**
   * Number of kills the Dire team had when the match ended
   * @return direScore
  **/
  @ApiModelProperty(value = "Number of kills the Dire team had when the match ended")
  public Integer getDireScore() {
    return direScore;
  }

  public void setDireScore(Integer direScore) {
    this.direScore = direScore;
  }

  public InlineResponse20014 radiantWin(Boolean radiantWin) {
    this.radiantWin = radiantWin;
    return this;
  }

   /**
   * Whether or not the Radiant won the match
   * @return radiantWin
  **/
  @ApiModelProperty(value = "Whether or not the Radiant won the match")
  public Boolean isRadiantWin() {
    return radiantWin;
  }

  public void setRadiantWin(Boolean radiantWin) {
    this.radiantWin = radiantWin;
  }

  public InlineResponse20014 radiant(Boolean radiant) {
    this.radiant = radiant;
    return this;
  }

   /**
   * Whether the team/player/hero was on Radiant
   * @return radiant
  **/
  @ApiModelProperty(value = "Whether the team/player/hero was on Radiant")
  public Boolean isRadiant() {
    return radiant;
  }

  public void setRadiant(Boolean radiant) {
    this.radiant = radiant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return Objects.equals(this.matchId, inlineResponse20014.matchId) &&
        Objects.equals(this.duration, inlineResponse20014.duration) &&
        Objects.equals(this.startTime, inlineResponse20014.startTime) &&
        Objects.equals(this.radiantTeamId, inlineResponse20014.radiantTeamId) &&
        Objects.equals(this.radiantName, inlineResponse20014.radiantName) &&
        Objects.equals(this.direTeamId, inlineResponse20014.direTeamId) &&
        Objects.equals(this.direName, inlineResponse20014.direName) &&
        Objects.equals(this.leagueid, inlineResponse20014.leagueid) &&
        Objects.equals(this.leagueName, inlineResponse20014.leagueName) &&
        Objects.equals(this.seriesId, inlineResponse20014.seriesId) &&
        Objects.equals(this.seriesType, inlineResponse20014.seriesType) &&
        Objects.equals(this.radiantScore, inlineResponse20014.radiantScore) &&
        Objects.equals(this.direScore, inlineResponse20014.direScore) &&
        Objects.equals(this.radiantWin, inlineResponse20014.radiantWin) &&
        Objects.equals(this.radiant, inlineResponse20014.radiant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchId, duration, startTime, radiantTeamId, radiantName, direTeamId, direName, leagueid, leagueName, seriesId, seriesType, radiantScore, direScore, radiantWin, radiant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    radiantTeamId: ").append(toIndentedString(radiantTeamId)).append("\n");
    sb.append("    radiantName: ").append(toIndentedString(radiantName)).append("\n");
    sb.append("    direTeamId: ").append(toIndentedString(direTeamId)).append("\n");
    sb.append("    direName: ").append(toIndentedString(direName)).append("\n");
    sb.append("    leagueid: ").append(toIndentedString(leagueid)).append("\n");
    sb.append("    leagueName: ").append(toIndentedString(leagueName)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    radiantScore: ").append(toIndentedString(radiantScore)).append("\n");
    sb.append("    direScore: ").append(toIndentedString(direScore)).append("\n");
    sb.append("    radiantWin: ").append(toIndentedString(radiantWin)).append("\n");
    sb.append("    radiant: ").append(toIndentedString(radiant)).append("\n");
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
