package org.acme.controllers;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.entity.Carro;
import org.acme.services.CarroService;

import java.util.ArrayList;
import java.util.List;


@Path("/api/carro")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarroController {

    @Inject
    CarroService carroService;

    @GET
    public List<Carro> retrieveCarros(){
        List<Carro> carros = new ArrayList<>();
        try{
            carros = carroService.findAllCarros();
        }catch (Exception e){
            e.printStackTrace();
        }

        return carros;
    }

    @POST
    @Transactional
    public void addCarro(Carro carro){
        carroService.addCarro(carro);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response updateCarro(@PathParam("id") Long id, Carro carro){
      return  Response.ok(carroService.updateCarro(id, carro)).build();
    }

    @GET
    @Path("/{id}")
    public Response addCarro(@PathParam("id")Long id){
        return Response.ok(carroService.findById(id)).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteCarro(@PathParam("id")Long id){
        carroService.deleteCarro(id);
        return Response.noContent().build();
    }
}
