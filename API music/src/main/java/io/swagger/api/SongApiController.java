package io.swagger.api;

import Modelos.Cancion;
import Requerimientos.Implementaciones.BuscarCancionRequirement;
import Requerimientos.Implementaciones.CrearCancionRequirement;
import Requerimientos.Implementaciones.EliminarCancionRequirement;
import io.swagger.model.Song;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-25T13:09:59.949Z[GMT]")
@RestController
@CrossOrigin
public class SongApiController implements SongApi {

    private static final Logger log = LoggerFactory.getLogger(SongApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private CrearCancionRequirement crearCancionRequirement;
    @Autowired
    private EliminarCancionRequirement eliminarCancionRequirement;
    @Autowired
    private BuscarCancionRequirement buscarCancionRequirement;

    @org.springframework.beans.factory.annotation.Autowired
    public SongApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createSong(@Parameter(in = ParameterIn.DEFAULT, description = "Created song object", required=true, schema=@Schema()) @Valid @RequestBody Song song) {
        Cancion cancion = Cancion.builder()
                .nombre(song.getSongName())
                .album(song.getAlbum())
                .añoLanzamiento(Math.toIntExact(song.getPublishedYear()))
                .build();

        crearCancionRequirement.ejecutar(cancion);

        return ResponseEntity.ok(null);
    }

    public ResponseEntity<Void> deleteSong(@Parameter(in = ParameterIn.PATH, description = "The name that needs to be deleted", required=true, schema=@Schema()) @PathVariable("songName") String songName) {
        Cancion cancion = Cancion.builder().nombre(songName).build();

        eliminarCancionRequirement.ejecutar(cancion);

        return ResponseEntity.ok(null);
    }

    public ResponseEntity<Song> getSongByName(@Parameter(in = ParameterIn.PATH, description = "The name that needs to be fetched.", required=true, schema=@Schema()) @PathVariable("songName") String songName) {

        buscarCancionRequirement.ejecutar(songName);

        return ResponseEntity.ok(null);
    }

}
