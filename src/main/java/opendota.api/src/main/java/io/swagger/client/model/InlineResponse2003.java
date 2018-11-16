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
 * match
 */
@ApiModel(description = "match")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse2003 {
  @SerializedName("match_id")
  private Integer matchId = null;

  @SerializedName("player_slot")
  private Integer playerSlot = null;

  @SerializedName("radiant_win")
  private Boolean radiantWin = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("game_mode")
  private Integer gameMode = null;

  @SerializedName("lobby_type")
  private Integer lobbyType = null;

  @SerializedName("hero_id")
  private Integer heroId = null;

  @SerializedName("start_time")
  private Integer startTime = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("kills")
  private Integer kills = null;

  @SerializedName("deaths")
  private Integer deaths = null;

  @SerializedName("assists")
  private Integer assists = null;

  @SerializedName("skill")
  private Integer skill = null;

  @SerializedName("lane")
  private Integer lane = null;

  @SerializedName("lane_role")
  private Integer laneRole = null;

  @SerializedName("is_roaming")
  private Boolean isRoaming = null;

  @SerializedName("cluster")
  private Integer cluster = null;

  @SerializedName("leaver_status")
  private Integer leaverStatus = null;

  @SerializedName("party_size")
  private Integer partySize = null;

  public InlineResponse2003 matchId(Integer matchId) {
    this.matchId = matchId;
    return this;
  }

   /**
   * Match ID
   * @return matchId
  **/
  @ApiModelProperty(value = "Match ID")
  public Integer getMatchId() {
    return matchId;
  }

  public void setMatchId(Integer matchId) {
    this.matchId = matchId;
  }

  public InlineResponse2003 playerSlot(Integer playerSlot) {
    this.playerSlot = playerSlot;
    return this;
  }

   /**
   * Which slot the player is in. 0-127 are Radiant, 128-255 are Dire
   * @return playerSlot
  **/
  @ApiModelProperty(value = "Which slot the player is in. 0-127 are Radiant, 128-255 are Dire")
  public Integer getPlayerSlot() {
    return playerSlot;
  }

  public void setPlayerSlot(Integer playerSlot) {
    this.playerSlot = playerSlot;
  }

  public InlineResponse2003 radiantWin(Boolean radiantWin) {
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

  public InlineResponse2003 duration(Integer duration) {
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

  public InlineResponse2003 gameMode(Integer gameMode) {
    this.gameMode = gameMode;
    return this;
  }

   /**
   * Integer corresponding to game mode played. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/game_mode.json
   * @return gameMode
  **/
  @ApiModelProperty(value = "Integer corresponding to game mode played. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/game_mode.json")
  public Integer getGameMode() {
    return gameMode;
  }

  public void setGameMode(Integer gameMode) {
    this.gameMode = gameMode;
  }

  public InlineResponse2003 lobbyType(Integer lobbyType) {
    this.lobbyType = lobbyType;
    return this;
  }

   /**
   * Integer corresponding to lobby type of match. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/lobby_type.json
   * @return lobbyType
  **/
  @ApiModelProperty(value = "Integer corresponding to lobby type of match. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/lobby_type.json")
  public Integer getLobbyType() {
    return lobbyType;
  }

  public void setLobbyType(Integer lobbyType) {
    this.lobbyType = lobbyType;
  }

  public InlineResponse2003 heroId(Integer heroId) {
    this.heroId = heroId;
    return this;
  }

   /**
   * The ID value of the hero played
   * @return heroId
  **/
  @ApiModelProperty(value = "The ID value of the hero played")
  public Integer getHeroId() {
    return heroId;
  }

  public void setHeroId(Integer heroId) {
    this.heroId = heroId;
  }

  public InlineResponse2003 startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time of the match in seconds elapsed since 1970
   * @return startTime
  **/
  @ApiModelProperty(value = "Start time of the match in seconds elapsed since 1970")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public InlineResponse2003 version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * version
   * @return version
  **/
  @ApiModelProperty(value = "version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public InlineResponse2003 kills(Integer kills) {
    this.kills = kills;
    return this;
  }

   /**
   * Total kills the player had at the end of the match
   * @return kills
  **/
  @ApiModelProperty(value = "Total kills the player had at the end of the match")
  public Integer getKills() {
    return kills;
  }

  public void setKills(Integer kills) {
    this.kills = kills;
  }

  public InlineResponse2003 deaths(Integer deaths) {
    this.deaths = deaths;
    return this;
  }

   /**
   * Total deaths the player had at the end of the match
   * @return deaths
  **/
  @ApiModelProperty(value = "Total deaths the player had at the end of the match")
  public Integer getDeaths() {
    return deaths;
  }

  public void setDeaths(Integer deaths) {
    this.deaths = deaths;
  }

  public InlineResponse2003 assists(Integer assists) {
    this.assists = assists;
    return this;
  }

   /**
   * Total assists the player had at the end of the match
   * @return assists
  **/
  @ApiModelProperty(value = "Total assists the player had at the end of the match")
  public Integer getAssists() {
    return assists;
  }

  public void setAssists(Integer assists) {
    this.assists = assists;
  }

  public InlineResponse2003 skill(Integer skill) {
    this.skill = skill;
    return this;
  }

   /**
   * Skill bracket assigned by Valve (Normal, High, Very High)
   * @return skill
  **/
  @ApiModelProperty(value = "Skill bracket assigned by Valve (Normal, High, Very High)")
  public Integer getSkill() {
    return skill;
  }

  public void setSkill(Integer skill) {
    this.skill = skill;
  }

  public InlineResponse2003 lane(Integer lane) {
    this.lane = lane;
    return this;
  }

   /**
   * Integer corresponding to which lane the player laned in for the match
   * @return lane
  **/
  @ApiModelProperty(value = "Integer corresponding to which lane the player laned in for the match")
  public Integer getLane() {
    return lane;
  }

  public void setLane(Integer lane) {
    this.lane = lane;
  }

  public InlineResponse2003 laneRole(Integer laneRole) {
    this.laneRole = laneRole;
    return this;
  }

   /**
   * lane_role
   * @return laneRole
  **/
  @ApiModelProperty(value = "lane_role")
  public Integer getLaneRole() {
    return laneRole;
  }

  public void setLaneRole(Integer laneRole) {
    this.laneRole = laneRole;
  }

  public InlineResponse2003 isRoaming(Boolean isRoaming) {
    this.isRoaming = isRoaming;
    return this;
  }

   /**
   * Boolean describing whether or not the player roamed
   * @return isRoaming
  **/
  @ApiModelProperty(value = "Boolean describing whether or not the player roamed")
  public Boolean isIsRoaming() {
    return isRoaming;
  }

  public void setIsRoaming(Boolean isRoaming) {
    this.isRoaming = isRoaming;
  }

  public InlineResponse2003 cluster(Integer cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * cluster
   * @return cluster
  **/
  @ApiModelProperty(value = "cluster")
  public Integer getCluster() {
    return cluster;
  }

  public void setCluster(Integer cluster) {
    this.cluster = cluster;
  }

  public InlineResponse2003 leaverStatus(Integer leaverStatus) {
    this.leaverStatus = leaverStatus;
    return this;
  }

   /**
   * Integer describing whether or not the player left the game. 0: didn&#39;t leave. 1: left safely. 2+: Abandoned
   * @return leaverStatus
  **/
  @ApiModelProperty(value = "Integer describing whether or not the player left the game. 0: didn't leave. 1: left safely. 2+: Abandoned")
  public Integer getLeaverStatus() {
    return leaverStatus;
  }

  public void setLeaverStatus(Integer leaverStatus) {
    this.leaverStatus = leaverStatus;
  }

  public InlineResponse2003 partySize(Integer partySize) {
    this.partySize = partySize;
    return this;
  }

   /**
   * Size of the players party. If not in a party, will return 1.
   * @return partySize
  **/
  @ApiModelProperty(value = "Size of the players party. If not in a party, will return 1.")
  public Integer getPartySize() {
    return partySize;
  }

  public void setPartySize(Integer partySize) {
    this.partySize = partySize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.matchId, inlineResponse2003.matchId) &&
        Objects.equals(this.playerSlot, inlineResponse2003.playerSlot) &&
        Objects.equals(this.radiantWin, inlineResponse2003.radiantWin) &&
        Objects.equals(this.duration, inlineResponse2003.duration) &&
        Objects.equals(this.gameMode, inlineResponse2003.gameMode) &&
        Objects.equals(this.lobbyType, inlineResponse2003.lobbyType) &&
        Objects.equals(this.heroId, inlineResponse2003.heroId) &&
        Objects.equals(this.startTime, inlineResponse2003.startTime) &&
        Objects.equals(this.version, inlineResponse2003.version) &&
        Objects.equals(this.kills, inlineResponse2003.kills) &&
        Objects.equals(this.deaths, inlineResponse2003.deaths) &&
        Objects.equals(this.assists, inlineResponse2003.assists) &&
        Objects.equals(this.skill, inlineResponse2003.skill) &&
        Objects.equals(this.lane, inlineResponse2003.lane) &&
        Objects.equals(this.laneRole, inlineResponse2003.laneRole) &&
        Objects.equals(this.isRoaming, inlineResponse2003.isRoaming) &&
        Objects.equals(this.cluster, inlineResponse2003.cluster) &&
        Objects.equals(this.leaverStatus, inlineResponse2003.leaverStatus) &&
        Objects.equals(this.partySize, inlineResponse2003.partySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchId, playerSlot, radiantWin, duration, gameMode, lobbyType, heroId, startTime, version, kills, deaths, assists, skill, lane, laneRole, isRoaming, cluster, leaverStatus, partySize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    playerSlot: ").append(toIndentedString(playerSlot)).append("\n");
    sb.append("    radiantWin: ").append(toIndentedString(radiantWin)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    lobbyType: ").append(toIndentedString(lobbyType)).append("\n");
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
    sb.append("    assists: ").append(toIndentedString(assists)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    lane: ").append(toIndentedString(lane)).append("\n");
    sb.append("    laneRole: ").append(toIndentedString(laneRole)).append("\n");
    sb.append("    isRoaming: ").append(toIndentedString(isRoaming)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    leaverStatus: ").append(toIndentedString(leaverStatus)).append("\n");
    sb.append("    partySize: ").append(toIndentedString(partySize)).append("\n");
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
