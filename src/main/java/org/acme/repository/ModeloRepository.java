package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entity.Modelo;

@ApplicationScoped
public class ModeloRepository implements PanacheRepository<Modelo> {
}
