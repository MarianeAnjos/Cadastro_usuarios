package com.cadastros.userRegister.dto;

public class VeiculoDTO {
    private String nomeDoVeiculo;
    private String marca;
    private Integer ano;

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

    public Integer getnumero(){
        return 1;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public boolean validarContratoDeEntradaVeiculo(){
        if(nomeDoVeiculo == null || nomeDoVeiculo.isEmpty()){
            return false;
        }
        if(marca == null || marca.isEmpty()){
            return false;
        }
        if(ano == null || ano <= 0 ){
            return false;
        }
        return true;
    }
}
