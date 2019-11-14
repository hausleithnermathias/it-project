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
import io.swagger.client.model.Feeder;
import io.swagger.client.model.Hotend;
import io.swagger.client.model.Material;
import java.io.IOException;

/**
 * Extruder drive train. Includes the feeder &amp; nozzle. Note that its id can never be lower than 0 and should be seen as an index.
 */
@ApiModel(description = "Extruder drive train. Includes the feeder & nozzle. Note that its id can never be lower than 0 and should be seen as an index.")
public class Extruder {
  @SerializedName("hotend")
  private Hotend hotend = null;

  @SerializedName("feeder")
  private Feeder feeder = null;

  @SerializedName("active_material")
  private Material activeMaterial = null;

  public Extruder hotend(Hotend hotend) {
    this.hotend = hotend;
    return this;
  }

   /**
   * Get hotend
   * @return hotend
  **/
  @ApiModelProperty(value = "")
  public Hotend getHotend() {
    return hotend;
  }

  public void setHotend(Hotend hotend) {
    this.hotend = hotend;
  }

  public Extruder feeder(Feeder feeder) {
    this.feeder = feeder;
    return this;
  }

   /**
   * Get feeder
   * @return feeder
  **/
  @ApiModelProperty(value = "")
  public Feeder getFeeder() {
    return feeder;
  }

  public void setFeeder(Feeder feeder) {
    this.feeder = feeder;
  }

  public Extruder activeMaterial(Material activeMaterial) {
    this.activeMaterial = activeMaterial;
    return this;
  }

   /**
   * Get activeMaterial
   * @return activeMaterial
  **/
  @ApiModelProperty(value = "")
  public Material getActiveMaterial() {
    return activeMaterial;
  }

  public void setActiveMaterial(Material activeMaterial) {
    this.activeMaterial = activeMaterial;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extruder extruder = (Extruder) o;
    return Objects.equals(this.hotend, extruder.hotend) &&
        Objects.equals(this.feeder, extruder.feeder) &&
        Objects.equals(this.activeMaterial, extruder.activeMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotend, feeder, activeMaterial);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extruder {\n");
    
    sb.append("    hotend: ").append(toIndentedString(hotend)).append("\n");
    sb.append("    feeder: ").append(toIndentedString(feeder)).append("\n");
    sb.append("    activeMaterial: ").append(toIndentedString(activeMaterial)).append("\n");
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

