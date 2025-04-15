package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entity.Carro;

@ApplicationScoped
public class CarroRepository implements PanacheRepository<Carro> {
    public String getModelo() {
        return getModelo();
    }


}
