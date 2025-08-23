package com.cadastros.userRegister.model;

import java.util.Date;

public class Veiculo {
    private Long id;
    private String nomeDoVeiculo;
    private String marca;
    private Integer ano;
    private Date dataCompra;

    public Veiculo(Long id, String nomeDoVeiculo, String marca, Integer ano, Date dataCompra){
        this.id = id;
        this.nomeDoVeiculo = nomeDoVeiculo;
        this.marca = marca;
        this.ano = ano;
        this.dataCompra = dataCompra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoVeiculo() {
        return nomeDoVeiculo;
    }

    public void setNomeDoVeiculo(String nomeDoVeiculo) {
        this.nomeDoVeiculo = nomeDoVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }


}
