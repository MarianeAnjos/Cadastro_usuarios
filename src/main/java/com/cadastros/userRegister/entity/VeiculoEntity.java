package com.cadastros.userRegister.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "veiculos")
public class VeiculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

  //Colunas nao podem ser nulas
    @Column(nullable = false)
    private String nomeDoVeiculo;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private Integer ano;

    //Metodo construtor
    public VeiculoEntity(Integer ano, String marca, String nomeDoVeiculo) {
        this.ano = ano;
        this.marca = marca;
        this.nomeDoVeiculo = nomeDoVeiculo;
    }

    public VeiculoEntity() {
    }

    public String getNomeDoVeiculo() {
        return nomeDoVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAno() {
        return ano;
    }
}
