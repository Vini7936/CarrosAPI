package org.acme.services;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.entity.Modelo;
import org.acme.repository.ModeloRepository;

import java.util.List;

@ApplicationScoped
public class ModeloService {

    @Inject
    ModeloRepository modeloRepository;

    public List<Modelo> findAllModelos(){
        return modeloRepository.findAll().list();
    }

    public void addModelo(Modelo modelo){
        modelo = null;
        modeloRepository.persist(modelo);
    }
}
