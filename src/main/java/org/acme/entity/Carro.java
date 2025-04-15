package org.acme.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Carro {

    @Id
    @GeneratedValue

    private Long Id;
    public void setId(Long id) {
        Id = id;
    }
    public Long getId() {
        return Id;
    }
/// /////////////////////////////////////////////////
    private String modelo;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    /// ////////////////////////////////////////////////////
    private String fabricante;

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }
    /// ////////////////////////////////////////////////

    private Integer ano;

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
