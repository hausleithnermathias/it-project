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
import java.io.IOException;

/**
 * InlineResponse201
 */
public class InlineResponse201 {
  @SerializedName("message")
  private String message = null;

  @SerializedName("uuid")
  private String uuid = null;

  public InlineResponse201 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse201 uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201 inlineResponse201 = (InlineResponse201) o;
    return Objects.equals(this.message, inlineResponse201.message) &&
        Objects.equals(this.uuid, inlineResponse201.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

