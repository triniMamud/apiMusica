package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Artist;
import io.swagger.model.Song;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Band
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-25T13:09:59.949Z[GMT]")


public class Band   {
  @JsonProperty("bandName")
  private String bandName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("Artist")
  private Artist artist = null;

  @JsonProperty("Song")
  private Song song = null;

  public Band bandName(String bandName) {
    this.bandName = bandName;
    return this;
  }

  /**
   * Get bandName
   * @return bandName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getBandName() {
    return bandName;
  }

  public void setBandName(String bandName) {
    this.bandName = bandName;
  }

  public Band description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Band artist(Artist artist) {
    this.artist = artist;
    return this;
  }

  /**
   * Get artist
   * @return artist
   **/
  @Schema(description = "")
  
    @Valid
    public Artist getArtist() {
    return artist;
  }

  public void setArtist(Artist artist) {
    this.artist = artist;
  }

  public Band song(Song song) {
    this.song = song;
    return this;
  }

  /**
   * Get song
   * @return song
   **/
  @Schema(description = "")
  
    @Valid
    public Song getSong() {
    return song;
  }

  public void setSong(Song song) {
    this.song = song;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Band band = (Band) o;
    return Objects.equals(this.bandName, band.bandName) &&
        Objects.equals(this.description, band.description) &&
        Objects.equals(this.artist, band.artist) &&
        Objects.equals(this.song, band.song);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandName, description, artist, song);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Band {\n");
    
    sb.append("    bandName: ").append(toIndentedString(bandName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    song: ").append(toIndentedString(song)).append("\n");
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
