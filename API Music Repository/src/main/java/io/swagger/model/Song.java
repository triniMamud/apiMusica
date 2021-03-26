package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Song
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-27T14:24:09.910Z[GMT]")


public class Song   {
  @JsonProperty("songName")
  private String songName = null;

  @JsonProperty("album")
  private String album = null;

  @JsonProperty("publishedYear")
  private Long publishedYear = null;

  public Song songName(String songName) {
    this.songName = songName;
    return this;
  }

  /**
   * Get songName
   * @return songName
   **/
  @Schema(description = "")
  
    public String getSongName() {
    return songName;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }

  public Song album(String album) {
    this.album = album;
    return this;
  }

  /**
   * Get album
   * @return album
   **/
  @Schema(description = "")
  
    public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public Song publishedYear(Long publishedYear) {
    this.publishedYear = publishedYear;
    return this;
  }

  /**
   * Get publishedYear
   * @return publishedYear
   **/
  @Schema(description = "")
  
    public Long getPublishedYear() {
    return publishedYear;
  }

  public void setPublishedYear(Long publishedYear) {
    this.publishedYear = publishedYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Song song = (Song) o;
    return Objects.equals(this.songName, song.songName) &&
        Objects.equals(this.album, song.album) &&
        Objects.equals(this.publishedYear, song.publishedYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(songName, album, publishedYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Song {\n");
    
    sb.append("    songName: ").append(toIndentedString(songName)).append("\n");
    sb.append("    album: ").append(toIndentedString(album)).append("\n");
    sb.append("    publishedYear: ").append(toIndentedString(publishedYear)).append("\n");
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
