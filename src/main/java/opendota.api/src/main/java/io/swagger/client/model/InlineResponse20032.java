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
 * InlineResponse20032
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse20032 {
  @SerializedName("hero_id")
  private Integer heroId = null;

  @SerializedName("lane_role")
  private Integer laneRole = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("games")
  private String games = null;

  @SerializedName("wins")
  private String wins = null;

  public InlineResponse20032 heroId(Integer heroId) {
    this.heroId = heroId;
    return this;
  }

   /**
   * Hero ID
   * @return heroId
  **/
  @ApiModelProperty(value = "Hero ID")
  public Integer getHeroId() {
    return heroId;
  }

  public void setHeroId(Integer heroId) {
    this.heroId = heroId;
  }

  public InlineResponse20032 laneRole(Integer laneRole) {
    this.laneRole = laneRole;
    return this;
  }

   /**
   * The hero&#39;s lane role
   * @return laneRole
  **/
  @ApiModelProperty(value = "The hero's lane role")
  public Integer getLaneRole() {
    return laneRole;
  }

  public void setLaneRole(Integer laneRole) {
    this.laneRole = laneRole;
  }

  public InlineResponse20032 time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Maximum game length in seconds
   * @return time
  **/
  @ApiModelProperty(value = "Maximum game length in seconds")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public InlineResponse20032 games(String games) {
    this.games = games;
    return this;
  }

   /**
   * The number of games where the hero played in this lane role
   * @return games
  **/
  @ApiModelProperty(value = "The number of games where the hero played in this lane role")
  public String getGames() {
    return games;
  }

  public void setGames(String games) {
    this.games = games;
  }

  public InlineResponse20032 wins(String wins) {
    this.wins = wins;
    return this;
  }

   /**
   * The number of games won where the hero played in this lane role
   * @return wins
  **/
  @ApiModelProperty(value = "The number of games won where the hero played in this lane role")
  public String getWins() {
    return wins;
  }

  public void setWins(String wins) {
    this.wins = wins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20032 inlineResponse20032 = (InlineResponse20032) o;
    return Objects.equals(this.heroId, inlineResponse20032.heroId) &&
        Objects.equals(this.laneRole, inlineResponse20032.laneRole) &&
        Objects.equals(this.time, inlineResponse20032.time) &&
        Objects.equals(this.games, inlineResponse20032.games) &&
        Objects.equals(this.wins, inlineResponse20032.wins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heroId, laneRole, time, games, wins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20032 {\n");
    
    sb.append("    heroId: ").append(toIndentedString(heroId)).append("\n");
    sb.append("    laneRole: ").append(toIndentedString(laneRole)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
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

