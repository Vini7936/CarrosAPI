package org.acme.controllers;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.entity.Fabricante;
import org.acme.services.FabricanteService;

import java.util.ArrayList;
import java.util.List;

@Path("/api/fabricante")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FabricanteController {
    @Inject
    FabricanteService fabricanteService;

    @GET
    public List<Fabricante> retrieveFabricante(){
        List<Fabricante> fabricantes = new ArrayList<>();
        try{
            fabricantes = fabricanteService.findAllFabricantes();
        }catch (Exception e){
            e.printStackTrace();
        }

        return fabricantes;
    }

    @POST
    @Transactional
    public void addFabricante(Fabricante fabricante){
        fabricanteService.addFabricante(fabricante);
    }
}
