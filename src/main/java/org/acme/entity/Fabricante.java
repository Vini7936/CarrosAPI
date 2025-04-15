package org.acme.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Fabricante {

    @Id
    @GeneratedValue

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    /// //////////////////////////////////////

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    /// ////////////////////////////////////////////

    private String origem;

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }
}
