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
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse2002 {
  @SerializedName("win")
  private Integer win = null;

  @SerializedName("lose")
  private Integer lose = null;

  public InlineResponse2002 win(Integer win) {
    this.win = win;
    return this;
  }

   /**
   * Number of wins
   * @return win
  **/
  @ApiModelProperty(value = "Number of wins")
  public Integer getWin() {
    return win;
  }

  public void setWin(Integer win) {
    this.win = win;
  }

  public InlineResponse2002 lose(Integer lose) {
    this.lose = lose;
    return this;
  }

   /**
   * Number of loses
   * @return lose
  **/
  @ApiModelProperty(value = "Number of loses")
  public Integer getLose() {
    return lose;
  }

  public void setLose(Integer lose) {
    this.lose = lose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.win, inlineResponse2002.win) &&
        Objects.equals(this.lose, inlineResponse2002.lose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(win, lose);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    win: ").append(toIndentedString(win)).append("\n");
    sb.append("    lose: ").append(toIndentedString(lose)).append("\n");
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

