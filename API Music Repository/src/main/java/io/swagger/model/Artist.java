package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Artist
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-27T14:24:09.910Z[GMT]")


public class Artist   {
  @JsonProperty("artistName")
  private String artistName = null;

  @JsonProperty("age")
  private Long age = null;

  public Artist artistName(String artistName) {
    this.artistName = artistName;
    return this;
  }

  /**
   * Get artistName
   * @return artistName
   **/
  @Schema(description = "")
  
    public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public Artist age(Long age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
   **/
  @Schema(description = "")
  
    public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artist artist = (Artist) o;
    return Objects.equals(this.artistName, artist.artistName) &&
        Objects.equals(this.age, artist.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistName, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Artist {\n");
    
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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
