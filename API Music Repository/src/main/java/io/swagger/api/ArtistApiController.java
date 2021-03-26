package io.swagger.api;

import Modelos.Artista;
import Requerimientos.Implementaciones.BuscarArtistaRequirement;
import Requerimientos.Implementaciones.CrearArtistaRequirement;
import Requerimientos.Implementaciones.EliminarArtistaRequirement;
import io.swagger.model.Artist;
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
import Requerimientos.Implementaciones.CrearArtistaRequirement;
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
public class ArtistApiController implements ArtistApi {

    private static final Logger log = LoggerFactory.getLogger(ArtistApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private CrearArtistaRequirement crearArtistaRequirement;
    @Autowired
    private EliminarArtistaRequirement eliminarArtistaRequirement;
    @Autowired
    private BuscarArtistaRequirement buscarArtistaRequirement;

    @org.springframework.beans.factory.annotation.Autowired
    public ArtistApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createArtist(@Parameter(in = ParameterIn.DEFAULT, description = "Created artist object", required=true, schema=@Schema()) @Valid @RequestBody Artist artist) {
        Artista artista = Artista.builder()
                .nombre(artist.getArtistName())
                .edad(artist.getAge())
                .build();

        crearArtistaRequirement.ejecutar(artista);
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<Void> deleteArtist(@Parameter(in = ParameterIn.PATH, description = "The name that needs to be deleted", required=true, schema=@Schema()) @PathVariable("artistName") String artistName) {
        Artista artista = Artista.builder()
                .nombre(artistName)
                .build();

        eliminarArtistaRequirement.ejecutar(artista);

        return ResponseEntity.ok(null);
    }

    public ResponseEntity<Artist> getArtistByName(@Parameter(in = ParameterIn.PATH, description = "The name that needs to be fetched.", required=true, schema=@Schema()) @PathVariable("artistName") String artistName) {

        Artista artista = buscarArtistaRequirement.ejecutar(artistName);

        return ResponseEntity.ok(new Artist().artistName(artista.getNombre()).age(Long.valueOf(artista.getEdad())));
    }

}
