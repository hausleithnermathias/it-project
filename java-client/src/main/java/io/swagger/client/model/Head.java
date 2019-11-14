/*
 * Ultimaker 3 API
 * REST api for the Ultimaker 3 - 3D printer.  Authentication: Any PUT/POST/DELETE api requires authentication before it can be used. Authentication is done with http digest (RFC 2617) without fallback to basic authentication.  To get a valid username/password combination, the following process can/should be followed.  1) POST /auth/request with 'application' and 'user' as parameters. The application name and user name will be shown to the user on the printer. The reply body will contain a json reply with an 'id' and 'key' part.  2) Repeatedly GET /auth/check/<id> until it reports 'authorized' or 'unauthorized'. This will be reported back once the end user selects if the application is allowed to use the API.  3) [optional] test the authentication, the earlier given 'id' is the username, the 'key' is the password. Use digest authentication on GET /auth/verify to test this.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Extruder;
import io.swagger.client.model.XYZ;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Head of a printer. May contain multiple extruders. Heads can be uniquely identified by ID. The id is an integer starting at 0.
 */
@ApiModel(description = "Head of a printer. May contain multiple extruders. Heads can be uniquely identified by ID. The id is an integer starting at 0.")
public class Head {
  @SerializedName("position")
  private XYZ position = null;

  @SerializedName("max_speed")
  private XYZ maxSpeed = null;

  @SerializedName("acceleration")
  private BigDecimal acceleration = null;

  @SerializedName("jerk")
  private XYZ jerk = null;

  @SerializedName("extruders")
  private List<Extruder> extruders = null;

  public Head position(XYZ position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public XYZ getPosition() {
    return position;
  }

  public void setPosition(XYZ position) {
    this.position = position;
  }

  public Head maxSpeed(XYZ maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }

   /**
   * Get maxSpeed
   * @return maxSpeed
  **/
  @ApiModelProperty(value = "")
  public XYZ getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(XYZ maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public Head acceleration(BigDecimal acceleration) {
    this.acceleration = acceleration;
    return this;
  }

   /**
   * The default acceleration for the X, Y and Z axis
   * @return acceleration
  **/
  @ApiModelProperty(value = "The default acceleration for the X, Y and Z axis")
  public BigDecimal getAcceleration() {
    return acceleration;
  }

  public void setAcceleration(BigDecimal acceleration) {
    this.acceleration = acceleration;
  }

  public Head jerk(XYZ jerk) {
    this.jerk = jerk;
    return this;
  }

   /**
   * Get jerk
   * @return jerk
  **/
  @ApiModelProperty(value = "")
  public XYZ getJerk() {
    return jerk;
  }

  public void setJerk(XYZ jerk) {
    this.jerk = jerk;
  }

  public Head extruders(List<Extruder> extruders) {
    this.extruders = extruders;
    return this;
  }

  public Head addExtrudersItem(Extruder extrudersItem) {
    if (this.extruders == null) {
      this.extruders = new ArrayList<Extruder>();
    }
    this.extruders.add(extrudersItem);
    return this;
  }

   /**
   * Get extruders
   * @return extruders
  **/
  @ApiModelProperty(value = "")
  public List<Extruder> getExtruders() {
    return extruders;
  }

  public void setExtruders(List<Extruder> extruders) {
    this.extruders = extruders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Head head = (Head) o;
    return Objects.equals(this.position, head.position) &&
        Objects.equals(this.maxSpeed, head.maxSpeed) &&
        Objects.equals(this.acceleration, head.acceleration) &&
        Objects.equals(this.jerk, head.jerk) &&
        Objects.equals(this.extruders, head.extruders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, maxSpeed, acceleration, jerk, extruders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Head {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    acceleration: ").append(toIndentedString(acceleration)).append("\n");
    sb.append("    jerk: ").append(toIndentedString(jerk)).append("\n");
    sb.append("    extruders: ").append(toIndentedString(extruders)).append("\n");
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
