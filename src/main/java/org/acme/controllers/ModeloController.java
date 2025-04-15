package org.acme.controllers;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.entity.Modelo;
import org.acme.services.ModeloService;

import java.util.ArrayList;
import java.util.List;

@Path("/api/modelo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ModeloController {

    @Inject
    ModeloService modeloService;

    @GET
    public List<Modelo> retrieveModelo(){
        List<Modelo> modelos = new ArrayList<>();
        try{
            modelos = modeloService.findAllModelos();
        }catch (Exception e){
            e.printStackTrace();
        }

        return modelos;
    }

    @POST
    @Transactional
    public void addModelo(Modelo modelo){
        modeloService.addModelo(modelo);
    }
}
