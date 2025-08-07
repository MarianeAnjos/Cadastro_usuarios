package com.cadastros.userRegister.model;

import java.util.Date;

public class Usuario {

    private Long id;
    private String nome;
    private String nomeUsuario;
    private String email;
    private String senha;
    private Date dataCriacao;

    public Usuario (Long id, String nome, String nomeUsuario, String email, String senha, Date dataCriacao){
        this.id = id;
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.dataCriacao = dataCriacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha() {
        return senha;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome='" + nome + '\'' + ", email='" + email + '\'' + '}';
    }

}

