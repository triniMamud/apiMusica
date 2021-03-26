
    public ResponseEntity<Void> addBand(@Parameter(in = ParameterIn.DEFAULT, description = "Band object that needs to be added to the repository", required=true, schema=@Schema()) @Valid @RequestBody Band band,
    @Parameter(in = ParameterIn.PATH, description = "Name", required=true, schema=@Schema()) @PathVariable("bandName") String bandName,
    @Parameter(in = ParameterIn.PATH, description = "Description", required=true, schema=@Schema()) @PathVariable("description") String description) {

    }

