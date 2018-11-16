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
import io.swagger.client.model.InlineResponse2001MmrEstimate;
import io.swagger.client.model.InlineResponse2001Profile;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse2001 {
  @SerializedName("tracked_until")
  private String trackedUntil = null;

  @SerializedName("solo_competitive_rank")
  private String soloCompetitiveRank = null;

  @SerializedName("competitive_rank")
  private String competitiveRank = null;

  @SerializedName("rank_tier")
  private BigDecimal rankTier = null;

  @SerializedName("leaderboard_rank")
  private BigDecimal leaderboardRank = null;

  @SerializedName("mmr_estimate")
  private InlineResponse2001MmrEstimate mmrEstimate = null;

  @SerializedName("profile")
  private InlineResponse2001Profile profile = null;

  public InlineResponse2001 trackedUntil(String trackedUntil) {
    this.trackedUntil = trackedUntil;
    return this;
  }

   /**
   * tracked_until
   * @return trackedUntil
  **/
  @ApiModelProperty(value = "tracked_until")
  public String getTrackedUntil() {
    return trackedUntil;
  }

  public void setTrackedUntil(String trackedUntil) {
    this.trackedUntil = trackedUntil;
  }

  public InlineResponse2001 soloCompetitiveRank(String soloCompetitiveRank) {
    this.soloCompetitiveRank = soloCompetitiveRank;
    return this;
  }

   /**
   * solo_competitive_rank
   * @return soloCompetitiveRank
  **/
  @ApiModelProperty(value = "solo_competitive_rank")
  public String getSoloCompetitiveRank() {
    return soloCompetitiveRank;
  }

  public void setSoloCompetitiveRank(String soloCompetitiveRank) {
    this.soloCompetitiveRank = soloCompetitiveRank;
  }

  public InlineResponse2001 competitiveRank(String competitiveRank) {
    this.competitiveRank = competitiveRank;
    return this;
  }

   /**
   * competitive_rank
   * @return competitiveRank
  **/
  @ApiModelProperty(value = "competitive_rank")
  public String getCompetitiveRank() {
    return competitiveRank;
  }

  public void setCompetitiveRank(String competitiveRank) {
    this.competitiveRank = competitiveRank;
  }

  public InlineResponse2001 rankTier(BigDecimal rankTier) {
    this.rankTier = rankTier;
    return this;
  }

   /**
   * rank_tier
   * @return rankTier
  **/
  @ApiModelProperty(value = "rank_tier")
  public BigDecimal getRankTier() {
    return rankTier;
  }

  public void setRankTier(BigDecimal rankTier) {
    this.rankTier = rankTier;
  }

  public InlineResponse2001 leaderboardRank(BigDecimal leaderboardRank) {
    this.leaderboardRank = leaderboardRank;
    return this;
  }

   /**
   * leaderboard_rank
   * @return leaderboardRank
  **/
  @ApiModelProperty(value = "leaderboard_rank")
  public BigDecimal getLeaderboardRank() {
    return leaderboardRank;
  }

  public void setLeaderboardRank(BigDecimal leaderboardRank) {
    this.leaderboardRank = leaderboardRank;
  }

  public InlineResponse2001 mmrEstimate(InlineResponse2001MmrEstimate mmrEstimate) {
    this.mmrEstimate = mmrEstimate;
    return this;
  }

   /**
   * Get mmrEstimate
   * @return mmrEstimate
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2001MmrEstimate getMmrEstimate() {
    return mmrEstimate;
  }

  public void setMmrEstimate(InlineResponse2001MmrEstimate mmrEstimate) {
    this.mmrEstimate = mmrEstimate;
  }

  public InlineResponse2001 profile(InlineResponse2001Profile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2001Profile getProfile() {
    return profile;
  }

  public void setProfile(InlineResponse2001Profile profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.trackedUntil, inlineResponse2001.trackedUntil) &&
        Objects.equals(this.soloCompetitiveRank, inlineResponse2001.soloCompetitiveRank) &&
        Objects.equals(this.competitiveRank, inlineResponse2001.competitiveRank) &&
        Objects.equals(this.rankTier, inlineResponse2001.rankTier) &&
        Objects.equals(this.leaderboardRank, inlineResponse2001.leaderboardRank) &&
        Objects.equals(this.mmrEstimate, inlineResponse2001.mmrEstimate) &&
        Objects.equals(this.profile, inlineResponse2001.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackedUntil, soloCompetitiveRank, competitiveRank, rankTier, leaderboardRank, mmrEstimate, profile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    trackedUntil: ").append(toIndentedString(trackedUntil)).append("\n");
    sb.append("    soloCompetitiveRank: ").append(toIndentedString(soloCompetitiveRank)).append("\n");
    sb.append("    competitiveRank: ").append(toIndentedString(competitiveRank)).append("\n");
    sb.append("    rankTier: ").append(toIndentedString(rankTier)).append("\n");
    sb.append("    leaderboardRank: ").append(toIndentedString(leaderboardRank)).append("\n");
    sb.append("    mmrEstimate: ").append(toIndentedString(mmrEstimate)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
