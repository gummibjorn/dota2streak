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
import io.swagger.client.model.InlineResponse20017RanksFields;
import io.swagger.client.model.InlineResponse20017RanksRows;
import io.swagger.client.model.InlineResponse20017RanksSum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ranks
 */
@ApiModel(description = "ranks")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-16T13:08:16.611+01:00")
public class InlineResponse20017Ranks {
  @SerializedName("commmand")
  private String commmand = null;

  @SerializedName("rowCount")
  private Integer rowCount = null;

  @SerializedName("rows")
  private List<InlineResponse20017RanksRows> rows = null;

  @SerializedName("fields")
  private List<InlineResponse20017RanksFields> fields = null;

  @SerializedName("rowAsArray")
  private Boolean rowAsArray = null;

  @SerializedName("sum")
  private InlineResponse20017RanksSum sum = null;

  public InlineResponse20017Ranks commmand(String commmand) {
    this.commmand = commmand;
    return this;
  }

   /**
   * command
   * @return commmand
  **/
  @ApiModelProperty(value = "command")
  public String getCommmand() {
    return commmand;
  }

  public void setCommmand(String commmand) {
    this.commmand = commmand;
  }

  public InlineResponse20017Ranks rowCount(Integer rowCount) {
    this.rowCount = rowCount;
    return this;
  }

   /**
   * rowCount
   * @return rowCount
  **/
  @ApiModelProperty(value = "rowCount")
  public Integer getRowCount() {
    return rowCount;
  }

  public void setRowCount(Integer rowCount) {
    this.rowCount = rowCount;
  }

  public InlineResponse20017Ranks rows(List<InlineResponse20017RanksRows> rows) {
    this.rows = rows;
    return this;
  }

  public InlineResponse20017Ranks addRowsItem(InlineResponse20017RanksRows rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<InlineResponse20017RanksRows>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * rows
   * @return rows
  **/
  @ApiModelProperty(value = "rows")
  public List<InlineResponse20017RanksRows> getRows() {
    return rows;
  }

  public void setRows(List<InlineResponse20017RanksRows> rows) {
    this.rows = rows;
  }

  public InlineResponse20017Ranks fields(List<InlineResponse20017RanksFields> fields) {
    this.fields = fields;
    return this;
  }

  public InlineResponse20017Ranks addFieldsItem(InlineResponse20017RanksFields fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<InlineResponse20017RanksFields>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * fields
   * @return fields
  **/
  @ApiModelProperty(value = "fields")
  public List<InlineResponse20017RanksFields> getFields() {
    return fields;
  }

  public void setFields(List<InlineResponse20017RanksFields> fields) {
    this.fields = fields;
  }

  public InlineResponse20017Ranks rowAsArray(Boolean rowAsArray) {
    this.rowAsArray = rowAsArray;
    return this;
  }

   /**
   * rowAsArray
   * @return rowAsArray
  **/
  @ApiModelProperty(value = "rowAsArray")
  public Boolean isRowAsArray() {
    return rowAsArray;
  }

  public void setRowAsArray(Boolean rowAsArray) {
    this.rowAsArray = rowAsArray;
  }

  public InlineResponse20017Ranks sum(InlineResponse20017RanksSum sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Get sum
   * @return sum
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20017RanksSum getSum() {
    return sum;
  }

  public void setSum(InlineResponse20017RanksSum sum) {
    this.sum = sum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20017Ranks inlineResponse20017Ranks = (InlineResponse20017Ranks) o;
    return Objects.equals(this.commmand, inlineResponse20017Ranks.commmand) &&
        Objects.equals(this.rowCount, inlineResponse20017Ranks.rowCount) &&
        Objects.equals(this.rows, inlineResponse20017Ranks.rows) &&
        Objects.equals(this.fields, inlineResponse20017Ranks.fields) &&
        Objects.equals(this.rowAsArray, inlineResponse20017Ranks.rowAsArray) &&
        Objects.equals(this.sum, inlineResponse20017Ranks.sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commmand, rowCount, rows, fields, rowAsArray, sum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017Ranks {\n");
    
    sb.append("    commmand: ").append(toIndentedString(commmand)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    rowAsArray: ").append(toIndentedString(rowAsArray)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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
