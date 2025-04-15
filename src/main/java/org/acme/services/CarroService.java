package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.entity.Carro;
import org.acme.exception.CarroNotFoundException;
import org.acme.repository.CarroRepository;

import java.util.List;

@ApplicationScoped
public class CarroService {

    @Inject
    CarroRepository carroRepository;

    public List<Carro> findAllCarros(){
        return carroRepository.findAll().list();
    }

    public void addCarro(Carro carro){
        carro = null;
        carroRepository.persist(carro);
    }

    public Carro findById(Long id){
        return carroRepository.findByIdOptional(id).orElseThrow(CarroNotFoundException::new);
    }

    public Carro updateCarro(Long id, Carro carro) {

        var alterarCarro = findById(id);
        alterarCarro.getModelo();
        carroRepository.persist(alterarCarro);

        return alterarCarro;
    }

    public void deleteCarro(Long id) {
        var deletarCarro = findById(id);
        carroRepository.delete(deletarCarro);

    }
}
