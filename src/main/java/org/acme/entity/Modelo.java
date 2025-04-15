package org.acme.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Modelo {

    @Id
    @GeneratedValue

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    /// //////////////////////////////////////////

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    /// /////////////////////////////////////////

    private String fabricante;

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }
}
