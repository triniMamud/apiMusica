package io.swagger.api;

import Modelos.*;
import Modelos.Cancion;
import Requerimientos.Implementaciones.*;
import io.swagger.model.Artist;
import io.swagger.model.Band;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.Song;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-25T13:09:59.949Z[GMT]")
@RestController
@CrossOrigin
public class BandApiController implements BandApi {

    private static final Logger log = LoggerFactory.getLogger(BandApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;



    @org.springframework.beans.factory.annotation.Autowired
    public BandApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }











}
