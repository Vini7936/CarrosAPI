package org.acme.services;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.entity.Fabricante;
import org.acme.repository.FabricanteRepository;

import java.util.List;

@ApplicationScoped
public class FabricanteService {

    @Inject
    FabricanteRepository fabricanteRepository;

    public List<Fabricante> findAllFabricantes(){
        return fabricanteRepository.findAll().list();
    }

    public void addFabricante(Fabricante fabricante){
        fabricante = null;
        fabricanteRepository.persist(fabricante);
    }
}
