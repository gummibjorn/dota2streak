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
 * InlineResponse20027
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse20027 {
  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("games_played")
  private Integer gamesPlayed = null;

  @SerializedName("wins")
  private Integer wins = null;

  @SerializedName("is_current_team_member")
  private Boolean isCurrentTeamMember = null;

  public InlineResponse20027 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The player account ID
   * @return accountId
  **/
  @ApiModelProperty(value = "The player account ID")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public InlineResponse20027 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The player name
   * @return name
  **/
  @ApiModelProperty(value = "The player name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20027 gamesPlayed(Integer gamesPlayed) {
    this.gamesPlayed = gamesPlayed;
    return this;
  }

   /**
   * Number of games played
   * @return gamesPlayed
  **/
  @ApiModelProperty(value = "Number of games played")
  public Integer getGamesPlayed() {
    return gamesPlayed;
  }

  public void setGamesPlayed(Integer gamesPlayed) {
    this.gamesPlayed = gamesPlayed;
  }

  public InlineResponse20027 wins(Integer wins) {
    this.wins = wins;
    return this;
  }

   /**
   * Number of wins
   * @return wins
  **/
  @ApiModelProperty(value = "Number of wins")
  public Integer getWins() {
    return wins;
  }

  public void setWins(Integer wins) {
    this.wins = wins;
  }

  public InlineResponse20027 isCurrentTeamMember(Boolean isCurrentTeamMember) {
    this.isCurrentTeamMember = isCurrentTeamMember;
    return this;
  }

   /**
   * If this player is on the current roster
   * @return isCurrentTeamMember
  **/
  @ApiModelProperty(value = "If this player is on the current roster")
  public Boolean isIsCurrentTeamMember() {
    return isCurrentTeamMember;
  }

  public void setIsCurrentTeamMember(Boolean isCurrentTeamMember) {
    this.isCurrentTeamMember = isCurrentTeamMember;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20027 inlineResponse20027 = (InlineResponse20027) o;
    return Objects.equals(this.accountId, inlineResponse20027.accountId) &&
        Objects.equals(this.name, inlineResponse20027.name) &&
        Objects.equals(this.gamesPlayed, inlineResponse20027.gamesPlayed) &&
        Objects.equals(this.wins, inlineResponse20027.wins) &&
        Objects.equals(this.isCurrentTeamMember, inlineResponse20027.isCurrentTeamMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, name, gamesPlayed, wins, isCurrentTeamMember);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20027 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gamesPlayed: ").append(toIndentedString(gamesPlayed)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    isCurrentTeamMember: ").append(toIndentedString(isCurrentTeamMember)).append("\n");
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

